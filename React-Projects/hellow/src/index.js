import React from 'react';
import ReactDOM from 'react-dom';
import 'bootstrap/dist/css/bootstrap.css';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<App />, document.getElementById('root'));
registerServiceWorker();


// npm install --save bootstrap@4.0.0-beta.2
// npm install --save reactstrap@next react@^16.0.0 react-dom@^16.0.0
