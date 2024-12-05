package br.com.curso.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.curso.data.vo.v1.PersonVO;
import br.com.curso.excecao.ResourceNotFoundException;
import br.com.curso.mapper.DozerMapper;
import br.com.curso.mapper.custom.PersonMapper;
import br.com.curso.model.Person;
import br.com.curso.repositories.PersonRepository;

@Service
public class PersonServices {
	//private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	@Autowired
	PersonRepository repository;
	
	@Autowired
	PersonMapper mapper;
	
	
	public PersonVO findById(Long id) {
		logger.info("Encontre uma pessoa.");
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		return DozerMapper.parseObject(entity,  PersonVO.class);
		//return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		//return PersonVO;
	}
	
	public List<PersonVO> findAll() {
		logger.info("Encontre todas as pessoas.");
		/*List<PersonVO> PersonVOs = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			PersonVO PersonVO = mockPersonVO(i);
			PersonVOs.add(PersonVO);
		}*/
		return DozerMapper.parseListObjects( repository.findAll(),  PersonVO.class);
		//return repository.findAll();
		//return PersonVOs;
		
	}

	/*
	 * private PersonVO mockPersonVO(int i) { PersonVO PersonVO = new PersonVO();
	 * PersonVO.setId(counter.incrementAndGet()); PersonVO.setPrimeiroNome("Hélcio");
	 * PersonVO.setUltimoNome("Rodrigues"); PersonVO.setEndereco("Quadra 01 lote 01");
	 * PersonVO.setGenero("M");
	 * 
	 * return PersonVO; }
	 */
	

	public PersonVO create(PersonVO person) {
		logger.info("Crie uma pessoa.");
		var entity =  DozerMapper.parseObject(person,  Person.class);
		var vo = DozerMapper.parseObject( repository.save(entity),  PersonVO.class);
		return vo;
		//return repository.save(PersonVO);
		//return PersonVO;
	}
	
	/*
	 * public PersonVOV2 createV2(PersonVOV2 person) {
	 * logger.info("Crie uma pessoa."); var entity =
	 * mapper.convertVoToEntity(person); var vo = mapper.convertEntityToVo(
	 * repository.save(entity)); return vo; //return repository.save(PersonVO);
	 * //return PersonVO; }
	 */
	
	public PersonVO update(PersonVO person) {
		logger.info("Atualize uma pessoa.");
		var entity = repository.findById(person.getId()).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		
		entity.setPrimeiroNome(person.getPrimeiroNome());
		entity.setUltimoNome(person.getUltimoNome());
		entity.setEndereco(person.getEndereco());
		entity.setGenero(person.getGenero());
		
		var vo = DozerMapper.parseObject( repository.save(entity),  PersonVO.class);
		return vo;
		//return repository.save(PersonVO);
		//return PersonVO;
	}
	
	public void delete(Long id) {
		logger.info("Excluir uma pessoa.");
		var entity = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Nenhum registro encontrado"));
		repository.delete(entity);
		
	}
}
