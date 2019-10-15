import React from 'react';
import ReactDOM from 'react-dom';
import Hello from './App.js';
// import registerServiceWorker from './registerServiceWorker';
var person = {
  name: "Denise",
  age: 25,
  favorites: [
    "lions",
    "tigers",
    "bears"
  ]
}

ReactDOM.render(
  <Hello name={person.name} age={person.age} animals  ={person.favorites}/>,
  document.getElementById('root')
);
// registerServiceWorker();
