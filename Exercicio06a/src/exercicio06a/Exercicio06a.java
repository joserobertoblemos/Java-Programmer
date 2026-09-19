/**
 * Uma empresa precisa de um pequeno sistema para cadastrar seus funcionários.
Todos os funcionários possuem algumas informações em comum, mas existem diferentes tipos de funcionários.
Neste exercício, serão utilizados:

Funcionário;
Funcionário Administrativo;
Funcionário Vendedor.
As duas classes filhas deverão herdar os atributos e o método da classe pai.
 */
package exercicio06a;

public class Exercicio06a {

    public static void main(String[] args) {
        
        FuncionarioAdministrativo func1adm = new FuncionarioAdministrativo ("Ana Souza", "111.111.111-11", 3000.00, "RH", "Auxiliar Adminisitativo");
        func1adm.exibirDados();
        func1adm.realizarTarefa();
        System.out.println("=".repeat(50));
        System.out.println("Aumento de 13% no salário");
        func1adm.reajusteSalario(13.0);
        func1adm.exibirDados();
        
        System.out.println("=".repeat(50));
        
        FuncionarioVendedor func1ven = new FuncionarioVendedor ("Carlos Santos", "222.222.222-22", 2500.00, 0.00, 10.00);
        func1ven.exibirDados();
        func1ven.realizarVenda(500.00);
        func1ven.realizarVenda(750.00);
        func1ven.realizarVenda(300.00);
        func1ven.exibirComissao();
        System.out.println("=".repeat(50));
        func1ven.exibirDados();
        func1ven.exibirComissao();
    }
    
}
    

