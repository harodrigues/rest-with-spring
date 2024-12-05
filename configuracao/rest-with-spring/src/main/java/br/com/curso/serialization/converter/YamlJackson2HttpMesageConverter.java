package br.com.curso.serialization.converter;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;



public class YamlJackson2HttpMesageConverter extends AbstractJackson2HttpMessageConverter{

	public YamlJackson2HttpMesageConverter() {
		super(
			new  ObjectMapper()
				.setSerializationInclusion(Include.NON_NULL),
					MediaType.parseMediaType("application/x-yaml")
				);
	}

}
