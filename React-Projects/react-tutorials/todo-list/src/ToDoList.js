import React from 'react';
import ListItem from './ListItem.js';

const ToDoList = props => (
  <ul>
    {props.toDoItemArray.map( (item, index) => (
      <ListItem doThis={item} key={index} />
    ))}
  </ul>
)

export default ToDoList;
