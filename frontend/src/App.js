import React, {Component} from 'react';
import logo from './logo.svg';
import './App.css';
import Form from './Components/Form.js';
import List from './Components/List';
import SearchItem from './Components/SearchItem';

class App extends Component {    


    render() {
        return (
            <React.Fragment>
            <SearchItem />
            
            <Form />
            </React.Fragment>
        );
    }
}

export default App;
