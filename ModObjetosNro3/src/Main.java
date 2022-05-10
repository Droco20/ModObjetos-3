import java.io.IOException;
import java.util.Scanner;

/**
 * En esta clase se puede instanciar una lista de numeros reales y aplicar la
 * funcionalidad invocando los metodos desde la clase Methods
 */

public class Main {
	public static void main(String[] args) throws IOException {
		Methods obj = new Methods();
		Scanner nl = new Scanner(System.in);

		Scanner s = new Scanner(System.in);
		int menu1 = 0;

		try {
			do {

				System.out.println("Digita la cantidad de numeros que deseas en tu arreglo");
				int number = nl.nextInt();

				int[] array = obj.addArray(number);
				obj.Show(array);

				int low = 0;
				int high = array.length - 1;
				System.out.println("""

						Seleccione alguna de las siguientes opciones:

						1. Numeros Aleatorios.\n
						2. Numeros Ordenados.\n
						3. Salir\n
						:""");

				menu1 = Integer.parseInt(s.nextLine());
				switch (menu1) {
					case 1:
						System.out.println("");
						obj.Show(array);
						break;
					case 2:
						obj.quick(array, low, high);
						System.out.println("");
						obj.Show(array);
					default: {
					}
						break;

				}

			} while (menu1 != 3);

		} catch (NumberFormatException e) {
			System.out.println("Error: Verificar el dato ingresado");
		}

	}
}
