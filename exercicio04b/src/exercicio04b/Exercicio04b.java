/**
 * Crie uma array de números inteiros com 5 elementos. Usando o for e a biblioteca random, atribua um número 
 * aleatório entre 1 e 100 a cada item da array. Depois imprima todos os elementos da array
 */
package exercicio04b;
import java.util.Random;

public class Exercicio04b {

    public static void main(String[] args) {
        
        Random rd = new Random();
        
        // int numero = rd.nextInt(100) + 1; 2 fors 1 pra array e 1 pra imprimir
        
        int[] valores = new int[5];
        
        for(int valor : valores){ 
            valor = rd.nextInt(100) + 1;
        }
        for( valor; valor <valores.length; valor++){
            System.out.println("numero " + valores[valor]);
        }
    }
    
}
