package com.observer.test;

public class TestObserver {

	public static void main(String[] args) {
		MessageSubcriber1 messageSubcriber1 = new MessageSubcriber1();
		MessageSubcriber2 messageSubcriber2 = new MessageSubcriber2();
		
		MessagePublisher messagePublisher = new MessagePublisher();
		
		messagePublisher.attach(messageSubcriber1);
		messagePublisher.attach(messageSubcriber2);
		
		messagePublisher.notifyUpdate(new Message("First Message.."));
		
		messagePublisher.detach(messageSubcriber2);
		messagePublisher.notifyUpdate(new Message("Second Message.."));
	}
}
