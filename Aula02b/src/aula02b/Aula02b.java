/**
 * Nesse programa vamos estudar o uso do tipo de classe String. 
 */
package aula02b;

public class Aula02b {

    public static void main(String[] args) {
        String nome = new String();
        nome = "Gaspar";
        
        String sobrenome = "Galego";
        
        String nomeCompleto = nome + " " + sobrenome;
        System.out.println(nomeCompleto);
        
        // Número de caracteres da String (inclusive espaços em branco)
        int tamanho = nomeCompleto.length();
        System.out.println("O nome Completo tem " + tamanho + " Caracteres");
        
        // Exibir em letras maiúsculas
        System.out.println("Maiusculo: " + nomeCompleto.toUpperCase());
        
        // Exibir em letras minúsculas
        System.out.println("Minusculas: " + nomeCompleto.toLowerCase());
        
        //Verificar se existe um conteúdo na variável
        System.out.println("Existe 'gaspar' na variavel: " + nomeCompleto.contains("Gaspar"));
        
        System.out.println("Existe 'jorge' na variavel: " + nomeCompleto.contains("Jorge"));
        
        //Verificar início da variável 
        System.out.println("variavel comeca com 'Gasp': " + nomeCompleto.startsWith("Gasp"));
        
        //Verifica final da variavel
        System.out.println("Variavel termina com 'lego': " + nomeCompleto.endsWith("lego"));
        
        //Comparar duas strings
        String nome2 = "Gaspar Galego";
        
        System.out.println("As variaveis nomeCompleto e nome sao iguais: " + nomeCompleto.equals(nome2));
        
        nome2 = nome2.toUpperCase();
        
        System.out.println("As variaveis 'nomeCompleto' e 'nome' sao iguais independente da caixa alta ou baixa: " 
                + nomeCompleto.equalsIgnoreCase(nome2));
        
        nomeCompleto = "     " + nomeCompleto + "     ";
        System.out.println("Nome Completo: " + nomeCompleto);
        
        //Retirar espaços em branco no início e fim do texto
        nomeCompleto = nomeCompleto.trim();
        System.out.println("Nome Completo Limpo: " + nomeCompleto);
        
        //Substituir parte do texto
        nomeCompleto = nomeCompleto.replace("g", "r");
        
        System.out.println("Nome Com letra alterada: " + nomeCompleto);

        // Extrair parte do texto
        String parteNome = nomeCompleto.substring(0,6); //da posição 0 até a 6
        System.out.println("parte do texto: " + parteNome);
        
        String vazia = "";
        String emBranco = "     ";
        
        //Verificar se a String está vazia
        System.out.println("Variável vazia " + vazia.isEmpty());
        
        //Verificar se a String está em branco
        System.out.println("Variavel em branco: " + emBranco.isBlank()); //.isBlank vai trazer se está com espaço e se está vazio igual isEmpty
        
        String nomeCompleto2 = nomeCompleto;
        
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome completo 2: " + nomeCompleto2);
        
        nomeCompleto = "Gaspar Galego";
        
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("Nome completo 2: " + nomeCompleto2);
        
        
        
    }
    
}
