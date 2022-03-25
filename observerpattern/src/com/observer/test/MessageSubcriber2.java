package com.observer.test;

public class MessageSubcriber2  implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubcriber2...."+ m.getMessageContent());
		
	}
}
