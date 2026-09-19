/**
 * Nessa Classe vamos herdar os atributos e métodos da classe 'Produto' de um sistema e implementar
 * seus próprios atributos e métodos
 */
package aula06d;

public class ProdutoDigital extends Produto {
    
    double tamanhoArquivo;
    String formato;
    public ProdutoDigital(String codigo, String nome, double preco, double tamanhoArquivo, String formato){
        super(codigo, nome, preco);
        this.tamanhoArquivo = tamanhoArquivo;
        this.formato = formato;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + " mb");
        System.out.println("Formato: " + formato);
    }
}
