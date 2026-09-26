/**
 * Uma Classe abstrata possui métodos abstratos (contratos) que as classes  filhas devem implementar.
 * Uma classe abstrata pode posuir metodos concretos que serão hardados pelas classes filhas
 */
package aula07d;

import javax.swing.JOptionPane;

public abstract class Conta {

    private String titular;
    private double saldo;

    //Construtor
    public Conta(String titular, double salario) {
        this.titular = titular;
        this.saldo = saldo;
    }

    
    public String getTitular() {
        return titular;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            JOptionPane.showMessageDialog(null, "Valor do depósito inválido");
        }
    }
    
    public void setSaldo(double valor){
        this.saldo -= valor;
    }
    
    public void exibirSaldo(){
        JOptionPane.showMessageDialog(null, "Titular: " + titular + "\nSaldo: R$" + saldo);
    }

    // Métodos abstratos
    public abstract void sacar(double valor);
    
    public abstract double calcularRendimento();
}
