package com.strategy.test;

public class CapTextFormatter implements TextFormatter{

	@Override
	public void format(String text) {
		System.out.println("Cap text formatter-->"+text.toUpperCase());
		
	}

}
