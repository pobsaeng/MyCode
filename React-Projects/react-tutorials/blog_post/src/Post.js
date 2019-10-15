import React, {Component} from 'react';
import Comment from './Comment';
import Author from './Author';

class Post extends Component {

  constructor(props){
    super();

    this.state = {
      body: props.body,
      value: ''
    };

    this.handleChange = this.handleChange.bind(this);
    this.changeBody = this.changeBody.bind(this);
  }

  changeBody(event){
    this.setState({
      body: this.state.value ? this.state.value : this.state.body
    });
    event.preventDefault();
  }

  handleChange(event){
    this.setState({
      value: event.target.value
    });
  }

  render(){

    let allComments = [
      <Comment body={this.props.comments[0]}/>,
      <Comment body={this.props.comments[1]}/>,
      <Comment body={this.props.comments[2]}/>
    ];

    let authors = [
      <Author author={this.props.allAuthors[0]}/>,
      <Author author={this.props.allAuthors[1]}/>,
      <Author author={this.props.allAuthors[2]}/>
    ];


    return(
      <div>
        <h1>{this.props.title}</h1>
        {authors}
        <p>{this.state.body}</p>
        <form onSubmit={this.changeBody}>
          <input type="submit" value="Edit Body"></input>
          <input type="text" onChange={this.handleChange}></input>
        </form>
        <h3>Comments:</h3>
        {allComments}
      </div>
    );
  }
}

export default Post;
