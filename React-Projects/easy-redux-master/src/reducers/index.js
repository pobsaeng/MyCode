import { combineReducers } from 'redux'
import counterReducer from './counter'

//put the counterReducer with the "counter" keyword.
export default combineReducers({
    counter: counterReducer
})