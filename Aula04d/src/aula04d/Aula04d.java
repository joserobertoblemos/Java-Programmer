/**
 * Nesse Programa vamos estudar a estrutura de repetição for
 */
package aula04d;


public class Aula04d {

    public static void main(String[] args) {
        
        for (int i = 1; i<= 10; i++){
            System.out.println(i);
        }
        
        for (int i = 2; i<= 40; i += 2){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        for (int i = 10; i > 0; i --){
            System.out.println(i + "...");
        }
        
        System.out.println("F O G O !!!");
        
        
        for (int i = 1;  i <= 10; i++){
            int numero = 1;
            int total = i * numero;
            System.out.println( i + " X " + numero + " = " + total);
        }
        
    }
    
}
