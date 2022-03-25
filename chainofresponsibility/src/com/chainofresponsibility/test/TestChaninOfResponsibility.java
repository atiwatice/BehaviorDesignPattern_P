package com.chainofresponsibility.test;

public class TestChaninOfResponsibility {

	public static void main(String[] args) {
		
	File file = null;
	Handler textHandler = new TextFileHandler("Text File Handler");
	Handler docshandler = new DocFileHandler("MS Docs file handler");
	Handler excelHandler = new ExcelHandler("Excel File Handler");
	Handler audioHandler = new AudioFileHandler("Text File Handler");
	
	textHandler.setHandler(docshandler);
	docshandler.setHandler(excelHandler);
	excelHandler.setHandler(audioHandler);
	audioHandler.setHandler(textHandler);
	
	/*
	 * file = new File("abc.mp3","audio","C:"); textHandler.process(file);
	 */
	
	file = new File("abc.doc","doc","C:");
	textHandler.process(file);
	
	}
}
