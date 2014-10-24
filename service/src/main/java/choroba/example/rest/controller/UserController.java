package choroba.example.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import choroba.example.rest.dto.User;
import choroba.example.rest.service.Service;

@Controller
@RequestMapping("/user")
public class UserController {

	private Service service;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public ResponseEntity<User> getUser(@PathVariable String id) {
		User user = service.getUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	public void setService(Service service) {
		this.service = service;
	}
}
