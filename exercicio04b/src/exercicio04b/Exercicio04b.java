/**
 * Crie uma array de números inteiros com 5 elementos. Usando o for e a biblioteca random, atribua um número 
 * aleatório entre 1 e 100 a cada item da array. Depois imprima todos os elementos da array
 */
package exercicio04b;
import java.util.Random;

public class Exercicio04b {

    public static void main(String[] args) {
        Random rd = new Random();
        int[] valores = new int[5];

        // Primeiro loop: Preenche a array usando um for tradicional (com índice)
        for (int i = 0; i < valores.length; i++) {
            valores[i] = rd.nextInt(100) + 1; // Atribui o número diretamente na posição i
        }

        // Segundo loop: Imprime os elementos (aqui o for-each funciona perfeitamente)
        System.out.println("Elementos da array:");
        for (int valor : valores) {
            System.out.println("numero " + valor);
        }
    }
}
