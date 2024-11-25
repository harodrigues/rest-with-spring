package br.com.curso.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.excecao.ResourceNotFoundException;
import br.com.curso.model.Person;
import br.com.curso.repositories.PersonRepository;

@Service
public class PersonServices {
	//private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	public Person findById(Long id) {
		logger.info("Encontre uma pessoa.");
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		//return person;
	}
	
	public List<Person> findAll() {
		logger.info("Encontre todas as pessoas.");
		/*List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}*/
		return repository.findAll();
		//return persons;
		
	}

	/*
	 * private Person mockPerson(int i) { Person person = new Person();
	 * person.setId(counter.incrementAndGet()); person.setPrimeiroNome("Hélcio");
	 * person.setUltimoNome("Rodrigues"); person.setEndereco("Quadra 01 lote 01");
	 * person.setGenero("M");
	 * 
	 * return person; }
	 */
	

	public Person create(Person person) {
		logger.info("Crie uma pessoa.");
		return repository.save(person);
		//return person;
	}
	
	public Person update(Person person) {
		logger.info("Atualize uma pessoa.");
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		
		entity.setPrimeiroNome(person.getPrimeiroNome());
		entity.setUltimoNome(person.getUltimoNome());
		entity.setEndereco(person.getEndereco());
		entity.setGenero(person.getGenero());
		
		return repository.save(person);
		//return person;
	}
	
	public void delete(Long id) {
		logger.info("Excluir uma pessoa.");
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		repository.delete(entity);
		
	}
}
