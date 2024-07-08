package com.example.Springboot_MariaDB_DTO_sample2;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController 
{
	@Autowired 
	PersonRepository prepo;
	
	@GetMapping("/bycity/{city}")
	PersonInterface show(@PathVariable String city)
	{
		return prepo.getByCity(city);
	}
	
	@GetMapping("/test")
	public String test()
	{
		return "This is demo test with interface";
	}
	
	@PostMapping("/save")
	public String savedata(@RequestBody Person person)
	{
		prepo.save(person);
		return "data Saved";
	}
	
	@GetMapping("/bylname/{lname}")
	public PersonDTO byLname(@PathVariable String lname)
	{
		return prepo.getByLname(lname);
	}
	
	@GetMapping("/{id}")
	public PersonInterface byId(@PathVariable int id)
	{
		return prepo.getDetailsById(id);
	}

}
