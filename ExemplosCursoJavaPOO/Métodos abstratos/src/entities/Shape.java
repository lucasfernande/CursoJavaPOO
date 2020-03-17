package entities;

import java.awt.Color;

import entities.enums.Colors;

public abstract class Shape {
           
	private Colors color;
    
	public Shape() {
	}
	public Shape(Colors color) {
		super();
		this.color = color;
	}

    public Colors getColor() {
		return color;
	}

	public void setColor(Colors color) {
		this.color = color;
	}
	
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}
		
	
	


}
