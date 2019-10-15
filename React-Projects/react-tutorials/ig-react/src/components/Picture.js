import React, {Component} from 'react';
import FontAwesome from 'react-fontawesome';

const Picture = props => (
  <div className="pic">
    <img src={`assets/images/${props.img}`}/>
    <div className="pic-stats">
      <p>
        <FontAwesome name='heart' /> {props.likes} &nbsp;
        <FontAwesome name='comment' /> {props.comments}
      </p>
    </div>
  </div>
)

export default Picture;
