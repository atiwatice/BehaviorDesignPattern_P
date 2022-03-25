package com.strategy.test;

public class LowerCaseFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("Lower caseformatter-->"+text.toLowerCase());
		
	}

}
