package br.com.curso.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.converters.NumberConverter;
import br.com.curso.excecao.UnsupportedMathOperationException;
import br.com.curso.math.SimpleMath;

@RestController
public class MathController {

	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.sum(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	
	@RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtract(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.subtract(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	
	@RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.mult(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.div(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	
	@RequestMapping(value = "/pow/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double pow(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.pow(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	
	@RequestMapping(value = "/sqrt/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sqrt(@PathVariable(value = "numberOne") String numberOne
			) throws Exception {
		if (!NumberConverter.isNumeric(numberOne)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return  math.sqrt(NumberConverter.converterParaDouble(numberOne));
		

	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Informe um número");
		}
		return math.mean(NumberConverter.converterParaDouble(numberOne), NumberConverter.converterParaDouble(numberTwo));

	}
	

	
}
