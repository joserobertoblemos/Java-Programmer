/**
 * Nessa Classe vamos implementar a sobrecarga de construtores (Conhecida como constructor Overloading) 
 */
package aula06a;

import javax.swing.JOptionPane;


public class Aluno {
    
    // Atributos
    
    String nome;
    int idade;
    String curso;
    
    // Construtor 1: sem parametros

    public Aluno(){
            this.nome = "Não informado";
            this.idade = 0;
            this.curso = "Não informado";
    }
        
    // Construtor 2: recebe 1 parametro
    
    public Aluno(String nome){                  //Possibilita cadastrar apenas com nome
        this.nome = nome;
        this.idade = 0;
        this.curso = "Não informado";
    }
    
    // Construtor 3: recebe 2 parametros - nome e idade
    public Aluno(String nome, int idade){                   //Possibilita cadastrar apenas com nome e idade
        this.nome = nome;
        this.idade = idade;
        this.curso = "Nao informado";
    }
    
    // Construtor 4: recebe 3 parametros - nome, idade e curso
    public Aluno(String nome, int idade, String curso){       //Possibilita cadastrar com nome, idade e curso
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    
    // Método
    public void exibirdados(){
        String msg = "Nome: " + this.nome;
        msg += "\nIdade: " + this.idade;
        msg += "\nCurso: " + this.curso;
        
        JOptionPane.showMessageDialog(null, msg, "Cadastro de Alunos", 1);
    }
}
