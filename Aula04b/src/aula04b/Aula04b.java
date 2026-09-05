/**
 * Nesse Programa vamos usar a estrutura de repetição do while para verificar a senha do usuário
 */
package aula04b;

import javax.swing.JOptionPane;

public class Aula04b {

    public static void main(String[] args) {

        String senhaCorreta = "1234";
        String tit = "Login";
        String senha;
        int tentativas = 1;

        do {
            senha = JOptionPane.showInputDialog(null, "Digite sua senha: ", tit, 3);
            if (senha.equals(senhaCorreta)) {
                JOptionPane.showMessageDialog(null, "Acesso Permitido");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta");
            }
            tentativas++;
        } while (!senha.equals(senhaCorreta) && tentativas <= 3);    //enquanto a senha '!' Não for igual a (.equals), senhaCorreta
        if (tentativas > 3) {
            JOptionPane.showMessageDialog(null, "Número de tentativas excedido!", tit, 0);
        }

    }

}
