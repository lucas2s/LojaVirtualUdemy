package com.sartorilucas.lojavirtualudemy.services.excepitions;

public class DataIntegrityExcepition extends RuntimeException{
	         
	private static final long serialVersionUID = 1L;
	
	public DataIntegrityExcepition (String msg) {
		super(msg);
	}
	
	public DataIntegrityExcepition (String msg, Throwable cause) {
		super(msg, cause);
	}

}
