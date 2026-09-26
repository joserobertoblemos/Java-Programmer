/**
 * Uma interface é o contrato que define os métodos que uma classe deve implementar. 
 * Ela contém apenas as assinaturas dos métodos. Ou seja, nome do método, parâmetro e tipo de retorno
 */
package aula07c;

public interface ProcessadorPagamento {
            
    //Contrato1: Iniciar o processamento de 1 valor. Todas as formas do pagamento devem inplementar este método.
    void ProcessarPagamento (double valor);
    
    //Contrato 2: Verificar se a transação ja foi concluida. Todas as formas de pagamento devem imprementar este método.
    String verificarStatus();
    
}
