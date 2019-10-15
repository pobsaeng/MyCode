import React, { Component } from 'react';
import { Player } from 'video-react';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';

class ReactES6 extends React.Component {
    constructor(){
        super();

    }
    componentDidMount(){
        this.setEvents();
    }
    setEvents() {
        var button = document.getElementById('myButton');
        button.addEventListener('click', () => {
            console.log('CLICK');
        });
    }
   
    render(){
        const {modal} = this.state;
        return (
             <div>
                <Button id="myButton" color="primary">primary</Button>{' '}
                <Button color="secondary">secondary</Button>{' '}
                <Button color="success">success</Button>{' '}
                <Button color="info">info</Button>{' '}
                <Button color="warning">warning</Button>{' '}
                <Button color="danger">danger</Button>{' '}
                <Button color="link">link</Button>

                <Button color="danger" onClick={this.toggle}> Open Modal </Button>
                
                <Modal isOpen={this.state.modal} toggle={this.toggle}>
                    <ModalHeader toggle={this.toggle}>Modal title</ModalHeader>
                    <ModalBody>
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                    </ModalBody>
                    <ModalFooter>
                        <Button color="primary" onClick={this.toggle}>Do Something</Button>{' '}
                        <Button color="secondary" onClick={this.toggle}>Cancel</Button>
                    </ModalFooter>
                </Modal>
                {/*
                <Player playsInline fluid={false}
                    ref="player"
                    videoWidth={100} videoHeight={50}
                    autoPlay>
                    <source src="https://media.w3.org/2010/05/sintel/trailer_hd.mp4"/>
                </Player>
                */}
                
            </div>
        );
    }
}
export default ReactES6;
