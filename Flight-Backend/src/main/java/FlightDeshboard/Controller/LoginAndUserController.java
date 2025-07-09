package FlightDeshboard.Controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import FlightDeshboard.Model.User;
import FlightDeshboard.Repository.LoginAndUserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/User")
public class LoginAndUserController {
	
	@Autowired
	private LoginAndUserRepository loginuserRepo;
	@GetMapping("/login/{username}")
	public ResponseEntity<User> login(@PathVariable("username") String username) {
	    Optional<User> user = loginuserRepo.findByUsername(username);
System.out.println(user.get());
	    if (user.isPresent()) {
	        return ResponseEntity.ok(user.get());
	    } else {
	        return ResponseEntity.status(404).body(null);  // Or a custom error message
	    }
	}

   @PostMapping("/signup")
   public ResponseEntity<String> signup(@RequestBody User user) {
	   loginuserRepo.save(user);
       return ResponseEntity.ok("User registered");
   }

}