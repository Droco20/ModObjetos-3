
/** Esta clase me permite utilizar la funcionalidad requerida en el ejercicio */
public class Methods {

     /**
      * este metodo me permite construir un array de numeros reales aleatoriamente
      * solicitando a el usuario la cantidad de numeros para la nueva lista.
      */

     public int[] addArray(int number) {
          int[] array = new int[number];
          for (int i = 0; i < array.length; i++) {
               array[i] = (int) (Math.random() * 100);
          }
          return array;
     }

     /** metodo que permite mostrar la lista creada */

     public void Show(int[] array) {
          for (int a : array) {
               System.out.println("" + a);
          }

     }
     /**metodo que permite ordenar por medio del metodo burbuja  */

     public void quick(int[] array, int low, int high) {
          int middle = low + (high - low) / 2;
          int pivote = array[middle];
          int i = low, j = high;

          while (i <= j) {
               while (array[i] < pivote) {
                    i++;
               }
               while (array[j] > pivote) {
                    j--;

               }
               if (i <= j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    i++;
                    j--;
               }

          }
          if (low < j) {
               quick(array, low, j);
          }
          if (high > i) {
               quick(array, i, high);

          }
     }

}
