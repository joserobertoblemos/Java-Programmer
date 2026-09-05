/**
 * Crie um programa que permita ao progessor informar várias notas.
 *
 * Depois de cada nota, pergunte:
 *
 * Deseja informar outra nota?:
 * Utilize do-while para repetir a entrada e JOptionPane para entrada e saída de dados.
 *
 * Ao final, mostre a média e o conceito final do aluno (APROVADO ou REPROVADO):
 *
 * Para ser aprovado o aluno deve ter média maior ou igual a 50
 */
package exercicio04a;

import javax.swing.JOptionPane;

public class Exercicio04a {
    public static void main(String[] args) {
        String notaStr;
        double somaNotas = 0;
        int numeroNotas = 0;
        double media = 0;
        int resposta;

        do {
            
            do {
                notaStr = JOptionPane.showInputDialog(null, "Digite a nota do aluno: ", "ESCOLA SENAI", 3);
                if (notaStr.equals("")){
                    JOptionPane.showMessageDialog(null, "Entrada inválida");
                } else {
                    break;
                }
            } while(true);
            double nota = Double.parseDouble(notaStr);
            somaNotas += nota; 
            numeroNotas++;
            
            resposta = JOptionPane.showConfirmDialog(null, "Deseja informar outra nota?", "ESCOLA SENAI", JOptionPane.YES_NO_OPTION, 3);
        } while (resposta == 0);
        
        if (numeroNotas > 0) {
            media = somaNotas / numeroNotas;
        }
        
        if (media >= 50) {
            JOptionPane.showMessageDialog(null, "Aluno APROVADO! \nCom média de " + String.format("%.2f", media), "ESCOLA SENAI", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Aluno REPROVADO! \nCom média de: " + String.format("%.2f", media), "ESCOLA SENAI", 0);
        }
    }
}