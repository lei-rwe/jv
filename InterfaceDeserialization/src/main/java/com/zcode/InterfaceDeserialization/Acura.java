package com.zcode.InterfaceDeserialization;

public class Acura implements Car, Cylinder {
	private int maxSpeed;
	private String type;
	private String model;
	private int cylinder;

	public Acura(String model, int maxSpeed, String type) {
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.type = type;
		this.cylinder = 6;
	}

	public String model() {
		return model;
	}

	public int maxSpeed() {
		return maxSpeed;
	}

	public String type() {
		return type;
	}

	public int cylinder() {
		return cylinder;
	}

	@Override
	public String toString() {
		return "Model: " + model + ", Max speed: " + maxSpeed + " km/h, Type: " + type + " Cylinder: "
				+ Integer.toString(cylinder);
	}
}