package com.observer.test;

public class MessageSubcriber1 implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubcriber1...."+ m.getMessageContent());
		
	}

}
