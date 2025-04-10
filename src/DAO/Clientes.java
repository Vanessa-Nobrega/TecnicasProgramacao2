/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Clientes {
    private String IdCliente;
    private String nome;
    private String Endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String cpf;
    private String nasc;
    private String CNPJ;
    


    public Clientes (String IdCliente, String nome, String endereco, String numero, String complemento, String bairro, String cidade, String estado, String cep, String telefone, String cpf, String nasc, String CNPJ){
        this.IdCliente = IdCliente; 
        this.nome = nome;
        this.Endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.cpf = cpf;
        this.nasc = nasc;
        this.CNPJ = CNPJ;
}
    public String getIdCliente () { return IdCliente; }
    public void setIdCliente(String IdCliente) { this.IdCliente = IdCliente; }
    
    public String getnome () { return nome; }
    public void setnome(String nome) { this.nome = nome; }
    
    public String getEndereco () { return Endereco; }
    public void setEndereco(String endereco) { this.Endereco = endereco ; }
    
    public String getnumero () { return numero; }
    public void setnumero(String numero) { this.numero = numero ; }
    
    public String getcomplemento () { return complemento; }
    public void setcomplemento(String complemento) { this.complemento = complemento ; }
    
    public String getbairro () { return bairro; }
    public void setbairro(String bairro) { this.bairro = bairro ; }
    
    public String getcidade () { return cidade; }
    public void setcidade(String cidade) { this.cidade = cidade; }
    
    public String getestado () { return estado; }
    public void setestado(String estado) { this.estado = estado; }
    
    public String getcep () { return cep; }
    public void setcep(String cep) { this.cep = cep; }
    
    public String gettelefone () { return telefone; }
    public void settelefone(String telefone) { this.telefone = telefone; }
    
    public String getcpf () { return cpf; }
    public void setcpf(String cpf) { this.cpf = cpf; }
    
    public String getnasc () { return nasc; }
    public void setnasc(String nasc) { this.nasc = nasc; }
    
    public String getCNPJ () { return CNPJ; }
    public void setCNPJ(String CNPJ) { this.CNPJ = CNPJ; }
    
    public Clientes(){
        
    }
    
    public String dadosSQLValues(){
        String dadosClientes;
        dadosClientes = 
            "'" + this.getIdCliente()+ "'" + "," +
            "'" + this.getnome()+ "'" + "," +
            "'" + this.getEndereco()+ "'" + "," +
            "'" + this.getnumero()+ "'" + "," +
            "'" + this.getcomplemento() + "'" +  "," + //Add complemento ao form dps
            "'" + this.getbairro()+ "'" + "," +
            "'" + this.getcidade()+ "'" + "," +
            "'" + this.getestado()+ "'" + "," +
            "'" + this.getcep()+ "'" + "," +
            "'" + this.gettelefone()+ "'" + "," + 
            "'" + this.getcpf()+ "'" + "," +
            "'" + this.getnasc()+ "'" + "," + //Add complemento ao form dps
            "'" + this.getCNPJ()+ "'";
        return dadosClientes;
    }
    
    public String alteraDadosSQLValues(){
        String dadosClientes;
        dadosClientes = 
        "ID_CLI='" + this.getIdCliente() + "'," +
        "NOME_CLI='" + this.getnome() + "'," +
        "ENDE_CLI='" + this.getEndereco() + "'," +
	"BAIR_CLI='" + this.getbairro() + "'," +
        "NUM_CLI='" + this.getnumero() + "'," +
        "COMP_CLI='" + this.getcomplemento() + "'," +
        "CIDA_CLI='" + this.getcidade() + "'," +
        "UF_CLI='" + this.getestado() + "'," +
	"CPF_CLI='" + this.getcpf() + "'," +
        "CEP_CLI='" + this.getcep() + "'," +
        "FONE_CLI='" + this.gettelefone() + "'," +
        "DATA_NASC='" + this.getnasc() + "'," +
        "CNPJ_CLI='" + this.getCNPJ() + "'";
        
        return dadosClientes;
    }
}