import React, { Component } from 'react';
import { Player } from 'video-react';
import logo from '../logo.svg';
import '../App.css';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';
import Form from './Form'

class ReactES6 extends React.Component {
    constructor() {
        super();

        this.state = {
            content: ''
        }
        this.onNavClick = this.onNavClick.bind(this);
    }
    componentDidMount() {
        this.setEvents();
    }
    setEvents() {
        // var button = document.getElementById('myButton');
        // button.addEventListener('click', () => {
        //     console.log('CLICK');
        // });
    }
    onNavClick() {
        let content = this.state.content;
        switch (content) {
            case "Home":
                let div = document.createElement("DIV");
                div.textContent = "HSDFdsfs";
                this.containerFluid.appendChild(div);
                break;

            default:
                break;
        }
    }
    render() {
        let me = this;
        return (
            <div>
                <nav id="topNav" className="navbar navbar-expand-sm navbar-light bg-faded">
                    <button className="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span className="navbar-toggler-icon"></span>
                    </button>
                    <header className="navbar-brand">
                        <img src={logo} className="App-logo" alt="logo" />
                    </header>

                    <div className="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul className="navbar-nav mr-auto">
                            <li className="nav-item active">
                                <a className="nav-link" onClick={(e) => {
                                    this.state.content = "Home";
                                    this.onNavClick();

                                }} href="#">Home<span className="sr-only">(current)</span></a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link" href="#">Link</a>
                            </li>
                            <li className="nav-item">
                                <a className="nav-link disabled" href="#">Disabled</a>
                            </li>
                        </ul>
                        <form className="form-inline my-2 my-lg-0">
                            <input className="form-control mr-sm-2" type="text" placeholder="Search" />
                            <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </form>
                    </div>
                </nav >

                <div ref={(containerFluid) => this.containerFluid = containerFluid} className="container-fluid">
                   
                </div>

                {/*<div>                
                <Player playsInline fluid={false}
                    ref="player"
                    videoWidth={100} videoHeight={50}
                    autoPlay>
                    <source src="https://media.w3.org/2010/05/sintel/trailer_hd.mp4"/>
                </Player>
            </div >*/}
            </div>
        );
    }
}
export default ReactES6;
