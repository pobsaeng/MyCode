import { Component, OnInit, Input } from '@angular/core';
import { FormControl, FormBuilder, Validators, FormGroup } from '@angular/forms';
import { GroupproductService } from './groupproduct.service';
import { DateFormatPipe } from '../common/dateformat.pipe';

@Component({
  selector: 'app-groupproduct',
  templateUrl: './groupproduct.component.html',
  styleUrls: ['./groupproduct.component.css']
})
export class GroupproductComponent implements OnInit {
  isValidFormSubmitted = null;
  isValidSearchFormSubmitted = null;

  ShowEditTable: boolean = false;
  EditRowID: any = '';

  public myForm: FormGroup;
  public groupAddForm: FormGroup;
  public groupSearchForm: FormGroup;
  public switcher: FormGroup;
  public groupEditForm: FormGroup;
  search_item: any;
  search_item_temp: any;

  public GROUP_PRODUCT_TYPE = {
    ADD: "เพิ่มกลุ่มสินค้า",
    SEARCH: "ค้นหา/แก้ไข"
  };
  constructor(
    private formBuilder: FormBuilder,
    private groupproductService: GroupproductService) {

    this.myForm = this.formBuilder.group({
      switcher: this.formBuilder.group({
        type: [''],
        SEARCH: this.formBuilder.group({}),
        ADD: this.formBuilder.group({}),
      })
    });

    //first display
    this.setPaymentMethodType(this.GROUP_PRODUCT_TYPE.ADD);

    this.groupAddForm = this.formBuilder.group({
      group_product_id: [null],
      group_product_code: [null, [Validators.required, Validators.pattern("^[A-Z0-9_-]{8}$")]],
      group_product_name: [null, [Validators.required]],
      group_product_detail: [null, [Validators.required]],
      group_product_created_date: [new DateFormatPipe().transform(new Date(), ['local'])],
      group_product_last_update: [new DateFormatPipe().transform(new Date(), ['local'])]
    });

    this.groupSearchForm = this.formBuilder.group({
      group_product_search: [null, [Validators.required]]
    });

    this.groupEditForm = this.formBuilder.group({
      group_product_code: [null, [Validators.required, Validators.pattern("^[A-Z0-9_-]{8}$")]],
      group_product_name: [null, [Validators.required]],
      group_product_detail: [null, [Validators.required]],
    });
  }

  ngOnInit() { }

  setPaymentMethodType(type: string) {
    const ctrl = this.myForm.get('switcher.type');
    ctrl.setValue(type);
  }

  @Input() message = { body: '', type: '' };
  setMsg(body, type, time = 3000) {
    this.message.body = body;
    this.message.type = type;
    setTimeout(() => { this.message.body = ''; }, time);
  }
  closeMsg() {
    this.setMsg('', '', 0);
  }
  onFormSubmit() {
    this.isValidFormSubmitted = false;
    if (this.groupAddForm.invalid) {
      return;
    }
    this.isValidFormSubmitted = true;
    let groupproduct: any = this.groupAddForm.value; //asign the value of a form to Groupproduct class
    this.groupproductService.create(groupproduct); //calling service
    this.setMsg('Insert Complete!', 'info'); //alert message is success
    this.groupAddForm.reset(); //set this form reset
  }
  //create a get attribute for FormBuilder
  get group_product_code() {
    return this.groupAddForm.get('group_product_code');
  }
  get group_product_name() {
    return this.groupAddForm.get('group_product_name');
  }
  get group_product_detail() {
    return this.groupAddForm.get('group_product_detail');
  }

  get group_product_search() {
    return this.groupSearchForm.get('group_product_search');
  }
  onEdit(id) {
    this.EditRowID = id;
  }
  onSave(id) {
    this.isValidFormSubmitted = false;
    if (this.groupEditForm.invalid) {
      return;
    }
    this.isValidFormSubmitted = true;
    // let groupproduct: any = this.groupEditForm.value;

    let item = this.search_item.filter((gp_id: any) => gp_id.group_product_id === id);
    console.log(item);
    this.EditRowID = '';
  }
  isFieldValid(field: string) {
    return !this.groupEditForm.get(field).valid && this.groupEditForm.get(field).touched;
  }

  displayFieldCss(field: string) {
    return {
      'has-error': this.isFieldValid(field),
      'has-feedback': this.isFieldValid(field)
    };
  }
  onCancel(id) {
    this.EditRowID = '';
  }
  onSearch() {
    this.isValidSearchFormSubmitted = false;
    if (this.groupSearchForm.invalid) {
      return;
    }
    this.isValidSearchFormSubmitted = true;
    console.log(this.groupSearchForm.value.group_product_search);
    // this.groupproductService.searchLike(this.searchForm.value.group_product_search);

    this.groupproductService.searchLike({ value: this.groupSearchForm.value.group_product_search })
      .subscribe(result => {
        if (result) {
          this.search_item = result.rows;
        } else {
          // alert(result.exception);
        }
      });

  }
}
