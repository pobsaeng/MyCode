import React, { Component } from 'react';
import './App.css';
import Calculator from './components/Calculator.js';

class App extends Component {
  render() {
    return (
      <Calculator operationToOperator={this.props.operationToOperator}/>
    );
  }
}

export default App;
