/**
 * Nessa Classe Vamos criar os atributos e métodos genéricos que serão herdados pelas classes filhas
 */
package aula07a;

import javax.swing.JOptionPane;

public class Pessoa {

    // Atributos Privados: Encapsulamento
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome Inválido");
        } else {
            this.nome = nome.trim();    //Para tirar os espaços, então um resposta apenas com espaço n aceita
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            JOptionPane.showMessageDialog(null, "Idade inválida");
        } else {
            this.idade = idade;
        }
    }

    public void exibirDados() {
        if (nome == null || idade < 0 || idade > 120) {
            JOptionPane.showMessageDialog(null, "Valores informádos inválidos");
        } else {
            String msg = "Nome: " + this.nome + "\n";
            msg += "Idade: " + this.idade;
            JOptionPane.showMessageDialog(null, msg);
        }
    }

}
