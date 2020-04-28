package com.selimhorri.pack.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selimhorri.pack.entities.Person;
import com.selimhorri.pack.entities.read_only.PersonReadOnly;
import com.selimhorri.pack.services.PersonService;

@RestController
@CrossOrigin
@RequestMapping("/persons")
public class PersonController {
// Begin Class
	
	private final PersonService service;
	
	@Autowired
	@Lazy
	public PersonController(final PersonService service) {
		this.service = service;
	}
	
	@GetMapping(value = {"","/"})
	public List<PersonReadOnly> listPersons() {
		return this.service.listPersons();
	}
	
	@GetMapping(value = {"/{id}"})
	public PersonReadOnly getPerson(@PathVariable("id") @Valid final Integer id) {
		return this.service.getPerson(id);
	}
	
	@PostMapping(value = {"","/save"})
	public PersonReadOnly savePerson(@RequestBody @Valid final Person person) {
		return this.service.savePerson(person);
	}
	
	@PutMapping(value = {"","/update"})
	public PersonReadOnly updatePerson(@RequestBody @Valid final Person person) {
		return this.service.updatePerson(person);
	}
	
	@DeleteMapping(value = {"{id}","/delete/{id}"})
	public void deletePerson(@PathVariable("id") @Valid final Integer id) {
		this.service.deletePerson(id);
	}
	
	
	
// End Class
}









