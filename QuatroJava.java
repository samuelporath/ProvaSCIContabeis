// Criar um vetor de cinco posições, solicitar cinco números e ao fim, imprimir o valor apresentado na posição três.

import java.util.ArrayList;
import java.util.Scanner;

public class ValorTres {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>(); // cria uma lista para armazenar os números

        Scanner input = new Scanner(System.in); // cria um objeto Scanner para leitura de entrada do usuário

        for (int i = 1; i <= 5; i++) { // loop para ler 5 números
            System.out.print("Digite um número: "); // lê o número digitado pelo usuário
            int numero = input.nextInt();
            numeros.add(numero); // adiciona o número à lista de números
        }

        System.out.println("Valor 3 do array: " + numeros.get(2)); // tentativa de acessar o valor 3 da lista
    }
}
