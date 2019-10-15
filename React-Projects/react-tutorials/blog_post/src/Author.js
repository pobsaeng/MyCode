import React, {Component} from 'react';

class Author extends Component {
  render(){
    return (
      <p>Written by {this.props.author}</p>
    )
  }
}

export default Author
