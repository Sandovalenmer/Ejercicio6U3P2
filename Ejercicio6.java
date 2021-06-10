import java.util.*;

public class Ejercicio6{

	public static void main(String args[]) {
		double i, promedio1, promedio2;
		int mayores, menores, n, numero_personasmay, numero, numero_personasm;
		Scanner scanner = new Scanner(System.in);
		
		menores = 0;
		mayores = 0;
		numero_personasmay = 0;
		numero_personasm = 0;
		numero=0;
		for (i=1;i<=100;i++) {
			System.out.println("Ingrese edades");
			n = scanner.nextInt();
			if (n<25) {
				menores += n;
				numero_personasm++;
			}
			

			if (n>25) {
				mayores += n;
				numero_personasmay++;
			}
		}
		promedio1 = menores / numero_personasm;
		promedio2 = mayores / numero_personasm;
		System.out.println("El promedio de edad que tienen las personas menores a 25 es = "+promedio1);
		System.out.println("El promedio de edad que tienen las personas mayores a 25 es = "+promedio2);
	}


}

