import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada das notas
        double[] notas = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo da média
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;

        // Exibe a média
        System.out.printf("Média: %.2f%n", media);

        // Condições para aprovação, recuperação ou reprovação
        if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Fazer recuperação.");
        } else {
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
