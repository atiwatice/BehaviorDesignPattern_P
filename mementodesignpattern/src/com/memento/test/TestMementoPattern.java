package com.memento.test;


public class TestMementoPattern {

	public static void main(String[] args) {
		CareTaker careTaker = new CareTaker();
		Orginator orginator = new Orginator(1, 1, careTaker);
		System.out.println("Default State--"+orginator);
		
		
		// save point 1
		orginator.setX(10);
		orginator.createSavePoint("SAVE1");
		System.out.println("State:--"+orginator);
		
		// save point 2
		orginator.setY(11);
		orginator.createSavePoint("SAVE2");
		System.out.println("State--"+orginator);
		
		// save point 3
		orginator.setY(50);
		orginator.setX(45);
		orginator.createSavePoint("SAVE3");
		System.out.println("State--"+orginator);
		
		//orginator.undo("SAVE1");
		orginator.undoAll();
		
		
		System.out.println("State--"+orginator);
		
	}
}
