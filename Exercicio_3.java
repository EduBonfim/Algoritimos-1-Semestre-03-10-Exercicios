import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner sequencial = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sequencial.nextInt();

        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor *= 2;
        }
        
        sequencial.close();
    }
}