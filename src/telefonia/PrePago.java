package telefonia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrePago extends Assinante{

	private float credito;
	private int numRecargas;
	protected Recarga[] recargas;
	
	//construtor da classe com seus atributos e atributos da classe Assinante
	public PrePago(long cpf, String nome, int numero, Recarga recargas[]) {
		super(nome, numero, cpf, numero);
		this.credito = credito;
		this.numRecargas = numRecargas;
		this.recargas = new Recarga[numRecargas];
	}
	
	public void fazerChamada(Date data, int duracao) {
		if(this.numChamadas > 0){
			
			if(numChamadas > 0){
				if(credito > (duracao*1.45f)) {
					this.credito = credito - duracao * 1.45f;
					this.chamadas[this.numChamadas - 1] = new Chamada(data, duracao);
					this.numChamadas = this.numChamadas - 1;
				}
				else {
					System.out.println("Credito insuficiente");
				}
				
			}
			else{
			System.out.println("não é possivel realizar mais chamadas");
			}
		}
	}
	
	public void recarregar(GregorianCalendar data, float valor) {
		if(this.numRecargas > 0){
			if(numRecargas > 0){
					this.credito = credito + valor;
					this.recargas[this.numRecargas - 1] = new Recarga(data, valor);
					this.numRecargas = this.numRecargas - 1;	
			}
			else{
			System.out.println("não é possivel realizar mais recargas");
			}
		}
		
		
		/*for(int i = 0; i < recargas.length; i++) {
			if (recargas.length < ) {
				
			}
			else {
				System.out.println("não é possivel realizar mais recargas.");
			}*/
	}

	// O método deve imprimir os dados do assinante (CPF, nome e número do telefone),
	//a data, duração e valor de suas chamadas feitas no mês.Deve imprimir também o valor total da fatura,
	//que é a soma da assinatura (atributo assinatura) com o custo de todas as ligações do mês.
	public void imprimirFatura(int mes) {
		
	}

}
