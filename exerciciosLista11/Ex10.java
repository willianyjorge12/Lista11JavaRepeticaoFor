package exerciciosLista11;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        int contadorPrimos = 0;

	        for (int i = 2; i <= 100; i++) {
	            if (ehPrimo(i)) {
	                contadorPrimos++;
	            }
	        }

	        System.out.println("Quantidade de números primos entre 1 e 100: " + contadorPrimos);
	    }

	    public static boolean ehPrimo(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
}
