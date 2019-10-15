class Helper {
  // createXMLHttpRequest() {
  //   let xmlHttp = null;
  //   if (window.ActiveXObject) {
  //     xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
  //   } else if (window.XMLHttpRequest) {
  //     xmlHttp = new XMLHttpRequest();
  //   } else {
  //     alert("Your browser doesn't support xmlHttp");
  //     return;
  //   }
  //   return xmlHttp;
  // }

  // ajaxLoader(method, URL, data, ajaxCallback) {
  //   let xmlHttp = this.createXMLHttpRequest();
  //   xmlHttp.open(method, URL);

  //   if (method == "post") {
  //     xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
  //   }
  //   xmlHttp.onreadystatechange = function () {
  //     if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
  //       ajaxCallback(xmlHttp.responseText);
  //     }
  //   }
  //   xmlHttp.send(data);
  // }
  isBlank(str) {
    return (!str || /^\s*$/.test(str));
  }
  getAllValuesEl(tags) {
    let rowData = {};
    let att = '';
    for (let i = 0; i < tags.length; i++) {
      att = '';
      if (tags[i].nodeName == 'INPUT' && !this.isBlank(tags[i].type)) {
        switch (tags[i].type) {
          case 'text'://if type name is text and get attribute id or name
            if (!this.isBlank(tags[i].attributes.id)) {
              att = tags[i].attributes.id.value;
            } else if (!this.isBlank(tags[i].attributes.name)) {
              att = tags[i].attributes.name.value;
            }
            if (!this.isBlank(att)) rowData[att] = tags[i].value;

            break;
          case 'password'://if type name is text and get attribute id or name
            if (!this.isBlank(tags[i].attributes.id)) {
              att = tags[i].attributes.id.value;
            } else if (!this.isBlank(tags[i].attributes.name)) {
              att = tags[i].attributes.name.value;
            }
            if (!this.isBlank(att)) rowData[att] = tags[i].value;

            break;
          case 'email'://if type name is text and get attribute id or name
            if (!this.isBlank(tags[i].attributes.id)) {
              att = tags[i].attributes.id.value;
            } else if (!this.isBlank(tags[i].attributes.name)) {
              att = tags[i].attributes.name.value;
            }
            if (!this.isBlank(att)) rowData[att] = tags[i].value;

            break;
          case 'radio':
            if (tags[i].checked) {
              if (!this.isBlank(tags[i].attributes.id)) {
                att = tags[i].attributes.id.value;
              } else if (!this.isBlank(tags[i].attributes.name)) {
                att = tags[i].attributes.name.value;
              }
              let vals = !this.isBlank(tags[i].attributes.value) ?
                tags[i].value : tags[i].nextSibling.textContent;
              if (!this.isBlank(att)) rowData[att] = vals;
            }
            break;
          case 'checkbox':
            if (tags[i].checked) {
              if (!this.isBlank(tags[i].attributes.id)) {
                att = tags[i].attributes.id.value;
              } else if (!this.isBlank(tags[i].attributes.name)) {
                att = tags[i].attributes.name.value;
              }
              let vals = !this.isBlank(tags[i].attributes.value) ?
                tags[i].value : tags[i].nextSibling.textContent;
              if (!this.isBlank(att)) rowData[att] = vals;
            }
            break;
          case 'file':
            if (!this.isBlank(tags[i].attributes.id)) {
              att = tags[i].attributes.id.value;
            } else if (!this.isBlank(tags[i].attributes.name)) {
              att = tags[i].attributes.name.value;
            }
            let vals = !this.isBlank(tags[i].attributes.value) ?
              tags[i].value : tags[i].nextSibling.textContent;


            let data_img = tags[i].getAttribute('data-img');
            if (!this.isBlank(data_img)) {
              if (!this.isBlank(att)) rowData[att] = data_img;
            }
            break
          default:
        }
      }
      if (tags[i].nodeName == 'TEXTAREA' && !this.isBlank(tags[i].type)) {
        if (!this.isBlank(tags[i].attributes.id)) {
          att = tags[i].attributes.id.value;
        } else if (!this.isBlank(tags[i].attributes.name)) {
          att = tags[i].attributes.name.value;
        }
        if (!this.isBlank(att)) rowData[att] = tags[i].value;
      }

      if (tags[i].nodeName == 'SELECT' && !this.isBlank(tags[i].type)) {
        let index = tags[i].selectedIndex;
        if (index != -1) {
          if (!this.isBlank(tags[i].attributes.id)) {
            att = tags[i].attributes.id.value;
          } else if (!this.isBlank(tags[i].attributes.name)) {
            att = tags[i].attributes.name.value;
          }
          let vals = '';
          for (let j = 0, length = tags[i].options.length; j < length; j++) {
            let option = tags[i].options[j];
            if (option.selected) {
              vals = vals + option.value + ',';
            }
          }
          vals = vals.substring(0, vals.length - 1);
          rowData[att] = vals;
        }
      }
      if (tags[i].nodeName == 'IMG') {
        if (!this.isBlank(tags[i].attributes.id)) {
          att = tags[i].attributes.id.value;
        } else if (!this.isBlank(tags[i].attributes.name)) {
          att = tags[i].attributes.name.value;
        }
        let vals = !this.isBlank(tags[i].attributes.value) ?
          tags[i].value : tags[i].nextSibling.textContent;

        let img_src = tags[i].getAttribute('src');
        if (!this.isBlank(img_src)) {
          if (!this.isBlank(att)) rowData[att] = img_src;
        }
      }
    }
    return rowData;
  }
}
export default new Helper();
