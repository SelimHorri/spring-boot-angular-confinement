package com.selimhorri.pack.services;

import java.util.List;

import com.selimhorri.pack.entities.Person;
import com.selimhorri.pack.entities.read_only.PersonReadOnly;

public interface PersonService {
// Begin Interface
	
	public abstract List<PersonReadOnly> listPersons();
	public abstract PersonReadOnly getPerson(final int id);
	public abstract PersonReadOnly savePerson(final Person person);
	public abstract PersonReadOnly updatePerson(final Person person);
	public abstract void deletePerson(final int id);
	
// End Interface
}





