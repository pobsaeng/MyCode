//bring in react component from react
import React, {Component} from 'react';

//define hello Component
class Hello extends Component {
  //what happens when the component instance is first created?
  constructor(props){
    //make a call to the parent class (Component) constructor
    super()

    this.state = {
      moodPoints: 1
    };
  }

  increaseMood(e){
    let newValue = (this.state.moodPoints < 10) ? this.state.moodPoints + 1 : 1;
    this.setState({
      moodPoints: newValue
    });

  }

  //what should the component render?
  render(){
    //make sure to return some UI
    return (
      <div>
        <h1>Hello {this.props.name}, {this.props.age}!</h1>
        <h3>It's time for tea.</h3>
        <p>You love {this.props.animals}</p>
        <p>You are this happy: {this.state.moodPoints}</p>
        <button onClick={ (e) => this.increaseMood(e) }>Cheer up!</button>
      </div>
    )
  }
}

export default Hello
