package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrab;

public class Trabalhador {
      
	private String name;
	private NivelTrab nivel;
	private Double salariobase;
	
	/* Associação - um trabalhador tem UM departamento */
	private Departamento departamento;
	
	/* Associação - um trabalhador tem vários contratos */
	private List<HoraContrato> contratos = new ArrayList<>(); /*Quando tiver uma composição de tipo "tem muitos"*/
	                                                          /*não incluir no construtor, apenas instanciar ela vazia*/
	public Trabalhador() {
	}

	public Trabalhador(String name, NivelTrab nivel, Double salariobase, Departamento departamento) {
		this.name = name;
		this.nivel = nivel;
		this.salariobase = salariobase;
		this.departamento = departamento;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NivelTrab getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrab nivel) {
		this.nivel = nivel;
	}

	public Double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(Double salariobase) {
		this.salariobase = salariobase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

    public void addContrato(HoraContrato contrato) { /* Método de adicionar contratos - vai pegar a lista de contratos e adicionar */
    	contratos.add(contrato);
    }                                     /* Dois métodos responsáveis for FAZER ou DESFAZER a associação entre um trabalhador e um contrato */
    public void removeContrato(HoraContrato contrato) { /* Método para remover contratos - */
    	contratos.remove(contrato);
    }
    
    public double income(int month, int year) {
    	double soma = salariobase;
    	Calendar cal = Calendar.getInstance();
    	for (HoraContrato c : contratos) {
    		cal.setTime(c.getDate()); /* Pegando a data que foi instanciada no contrato */
    		int c_ano = cal.get(Calendar.YEAR); /* Extraindo o ano e mês do contrato */
    		int c_mes = 1 + cal.get(Calendar.MONTH);
    	     if(year == c_ano && month == c_mes) {
    			soma += c.valorTotal();
    	     }
    	}
    	return soma;
    }
	
}
