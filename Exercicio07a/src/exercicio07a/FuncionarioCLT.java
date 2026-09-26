/**
 * 
 */
package exercicio07a;

public class FuncionarioCLT extends Funcionario {
    
    public FuncionarioCLT (String nome, double salarioBase){
        super(nome, salarioBase);
    }
    
    
    @Override
    public double calcularPagamento(){
        double desconto = getSalarioBase() * 0.10;
        return getSalarioBase() - desconto;
    }
    
    
}
