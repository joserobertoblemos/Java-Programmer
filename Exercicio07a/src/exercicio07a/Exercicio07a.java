/**
 * 
 */
package exercicio07a;

import javax.swing.JOptionPane;

public class Exercicio07a {

    public static void main(String[] args) {
        
        FuncionarioCLT clt1 = new FuncionarioCLT("Jose", 5000);
        FuncionarioPJ pj1 = new FuncionarioPJ("Paulo", 6000);
        System.out.println("=== " + "FUNCIONARIO CLT " + "===");
        System.out.println("Nome: " + clt1.getNome());
        System.out.println("Salario-base: " + clt1.getSalarioBase());
        System.out.println("Pagamento: " + clt1.calcularPagamento());
        
        
        System.out.println("=== " + "FUNCIONARIO PJ " + "===");
        System.out.println("Nome: " + pj1.getNome());
        System.out.println("Salario-base: " + pj1.getSalarioBase());
        System.out.println("Pagamento: " + pj1.calcularPagamento());
        
        
    }
    
}
