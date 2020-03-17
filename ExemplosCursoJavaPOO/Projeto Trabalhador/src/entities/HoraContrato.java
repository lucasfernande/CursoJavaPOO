package entities;

import java.util.Date;

public class HoraContrato {
         
	private Date date;
	private Double valorphora;
	private Integer horas;
	
	public HoraContrato() {
	}

	public HoraContrato(Date date, Double valorphora, Integer horas) {
		this.date = date;
		this.valorphora = valorphora;
		this.horas = horas;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValorphora() {
		return valorphora;
	}

	public void setValorphora(Double valorphora) {
		this.valorphora = valorphora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public double valorTotal() {
		return valorphora * horas;
	}
	
	
}
