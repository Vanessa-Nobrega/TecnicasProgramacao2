/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; //controlar exceções, tratar o erro
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
// import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Alunos
 */

public class ConnectDAO{ 
    Connection con; //cria o método do tipo connection
    public Connection connectDB(){ //connection é o tipo de dado da conexão, só serve para conectar com o banco de dados 
        JOptionPane.showMessageDialog(null, "Inicia a classe para conexão com SQL SERVER!");
 
        String caminho = "jdbc:sqlserver://localhost:1433;databaseName=MOV_CONTA_CORRENTE;"
                + "encrypt=true;trustServerCertificate=true;"; 
        String usuario = "sa";
        String senha = ".";
        try { // tentativa de fazer essa conexão, se uma da linhas der erro ele para e vai para o catch. Verifica se o que está sendo feito funciona
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException erro) { //cria uma variavel de erro para mostrar o erro
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage()); //joption é um objeto
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Código => "+erro.getErrorCode());
        }
        return con; //retornar a varíavel criada 
        // con.close();
    }
public void insereRegistroJFBD(String tabela, String strDados) { //segundo método, tipo void não retorna nada
    con = connectDB();
    Statement stmt;
    try{
        stmt = con.createStatement(); //statement é a variavel que eu consigo conversar com o banco 
        
        String sql = "INSERT INTO dbo." + tabela + " Values(" + strDados + ")";
        JOptionPane.showMessageDialog(null, "String de insert " + sql);
        
        try{
            stmt.executeUpdate (sql);
            JOptionPane.showMessageDialog(null, "Inclusão executada com sucesso!");
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
        }
    }
 catch (SQLException ex) {
     Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null,ex);
 }
}

    public void alteraRegistroJFBD (String tabela, String strDados, String pesquisaId){
        con = connectDB();
        {
            Statement stmt;
            try {
                stmt = con.createStatement(); 
                String sql = "UPDATE dbo."+tabela
                        + " SET "+strDados
                        + " WHERE ("+pesquisaId+");";
                // JOptionPane.showMessageDialog(null, "String sql: "+sql);
                 try{
            stmt.executeUpdate (sql);
            JOptionPane.showMessageDialog(null, "alteração executada com sucesso!");
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
        }
    }
 catch (SQLException ex) {
     Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null,ex);
 }
            }
        }
    
    public void excluiRegistroJFBD (String tabela, String pesquisaId){
        con = connectDB();
        {
            Statement stmt;
            try {
                stmt = con.createStatement(); 
                String sql = "DELETE dbo."+tabela
                        + " WHERE ("+pesquisaId+");";
                // JOptionPane.showMessageDialog(null, "String sql: "+sql);
                 try{
            stmt.executeUpdate (sql);
            JOptionPane.showMessageDialog(null, "Exclusão executada com sucesso!");
        }
        catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
            JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
        }
    }
 catch (SQLException ex) {
     Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null,ex);
 }
            }
        }
    
    
    public Clientes pesquisaClienteJFBD(String tabela, String pesquisaId){
        Clientes clientesReturn = new Clientes();
        String tabelaSGBD = "CLIENTES";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaId;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql); //query é utilizada apenas no select
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        clientesReturn.setIdCliente(dados.getString(1));
                        clientesReturn.setnome(dados.getString(2));
                        clientesReturn.setEndereco(dados.getString(3));
                        clientesReturn.setnumero(dados.getString(4));
                        clientesReturn.setcomplemento(dados.getString(5));
                        clientesReturn.setbairro(dados.getString(6));
                        clientesReturn.setcidade(dados.getString(7));
                        clientesReturn.setestado(dados.getString(8));
                        clientesReturn.setcep(dados.getString(9));
                        clientesReturn.settelefone(dados.getString(10));
                        clientesReturn.setcpf(dados.getString(11));
                        clientesReturn.setnasc(dados.getString(12));
                        clientesReturn.setCNPJ(dados.getString(13));
                    }
                    con.close();
                    
                    return clientesReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return clientesReturn;
    }
    
    public ContaCorrente pesquisaContaCorrenteJFBD(String tabela, String pesquisaNumAge){
        ContaCorrente CCReturn = new ContaCorrente();
        String tabelaSGBD = "CONTACORRENTE";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaNumAge;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        CCReturn.setNumAge(dados.getInt(1));
                        CCReturn.setNumCc(dados.getInt(2));
                        CCReturn.setIdCli(dados.getInt(3));
                        CCReturn.setSaldo(dados.getInt(4));
                    }
                    con.close();
                    
                    return CCReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CCReturn;
    }
    
    public Usuarios pesquisaUsuarioJFBD(String tabela, String pesquisaId){
        Usuarios userReturn = new Usuarios();
        String tabelaSGBD = "USUARIOS";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaId;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        userReturn.setId(dados.getString(1));
                        userReturn.setSenha(dados.getString(2));
                        userReturn.setNumAge(dados.getInt(3));
                        userReturn.setNumCc(dados.getInt(4));
                    }
                    con.close();
                    
                    return userReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return userReturn;
    }
    
    public Historico pesquisaHistoricoJFBD(String tabela, String pesquisaIdHis){
        Historico HisReturn = new Historico();
        String tabelaSGBD = "HISTORICOS";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaIdHis;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        HisReturn.setIdHis(dados.getString(1));
                        HisReturn.setDescricao(dados.getString(2));
                    }
                    con.close();
                    
                    return HisReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return HisReturn;
    }
    
    public Movimentacao pesquisaMovimentacaoJFBD(String tabela, String pesquisaNumAge){
        Movimentacao MovReturn = new Movimentacao();
        String tabelaSGBD = "MOVIMENTACAO";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaNumAge;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        MovReturn.setNumAge(dados.getInt(1));
                        MovReturn.setNumCc(dados.getInt(2));
                        MovReturn.setDataMov(dados.getString(3));
                        MovReturn.setNumDocto(dados.getString(4));
                        MovReturn.setDebitoCredito(dados.getString(5));
                        MovReturn.setIdHis(dados.getInt(6));
                        MovReturn.setComplHis(dados.getString(7));
                        MovReturn.setValor(dados.getInt(8));
                        MovReturn.setSaldo(dados.getInt(9));
                    }
                    con.close();
                    
                    return MovReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return MovReturn;
    }
    
    public Agencias pesquisaAgenciaJFBD(String tabela, String pesquisaNumAge){
        Agencias AgeReturn = new Agencias();
        String tabelaSGBD = "AGENCIAS";
        if (tabela.equals(tabelaSGBD)){
            
            con = connectDB();
            
            Statement stmt;
            try {
                stmt = con.createStatement();
                
                String sql = "SELECT * FROM "+tabela
                        + " WHERE "+pesquisaNumAge;
                
                try {
                    ResultSet dados;
                    dados = stmt.executeQuery(sql);
                    if (dados.next() == false){
                        
                        JOptionPane.showMessageDialog(null, "Nenhum registro foi"
                        + "encontrado para essa pesquisa");
                    }
                   else
                    {
                        AgeReturn.setNumAgencia(dados.getString(1));
                        AgeReturn.setNome(dados.getString(2));
                        AgeReturn.setEndereco(dados.getString(3));
                        AgeReturn.setNumero(dados.getString(4));
                        AgeReturn.setComplemento(dados.getString(5));
                        AgeReturn.setBairro(dados.getString(6));
                        AgeReturn.setCidade(dados.getString(7));
                        AgeReturn.setUF(dados.getString(8));
                        AgeReturn.setCep(dados.getString(9));
                        AgeReturn.setFone(dados.getString(10));
                    }
                    con.close();
                    
                    return AgeReturn;
                } catch (SQLException erro){
                     JOptionPane.showMessageDialog(null, "Erro de conexão, connectDAO - Mensagem => "+erro.getMessage());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - Estado => "+erro.getSQLState());
                     JOptionPane.showMessageDialog(null, "\n Erro de conexão, connectDAO - código => "+erro.getErrorCode());
                }
                con.close();
            } catch (SQLException ex){
                Logger.getLogger(ConnectDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return AgeReturn;
    }
    }



