package exerciciosLista11;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        long produto = 1;

        for (int i = 1; i <= 10; i++) {
            produto *= i;
        }

        System.out.println("O produto dos números de 1 a 10 é: " + produto);
    }
}
