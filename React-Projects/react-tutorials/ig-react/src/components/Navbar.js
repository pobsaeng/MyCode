import React from 'react';
import {Link} from 'react-router-dom';
import FontAwesome from 'react-fontawesome';

const Navbar = props => (
  <div className="text-center">
    <nav>
      <img className="float-left" src="/assets/images/logo.jpg"/>
      <p className="bar"> | </p>
      <p className="title">&emsp;Instergerm&emsp;</p>
      <input className="float-left search" type="text" placeholder="Search"/>
      <Link className="float-right" to="/">Log in</Link>
      <p className="float-right ig-dark-gray">|</p>
      <Link className="float-right" to="/profile">&emsp;Sign up</Link>
      <button className="float-right ig-btn">Get the app</button>
    </nav>
  </div>
);

export default Navbar;
