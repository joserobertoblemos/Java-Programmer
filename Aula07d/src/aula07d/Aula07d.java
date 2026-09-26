/**
 * Nessa Classe vamos criar os objetos das classes ContaCorrente e ContaPoupança
 */
package aula07d;

import javax.swing.JOptionPane;

public class Aula07d {

    public static void main(String[] args) {
        
        String titular = JOptionPane.showInputDialog(null, "Digite o nome do Cliente: ");
        double saldo = 0;
        
        ContaCorrente corrente = new ContaCorrente(titular, saldo);
        
        corrente.exibirSaldo();
        
        double deposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do deposito: R$"));
        
        corrente.depositar(deposito);
        corrente.exibirSaldo();
        
        double saque = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do saque: R$"));
        corrente.sacar(saque);
        corrente.exibirSaldo();
    }
    
}
