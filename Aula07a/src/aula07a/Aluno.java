/**
 * Nessa Classe vamos herdar os métodos e atributos da classe mãe(Super Classe)
 */
package aula07a;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    
    private String curso;
    private String periodo;
    private double media;
    
    public Aluno(String nome, int idade, String curso, String periodo){
        super(nome,idade);
        setCurso(curso);
        setPeriodo(periodo);
    }

   
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getPeriodo() {
        return periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public void calcularMedia(double nota1, double nota2, double nota3){
        this.media = (nota1 + nota2 + nota3) / 3;
    }
    
    public double getMedia(){
        return this.media;
    }
    
    @Override
    public void exibirDados(){
        String msg = "Nome: " + this.getNome() + "\n";
        msg += "Idade: " + this.getIdade() + "\n";
        msg += "Curso: " + curso + "\n";
        msg += "Periodo: " + periodo + "\n";
        msg += "Média: " + String.format("%.1f", media);
        JOptionPane.showMessageDialog(null, msg);
        
    }
    
}
