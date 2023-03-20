// Elabore um programa de computador que realize o cálculo de notas. Este programa deverá solicitar o nome do aluno e quatro notas, todo este
// conjunto deverá estar contido em um laço que confirme se deseja encerrar o programa ou continuar solicitando outros nomes e notas.
// Ao final da solicitação do nome e das notas deverá ser impresso o nome do aluno e a sua média,
// se a nota for  menor que 6 imprimir Reprovado, senão, se a nota for igual ou maior que 6, imprimir Aprovado.

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        // cria uma lista para armazenar as notas dos alunos
        ArrayList<Double> numeros = new ArrayList<Double>();

        Scanner input = new Scanner(System.in);

        while (true) {
            // solicita o nome do aluno
            System.out.print("Digite o nome do(a) aluno(a) (ou 'P' para parar): ");
            String nome = input.nextLine();

            // verifica se o usuário digitou 'P' para parar o programa
            if (nome.equalsIgnoreCase("P")) {
                break;
            }

            // limpa a lista de notas para cada aluno
            numeros.clear();

            // solicita as notas do aluno e adiciona na lista
            for (int i = 1; i <= 4; i++) {
                System.out.print("Digite a nota " + i + ": ");
                double numero = input.nextDouble();
                numeros.add(numero);
            }
            input.nextLine(); // limpa o buffer de entrada

            // calcula a média das notas do aluno
            double soma = 0;
            for (double numero : numeros) {
                soma += numero;
            }
            double media = soma / numeros.size();

            // verifica se o aluno foi aprovado ou reprovado
            String situacao = media >= 6 ? "Aprovado(a)" : "Reprovado(a)";

            // exibe o nome do aluno, sua média e situação
            System.out.println("Nome do(a) aluno(a): " + nome);
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
        }
    }
}
