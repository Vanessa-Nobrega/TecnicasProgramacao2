/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Agencias {
    private String numAgencia;
    private String Nome;
    private String Endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String cep;
    private String CNPJ;
    private String Fone;
    private String gerente;

    public Agencias(String numAgencia, String Nome, String Endereco, String numero, String complemento, String bairro, String cidade, String UF, String cep, String CNPJ, String Fone, String gerente) {
        this.numAgencia = numAgencia;
        this.Nome = Nome;
        this.Endereco = Endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.UF = UF;
        this.cep = cep;
        this.CNPJ = CNPJ;
        this.Fone = Fone;
        this.gerente = gerente;
    }
    
public Agencias(){
    //
}
    
    public String getNumAgencia () { return numAgencia; }
    public void setNumAgencia(String numAgencia) { this.numAgencia = numAgencia; }
    
    public String getNome() { return Nome; }
    public void setNome(String Nome) { this.Nome = Nome; }
    
    public String getEndereco() { return Endereco; }
    public void setEndereco(String Endereco) { this.Endereco = Endereco; }
    
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    
    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }
    
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    
    public String getUF() { return UF; }
    public void setUF(String UF) { this.UF = UF; }
    
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    
    public String getCNPJ() { return CNPJ; }
    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
    
    public String getFone() { return Fone; }
    public void setFone(String Fone) { this.Fone = Fone; }
    
    public String getGerente() { return gerente; }
    public void setGerente(String gerente) { this.gerente = gerente; }
    
    public void exibirInformacoes() {
        System.out.println("Número da agência: " + numAgencia);
        System.out.println("Nome: " + Nome);
        System.out.println("Endereço: " + Endereco);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade);
        System.out.println("Uf: " + UF);
        System.out.println("CEP: " + cep);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Fone: " + Fone);
        System.out.println("Gerente: " + gerente);
    }
    
    public String dadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = 
            "'" + this.getNumAgencia()+ "'" + "," +
            "'" + this.getNome()+ "'" + "," +
            "'" + this.getEndereco()+ "'" + "," +
            "'" + this.getNumero()+ "'" + "," +
            "'" + this.getComplemento() + "'" +  "," + //Add complemento ao form dps
            "'" + this.getBairro()+ "'" + "," +
            "'" + this.getCidade()+ "'" + "," +
            "'" + this.getUF ()+ "'" + "," +
            "'" + this.getCep()+ "'" + "," +
            "'" + this.getFone()+ "'";
        return dadosAgencia;
    }
    
    public String alteraDadosSQLValues(){
        String dadosAgencia;
        dadosAgencia = 
        "NUM_AGE='" + this.getNumAgencia() + "'," +
        "NOME_AGE='" + this.getNome() + "'," +
        "ENDE_AGE='" + this.getEndereco() + "'," +
	"NUME_AGE='" + this.getNumero() + "'," +
        "COMPL_AGE='" + this.getComplemento() + "'," +
        "BAIR_AGE='" + this.getBairro() + "'," +
        "CIDA_AGE='" + this.getCidade() + "'," +
        "UF_AGE='" + this.getUF() + "'," +
	"CEP_AGE='" + this.getCep() + "'," +
        "FONE_AGE='" + this.getFone() + "'";
        
        return dadosAgencia;
    }
}
