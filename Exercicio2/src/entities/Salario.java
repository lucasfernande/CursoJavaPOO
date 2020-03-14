package entities;

public class Salario {
      
	public String name;
	public double salbruto;
	public double imposto;
	
	public double saLiquido() {
		return salbruto - imposto;
	}
	public void bonussalario(double percentage) {
		salbruto += salbruto * percentage / 100.0;
	}
	public String toString() {
	return name + ", $ " + String.format("%.2f", saLiquido());
	}
	}

