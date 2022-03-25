package com.chainofresponsibility.test;

public class ExcelHandler implements Handler{

	private Handler handler;
	private String handlerName;
	
	@Override
	public void setHandler(Handler handler) {
		this.handler = handler;
		
	}
	
	public ExcelHandler(String handlerName) {
		this.handlerName = handlerName;
	}



	@Override
	public void process(File file) {

		if(file.getFileType().equalsIgnoreCase("xls")) {
			System.out.println("Excel File is processed and saved in database-- "+handlerName);
		}else if(handler!=null) {
			System.out.println(handlerName+ " forwarded request"+handler.handlerName());
			handler.process(file);
		}else {
			System.out.println("Handler is not available or file is not supported");
		}
		
	}

	@Override
	public String handlerName() {
		return handlerName;
	}
	

}
