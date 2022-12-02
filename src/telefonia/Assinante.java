package telefonia;

import java.util.Date;

abstract class Assinante{
	private String nome;
	private int numero;
	private long cpf;
	protected int numChamadas;
	protected Chamada[] chamadas;
	
	public Assinante(String nome, int numero, long cpf, int num) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.cpf = cpf;
		this.numChamadas = num;
		this.chamadas = new Chamada[num];
	}

	public long getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Assinante [Nome = " + nome + ", CPF = " + cpf + ", Numero = " + numero + "]";
	}
}
