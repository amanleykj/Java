package com.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.bookclub.models.LoginUser;
import com.bookclub.models.User;
import com.bookclub.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public User register(User user, BindingResult result) {
		Optional<User> maybeUser = userRepo.findByEmail(user.getEmail());
		
		if(maybeUser.isPresent()) {
			result.rejectValue("email", "Matches", "An account with that email already exists." );
		}
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			result.rejectValue("confirmPassword", "Matches", "Passwords aren't matching up. Try again.");
		}
		if(result.hasErrors()) {
			return null;
		}
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepo.save(user);
	}
	
	public User login(LoginUser user, BindingResult result) {
		Optional<User> maybeUser = userRepo.findByEmail(user.getEmail());
		if(!maybeUser.isPresent()) {
			result.rejectValue("email", "Matches", "User not found with that email address." );
			return null;
		}
		User userFromDB = maybeUser.get();
		// check plain password from user and hashed password are matching
		if(!BCrypt.checkpw(user.getPassword(), userFromDB.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid password.");
		}
		if(result.hasErrors()) {
			return null;
		}
		 return userFromDB;
	}
	
	public User getOneUser(Long id) {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			return null;
		}
	}

}
