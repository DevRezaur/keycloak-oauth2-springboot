package serviceread.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import serviceread.model.User;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/read")
public class ReadController {
	
	private List<User> users = List.of(new User(101, "Rezaur Rahman", "Rezaur", "rezaur.official@gmail.com", "01839100546"),
			new User(102, "Mr Adam", "Adam", "adam@gmail.com", "01839100546"));
	
	@GetMapping("/all")
	@RolesAllowed("service-user")
	public List<User> getAllUsers() {
		return users;
	}
	
	@GetMapping("/{id}")
	@RolesAllowed("service-admin")
	private User getUser(@PathVariable long id) {
		return users.stream()
				.filter(user -> user.getId() == id)
				.findFirst()
				.orElse(null);
	}

}
