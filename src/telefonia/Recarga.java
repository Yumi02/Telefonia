package telefonia;
import java.util.Date;


public class Recarga {
	protected Date data;
	protected float valor;
	
	
	public Recarga(Date data, float valor) {
		super();
		this.data = data;
		this.valor = valor;
	}
	
	public Date getData() {
		return data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public String toString() {
		return "Recarga [data=" + data + ", valor=" + valor + "]";
	}
	
}
