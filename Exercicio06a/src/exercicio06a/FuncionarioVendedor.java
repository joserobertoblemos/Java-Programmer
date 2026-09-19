/*
*/
package exercicio06a;

public class FuncionarioVendedor extends Funcionario {
    
    //Dados especificos
    double totalVendas = 0;
    double percentualComissao;
    
    //Construtor
    public FuncionarioVendedor(String nome, String cpf, double salario, double totalVendas, double percentualComissao){
        //Chama o construtor da super Classe
        super(nome,cpf,salario);
        this.totalVendas = totalVendas;
        this.percentualComissao = percentualComissao;
    }
    
    public void realizarVenda(double valor){
        totalVendas += valor;
    }
    
    public void exibirComissao(){
        double valorComissao = totalVendas * percentualComissao / 100;
        System.out.println("Valor comissão: " + valorComissao);
    }
    
    // Método sobreposto da classe Funcionario
    @Override                                       // Para saber que está usando um método sobreposto
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Total Vendas: " + totalVendas);
        System.out.println("Comissão: " + percentualComissao);
    }
    
}
