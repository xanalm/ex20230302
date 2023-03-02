package ejercicio1y2;

public class Lavadoras extends Electrodomesticos{
	
	private int carga;
	protected final int cargadefect = 5;
	
	
	public Lavadoras(double precio, COLOR color, String consumo, double peso, int carga) {
		super(precio, color, consumo, peso);
		this.carga = carga;
	}


	public int getCarga() {
		return carga;
	}


	public int getCargadefect() {
		return cargadefect;
	}


	@Override
	public String toString() {
		return "Lavadoras [carga=" + carga + ", cargadefect=" + cargadefect + "]";
	}
	
	
	@Override
	public double precioFinal() {
		 if (carga > 8)
	            return super.precioFinal() + 50;
	        else
	            return super.precioFinal();
	    }
	}

}
