import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner calculos = new Scanner(System.in);
        int contador = 0;
        int Pessoas = 0;

        while (contador < 10) {

            System.out.print("Digite a altura da pessoa (em metros): ");
            double altura = calculos.nextDouble();

            System.out.print("Digite o peso da pessoa (em kg): ");
            double peso = calculos.nextDouble();

            double imc = peso / (altura * altura);

            if (imc >= 18.5 && imc <= 24.9) {
                Pessoas++;  
            }

            System.out.println("IMC da pessoa " + (contador + 1) + ": " + imc);
            
            contador++; 
        }

        System.out.printf("Número de pessoas com IMC entre 18,5 e 24,9: %.2f%n ", Pessoas);
        
    }
}