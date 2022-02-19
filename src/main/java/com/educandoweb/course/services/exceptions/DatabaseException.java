package com.educandoweb.course.services.exceptions;

public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//Objeto recebendo uma string alimentada por uma mensagem da superclasse RuntimeException
	public DatabaseException(String msg) {
		super(msg);
	}
	
}
