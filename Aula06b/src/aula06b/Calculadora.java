/**
 *  Nessa Classe vamos criar Métodos com sobrecarga de método 
 */
package aula06b;


public class Calculadora {
    
    // Método para somar 2 numeros    
    public int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
    
    // Método com sobrecarga para somar 3 números
    public int somar (int a, int b, int c){             // Não pode criar sem o c pq teria 3 métodos iguais
        int soma = a + b + c;
        return soma;
    }

    // Método com sobrecarga para dois números decimais
    public double somar (double a, double b){
        double soma = a + b;
        return soma;
    }

}
