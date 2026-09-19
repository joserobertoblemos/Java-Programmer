/**
 *  Nessa Classe vamos específicar os atributos em métodos genéricos dos Produtosde um sistema 
 * comercial proximo da realidade
 */
package aula06d;

public class Produto {
    
    String codigo;
    String nome;
    double preco;
    
    public Produto(String codigo, String nome, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }
    
    public void exibirDados(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + String.format("%,.2f", preco));
    }
    
    public void aplicarDesconto(double percentual){
        double desconto = preco * percentual / 100;
        preco -= desconto;
    }
    
    public void alterarPreco(double novoPreco){
        preco = novoPreco;
    }
}
