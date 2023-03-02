package ejercicio1y2;

enum COLOR {BLANCO, NEGRO, ROJO, AZUL, GRIS}

public class Electrodomesticos {

	private double precio;
	private COLOR color;
	private String consumo;
	private double peso;


	public Electrodomesticos(double precio, COLOR color, String consumo, double peso) {
		super();
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}


	public Electrodomesticos(COLOR color, String consumo) {
		super();
		this.color = color;
		this.consumo = consumo;
	}


	public Electrodomesticos() {
		super();
	}


	public double getPrecio() {
		return precio;
	}


	public COLOR getColor() {
		return color;
	}


	public String getConsumo() {
		return consumo;
	}


	public double getPeso() {
		return peso;
	}


	@Override
	public String toString() {
		return "Electrodomesticos [precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso
				+ "]";
	}


	public double precioFinal() {
		int precioConsumo = 0;
		int precioTamaño = 0;

		if (consumo == "A")
			precioConsumo = 100;

		else if (consumo == "B")
			precioConsumo = 80;

		else if (consumo== "C")
			precioConsumo = 60;

		else if (consumo == "D")
			precioConsumo = 50;

		else if (consumo == "E")
			precioConsumo = 30;

		else if (consumo == "F")
			precioConsumo = 10;


		if (peso >= 19)
			precioTamaño = 10;

		else if (peso >= 20 && peso < 49)
			precioTamaño = 50;

		else if (peso >= 50 && peso < 79)
			precioTamaño = 80;

		else if (peso >= 80)
			precioTamaño = 100;

		return precio + precioConsumo + precioTamaño;
	}

}
