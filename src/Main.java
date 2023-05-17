import java.util.Scanner;

/**
 * Aplicación genera una matriz dada las filas y columnas por parte del usuario,
 * y llena con números aleatorios entre 0 y 10, y luego los muestra.
 * @author Brian Guzmán
 * @version 1.0
 */
public class Main {

  /**
   * matriz que será manipulada por la app.
   * @see http://www.google.com
   */
  public static int matrix[][];

  /**
   * lee un número entero ingresado por el usuario
   * @param message mensaje explicativo de la solucitud para el usuario
   * @return número entero ingresado por el usuario
   */
  public static int read(String message) {
    System.out.println(message);
    Scanner input = new Scanner(System.in);
    return input.nextInt();
  }

  /**
   * carga con datos aleatorios la matriz del proyecto.
   */
  public static void loadMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) ((Math.random() * 9) + 1);
      }
    }
  }

  /**
   * muestra el contenido de la matriz
   */
  public static void showMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print("[" + matrix[i][j] + "]");
      }
      System.out.println();
    }
  }

  /**
   * metodo principal de ejecución del programa.
   * @param args no los considero.
   */
  public static void main(String[] args) {
    int rows = read("Ingresa la cantidad de filas");
    int cols = read("Ingresa la cantidad de columnas");

    // lowerUpperCase -> lowerCamelCase
    String firstNameOfUser = "Brian";

    // UpperCase -> upperCamelCase
    String FirstLastName = "Guzmán";

    // snake_case
    String second_last_name = "Martínez";

    matrix = new int[rows][cols];

    loadMatrix();
    showMatrix();


  }
}