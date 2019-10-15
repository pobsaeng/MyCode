import React from 'react';
import home from './Home.js';
class App extends React.Component {

    constructor(props) {
        super(props);

        this.state = {
            data: ''
        }

        this.updateState = this.updateState.bind(this);
    };
    handleClick(e) {
        e.preventDefault();
        let data = document.getElementById("data");
        home.init(data.value);
    }
    updateState(e) {
        this.setState({ data: e.target.value });
    }

    render() {
        return (
            <div>
                <div><input type="text" id="data" value={this.state.data} onChange={this.updateState} /></div>
                <br/>
                <div><input type="submit" id="btnClick" onClick={(e) => this.handleClick(e)} value="Click" /></div>
                <h4>{this.state.data}</h4>
            </div>
        );
    }
}

export default App;