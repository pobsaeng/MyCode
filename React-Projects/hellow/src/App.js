import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import ReactES6 from './components/ReatES6';

class App extends Component {
  constructor(){
    super();

    this.state = {
        modal: false
    };
    this.toggle = this.toggle.bind(this);
  }
  toggle() {
        this.setState({
            modal: !this.state.modal
        });
    }
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">Welcome to React</h1>
        </header>
        <br/>

          <div>
            <ReactES6 />
          </div>
        
      </div>
    );
  }
}

export default App;
