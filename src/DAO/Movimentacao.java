/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.util.Date;
/**
 *
 * @author Alunos
 */
public class Movimentacao {

    private int numAge;               
    private int numCc;               
    private String dataMov;             
    private String numDocto;          
    private String debitoCredito;       
    private int idHis;                
    private String complHis;          
    private double valor;             
    private double saldo;             

    
    public Movimentacao() {
    }

    
    public Movimentacao(int numAge, int numCc, String dataMov, String numDocto, String debitoCredito, int idHis, String complHis, double valor, double saldo) {
        setNumAge(numAge);
        setNumCc(numCc);
        setDataMov(dataMov);
        setNumDocto(numDocto);
        setDebitoCredito(debitoCredito);
        setIdHis(idHis);
        setComplHis(complHis);
        setValor(valor);
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

    public String getDataMov() {
        return dataMov;
    }

    public void setDataMov(String dataMov) {
        if (dataMov == null) {
            throw new IllegalArgumentException("A data da movimentação não pode ser nula.");
        }
        this.dataMov = dataMov;
    }

    public String getNumDocto() {
        return numDocto;
    }

    public void setNumDocto(String numDocto) {
        if (numDocto == null || numDocto.length() != 6) {
            throw new IllegalArgumentException("O número do documento deve ter exatamente 6 caracteres.");
        }
        this.numDocto = numDocto;
    }

    public String getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(String debitoCredito) {
         if (debitoCredito == null || (!debitoCredito.equals("D") && !debitoCredito.equals("C"))) {
            throw new IllegalArgumentException("O campo débito/crédito deve ser 'D' (débito) ou 'C' (crédito).");
        }
        this.debitoCredito = debitoCredito;
    }

    public int getIdHis() {
        return idHis;
    }

    public void setIdHis(int idHis) {
        if (idHis <= 0 || String.valueOf(idHis).length() > 4) {
            throw new IllegalArgumentException("ID do histórico deve ser positivo e ter no máximo 4 dígitos.");
        }
        this.idHis = idHis;
    }

    public String getComplHis() {
        return complHis;
    }

    public void setComplHis(String complHis) {
        if (complHis != null && complHis.length() > 30) {
            throw new IllegalArgumentException("O complemento do histórico não pode ter mais de 30 caracteres.");
        }
        this.complHis = complHis;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor da movimentação deve ser positivo.");
        }
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo != 0 && saldo < 0) {
            throw new IllegalArgumentException("O saldo não pode ser negativo.");
        }
        this.saldo = saldo;
    }

    
    @Override
    public String toString() {
        return "Movimentacao{" +
                "numAge=" + numAge +
                ", numCc=" + numCc +
                ", dataMov=" + dataMov +
                ", numDocto='" + numDocto + '\'' +
                ", debitoCredito=" + debitoCredito +
                ", idHis=" + idHis +
                ", complHis='" + complHis + '\'' +
                ", valor=" + valor +
                ", saldo=" + saldo +
                '}';
    }
    
    public String dadosSQLValues(){
        String dadosMov;
        dadosMov = 
            "'" + this.getNumAge()+ "'" + "," +
            "'" + this.getNumCc()+ "'" + "," +
            "'" + this.getDataMov()+ "'" + "," +
            "'" + this.getNumDocto()+ "'" + "," +
            "'" + this.getDebitoCredito() + "'" +  "," + 
            "'" + this.getIdHis()+ "'" + "," +
            "'" + this.getComplHis()+ "'" + "," +
            "'" + this.getValor()+ "'" + "," +
            "'" + this.getSaldo()+ "'";
        return dadosMov;
    }
    
    public String alteraDadosSQLValues(){
        String dadosMov;
        dadosMov = 
        "NUM_AGE='" + this.getNumAge() + "'," +
        "NUM_CC='" + this.getNumCc() + "'," +
        "DATA_MOV='" + this.getDataMov() + "'," +
	"NUM_DOCTO='" + this.getNumDocto() + "'," +
        "DEBITO_CREDITO='" + this.getDebitoCredito() + "'," +
        "COMPL_HIS='" + this.getIdHis() + "'," +
        "ID_HIS='" + this.getComplHis() + "'," +
        "VALOR='" + this.getValor() + "'," +
        "SALDO='" + this.getSaldo() + "'";
        
        return dadosMov;
    }
}
