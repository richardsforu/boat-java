package com;

public class NoSuchHotelFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NoSuchHotelFoundException(String msg) {
		super(msg);
	}

}
