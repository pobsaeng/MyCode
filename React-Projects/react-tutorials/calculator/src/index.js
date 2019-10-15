import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import './index.css';

const operationToOperator = {
  "Add": "+",
  "Subtract": "-",
  "Multiply": "*",
  "Divide": "/"
}

ReactDOM.render(<App operationToOperator={operationToOperator}/>, document.getElementById('root'));
registerServiceWorker();
