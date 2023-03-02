package ejercicio1y2;

public class Televisores extends Electrodomesticos{

	private double tama�o;
	private String sincronizador;
	protected final int tama�odefect = 20;
	protected final String sincronizaddordefect = "NORMAL";
	
	
	public Televisores(double precio, COLOR color, String consumo, double peso, double tama�o, String sincronizador) {
		super(precio, color, consumo, peso);
		this.tama�o = tama�o;
		this.sincronizador = sincronizador;
	}


	public double getTama�o() {
		return tama�o;
	}


	public String getSincronizador() {
		return sincronizador;
	}


	public int getTama�odefect() {
		return tama�odefect;
	}


	public String getSincronizaddordefect() {
		return sincronizaddordefect;
	}


	@Override
	public String toString() {
		return "Televisores [tama�o=" + tama�o + ", sincronizador=" + sincronizador + ", tama�odefect=" + tama�odefect
				+ ", sincronizaddordefect=" + sincronizaddordefect + "]";
	}
	
	
	
	
	
}
