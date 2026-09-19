/**
 * Nessa Classe vamos implementar os Objetos da classe Aluno
 */
package aula06a;

public class Aula06a {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.exibirdados();
        aluno1.nome = "Gaspar";     // Usando o objeto para informar
        aluno1.idade = 8;
        aluno1.curso = "Java";
        aluno1.exibirdados();
        
        Aluno aluno2 = new Aluno();
        aluno2.idade = 4;
        aluno2.exibirdados();
        
        Aluno aluno3 = new Aluno("Luiza", 10);  // Diretamente dentro do parametro
        aluno3.exibirdados();
        
        String nome = "Jorge";
        int idade = 14;
        String curso = "Python";
        Aluno aluno4 = new Aluno(nome, idade, curso);
        aluno4.exibirdados();
        
    }
    
}
