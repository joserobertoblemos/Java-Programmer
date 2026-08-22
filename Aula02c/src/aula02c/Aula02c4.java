/**
 * Nesse programa vamos estudar o operador ternário (pergunta simples, respostas simples)
 */

package aula02c;

public class Aula02c4 {
    public static void main (String args[]){
        
        boolean ehAluno = false;
        
        System.out.println((ehAluno ? "e aluno" : "Nao e aluno"));
        
        String nome = "Gaspar Galego Neve";
        
        System.out.println(nome.contains("Neve"));
        System.out.println((nome.contains("Neve") ? "Contem no nome " : "Não contem no nome"));
        
        int idade = 18;
        String msg = idade >= 18 ? "Maior de Idade" : "Menor de Idade";
        
        System.out.println(msg);
        
    }
}
