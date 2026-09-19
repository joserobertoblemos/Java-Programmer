/**
 * Nessa Classe vamos criar os objetos das classes Funcionario, Professor e Técnico
 */
package aula06c;

public class Aula06c {

    public static void main(String[] args) {
        
        Funcionario func1 = new Funcionario("Gaspar", 5000);
        func1.exibirDados();
        System.out.println("=".repeat(50));
        System.out.println("Aumento de 5% no salário");
        func1.aumentarSalario(5.0);
        func1.exibirDados();
        
        System.out.println("=".repeat(50));
        Professor prof1 = new Professor("Anabela", 4500, "TI", "Manhã");
        prof1.ensinar();
        prof1.exibirDados();
        System.out.println("=".repeat(50));
        System.out.println("Aumento de 15% no salário");
        prof1.aumentarSalario(15.0);
        prof1.exibirDados();
    }
    
}
