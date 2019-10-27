package com.loginregistrationjpa.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.loginregistrationjpa.model.User;
import com.loginregistrationjpa.repos.Repository;

@Controller
public class WebController {
	@Autowired
	Repository repos;
@RequestMapping("/search/")
public Optional<User> getUserByName(@PathVariable("id")long id, @PathVariable("username")String username, @PathVariable("password")String pass ) {
	Optional<User> usertest = (Optional<User>) repos.findById(id);
	System.out.println(username + pass);
	return usertest;
}



}
