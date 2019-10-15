import React, { Component } from 'react';
import './App.css';

import {
  BrowserRouter as Router,
  Route,
  Link
} from 'react-router-dom';

import Home from './components/Home';
import Contact from './components/Contact';
import Procedures from './components/Procedures';

class App extends Component {
  render() {
    return (
        <Router>
          <div>
            <nav>
              <Link to="/">Go to Home Page</Link>{' '}
              <Link to="/procedures">See Our Procedures</Link>{' '}
              <Link to="/contact">Contact Us!</Link>
            </nav>
            <Route exact path="/" component={Home} />
            <Route path="/procedures" component={Procedures} />
            <Route path="/contact" component={Contact} />
          </div>
        </Router>
    );
  }
}

export default App;
