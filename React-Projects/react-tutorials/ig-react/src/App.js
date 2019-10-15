import React, { Component } from 'react';
import {
  BrowserRouter as Router,
  Route
} from 'react-router-dom';

import Home from './components/Home';
import Profile from './components/Profile';
import Navbar from './components/Navbar';

class App extends Component {
  render() {
    return (
      <Router>
        <div>
          <Navbar/>
          <hr/>
          <Route exact path="/" component={Home}></Route>
          <Route exact path="/profile" component={Profile}></Route>
        </div>
      </Router>
    );
  }
}

export default App;
