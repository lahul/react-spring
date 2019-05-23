import React, {Component} from 'react';

export default class List extends Component{
    
    state = {
        items : []
    }

    componentDidMount = () =>{
        console.log("hi");
        fetch('api/get',{
            method: 'GET',
        headers: {
          Accept: 'application/json',
        }
    }).then(res =>{
            return res.json();
        }).then(body =>{
            console.log(body);
            this.setState({
                items : body
            })
        })
    }

    render(){

    const printList = () =>{
        let key = this.props.listKey;
        console.log(this.props);
         return   this.state.items.map((item) =>{
                if(item.name.includes(key) || key == null)
                    return <li id={item.id}>{item.name}</li>
            })
        }

        return(
            <div>
                <ul>
            {printList()}
            </ul>
            </div>
        )
    }
}