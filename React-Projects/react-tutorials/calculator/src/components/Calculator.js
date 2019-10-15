import React, {Component} from 'react';

class Calculator extends Component {
  constructor(props){
    super(props);

    this.state = {
      num1: '',
      num2: '',
      operation: 'Add',
      operator: '+',
      result: ''
    };
  }

  num1Change(e){
    this.setState({
      num1: e.target.value
    }, () => {
      this.getResult();
    });
  }

  num2Change(e){
    this.setState({
      num2: e.target.value
    }, () => {
      this.getResult();
    });
  }



  getResult(){
    let r = 0;
    switch(this.state.operator) {
      case "+":
        r = parseInt(this.state.num1, 10) + parseInt(this.state.num2, 10);
        break;
      case "-":
        r = parseInt(this.state.num1, 10) - parseInt(this.state.num2, 10);
        break;
      case "*":
        r = parseInt(this.state.num1, 10) * parseInt(this.state.num2, 10);
        break;
      case "/":
        r = parseInt(this.state.num1, 10) / parseInt(this.state.num2, 10);
        break;
      default:
        r = parseInt(this.state.num1, 10) + parseInt(this.state.num2, 10);
        break;
    }

    this.setState({
      result: r
    });
  }

  setOperation(e){
    this.setState({
      operation: e.target.innerHTML,
      operator: this.props.operationToOperator[e.target.innerHTML]
    }, () => {
      this.getResult();
    });
  }

  render(){
    return (
      <div className="container">
         <h1>{this.state.operation ? this.state.operation : "Calculate"} with React!</h1>
         <button onClick={(e) => this.setOperation(e)}>Add</button>
         <button onClick={(e) => this.setOperation(e)}>Subtract</button>
         <button onClick={(e) => this.setOperation(e)}>Multiply</button>
         <button onClick={(e) => this.setOperation(e)}>Divide</button>
         <br></br>
         <br></br>
         <div className="add">
           <input type="text"
             onChange={(e) => this.num1Change(e)}
             value={this.state.num1}
           />
         <span>{this.state.operator ? " " + this.state.operator + " "  : " " }</span>
           <input type="text"
             onChange={(e) => this.num2Change(e)}
             value={this.state.num2}
           />
           <span>=</span>
           <h3>{this.state.result ? this.state.result : "Results go here!"}</h3>
         </div>
      </div>
    )
  };
}

export default Calculator;
