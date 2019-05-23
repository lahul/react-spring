package com.todolist.Controller;

import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONArray;

import com.google.gson.Gson;
import com.todolist.entity.User;
import com.todolist.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	UserService userService;
	
    /*@GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }*/
    
    @GetMapping("/api/login")
    public String login() {
    	return "login successful";
    }
    
    @GetMapping("/api/hello")
    public String hi() {
    	return "Hello World";
    }
    
    @PostMapping(value="/api/get", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void hi1(@RequestBody String user) throws JSONException {
    	//JSONArray json = new JSONArray();
    	//System.out.println(user);
    	
    	JSONObject json = new JSONObject(user);
    	
    	User u = new User((String)(json.get("name")),(String) json.get("password"));
    	//System.out.println(user.toString());*/
    	System.out.println(u.getName());
    	System.out.println(u.getPassword());
    	System.out.flush();
    	userService.saveUser(u);
    }

    @GetMapping("/api/get")
    @ResponseBody
	public String getUsers(){
    	List l = userService.getUsers();
    	
    	 Gson gson = new Gson();
    	 // convert your list to json
    	 String jsonCartList = gson.toJson(l);
    	 // print your generated json
    	 
    	return jsonCartList;
	}
    
    @GetMapping("/api/find/{name}")
    @ResponseBody
    public String findUsers(@PathVariable String name) {
    	List<User> l = userService.findUser(name);
    	
    	Gson gson = new Gson();
    	
    	String json = gson.toJson(l);
    	return json;
    }
}
