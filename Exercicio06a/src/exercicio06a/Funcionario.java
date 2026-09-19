/*
 */
package exercicio06a;


public class Funcionario {
    String nome;
    String cpf;
    double salario;
    
    public Funcionario(String nome, String cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: R$ " + salario);
    }
    
    public void reajusteSalario(double percentual){
        double reajuste = salario * percentual / 100;
        this.salario += reajuste;
    }
}
