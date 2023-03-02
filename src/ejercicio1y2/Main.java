package ejercicio1y2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Electrodomesticos> lista = new ArrayList<>();
		
		lista.add(new Lavadoras(1500, COLOR.BLANCO, "D" , 60, 11));
		lista.add(new Frigorificos(2000, COLOR.GRIS, "C" , 80, "NO FROST"));
		lista.add(new Televisores(1100, COLOR.NEGRO, "E" , 30, 80, "HD"));
		
		lista.sort(precio);

}
