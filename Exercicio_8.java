import java.util.Scanner;

public class Exercicio_8 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        int NumAlunos = 5; 

        for (int i = 1; i <= NumAlunos; i++) {
            double nota1, nota2, media;

            do {
                System.out.print("Digite a primeira nota do aluno  " + i + " : ");
                nota1 = notas.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

            do {
                System.out.print("Digite a segunda nota do aluno  " + i + " : ");
                nota2 = notas.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
                }
            } while (nota2 < 0 || nota2 > 10);

            media = (nota1 + nota2) / 2;

            System.out.println("A média do aluno é: " + media);
        }
    }
}