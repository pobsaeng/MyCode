import React, {Component} from 'react';
import Picture from './Picture.js';
import ProfilePic from './ProfilePicture';

class Profile extends Component {

  constructor(props){
    super(props);

    let up = [
      {src: 'pic.jpg', likes: 10, comments: 2},
      {src: 'pic.jpg', likes: 1, comments: 0},
      {src: 'pic.jpg', likes: 5, comments: 2},
      {src: 'pic.jpg', likes: 7, comments: 4},
      {src: 'pic.jpg', likes: 20, comments: 3},
      {src: 'pic.jpg', likes: 3, comments: 1},
      {src: 'pic.jpg', likes: 3, comments: 0},
      {src: 'pic.jpg', likes: 19, comments: 6},
      {src: 'pic.jpg', likes: 11, comments: 5},
    ]

    this.state = {
      userPics: up,
      username: 'stealthystegosaurus',
      posts: up.length,
      followers: 35,
      following: 78,
      profilePic: 'stego.png'
    }

    console.log(this.state.userPics)
  }

  componentDidMount(){
    //load data from api here
  }

  render() {

    let upComponents = this.state.userPics.map( (item, index) => (
      <Picture className="pic" img={item.src} likes={item.likes} comments={item.comments} key={index}/>
    ))

    return(
      <div className="text-center gray-bg">

        <div>
          <ProfilePic className="float-left" img={this.state.profilePic}/>
          <p className="username">{this.state.username}</p>
          <span id="follow"><button className="ig-btn">Follow</button></span>
          <div className="profile-nav">
            <p id="left-most" className="float-left"><strong>{this.state.posts}</strong> posts</p>
            <p className="float-left"><strong>{this.state.followers}</strong> followers</p>
            <p className="float-left"><strong>{this.state.following}</strong> following</p>
          </div>
        </div>

        <div className="container">
          {upComponents}
        </div>
      </div>
    )
  }
}

export default Profile;
