/**
 * 
 */
package clientes;

public class Cliente {
    
    private final int id;
    private final String nome;
    private final String email;
    private final String cidade;
    private final String estado;
    
    //Construtor
    public Cliente(int id, String nome, String email, String cidade, String estado){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cidade = cidade;
        this.estado = estado;
    }

   
    public int getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }
}
