// Solicitar a inserção de 5 números, ao final, imprimir os números pares, números ímpares e a média geral desses números.

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploFor {
    public static void main(String[] args) {

        // cria uma lista para armazenar os números digitados pelo usuário
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // cria um objeto Scanner para ler os números digitados pelo usuário
        Scanner input = new Scanner(System.in);

        // faz um loop 5 vezes para que o usuário possa digitar 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt(); // lê um número digitado pelo usuário
            numeros.add(numero); // adiciona o número à lista de números
        }

        // exibe os números pares da lista de números
        System.out.print("Numeros pares: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) { // verifica se o número é par
                System.out.print(numero + ", "); // exibe o número par
            }
        }
        
        // exibe uma linha em branco
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println(" ");
        
        // exibe os números ímpares da lista de números
        System.out.print("Numeros impares: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) { // verifica se o número é ímpar
                System.out.print(numero + ", "); // exibe o número ímpar
            }
        }
        
        // exibe uma linha em branco
        System.out.println(" ");
        System.out.println("--------------------");
        System.out.println(" ");
        
        // calcula a média dos números da lista
        int soma = 0;
        for (int numero : numeros) {
            soma += numero; // soma cada número da lista
        }
        double media = (double) soma / numeros.size(); // calcula a média

        // exibe a média dos números da lista arredondada
        System.out.println("Media dos valores: " + Math.round(media));
    }
}


// O primeiro import (java.util.ArrayList) importa a classe ArrayList do pacote java.util. A classe ArrayList é uma implementação da interface
// List em que os elementos são armazenados em um array dinâmico, ou seja, pode ser redimensionado conforme a necessidade.

// O segundo import (java.util.Scanner) importa a classe Scanner do pacote java.util. A classe Scanner é utilizada para ler dados de entrada
// do usuário, como números ou strings, a partir do console.
