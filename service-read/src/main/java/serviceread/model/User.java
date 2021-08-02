package serviceread.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class User {
	
	private long id;
	private String fullname;
	private String nickname;
	private String contact;
	private String email;
	
}