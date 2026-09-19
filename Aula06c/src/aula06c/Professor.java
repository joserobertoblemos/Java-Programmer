/**
 * Nesse classe vamos herdar os atributos e métodos da classe funcionários e implementar
 * os atributos e metodos específicos da classe professor.
 */
package aula06c;

import javax.swing.JOptionPane;

public class Professor extends Funcionario {

    // Atributos específicos
    String disciplina;
    String periodo;

    // Construtor
    public Professor(String nome, double salario, String disciplina, String periodo) {

        // Chama o construtor da Super Classe
        super(nome, salario);                               // Para usar os mesmos métodos da classe Funcionario e implementar mais coisas
        this.disciplina = disciplina;
        this.periodo = periodo;
    }

    // Método especpifico da classe professor
    public void ensinar() {
        JOptionPane.showMessageDialog(null, "O Professor(a) " + nome + " Lesiona a matéria de " + disciplina);
    }

    // Método sobreposto da classe Funcionario
    @Override                                               // Para saber que está usando um método sobreposto
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Periodo: " + periodo);
        
    }
}
