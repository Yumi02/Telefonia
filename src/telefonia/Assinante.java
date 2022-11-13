package telefonia;

import java.util.ArrayList;
import java.util.Date;

public class Assinante extends Chamada{
	protected String nome;
	protected int numero;
	protected long cpf;
	protected int numChamadas;
	protected ArrayList<Chamada>chamadas;
	
	public Assinante(Date d, Integer duracao, String nome, int numero, long cpf) {
		super(d, duracao);
		this.nome = nome;
		this.numero = numero;
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Assinante [Nome=" + nome + ", CPF=" + cpf + "Numero=" + numero + "Numero de Chamadas=" + numChamadas + "]";
	}
}
