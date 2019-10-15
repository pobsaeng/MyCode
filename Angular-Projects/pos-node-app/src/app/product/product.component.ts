import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { ProductService } from './product.service';
import { NgbModal, ModalDismissReasons } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  products: any;
  closeResult: string;
  productModal: string;

  constructor(private productService: ProductService, private modalService: NgbModal) { }

  ngOnInit() {
    this.productService.getAllProduct()
      .subscribe(result => {
        if (result.success) {
          this.products = result.data.rows;
        } else {
          alert(result.exception);
        }
      });

  }
  open(content, isbn: string) {
    this.productModal = this.products.filter((book: any) => book.isbn === isbn);

    this.modalService.open(content).result.then((result) => {
      this.closeResult = `Closed with: ${result}`;
    }, (reason) => {
      this.closeResult = `Dismissed ${this.getDismissReason(reason)}`;
    });
  }
  private getDismissReason(reason: any): string {
    if (reason === ModalDismissReasons.ESC) {
      return 'by pressing ESC';
    } else if (reason === ModalDismissReasons.BACKDROP_CLICK) {
      return 'by clicking on a backdrop';
    } else {
      return `with: ${reason}`;
    }
  }
}
