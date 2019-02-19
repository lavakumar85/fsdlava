package com.fsd.mentorondemand.resource;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsd.mentorondemand.model.User;
import com.fsd.mentorondemand.repository.MentorRepository;
//@CrossOrigin(origins="*")
@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
public class DBResourceController {
	
	@Autowired
	public MentorRepository mentorRepository;
	
	User user;
	
	@GetMapping("/users")
	public Iterable<User> retrieveUservalues(){
	
		return mentorRepository.findAll();
	}


	@GetMapping("/user/{id}")
	public Optional<User> retrieveUservalueById(@PathVariable int id){
	
		return mentorRepository.findById(id);
		
	}
	
	
    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
    public Iterable<User> add(@RequestBody final User user) {
    	System.out.println("Enetr the dfragon");

		/*
		 * quotes.getQuotes() .stream() .map(quote -> new Quote(quotes.getUserName(),
		 * quote)) .forEach(quote -> quotesRepository.save(quote)); return
		 * getQuotesByUserName(quotes.getUserName());
		 */
    	
    	mentorRepository.save(user);
    	return mentorRepository.findAll();
    	
    }

	
	/*
	 * @GetMapping("/signup/{username}{firstname}{lastname}") public Optional<User>
	 * doSignup(@PathVariable String username,@PathVariable String
	 * firstname,@PathVariable String lastname){
	 * 
	 * return mentorRepository.findById(id);
	 * 
	 * }
	 */
	
	
}
