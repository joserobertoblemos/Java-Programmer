/**
 * Nesse Programa vamos estudar o uso da estrutura de repetição while
 */
package aula03c;


public class Aula03c {

    public static void main(String[] args) {
        String frase = "É PIQUE!";
        int contador = 1;
        
        while (contador <= 5){
            System.out.print(frase);
            contador++;
        }
        
        contador = 1;
        frase = "É HORA";
        while (contador <= 5){
            System.out.print(frase);
            contador++;
        }
        System.out.println("\nRA-TIM-BUM!");
        
        
    }
    
}
