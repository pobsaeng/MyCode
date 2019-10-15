import React from 'react'
import { connect } from 'react-redux'

const ViewCounter = (props) => {
    return <div>
        Counter: {props.counter}
    </div>
}

export default connect(
    state => ({ counter: state.counter })
)(ViewCounter)