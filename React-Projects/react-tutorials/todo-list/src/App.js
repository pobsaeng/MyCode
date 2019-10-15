import React, { Component } from 'react';
import './App.css';
import ToDoList from './ToDoList.js';
import Modal from 'react-modal';

const customStyles = {
  content : {
    top                   : '50%',
    left                  : '50%',
    right                 : 'auto',
    bottom                : 'auto',
    marginRight           : '-50%',
    // transform             : 'translate(-50%, -50%)'
  }
};

class MyList extends Component {
  constructor(props){
    super();

    this.state = {
      toDoItemArray: props.theList,
      newItem: '',
      modalIsOpen: false
    };

    this.openModal = this.openModal.bind(this);
    this.afterOpenModal = this.afterOpenModal.bind(this);
    this.closeModal = this.closeModal.bind(this);

  }

  openModal() {
    this.setState({modalIsOpen: true});
  }

  afterOpenModal() {
    // references are now sync'd and can be accessed.
    this.subtitle.style.color = '#f00';
  }

  closeModal() {
    this.setState({modalIsOpen: false});
  }


  clearList (e){
    this.setState({
      toDoItemArray: []
    });
  }

  newItemChange(e){
    this.setState({
      newItem: e.target.value
    });
  }

  addItem(e){
    let oldArray = this.state.toDoItemArray;
    oldArray.push(this.state.newItem);
    this.setState({
      toDoItemArray: oldArray,
      newItem: ''
    });
    e.preventDefault();
  }



  render() {

    return (
      <div>
        <h1>Things I should stop procrastinating:</h1>
        <ToDoList toDoItemArray={this.state.toDoItemArray} />
        <form>
          <input type="text"
            placeholder="Type an item here"
            onChange={(e) => this.newItemChange(e)}
            value={this.state.newItem}
          />
          <button onClick={(e) => this.addItem(e)}>Add it!</button>
        </form>
        <button onClick={(e) => this.clearList(e)}>
          Finished the list!
        </button>
        <br/>

          <div>
            <button onClick={this.openModal}>Open Modal</button>
            <Modal
              isOpen={this.state.modalIsOpen}
              onAfterOpen={this.afterOpenModal}
              onRequestClose={this.closeModal}
              style={customStyles}
              contentLabel="Example Modal">
              <h2 ref={subtitle => this.subtitle = subtitle}>Hello</h2>
              <button onClick={this.closeModal}>close</button>
              <form>

                <input />
              </form>
            </Modal>
          </div>
      </div>
    );
  }
}

export default MyList;
