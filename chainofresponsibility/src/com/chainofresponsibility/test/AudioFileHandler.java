package com.chainofresponsibility.test;

public class AudioFileHandler implements Handler {

	private Handler handler;
	private String handlerName;
	
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}
	
	public AudioFileHandler(String handlerName) {
		this.handlerName = handlerName;
	}



	@Override
	public void process(File file) {

		if(file.getFileType().equalsIgnoreCase("audio")) {
			System.out.println("Audio File is processed and saved in database-- "+handlerName);
		}else if(handler!=null) {
			System.out.println(handlerName+ " forwarded request"+handler.handlerName());
			handler.process(file);
		}else {
			System.out.println("Handler is not avaiable or file is not supported");
		}
		
	}

	@Override
	public String handlerName() {
		return handlerName;
	}
	
}
