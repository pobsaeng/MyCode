import React, {Component} from 'react';

class Main extends Component {
  constructor(props) {
    super(props);

    this.state = {
      poem: ''
    }

  }

  componentDidMount(){
    var base = this;

    let poemApi = 'http://ShakeItSpeare.com/api/poem';

    fetch(poemApi)
      .then((response) => {
        return response.json();
      }).then((json) => {
        base.setState({poem: json.poem});
      })
      .catch((exception) => {
        console.log("There was an error", exception);
      });
  }

  render() {
    let poetry = this.state.poem;
    if(this.state.poem){
      return (
        <div>
          <h1>My favorite Shakespeare poem:</h1>
          {poetry}
        </div>
      );
    }
    return (
      <div>
        <h1>My favorite Shakespeare poem:</h1>
        Loading...
      </div>
    );
  }
}

export default Main;
