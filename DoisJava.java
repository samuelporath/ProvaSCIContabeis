// Solicitar 5 números, ao fim, imprimir o número maior e o número menor.

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
    
        // Cria um ArrayList para armazenar os números digitados pelo usuário
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        // Cria um Scanner para capturar a entrada do usuário
        Scanner input = new Scanner(System.in);
        
        // Loop para solicitar que o usuário digite 5 números
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();
            
            // Adiciona o número digitado na lista de números
            numeros.add(numero);
        }
        
        // Inicializa as variáveis "maior" e "menor" com o primeiro número da lista
        int maior = numeros.get(0);
        int menor = numeros.get(0);
        
        // Loop para encontrar o maior e o menor número da lista
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                // Se o número atual for maior do que o maior número encontrado até agora, atualiza a variável "maior"
                maior = numeros.get(i);
            }
            if (numeros.get(i) < menor) {
                // Se o número atual for menor do que o menor número encontrado até agora, atualiza a variável "menor"
                menor = numeros.get(i);
            }
        }
        
        // Imprime o maior e o menor número da lista
        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
    }
}

// Os imports java.util.ArrayList e java.util.Scanner permitem o uso das classes ArrayList e Scanner, respectivamente, que são úteis
// para armazenar uma lista de valores e ler a entrada do usuário a partir do console. Sem os imports, essas classes não estariam disponíveis
// no código e seria necessário implementá-las do zero.
