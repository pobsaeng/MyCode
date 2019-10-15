import React, {Component} from 'react';

class FavoriteMovies extends Component {

  constructor(props){
    super(props);
    this.state = {
      value: '',
      movie: '',
      error: ''
    }
  }

  sanitizeInput(str){
    return str.replace(/\s/g, "%20" );
  }

  handleChange(e) {
    let str = this.sanitizeInput(e.target.value);
    this.setState(
      {value: str}
    );
  }

  formSubmit(e){
    this.searchMovie();
    e.preventDefault();
  }

  searchMovie(){
    let base = this;
    fetch(`http://netflixroulette.net/api/api.php?title=${base.state.value}`)
      .then((response) => {
        return response.json();
      }).then((json) => {
        base.setState({movie: json});
      })
      .catch((ex) => {
        console.log("base.setstate", ex);
        base.setState({error: ex});
      });
  }

  render(){
    let m = this.state.movie;
    return (
      <div>
        <form onSubmit={(e) => {this.formSubmit(e)}}>
          <label>Name:
            <input type="text" name="name" onChange={(e) => {this.handleChange(e)}} />
          </label>
          <input type="submit" value="Get this movie!" />
        </form>
        <br/>
        {this.state.error}
        {m.show_title}
        <br/><br/>
        {m.director}
        <br/><br/>
        {m.summary}
      </div>
    );
  }
}

export default FavoriteMovies;
