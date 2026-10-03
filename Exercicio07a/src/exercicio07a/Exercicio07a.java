/**
 * 
 */
package exercicio07a;

import javax.swing.JOptionPane;

public class Exercicio07a {

    public static void main(String[] args) {
        
        String salarioStr = JOptionPane.showInputDialog(null, "Digite o salário do funcionário CLT");
        salarioStr = salarioStr.replace(",",".");
        
        double salario = Double.parseDouble(salarioStr);
        
        FuncionarioCLT funcClt = new FuncionarioCLT("Gaspar", salario);
        
        String msg;
        msg = "Nome: " + funcClt.getNome();
        msg += "\nSalario-base: R$ " +  String.format("%,.2f", funcClt.getSalarioBase());
        msg += "\nPagamento: R$ " + String.format("%,.2f", funcClt.calcularPagamento());
        JOptionPane.showMessageDialog(null, msg);
        
        FuncionarioPJ funcPj = new FuncionarioPJ("Anabela Blue", 4000);
        
        msg = "Nome: " + funcPj.getNome();
        msg += "\nSalário-base: R$ " + String.format("%,.2f", funcPj.getSalarioBase());
        msg += "\nPagamento: R$ " + String.format("%,.2f",funcPj.calcularPagamento());
        
        JOptionPane.showMessageDialog(null,msg);
    }
    
}
