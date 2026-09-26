/**
 * 
 */
package exercicio07a;

public class FuncionarioPJ extends Funcionario {
    
    public FuncionarioPJ (String nome, double salarioBase){
        super(nome,salarioBase);
    }
    
    @Override
    public double calcularPagamento(){
        return getSalarioBase();
    }
    
}
