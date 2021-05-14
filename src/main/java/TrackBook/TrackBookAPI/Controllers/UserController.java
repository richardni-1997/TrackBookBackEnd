package TrackBook.TrackBookAPI.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import TrackBook.TrackBookAPI.Models.*;
import TrackBook.TrackBookAPI.Repositories.*;
import TrackBook.TrackBookAPI.Controllers.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

//	@GetMapping("/users/{email}")
//	public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String email) {
//		try {
//			List<User> users = new ArrayList<User>();
//
////			if (email == null)
////				userRepository.findAll().forEach(users::add);
////			else
//				userRepository.findByEmailContaining(email).forEach(users::add);
//
//			if (users.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<>(users, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}

	@GetMapping("/users/{email}")
	public ResponseEntity<Users> getUserById(@PathVariable("email") String email) {
		Optional<Users> userData = userRepository.findByEmailContaining(email);

		if (userData.isPresent()) {
			return new ResponseEntity<>(userData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/users")
	public ResponseEntity<Users> createUser(@RequestBody Users user) {
		try {
			Users _user = userRepository
					.save(new Users(user.getEmail(), user.getPassword()));
			// CHECK, look at the '0'.
			return new ResponseEntity<>(_user, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PutMapping("/users/{email}")
	public ResponseEntity<Users> updateUser(@PathVariable("email") String email, @RequestBody Users user) {
		Optional<Users> userData = userRepository.findByEmailContaining(email);

		if (userData.isPresent()) {
			Users _user = userData.get();
			_user.setEmail(user.getEmail());
			_user.setPassword(user.getPassword());
			return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}