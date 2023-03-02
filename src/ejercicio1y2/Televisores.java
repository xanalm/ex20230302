package ejercicio1y2;

public class Televisores extends Electrodomesticos{

	private double tamaño;
	private String sincronizador;
	protected final int tamañodefect = 20;
	protected final String sincronizaddordefect = "NORMAL";
	
	
	public Televisores(double precio, COLOR color, String consumo, double peso, double tamaño, String sincronizador) {
		super(precio, color, consumo, peso);
		this.tamaño = tamaño;
		this.sincronizador = sincronizador;
	}


	public double getTamaño() {
		return tamaño;
	}


	public String getSincronizador() {
		return sincronizador;
	}


	public int getTamañodefect() {
		return tamañodefect;
	}


	public String getSincronizaddordefect() {
		return sincronizaddordefect;
	}


	@Override
	public String toString() {
		return "Televisores [tamaño=" + tamaño + ", sincronizador=" + sincronizador + ", tamañodefect=" + tamañodefect
				+ ", sincronizaddordefect=" + sincronizaddordefect + "]";
	}
	
	
	
	
	
}
