package com.memento.test;

public class Orginator {

	private double x;
	private double y;
	private String lastUndoSavePoint;

	private CareTaker careTaker;

	public Orginator(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Orginator(double x, double y, CareTaker careTaker) {
		this.x = x;
		this.y = y;
		this.careTaker = careTaker;
		createSavePoint("INITIAL");
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void createSavePoint(String savePointName) {
		careTaker.saveMemento(new Memento(this.x, this.y), savePointName);
		lastUndoSavePoint = savePointName;
	}

	public void undo(String savePointName) {
		setOriginatorState(savePointName);
	}

	public void undo() {
		setOriginatorState(lastUndoSavePoint);
	}

	public void undoAll() {
		setOriginatorState("INITIAL");
		careTaker.clearSavePoints();
	}

	private void setOriginatorState(String savePointName) {
		Memento memento = careTaker.getMemento(savePointName);
		this.x = memento.getX();
		this.y = memento.getY();
	}

	@Override
	public String toString() {
		return "Orginator [x=" + x + ", y=" + y + "]";
	}

}
