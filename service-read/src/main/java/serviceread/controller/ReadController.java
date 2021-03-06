package serviceread.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import serviceread.model.User;

@RestController
@RequestMapping("/api/read")
public class ReadController {
	
	private static List<User> users = List.of(new User(101, "Rezaur Rahman", "Rezaur", "rezaur.official@gmail.com", "01839100546"),
			new User(102, "Mr Adam", "Adam", "adam@gmail.com", "01839100546"));
	
	@GetMapping("/all")
	public List<User> getAllUsers() {
		return users;
	}
	
	@PostMapping("/profile")
	private User getUser(@RequestBody HashMap<String, String> id) {
//		return users.stream()
//				.filter(user -> user.getId() == id.get("id"))
//				.findFirst()
//				.orElse(null);
		System.out.println(id.get("id"));
		if(id.get("id").equals("c5597e5f-83a7-4fd9-831c-ea074026c9e7"))
			return users.get(1);
		else if(id.get("id").equals("2f3b6c05-540d-4018-b9ec-8b50e8274b81"))
			return users.get(0);
		else return null;
	}

}
