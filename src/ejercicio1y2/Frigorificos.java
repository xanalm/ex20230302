package ejercicio1y2;

public class Frigorificos extends Electrodomesticos{
	
	private String marca;
	protected final String marcadefect = "NORMAL";
	
	
	public Frigorificos(double precio, COLOR color, String consumo, double peso, String marca) {
		super(precio, color, consumo, peso);
		this.marca = marca;
	}


	public String getMarca() {
		return marca;
	}


	public String getMarcadefect() {
		return marcadefect;
	}


	@Override
	public String toString() {
		return "Frigorificos [marca=" + marca + ", marcadefect=" + marcadefect + "]";
	}
	
	


}
