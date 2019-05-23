import React, {Component} from 'react';
import List from './List';

export default class SearchItem extends Component{
   
    state = {
        key : ""
    }

    buttonClick = (e) =>{

        
    }

    keyChange = (e) =>{
        this.setState({
            key : e.target.value
        })
    }


    render(){
        return(
            <div>
                <input type = {this.state.key} onChange={this.keyChange}/>
                <button onClick={this.buttonClick}>Search</button>
                <List listKey={this.state.key}/>
            </div>
        )
    }
}