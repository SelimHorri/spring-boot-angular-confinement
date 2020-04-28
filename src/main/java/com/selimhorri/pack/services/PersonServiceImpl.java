package com.selimhorri.pack.services;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.selimhorri.pack.entities.Person;
import com.selimhorri.pack.entities.read_only.PersonReadOnly;
import com.selimhorri.pack.repositories.PersonRepository;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
// Begin Class
	
	private final PersonRepository rep;
	
	@Autowired
	@Lazy
	public PersonServiceImpl(final PersonRepository rep) {
		this.rep = rep;
	}
	
	@Override
	public List<PersonReadOnly> listPersons() {
		return Collections.unmodifiableList(this.rep.findAll());
	}
	
	@Override
	public PersonReadOnly getPerson(final int id) {
		return this.rep.findById(id).get();
	}
	
	@Override
	public PersonReadOnly savePerson(final Person person) {
		return this.rep.save(person);
	}
	
	@Override
	public PersonReadOnly updatePerson(final Person person) {
		return this.rep.save(person);
	}
	
	@Override
	public void deletePerson(final int id) {
		this.rep.deleteById(id);
	}
	
	
	
// End Class
}









