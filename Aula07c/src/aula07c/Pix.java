/**
 * Nessa classe Vamos implementar o contrato da interface ProcessadorPagamento
 */
package aula07c;

import javax.swing.JOptionPane;

public class Pix implements ProcessadorPagamento{
    
    private String chave;
    private Boolean aprovado = false;
    
    //Construtor
    public Pix (String chave) {
        this.chave = chave;
    }
    
    @Override
    public void ProcessarPagamento(double valor){
      JOptionPane.showMessageDialog(null, "valor " + valor + "\nChave: " + chave);
      
      //Simulação transação aceita
      this.aprovado = true;
    }
    
    @Override
    public String verificarStatus(){
        return aprovado ? "PAGAMENTO CONFIRMADO" : "AGUARDANDO PAGAMENTO";
    }
 }
