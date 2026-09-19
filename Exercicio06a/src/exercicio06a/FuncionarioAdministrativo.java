/*
 */
package exercicio06a;

public class FuncionarioAdministrativo extends Funcionario {
    //Dados específicos
    String setor;
    String cargo;
    
    // Construtor
    public FuncionarioAdministrativo(String nome,String cpf, double salario, String setor, String cargo) {
        // Chama o construtor da Super Classe
        super(nome,cpf, salario);                               // Para usar os mesmos métodos da classe Funcionario e implementar mais coisas
        this.setor = setor;
        this.cargo = cargo;
    }
    
    public void realizarTarefa(){
        System.out.println("O Funcionário " + nome + " Do setor " + setor + " Está analisando as planilhas");
    }
    
    // Método sobreposto da classe Funcionario
    @Override                                               // Para saber que está usando um método sobreposto
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Setor: " + setor);
        System.out.println("Cargo: " + cargo);
        
    }
    
}
