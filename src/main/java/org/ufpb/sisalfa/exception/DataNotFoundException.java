package org.ufpb.sisalfa.exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 724841078458562239L;

	public DataNotFoundException(String message){
		super(message);
	}
}
