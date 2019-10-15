import React, { Component } from 'react'
import { Provider, connect } from 'react-redux'

import store from '../store'
import ViewCounter from '../components/ViewCounter.jsx'
import IncreaseButton from '../components/IncreaseButton.jsx'
import { increase } from '../actions/counter.jsx'

const mapDispatchToProps = dispatch => {
    return {
        increaseNumber: () => dispatch(increase())
    }
}

export default connect(
    null,
    mapDispatchToProps
)(class extends Component {
    render() {
        console.log(this.props)
        return <div>
            <ViewCounter />
            <IncreaseButton buttonClick={this.props.increaseNumber} />
        </div>
    }
})
