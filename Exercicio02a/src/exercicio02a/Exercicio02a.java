/**
 * 1. Crie um novo projeto chamado `Exercicio02a.java`.
 * 2. Declare uma variável `String` chamada `frase` com o valor "A linguagem Java é poderosa.".
 * 3. Usando os métodos de `String`, faça e imprima o seguinte:
 * - Imprima o comprimento da frase.
 * - Imprima a frase em letras maiúsculas.
 * - Verifique e imprima se a frase contém a palavra "Java".
 * - Substitua e imprima a palavra 'poderosa' por 'incrível'
 */
package exercicio02a;

public class Exercicio02a {

    public static void main(String[] args) {
        
        String frase = "A linguagem Java e poderosa.";
        
        System.out.println("Comprimento da frase: " + frase.length());
        System.out.println("Frase em letras minusculas: " + frase.toLowerCase());
        System.out.println("Frase em letras miusculas: " + frase.toUpperCase());
        System.out.println("Na Frase tem 'Java'?: " + (frase.contains("Java") ? "Sim" : "Nao"));
        System.out.println("Substituir na Frase a palavra 'poderosa' por 'incrivel' : " + frase.replace("poderosa","incrivel"));
        
        
        
        
    }
    
}
