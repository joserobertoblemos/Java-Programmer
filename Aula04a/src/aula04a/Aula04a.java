/**
 * Nesse Programa vamos estudar a estrutura de repetição do...while
 */
package aula04a;


public class Aula04a {

    public static void main(String[] args) {
        int contador = 1;
        
        do {
            System.out.println(contador);
            contador++;
        }
        while (contador <= 10);
            
        System.out.println("=".repeat(30));
        System.out.println("Fim do Programa");
    }
    
}
