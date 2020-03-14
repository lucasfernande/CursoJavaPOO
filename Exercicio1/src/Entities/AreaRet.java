package Entities;

public class AreaRet {
       
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	public double perimetro() {
		return 2 * (width + height);
	}
	public double diag() {
		return Math.sqrt(width*width + height*height);
	}
}
