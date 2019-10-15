import React, {Component} from 'react';

const ProfilePicture = props => (
  <div className="inline-block">
    <img className="profile-img" src={`assets/images/${props.img}`}/>
  </div>
)

export default ProfilePicture;
