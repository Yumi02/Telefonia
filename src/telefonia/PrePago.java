package telefonia;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrePago extends Assinante{

	protected float credito;
	protected int numRecargas;
	Recarga recargas[] = new Recarga[6];
	
	//protected Recarga[]recargas;
	
	
	public PrePago(Date d, Integer duracao, String nome, int numero, long cpf, float credito, int numRecargas, Recarga[] recargas) {
		super(d, duracao, nome, numero, cpf);
		this.credito = credito;
		this.numRecargas = numRecargas;
		this.recargas = recargas;
	}
	
	public void fazerChamada(GregorianCalendar data, int duracao) {
		
	}
	
	public void recarregar(GregorianCalendar data, float valor) {
		boolean completo = true;
		for(int i = 0; i < recargas.length; i++)
			if (recargas[i] == null) {
				
			}
			else {
				System.out.println("não é possivel realizar mais recargas.");
			}
	}
	public void imprimirFatura(int mes) {
		
	}
		/*Assinante a;
		a = new Assinante(21, 12, ant, 12, 382000);
		a.getCpf();*/
	


	
	

}
