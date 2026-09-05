/**
 * Você foi contratado pelas Lojas Fantomas para desenvolver um pequeno sistema que será utilizado pelos vendedores da loja.
 *
 * O sistema deverá permitir que o vendedor registre uma venda e gere um relatório com as informações da compra e das parcelas.
 *
 * Dados da venda
 * O programa deverá solicitar, utilizando JOptionPane, as seguintes informações:
 *
 * Nome do cliente;
 * Nome do produto;
 * Preço do produto;
 * Número de parcelas;
 * Dia de vencimento das parcelas.
 * O dia de vencimento deverá ser escolhido entre as seguintes opções:
 *
 * Dia 5;
 * Dia 10;
 * Dia 15;
 * Dia 20;
 * Dia 25.
 * Regras da venda
 * O programa deverá seguir as seguintes regras:
 *
 * O cliente poderá pagar em até 10 parcelas.
 * Não será permitido realizar a compra em mais de 10 parcelas.
 * As compras parceladas serão realizadas sem juros.
 * Se o cliente escolher pagar em 1 parcela, receberá 10% de desconto sobre o valor do produto.
 * Se o cliente escolher pagar em 2 ou mais parcelas, não haverá desconto.
 * O valor de cada parcela deverá ser calculado dividindo o valor da compra pela quantidade de parcelas.
 * A primeira parcela deverá vencer no dia escolhido pelo cliente, no mês seguinte da compra.
 * As demais parcelas deverão vencer mensalmente, mantendo o mesmo dia escolhido.
 */
package exercicio03a;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio03a {
    public static void main(String[] args) {
        String tit = "LOJAS FANTOMAS";
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente:", tit, 3);
        String prod = JOptionPane.showInputDialog(null, "Digite o nome do produto:", tit, 3);
        String precoStr = JOptionPane.showInputDialog(null, "Digite o preço do produto em R$: ", tit, 3).replace(",", ".");
        
        double precoOriginal = Double.parseDouble(precoStr);
        double precoFinal = precoOriginal;
        int parc = 0;

        
        while (true) {
            String parcelaStr = JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas (1 a 10):", tit, 3);
            parc = Integer.parseInt(parcelaStr);
            
            if (parc >= 1 && parc <= 10) {
                break; 
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade inválida! Escolha de 1 a 10 parcelas.", tit, 0);
            }
        }
        if (parc == 1) {
            precoFinal = precoOriginal * 0.9; 
        }

        double precoParcela = precoFinal / parc;
        
        Object[] diaVencimento = {"Dia 5", "Dia 10", "Dia 15", "Dia 20", "Dia 25"};
        int optVencimento = JOptionPane.showOptionDialog(null, "Em que dia do mês deseja pagar?", tit, JOptionPane.DEFAULT_OPTION, 3, null, diaVencimento, diaVencimento[0]);
        
        int diaVenc = 5;
        if (optVencimento == 1) diaVenc = 10;
        else if (optVencimento == 2) diaVenc = 15;
        else if (optVencimento == 3) diaVenc = 20;
        else if (optVencimento == 4) diaVenc = 25;

        
        String msg = "===============================================\n";
        msg += "                LOJAS FANTOMAS                 \n";
        msg += "===============================================\n";
        msg += "Cliente: " + nome + "\n";
        msg += "Produto: " + prod + "\n";
        msg += "Preco Original: R$ " + String.format("%.2f", precoOriginal) + "\n";
        msg += "Preco Total: R$ " + String.format("%.2f", precoFinal) + "\n";
        msg += "Total de Parcelas: " + parc + "\n";
        msg += "===============================================\n";
        msg += "             DETALHE DAS PARCELAS              \n";
        msg += "===============================================\n";
        
        LocalDate dataAtual = LocalDate.now();
        
        LocalDate dataParcela = LocalDate.of(dataAtual.getYear(), dataAtual.getMonth().plus(0), diaVenc);
        
       
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        for (int i = 1; i <= parc; i++) {
            msg += "Parcela " + i + " - Vencimento: " + dataParcela.format(formatador) + " - Valor: R$ " + String.format("%.2f", precoParcela) + "\n";
            dataParcela = dataParcela.plusMonths(1);
        }
        
        msg += "===============================================";
        
        System.out.println(msg);
        JOptionPane.showMessageDialog(null, msg, tit, 1);
    }
}
