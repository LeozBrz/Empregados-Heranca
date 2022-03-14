package entidades;

public  class Terceirizados extends Empregados {

	private double valorAdicional;

	public Terceirizados(String nome, int horas, double valorHora, double valorAdicional) {
		super(nome, horas, valorHora);
		this.valorAdicional = valorAdicional;
	}
	
	public Terceirizados() {
		super();
		
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double pagamento() {
		return horas*valorHora+valorAdicional;
	}
	
}
