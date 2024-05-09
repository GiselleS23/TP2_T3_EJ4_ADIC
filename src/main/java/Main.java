/* 4.- Realice un diagrama que escriba una tabla de dos columnas para la conversión entre las temperaturas en grados Fahrenheit -comprendidas entre 0 °F y 300 °F, según incrementos de 20 °F- y su equivalente en grados centígrados. La conversión entre grados Centigrados y grados Fahrenheit sigue la regla:
C = [5*(F-32)] / 9 
Sacchetti, Maria Giselle C2*/

/* si es de a 20 incrementos seran 15 elementos en la tabla para hacer de 0 a 300 */

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int fahrenheit = 0;
    double centigrados = 0;
    System.out.println("Tabla de conversión de temperaturas");
    System.out.println("----------------------------------");
    System.out.println("Fahrenheit A Centigrados");
    System.out.println("----------------------------------");
    while (fahrenheit <= 300) {
      centigrados = (5.0 * (fahrenheit - 32)) / 9.0;
      
      System.out.printf("%d\t\t\t\t%.2f%n", fahrenheit, centigrados);
      System.out.println("----------------------------------");
      fahrenheit += 20;
    }
    scanner.close();
  }
}