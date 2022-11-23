package com.protoype;


import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 */
public abstract class GameUnit implements Cloneable{
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}



	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}

	@Override
	public GameUnit clone() throws CloneNotSupportedException{
		GameUnit gameUnit = (GameUnit) super.clone();  // super.clone()   >>> shallow copy
		gameUnit.initialize(); // this resets the state(e.g fields -> position) of the base class before returning it to the outside world
		return gameUnit;
	}

	protected void initialize(){
		this.position = Point3D.ZERO;
	}

	protected abstract void reset(); // an ability provided to the inheritors to inherit their own states
}
