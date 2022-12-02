package telefonia;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class PosPago extends Assinante{
	private float assinatura=0;
	
	public PosPago(long cpf, String nome, int numero, float assinatura) {
		super(nome, numero, cpf, numero);
		this.assinatura = assinatura;
	}

	public void fazerChamada(Date data, int duracao) {		
		
		if(this.numChamadas > 0){
			//System.out.println(this.numChamadas);
			if(numChamadas > 0){
				this.assinatura = assinatura + duracao * 1.04f;
				this.chamadas[this.numChamadas - 1] = new Chamada(data, duracao);
				this.numChamadas = this.numChamadas - 1;
				//System.out.println(this.assinatura);
			}
		} else{
			System.out.println("não é possivel realizar mais chamadas");
		}

	}
	
	// O método deve imprimir os dados do assinante (CPF, nome e número do telefone), 
	//a data, duração e valor de suas chamadas feitas no mês.Deve imprimir também o valor total da fatura, 
	//que é a soma da assinatura (atributo assinatura) com o custo de todas as ligações do mês.
	
	public void imprimirFatura(int mes) {
			/*for(int i=0;i< this.chamadas.length;i++)
		    {   if( this.chamadas[i].getData()) {
		    		System.out.println(this.chamadas[i].getData());
		    		
				
					Date aux = this.chamadas[i].getData();

		    		aux2.setMonth(12);
		    		if (aux.getMonth() = aux2) {
		    		System.out.println(aux);
		    		}
		    		
		    	}
		    }*/
		
	
	

	/*inicio teste
	
	public void mostrarChamadas() {
		for(int i =0; i < this.chamadas.length; i ++) {
			System.out.println(this.chamadas[i]);
		}
	}
	
	
	public static void main(String[] args) {
		PosPago p = new PosPago(38299, "Ant", 4, 0f);
		GregorianCalendar gc = new GregorianCalendar();
		
		gc.set(1999,01,01);
		Date d = gc.getTime();
		p.fazerChamada(d,10);
		gc.set(2020,9,02);
		d = gc.getTime();
		p.fazerChamada(d,100);

		
		p.fazerChamada(new Date(),200);
		p.fazerChamada(new Date(),300);
		p.fazerChamada(new Date(),400);
		p.mostrarChamadas();
		System.out.println(p.toString());
		p.imprimirFatura(9);
		DateFormat dfs = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dfs.format(new Date()));

		fim teste*/
	}
}
