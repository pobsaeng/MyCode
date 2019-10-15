import React, { Component } from 'react';
import { render } from 'react-dom';
import { Route, Router, hashHistory, browserHistory } from 'react-router'
// import { NavLink, HashRouter, Router, Route, browserHistory } from 'react-router-dom';
// import { Router, Route, IndexRoute, useRouterHistory } from 'react-router';
// import { createHashHistory } from 'history';


import 'bootstrap/dist/css/bootstrap.css';
import './resources/style.css';
import Home from './components/Home';
import Contact from './components/Contact';
import Product from './components/Product';
import AjaxTable from './components/AjaxTable';

class MainApp extends Component {
  constructor(props) {
    super(props);

  }

  componentDidMount() {
    console.log('=======componentDidUpdate=========');
    //Example Redux here ===> https://github.com/scotch-io/react-redux-bookshop/tree/master/tools
  }
  handlerFunction(a){
    console.log(a);
  }
  render() {
    return (
      <Router history={hashHistory}>
      <Route path='/' component={Home}>
        <Route path='/about' component={Contact} />
      </Route>
      </Router>
       

      /*<HashRouter>
        <div className="indexTop">
          <nav className="navbar navbar-default navbar-fixed-top">
            <div className="container-fluid">
              <div className="navbar-header">
                <a className="navbar-brand">
                  <i><img className="image-thumbnail" src="https://res.cloudinary.com/candidbusiness/image/upload/v1455406304/dispute-bills-chicago.png" alt="Dispute Bills" /></i></a>
              </div>
              <ul className="nav navbar-nav">
                <li><NavLink to="/home" onClick={this.handlerFunction(null)}>Home</NavLink></li>
                <li><NavLink to="/table">Table</NavLink></li>
                <li><NavLink to="/product">Product</NavLink></li>
                <li><NavLink to="/contact">Contact</NavLink></li>
                <li><NavLink to="/home">About</NavLink></li>
                <form className="navbar-form navbar-left" role="search">
                  <div className="form-group">
                    <input type="text" className="form-control" placeholder="Search" />
                  </div>
                  <button type="submit" className="btn btn-default">Submit</button>
                </form>
              </ul>
            </div>
          </nav>

          <div className="content">
            <Route path="/home" component={Home} />
            <Route path="/table" component={AjaxTable} />
            <Route path="/product" component={Product} />
            <Route path="/contact" component={Contact} />
          </div>
        </div>
      </HashRouter>*/
    );
  }
}
render(<MainApp />, document.getElementById('root'));
