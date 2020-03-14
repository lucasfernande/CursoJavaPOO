package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numFunc;
	
	public PessoaJuridica() {
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFunc) {
		super(nome, rendaAnual);
		this.numFunc = numFunc;
	}

	public Integer getNumFunc() {
		return numFunc;
	}

	public void setNumFunc(Integer numFunc) {
		this.numFunc = numFunc;
	}

	@Override
	public double imposto() {
	       if(getNumFunc() > 10) {
	    	   return getRendaAnual() * 0.14;
	       }
	       else
	    	   return getRendaAnual() * 0.16;
	}

}
