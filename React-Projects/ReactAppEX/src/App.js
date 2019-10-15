import React, { Component } from 'react';

import ReactES6 from './components/ReatES6';

class App extends Component {
  constructor() {
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

        
        <div>
          <ReactES6 />
        </div>
      </div>
    );
  }
}

export default App;
