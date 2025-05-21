package exerciciosLista11;
import java.util.Scanner;
public class Ex06 {
	  public static void main(String[] args) {
	        int n = 10; // quantidade de termos
	        int termo1 = 1, termo2 = 1;

	        System.out.print("Sequência de Fibonacci (primeiros 10 termos): ");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(termo1 + " ");

	            int proximoTermo = termo1 + termo2;
	            termo1 = termo2;
	            termo2 = proximoTermo;
	        }
}
}
