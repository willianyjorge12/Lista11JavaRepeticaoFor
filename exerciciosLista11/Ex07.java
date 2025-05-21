package exerciciosLista11;
import java.util.Scanner;
public class Ex07 {
	  public static void main(String[] args) {
	        int contador = 0;

	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0) {
	                contador++;
	            }
	        }

	        System.out.println("Quantidade de números divisíveis por 3 entre 1 e 50: " + contador);
	    }
}
