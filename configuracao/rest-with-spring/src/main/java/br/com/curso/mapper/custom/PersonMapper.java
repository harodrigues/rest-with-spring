package br.com.curso.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import br.com.curso.data.vo.v2.PersonVOV2;
import br.com.curso.model.Person;

@Service
public class PersonMapper {

	public PersonVOV2 convertEntityToVo(Person person) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(person.getId());
		vo.setEndereco(person.getEndereco());
		vo.setGenero(person.getGenero());
		vo.setPrimeiroNome(person.getPrimeiroNome());
		vo.setUltimoNome(person.getUltimoNome());
		vo.setDataNascimento(new Date());
		return vo;
	}

	public Person convertVoToEntity(PersonVOV2 person) {
		Person entity = new Person();
		entity.setId(person.getId());
		entity.setEndereco(person.getEndereco());
		entity.setGenero(person.getGenero());
		entity.setPrimeiroNome(person.getPrimeiroNome());
		entity.setUltimoNome(person.getUltimoNome());
		return entity;
	}
	
}

