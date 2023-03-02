package ejercicio3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			double A, B, H;
			boolean F;
			
			do {
				System.out.println("Introduce el valor del cateto 1: ");
				A = Double.parseDouble(in.readLine());

				System.out.println("Introduce el valor del cateto 2: ");
				B = Double.parseDouble(in.readLine());

				H = Math.sqrt(Math.pow(A, B) + Math.pow(A, B));
				System.out.println("La hipotenusa es: " + H);


			}while(!= 'F');
			
		}catch(Not)
	}

}
