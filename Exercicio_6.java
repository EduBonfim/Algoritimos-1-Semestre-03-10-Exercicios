//Não consegui resolver sozinho esse exercicio e tive que pedir ajuda,mas foi atras de descobrir 
//O que siginificava "integer.MAX_VALUE"

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner Leitor = new Scanner(System.in);
        int contador = 0;
        int menorNumero = Integer.MAX_VALUE; 

        while (contador < 10) {
            System.out.print("Digite um número inteiro e positivo: ");
            int numero = Leitor.nextInt();

            if (numero > 0) {
                if (numero < menorNumero) {
                    menorNumero = numero; 
                }
                contador++; 
            } else {
                System.out.println("Por favor, insira um número positivo.");
            }
        }

        System.out.println("O menor número digitado foi: " + menorNumero);
        
        Leitor.close();
    }
}
