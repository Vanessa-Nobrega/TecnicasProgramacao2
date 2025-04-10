/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class ContaCorrente {

    private int numAge;   
    private int numCc;     
    private int idCli;      
    private int saldo;   

    // Construtor vazio
    public ContaCorrente() {
    }

    public ContaCorrente(int numAge, int numCc, int idCli, int saldo) {
        setNumAge(numAge);
        setNumCc(numCc);
        setIdCli(idCli);
        setSaldo(saldo);
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

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        if (idCli <= 0 || String.valueOf(idCli).length() > 9) {
            throw new IllegalArgumentException("ID do cliente deve ser positivo e ter no máximo 9 dígitos.");
        }
        this.idCli = idCli;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numAge=" + numAge +
                ", numCc=" + numCc +
                ", idCli=" + idCli +
                ", saldo=" + saldo +
                '}';
    }
    public String dadosSQLValues(){
        String dadosContaCorrente;
        dadosContaCorrente = 
            "'" + this.getNumAge()+ "'" + "," +
            "'" + this.getNumCc()+ "'" + "," +
            "'" + this.getIdCli()+ "'" + "," +
            "'" + this.getSaldo()+ "'";
        return dadosContaCorrente;
    }
    
    public String alteraDadosSQLValues(){
        String dadosContaCorrente;
        dadosContaCorrente = 
        "NUM_AGE='" + this.getNumAge() + "'," +
        "NUM_CC='" + this.getNumCc() + "'," +
        "ID_CLI='" + this.getIdCli() + "'," +
        "SALDO='" + this.getSaldo() + "'";
        
        return dadosContaCorrente;
    }
}
