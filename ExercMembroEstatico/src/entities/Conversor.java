package entities;

public class Conversor {
      
	public static double IOF = 0.06;
	
	public static double dolarToReal(double compra, double precoDolar) {
		return compra * precoDolar * (1.0 + IOF);
	}
}
