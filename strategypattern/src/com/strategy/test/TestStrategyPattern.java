package com.strategy.test;

public class TestStrategyPattern {

	public static void main(String[] args) {
		TextFormatter formatter = new CapTextFormatter();
		TextEditor editor = new TextEditor(formatter);
		editor.publishText("Testing uppercase strategy");
		
		formatter = new LowerCaseFormatter();
		editor = new TextEditor(formatter);
		editor.publishText("TESTING LOWERCASE FORMATTER");
	}
}
