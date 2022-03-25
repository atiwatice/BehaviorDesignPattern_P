package com.memento.test;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {

	private final Map<String,Memento>savePointStorage = new HashMap<>();
	
	public void saveMemento(Memento memento,String savePointName) {
		//System.out.println("Saving the state---- "+savePointName);
		savePointStorage.put(savePointName,memento);
	}
	
	public Memento getMemento(String savePointName) {
		System.out.println("undo at---- "+savePointName);
		return savePointStorage.get(savePointName);
	}
	
	public void clearSavePoints() {
		System.out.println("clearing all the saved state---- ");
		savePointStorage.clear();
	}
}
