/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author Alunos
 */
public class Historico {
    private String idHis; // O nome da variável deve seguir a convenção camelCase
    private String descricao;

    public Historico() {
    }

    public Historico(String idHis, String descricao) {
        setIdHis(idHis);
        setDescricao(descricao);
    }

    public String getIdHis() {
        return idHis;
    }

    public void setIdHis(String idHis) {
        this.idHis = idHis;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String dadosSQLValues(){
        String dadosHis;
        dadosHis = 
            "'" + this.getIdHis()+ "'" + "," +
            "'" + this.getDescricao()+ "'";
        return dadosHis;
    }
    
    public String alteraDadosSQLValues(){
        String dadosHis;
        dadosHis = 
        "ID_HIS='" + this.getIdHis() + "'," +
        "DES_HIS='" + this.getDescricao() + "'";
        
        return dadosHis;
    }
}

