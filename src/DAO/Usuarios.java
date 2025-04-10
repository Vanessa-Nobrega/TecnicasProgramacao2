/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Usuarios {

    private String id;          
    private String senha;       
    private int numAge;         
    private int numCc;         

  
    public Usuarios() {
    }

    
    public Usuarios(String id, String senha, int numAge, int numCc) {
        setId(id);
        setSenha(senha);
        setNumAge(numAge);
        setNumCc(numCc);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.length() > 20) {
            throw new IllegalArgumentException("O ID do usuário não pode ser nulo e deve ter no máximo 20 caracteres.");
        }
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.length() > 20) {
            throw new IllegalArgumentException("A senha não pode ser nula e deve ter no máximo 20 caracteres.");
        }
        this.senha = senha;
    }

    public int getNumAge() {
        return numAge;
    }

    public void setNumAge(int numAge) {
        if (numAge <= 0 || String.valueOf(numAge).length() > 5) {
            throw new IllegalArgumentException("Número da agência deve ser positivo e ter no máximo 5 dígitos.");
        }
        this.numAge = numAge;
    }

    public long getNumCc() {
        return numCc;
    }

    public void setNumCc(int numCc) {
        if (numCc <= 0 || String.valueOf(numCc).length() > 10) {
            throw new IllegalArgumentException("Número da conta corrente deve ser positivo e ter no máximo 10 dígitos.");
        }
        this.numCc = numCc;
    }

    
    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", senha='" + senha + '\'' +
                ", numAge=" + numAge +
                ", numCc=" + numCc +
                '}';
    }
    public String dadosSQLValues(){
        String dadosUser;
        dadosUser = 
            "'" + this.getId()+ "'" + "," +
            "'" + this.getSenha()+ "'" + "," +
            "'" + this.getNumAge()+ "'" + "," +
            "'" + this.getNumCc()+ "'";
        return dadosUser;
    }
    
    public String alteraDadosSQLValues(){
        String dadosUser;
        dadosUser = 
        "ID='" + this.getId() + "'," +
        "SENHA='" + this.getSenha() + "'," +
        "NUM_AGE='" + this.getNumAge() + "'," +
        "NUM_CC='" + this.getNumCc() + "'";
        
        return dadosUser;
    }
}
