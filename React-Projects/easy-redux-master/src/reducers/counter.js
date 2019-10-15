import Action from '../actions' 
//=== Reducer ===
// Here is Default State
var initialState = {
    couter: 0,
    text: ""
}
//Reducer Function
function counterReducer(state = initialState, action) {
    switch (action.type) {
        case Action.INCREMENT: //if it's a 'INCREMENT' keyword then return this object
            return {
                couter: state.couter + 1,
                text: action.text
            }
        case Action.DECREMENT: //if it's a 'DECREMENT' keyword then return this object
            return {
                couter: state.couter - 1,
                text: action.text
            }
        default:
            return state
    }
}

export default counterReducer; //return the functoin out