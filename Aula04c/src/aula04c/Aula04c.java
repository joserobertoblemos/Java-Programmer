/**
 * Nesse Programa vamos criar um jogo de adivinhação onde um jogador deve adivinhar um número sorteado pelo
 * sistema. O jogador terá 3 chances de descobrir o número. A cada palpite errado o sistema fornece uma díca
 * dizendo se o palpite é maior ou menor do que o número sorteado.
 */
package aula04c;

import java.util.Random;
import javax.swing.JOptionPane;

public class Aula04c {

    public static void main(String[] args) {

        Random rd = new Random();
        do {

            int numeroSecreto = rd.nextInt(10) + 1;  //.nextInt() começa a gerar números do 0 até (...) - 1 sempre
            int tentativas = 1;
            boolean acertou = false;

            do {
                int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seu palpite: ", "Jogo da Adivinhação", 3));
                if (palpite == numeroSecreto) {
                    acertou = true;
                    break;
                } else if (palpite > numeroSecreto) {
                    JOptionPane.showMessageDialog(null, "Seu palpite é maior do que o número secreto", "Jogo da Adivinhação", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Seu palpite é menor do que o número secreto", "Jogo da Adivinhação", 1);
                }
                if (tentativas < 3) {
                    JOptionPane.showMessageDialog(null, "Tente novamente", "Jogo da Adivinhação", 1);
                }
                tentativas++;
            } while (tentativas <= 3);

            if (acertou) {
                JOptionPane.showMessageDialog(null, "PARABÉNS!!!\nVocê acertou o número secreto era: \n" + numeroSecreto, "Jogo da Adivinhação", 1);
            } else {
                JOptionPane.showMessageDialog(null, "PERDEU!!!\nVocê Não acertou o número secreto era: \n" + numeroSecreto, "Jogo da Adivinhação", 0);
            }
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?", "Jogo da Adivinhação", JOptionPane.YES_NO_OPTION, 3);
            if (resposta == 1) {
                break;
            }
        } while (true);
    }
}
