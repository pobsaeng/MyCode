import React from 'react';
import ReactDOM from 'react-dom';
import MyList from './App.js';
import registerServiceWorker from './registerServiceWorker';
import './index.css';

var toDos = [
  "Buy groceries",
  "Clean apartment",
  "Do laundry",
  "Go outside"
]

ReactDOM.render(<MyList theList={toDos}/>, document.getElementById('root'));
registerServiceWorker();
