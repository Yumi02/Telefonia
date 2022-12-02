package telefonia;
import java.util.Date;
import java.util.GregorianCalendar;


public class Recarga {
	private GregorianCalendar data;
	private float valor;
	
	
	public Recarga(GregorianCalendar data, float valor) {
		super();
		this.data = data;
		this.valor = valor;
	}
	
	public GregorianCalendar getData() {
		return data;
	}
	
	public float getValor() {
		return valor;
	}
	
	public String toString() {
		return "Recarga [data=" + data + ", valor=" + valor + "]";
	}
	
}
