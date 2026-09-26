/**
 * Nessa Classe vamos criar os objetos do tipo CartaoCredito e Pix
 */
package aula07c;

import javax.swing.JOptionPane;

public class Aula07c {

    public static void main(String[] args) {
        
        CartaoCredito pagamentoCartao = new CartaoCredito("Gaspar Neve");
        
        Pix pagamentoPix = new Pix("11912345678");
        
        //Chamando o método para finalizar o pagamento
        //Processar o pagamento por cartão
        finalizarCompra(pagamentoCartao);
        
        //Chamando o método para finalizar o pagamento
        //processar o pagamento via PIX
        finalizarCompra(pagamentoPix); 
        
    }
    
        //Método que finaliza a compra e recebe como parametro um objeto do tipo da interface ProcessarPagamento
        public static void finalizarCompra(ProcessadorPagamento metodo){
            JOptionPane.showMessageDialog(null, metodo.verificarStatus());
            String valorStr = JOptionPane.showInputDialog(null, "Digite o valor a pagar");
            double valor = Double.parseDouble(valorStr);
            // Processando o pagamento
            metodo.ProcessarPagamento(valor);
            
            JOptionPane.showMessageDialog(null, metodo.verificarStatus());
        }
    
    
}
