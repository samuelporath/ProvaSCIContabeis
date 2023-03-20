// Crie uma matriz bidimensional. Deverá ser solicitado três nomes de alunos e quatro notas, após solicitação dos
// nomes e das notas deverá ser impresso os nomes acompanhados da média geral de cada aluno, deverá ser impresso
//também o nome do aluno que obteve a maior média e o nome do aluno que obteve a menor média.

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizMediaAlunos {

// método principal
public static void main(String[] args) {

    // criação de um ArrayList de objetos Aluno
    ArrayList<Aluno> alunos = new ArrayList<>();
    // criação de um objeto Scanner para leitura dos dados de entrada
    Scanner scanner = new Scanner(System.in);

    // laço para ler os dados de cada aluno
    for (int i = 0; i < 3; i++) {
        // solicitação do nome do aluno ao usuário
        System.out.print("Digite o nome do(a) aluno(a) " + (i+1) + ": ");
        String nome = scanner.nextLine();
        // criação de um array de notas para o aluno
        double[] notas = new double[4];
        // laço para ler as 4 notas do aluno
        for (int j = 0; j < 4; j++) {
            // solicitação da j-ésima nota do aluno ao usuário
            System.out.print("Digite a nota " + (j+1) + " de " + nome + ": ");
            notas[j] = scanner.nextDouble();
        }
        scanner.nextLine();
        // criação de um objeto Aluno com o nome e as notas lidos e adição do objeto no ArrayList
        alunos.add(new Aluno(nome, notas));
    }

    // variáveis para armazenar a maior e a menor média e os nomes dos alunos correspondentes
    double maiorMedia = 0;
    double menorMedia = Double.MAX_VALUE;
    String nomeMaiorMedia = "";
    String nomeMenorMedia = "";

    // laço para calcular as médias dos alunos e encontrar a maior e a menor média
    for (Aluno aluno : alunos) {
        double media = aluno.calcularMedia();
        if (media > maiorMedia) {
            maiorMedia = media;
            nomeMaiorMedia = aluno.getNome();
        }
        if (media < menorMedia) {
            menorMedia = media;
            nomeMenorMedia = aluno.getNome();
        }
    }

    // exibição das médias de cada aluno
    System.out.println("Médias dos alunos:");
    for (int i = 0; i < alunos.size(); i++) {
        System.out.println(alunos.get(i).getNome() + ": " + alunos.get(i).calcularMedia());
    }

    // exibição do nome do aluno com a maior e a menor média
    System.out.println("Aluno(a) com a maior média: " + nomeMaiorMedia);
    System.out.println("Aluno(a) com a menor média: " + nomeMenorMedia);

    // fechamento do objeto Scanner
    scanner.close(); 
}

// definição da classe Aluno
private static class Aluno {
    private String nome;
    private double[] notas;

    // construtor da classe Aluno
    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    // método para retornar o nome do aluno
    public String getNome() {
        return nome;
    }

    // método para retornar o array de notas do aluno
    public double[] getNotas() {
        return notas;
    }

    // método para calcular a média das notas do aluno
    public double calcularMedia() {
        double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }
            return soma / notas.length;
        }
    }
}
