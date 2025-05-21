package exerciciosLista11;
import java.util.Scanner;
public class Ex09 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o número " + i + ": ");
	            double num = scanner.nextDouble();
	            soma += num;
	        }

	        double media = soma / 10;
	        System.out.println("A média dos 10 números digitados é: " + media);

	        scanner.close();
	    }
}
