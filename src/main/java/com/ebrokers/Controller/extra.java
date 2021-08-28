package com.ebrokers.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.ebrokers.Beans.User;
import com.ebrokers.Entity.Property;

public class extra {
	@GetMapping("/addUser")
	public String sendForm(User user) {
	//	logger.info("merchantId : "+ user.getName());
		return "addUser";
	}

	@PostMapping("/addUser")
	public String processForm(User user) {
	//	logger.info("merchantId2 : "+ user.getName());
		return "showMessage";
	}
	
		// TEST DB
/*	//Test DB
	
	@GetMapping("/testDb/{id}")
	public Optional<Property> test(@PathVariable Integer id) {
		logger.info("merchantId : " + id);
		return propertyRepository.findById(id);
	}
	
	@GetMapping("/testDb2/{id}")
	public Optional<Property> test2(@PathVariable Integer id) {
		logger.info("merchantId : " + id);
		Optional<Property> m = propertyRepository.findById(id);
		
		return m;
	}
	
	@GetMapping("/testDb3/{id}")
	public String test3(@PathVariable Integer id) {
		logger.info("merchantId : " + id);
		//Optional<Property> m = propertyRepository.findById(id);
		Property p = new Property();

		p.setLocation("BANDRA");
		p.setName("ASD");
		p.setMeid("233");
		propertyRepository.save(p);
		
		return "Created....";
	}*/

/*	<select class="form-select" aria-label="Default select example">
	  <option selected>State</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select>
	
	<select class="form-select" aria-label="Default select example">
	  <option selected>City</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select>
	
	<select class="form-select" aria-label="Default select example">
	  <option selected>Location</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select> 
	
	<select class="form-select" aria-label="Default select example">
	  <option selected>State</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select>
	
	<select class="form-select" aria-label="Default select example">
	  <option selected>City</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select>
	
	<select class="form-select" aria-label="Default select example">
	  <option selected>Location</option>
	  <option value="1">One</option>
	  <option value="2">Two</option>
	  <option value="3">Three</option>
	</select>*/
}
