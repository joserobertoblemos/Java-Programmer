/**
 * Nesse programa vamos estudar as variaveis do tipo primitivo
 */
package aula01a;


public class Aula01a {

    public static void main(String[] args) {
        System.out.println("Jose Roberto");
        System.out.println("======================");
        System.out.println("===== Tipos Primitivos =======");
        System.out.println("======================");
        
        //Tipo byte 8 bits de -128 até 127
        byte idadeAluno;
        byte temperaturaAtual;
        idadeAluno = 16;
        temperaturaAtual = 23;
        System.out.println("Idade do aluno: " + idadeAluno);
        System.out.println("Temperatura atual: " + temperaturaAtual + " Graus");
        
        //Tipo short 16 bits -32768 até 32767
        short populacaoGuara = 18606;
        short anoInicial = 2026;
        System.out.println("Populacao de Guara: " + populacaoGuara);
        System.out.println("Ano Inicial: " + anoInicial);
        
        //Tipo int -2 bilões até 2 bilões
        int impostoSaoPaulo = 1200000000;
        int premioMegaSena = 89456000;
        System.out.println("Imposto Arrecadado no Estado de " + "Sao Paulo por "
                + "dia: " + impostoSaoPaulo);
        System.out.println("premio da Megasena: " + premioMegaSena);
    
        //Tipo long 64 bits 9 quintilões
        long impostoBrasil = 2_886_000_000_000L;    // 'L' para afirmar tipo long
        long populacaoMundial = 7_800_000_000L;
        System.out.println("Arrecadacao de Imposto no Brasil: " + impostoBrasil);
        System.out.println("Populacao mundial: " + populacaoMundial);
        
        //Tipo float 32 bits números com 7 casas decimais
        float altura = 1.75f;   // 'f' para afimar tipo float
        float microValor = 12345.123456719123f;
        System.out.println("Altura: " + altura);
        System.out.println("Micro valor: " +microValor);
        
        
        
    }
    
}
