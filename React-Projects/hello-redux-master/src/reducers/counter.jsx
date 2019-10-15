const initialState = 0

export default (state = initialState, action) => {
    switch (action.type) {
        case "INCREASE_COUNTER":
            return state + action.payload
        default:
            return state
    }
}