package com.iterator.test;

public class IteratorPatternTest {

	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Triangle");
		storage.addShape("Circle");
		storage.addShape("Square");
		
		ShapeIterator iterator = new ShapeIterator(storage.getShape());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Removing element from shape storage...");
		iterator = new ShapeIterator(storage.getShape());
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
	}
}
