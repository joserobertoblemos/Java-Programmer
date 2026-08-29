/**
 * Nesse Programa vamos estudar a estrutura de decisão switch case
 */
package aula03b;

import javax.swing.JOptionPane;

public class Aula03b {

    public static void main(String[] args) {
        int mes = 4;
        String msg;

        switch (mes) {
            case 1:
                msg = "Janeiro";
                break;
            case 2:
                msg = "Fevereiro";
                break;
            case 3:
                msg = "Março";
                break;
            case 4:
                msg = "Abril";
                break;
            case 5:
                msg = "Maio";
                break;
            default:
                msg = "Opção Inválida";
        }

        JOptionPane.showMessageDialog(null, "Mes escolhido: " + msg);

        int diaSemana = 7;
        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                msg = "Dia de trabalho";
                break;
            case 7:
                msg = "Sábado: Meio periodo";
                break;
            case 1:
                msg = "Domingo: Dia de descanso";
                break;
            default:
                msg = "Opção Inválida";
        }

        JOptionPane.showMessageDialog(null, msg);

        boolean loginOk = true;
        String tipoUsuario = "Tecnico";
        switch (loginOk) {
            case false:
                msg = "O acesso nao foi permitido. ";
                break;
            case true:
                switch (tipoUsuario) {
                    case "Adm":
                        msg = "Acesso Administrativo";
                        break;
                    case "Tecnico":
                        msg = "Acesso Tecnico";
                        break;
                    case "Usuario":
                        msg = "Acesso Usuario";
                        break;
                    default:
                        msg = "Acesso invalido";
                }
        }
        
        JOptionPane.showMessageDialog(null, msg);
        
    }

}
