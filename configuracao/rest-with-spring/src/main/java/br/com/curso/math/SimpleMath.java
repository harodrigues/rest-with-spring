package br.com.curso.math;

public class SimpleMath {

	public Double sum(Double numberOne, Double numberTwo) throws Exception {
		return numberOne + numberTwo;
	}

	public Double subtract(Double numberOne, Double numberTwo) throws Exception {
		return numberOne - numberTwo;
	}

	public Double mult(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}

	public Double div(Double numberOne, Double numberTwo) throws Exception {
		return numberOne / numberTwo;
	}

	public Double pow(Double numberOne, Double numberTwo) throws Exception {
		return Math.pow(numberOne, numberTwo);
	}

	public Double sqrt(Double number) throws Exception {
		return Math.sqrt(number);
	}

	public Double mean(Double numberOne, Double numberTwo) throws Exception {
		return (numberOne + numberTwo) / 2;
	}
}
