import React, { Component } from 'react';
import logo from './../resources/img/logo.svg';
import Immutable from 'immutable';
import './../resources/css/App.css';
import AlbumList from './AlbumList';
import * as musicApi from '../api/musicApi';

const todosVanilla = [
  {
    task: 'eat supper',
    priority: 'Urgent',
    isCompleted: true
  }
];

var todos = Immutable.fromJS(todosVanilla);

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      searchTerm: '',
      albums: [],
    };
    this.getAlbums = this.getAlbums.bind(this);
    this.processAlbums = this.processAlbums.bind(this);
    this.handleInputChange = this.handleInputChange.bind(this);

    this.state = {
      todos: todos
    };
  }
  getAlbums(artist) {
    musicApi.getAlbums(artist, this.processAlbums);
  }

  processAlbums(payload) {
    this.setState({
      albums: payload.albums.items,
    });
  }
  handleInputChange(event) {
    this.setState({
      searchTerm: event.target.value,
    });

    // this.getTracks(2, function(data){
    //   alert(data);
    // });
  }
  render() {
    return (
      <div className="App">
        <div className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h2>Welcome to React</h2>
        </div>
        <br />

        <input onChange={this.handleInputChange} /><br />

        <p className="App-intro"></p>
      </div>
    );
  }
}

export default App;
