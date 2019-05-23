import React, {Component} from 'react';

class Form extends Component {
	
	state = {
			name : "",
			password : ""
	}
	
	handleSubmit = (e) =>{
		e.preventDefault();
		console.log("Hello");
		fetch('/api/get', {
			  method: 'POST',
			  headers : {
				  'Access-Control-Allow-Origin' : '*',
				  'Access-Control-Allow-Methods': 'GET, POST, OPTIONS',
					  'Content-Type': 'application/json'
			  },
			  body : JSON.stringify({
				  "name" : this.state.name,
				  "password" : this.state.password
			  })
			})
	}

	handleChange = (e) =>{
		console.log(e.target.value);
		this.setState({
			name : e.target.value,
			password : this.state.password
		})
	}
	
	handlePassword = (e) =>{
		console.log(e.target.value);
		this.setState({
			name : this.state.name,
			password : e.target.value
		})
	}
	
	
	render(){
		 return (
				 
			      <form method="post" onSubmit={(e) => {this.handleSubmit(e)}}>
			          Name:
			          <input type="text" value={this.state.name} onChange={(e) =>{this.handleChange(e)}}></input>
			          <input type="text" value={this.state.password} onChange={(e) =>{this.handlePassword(e)}}/>
								<input type="submit" value="submit"/>
			          </form>
			      
			    );
	}
}

export default Form;