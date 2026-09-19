/**
 * Nessa Classe vamos herdar os atributos e métodos da classe funcionários e implementar
 * os atributos e metodos específicos da classe Tecnico.
 */
package aula06c;

import javax.swing.JOptionPane;

public class Tecnico extends Funcionario {
    // Atributos específicos do Técnico
    String setor;
    String cargo;
    
    // Construtor
    public Tecnico (String nome, double salario, String setor, String cargo){
        super (nome, salario);                    // Para usar os mesmos métodos da classe Funcionario e implementar mais coisas
        this.setor = setor;
        this.cargo = cargo;
    }
    
    // Método específico da classe técnico
    public void realizarManutenção(){
        JOptionPane.showMessageDialog(null, "O Técnico: " + nome + " Trabalha no setor: " + setor);
    }
    
    // Método herdado da classe Funcionario
    @Override                                    // Para saber que está usando um método sobreposto
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
    }
    
}
