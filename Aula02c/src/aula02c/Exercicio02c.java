/**
 * Você foi contratado para criar um programa que verifica o indice de Massa corporal de uma pessoa (IMC)
 * Seu programa deve solicitar a altura do cliente, calcular o IMC e informar a classificação de acordo com a 
 * tabela
 * Para encontrar o IMC, utilize a fórmula
 * imc = peso / (altura * altura)
 * 
 * IMC                  Classificação      
 * Menor que 18,5       Magreza
 * Entre 25,0 e 29,9   Sobrepeso
 * Entre 30,0 e 34,9   Obesidade Grau I
 * Entre 35,0 e 39,9   Obesidade Grau II
 * Maior que 40,0      Obesidade Grau III
 * 
 * Utilize JOptionPane para solicitar o peso e a altura e para informar a classificação.
 */
package aula02c;

import javax.swing.JOptionPane;

public class Exercicio02c {
    public static void main (String args[]){
        
        String tit = "Calcular IMC";
        JOptionPane.showMessageDialog(null,"Vamos calcular seu IMC!!! ");
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome: ", tit, 3);
        String pesoStr = JOptionPane.showInputDialog(null, "Digite seu peso em Kg: ");
        String alturaStr = JOptionPane.showInputDialog(null, "Digite sua altura em Metros: ");
        
        alturaStr = alturaStr.replace(",",".");
        
        JOptionPane.showMessageDialog(null,"Agora vamos calcular imc = peso / (altura * altura)");
        double peso = Double.parseDouble(pesoStr); 
        double altura = Double.parseDouble(alturaStr);
        
        double imc = peso / (altura * altura);
        
        if (imc <= 18.5){
        JOptionPane.showMessageDialog(null,nome + " está em Magreza",tit,1);
    }  
        else if (imc <= 24.99){
        JOptionPane.showMessageDialog(null,nome + " está em peso médio",tit,1);
    }  
        else if (imc >= 25.0){
        JOptionPane.showMessageDialog(null,nome + " está em Sobrepeso",tit,1);
    }  
        else if (imc >= 30.00){
        JOptionPane.showMessageDialog(null,nome + " está em Obesidade Grau I",tit,1);
    }  
        else if (imc >= 35.00){
        JOptionPane.showMessageDialog(null,nome + " está em Obesidade Grau II",tit,1);
    }  
        else{
        JOptionPane.showMessageDialog(null,nome + " está em Obesidade Grau III",tit,1);
    }
        
    }
}
