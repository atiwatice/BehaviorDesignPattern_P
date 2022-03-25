package com.chainofresponsibility.test;


public interface Handler {

	public void setHandler(Handler handler);
	public void process(File file);
	public String handlerName();
	
}
