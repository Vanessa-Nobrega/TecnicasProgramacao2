/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.Clientes;
import DAO.ConnectDAO;
import java.util.Set;
/**
 *
 * @author Alunos
 */
public class cliente extends javax.swing.JFrame {
    String operacaoAtivaGlobal = "Nenhum";
    /**
     * Creates new form cliente
     */
    public cliente() {
        initComponents();
    }
    public cliente (String operacaoAtiva) {
        //construtor
        initComponents ();
        operacaoAtivaGlobal = operacaoAtiva;
        String operacao = "Incluir";
        
        if (operacaoAtiva.equals(operacao)) {
          jButton1.setVisible(false);
          jButton2.setVisible(false);
          jButton3.setText("Incluir BD");
          
          jLabel1.setVisible(true);
          jLabel2.setVisible(true);
          jLabel3.setVisible(true);
          jLabel4.setVisible(true);
          jLabel5.setVisible(true);
          jLabel6.setVisible(true);
          jLabel7.setVisible(true);
          jLabel8.setVisible(true);
          jTextField1.setVisible(true);
          jTextField2.setVisible(true);
          jTextField3.setVisible(true);
          jTextField4.setVisible(true);
          jTextField5.setVisible(true);
          jTextField6.setVisible(true);
          jTextField7.setVisible(true);
          jLabel10.setVisible(true);
          jLabel9.setVisible(true);
          jLabel12.setVisible(true);
          jLabel11.setVisible(true);
          jLabel13.setVisible(true);
          jTextField8.setVisible(true);
          jTextField9.setVisible(true);
          jTextField10.setVisible(true);
          jTextField11.setVisible(true);
          jTextField12.setVisible(true);
          jTextField13.setVisible(true);
        }
        operacao = "Alterar";
        if (operacaoAtiva.equals(operacao)){
          jLabel1.setVisible(false);
          jLabel2.setVisible(false);
          jLabel3.setVisible(false);
          jLabel4.setVisible(false);
          jLabel5.setVisible(false);
          jLabel6.setVisible(false);
          jLabel7.setVisible(false);
          jLabel8.setVisible(false);
          jTextField1.setVisible(false);
          jTextField2.setVisible(false);
          jTextField3.setVisible(false);
          jTextField4.setVisible(false);
          jTextField5.setVisible(false);
          jTextField6.setVisible(false);
          jTextField7.setVisible(false);
          jLabel10.setVisible(false);
          jLabel9.setVisible(false);
          jLabel12.setVisible(false);
          jLabel11.setVisible(false);
          jLabel13.setVisible(false);
          jTextField8.setVisible(false);
          jTextField9.setVisible(false);
          jTextField10.setVisible(false);
          jTextField11.setVisible(false);
          jTextField12.setVisible(false);
          jTextField13.setVisible(true);
          
          jButton1.setVisible(false);
          jButton2.setVisible(false);
          jButton3.setText("Pesquisar");
        }
        
        operacao = "Excluir";
        if (operacaoAtiva.equals(operacao)){
          jLabel1.setVisible(false);
          jLabel2.setVisible(false);
          jLabel3.setVisible(false);
          jLabel4.setVisible(false);
          jLabel5.setVisible(false);
          jLabel6.setVisible(false);
          jLabel7.setVisible(false);
          jLabel8.setVisible(false);
          jTextField1.setVisible(false);
          jTextField2.setVisible(false);
          jTextField3.setVisible(false);
          jTextField4.setVisible(false);
          jTextField5.setVisible(false);
          jTextField6.setVisible(false);
          jTextField7.setVisible(false);
          jLabel10.setVisible(false);
          jLabel9.setVisible(false);
          jLabel12.setVisible(false);
          jLabel11.setVisible(false);
          jLabel13.setVisible(false);
          jTextField8.setVisible(false);
          jTextField9.setVisible(false);
          jTextField10.setVisible(false);
          jTextField11.setVisible(false);
          jTextField12.setVisible(false);
          jTextField13.setVisible(true);
          
          jButton1.setVisible(false);
          jButton2.setVisible(false);
          jButton3.setText("Pesquisar-Excluir");
        }
    }
    Clientes cliente_tela = new Clientes();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Endereço ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Bairro");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Ler");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Cidade");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("limpar tela");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("CNPJ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Telefone");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setText("Cliente");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Numero");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Complemento");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("CEP");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("CPF");

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Data nascimento");

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Id Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10)
                                    .addComponent(jTextField6)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField9)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                        .addComponent(jTextField8)
                                        .addComponent(jTextField2)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(91, 91, 91)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField11)
                                        .addComponent(jTextField5)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //Cadastrar
        String operacao = "Incluir";
        if (operacaoAtivaGlobal.equals(operacao))
        {
            Clientes cliente_tela = new Clientes();
            cliente_tela.setnome(jTextField1.getText());
            cliente_tela.setEndereco(jTextField3.getText());
            cliente_tela.setbairro(jTextField2.getText());
            cliente_tela.setcidade(jTextField4.getText());
            cliente_tela.setestado(jTextField5.getText());
            cliente_tela.setCNPJ(jTextField6.getText());
            cliente_tela.setnumero(jTextField8.getText());
            cliente_tela.setcomplemento(jTextField9.getText());
            cliente_tela.setcpf(jTextField11.getText());
            cliente_tela.setcep(jTextField10.getText());
            cliente_tela.setnasc(jTextField12.getText());
            cliente_tela.settelefone(jTextField7.getText());
            cliente_tela.setIdCliente(jTextField13.getText());

            ConnectDAO objcon = new ConnectDAO();
                objcon.connectDB();
                objcon.insereRegistroJFBD("CLIENTES", cliente_tela.dadosSQLValues());

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            }
        
        operacao = "Alteração";
        if (operacaoAtivaGlobal.equals(operacao)){
            
            ConnectDAO objcon = new ConnectDAO();
            
            Clientes cliente_tela = new Clientes();
            cliente_tela.setnome(jTextField1.getText());
            cliente_tela.setEndereco(jTextField3.getText());
            cliente_tela.setbairro(jTextField2.getText());
            cliente_tela.setcidade(jTextField4.getText());
            cliente_tela.setestado(jTextField5.getText());
            cliente_tela.setCNPJ(jTextField6.getText());
            cliente_tela.setnumero(jTextField8.getText());
            cliente_tela.setcomplemento(jTextField9.getText());
            cliente_tela.setcpf(jTextField11.getText());
            cliente_tela.setcep(jTextField10.getText());
            cliente_tela.setnasc(jTextField12.getText());
            cliente_tela.settelefone(jTextField7.getText());
            cliente_tela.setIdCliente(jTextField13.getText());
            
            objcon.alteraRegistroJFBD("CLIENTES", cliente_tela.alteraDadosSQLValues(),
            "ID_CLI = '" + jTextField13.getText()+"'");
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");     
        }
        
        operacao = "Alterar";
        if(operacaoAtivaGlobal.equals(operacao)){
            
            ConnectDAO objcon = new ConnectDAO();
            cliente_tela = objcon.pesquisaClienteJFBD("CLIENTES", "ID_CLI = '" + jTextField13.getText()+"'");
            
            jTextField1.setText(cliente_tela.getnome());
            jTextField3.setText(cliente_tela.getEndereco());
            jTextField2.setText(cliente_tela.getbairro());
            jTextField4.setText(cliente_tela.getcidade());
            jTextField5.setText(cliente_tela.getestado());
            jTextField6.setText(cliente_tela.getCNPJ());
            jTextField7.setText(cliente_tela.gettelefone());
            jTextField8.setText(cliente_tela.getnumero());
            jTextField9.setText(cliente_tela.getcomplemento());
            jTextField10.setText(cliente_tela.getcep());
            jTextField11.setText(cliente_tela.getcpf());
            jTextField12.setText(cliente_tela.getnasc());
            jTextField13.setText(cliente_tela.getIdCliente());
            
          jLabel1.setVisible(true);
          jLabel2.setVisible(true);
          jLabel3.setVisible(true);
          jLabel4.setVisible(true);
          jLabel5.setVisible(true);
          jLabel6.setVisible(true);
          jLabel7.setVisible(true);
          jLabel8.setVisible(true);
          jTextField1.setVisible(true);
          jTextField2.setVisible(true);
          jTextField3.setVisible(true);
          jTextField4.setVisible(true);
          jTextField5.setVisible(true);
          jTextField6.setVisible(true);
          jTextField7.setVisible(true);
          jLabel10.setVisible(true);
          jLabel9.setVisible(true);
          jLabel12.setVisible(true);
          jLabel11.setVisible(true);
          jLabel13.setVisible(true);
          jTextField8.setVisible(true);
          jTextField9.setVisible(true);
          jTextField10.setVisible(true);
          jTextField11.setVisible(true);
          jTextField12.setVisible(true);
          jTextField13.setVisible(true);
          
          jButton3.setText("Alterar");
          operacaoAtivaGlobal = "Alteração";
        }
        
        operacao = "Exclusão";
        if (operacaoAtivaGlobal.equals(operacao)){
            
            ConnectDAO objcon = new ConnectDAO();
            objcon.excluiRegistroJFBD("CLIENTES","ID_CLI="+jTextField13.getText());
            
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            this.dispose();
        }
        
        operacao = "Excluir";
        if(operacaoAtivaGlobal.equals(operacao)){
            
            ConnectDAO objcon = new ConnectDAO();
            cliente_tela = objcon.pesquisaClienteJFBD("CLIENTES", "ID_CLI = '" + jTextField13.getText()+"'");
            
            jTextField1.setText(cliente_tela.getnome());
            jTextField3.setText(cliente_tela.getEndereco());
            jTextField2.setText(cliente_tela.getbairro());
            jTextField4.setText(cliente_tela.getcidade());
            jTextField5.setText(cliente_tela.getestado());
            jTextField6.setText(cliente_tela.getCNPJ());
            jTextField7.setText(cliente_tela.gettelefone());
            jTextField8.setText(cliente_tela.getnumero());
            jTextField9.setText(cliente_tela.getcomplemento());
            jTextField10.setText(cliente_tela.getcep());
            jTextField11.setText(cliente_tela.getcpf());
            jTextField12.setText(cliente_tela.getnasc());
            jTextField13.setText(cliente_tela.getIdCliente());
            
          jLabel1.setVisible(true);
          jLabel2.setVisible(true);
          jLabel3.setVisible(true);
          jLabel4.setVisible(true);
          jLabel5.setVisible(true);
          jLabel6.setVisible(true);
          jLabel7.setVisible(true);
          jLabel8.setVisible(true);
          jTextField1.setVisible(true);
          jTextField2.setVisible(true);
          jTextField3.setVisible(true);
          jTextField4.setVisible(true);
          jTextField5.setVisible(true);
          jTextField6.setVisible(true);
          jTextField7.setVisible(true);
          jLabel10.setVisible(true);
          jLabel9.setVisible(true);
          jLabel12.setVisible(true);
          jLabel11.setVisible(true);
          jLabel13.setVisible(true);
          jTextField8.setVisible(true);
          jTextField9.setVisible(true);
          jTextField10.setVisible(true);
          jTextField11.setVisible(true);
          jTextField12.setVisible(true);
          jTextField13.setVisible(true);
          
          jTextField1.setEditable(false);
          jTextField2.setEditable(false);
          jTextField3.setEditable(false);
          jTextField4.setEditable(false);
          jTextField5.setEditable(false);
          jTextField6.setEditable(false);
          jTextField7.setEditable(false);
          jTextField8.setEditable(false);
          jTextField9.setEditable(false);
          jTextField10.setEditable(false);
          jTextField11.setEditable(false);
          jTextField12.setEditable(false);
          jTextField13.setEditable(false);
          
          jButton3.setText("Excluir");
          operacaoAtivaGlobal = "Exclusão";
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(cliente_tela.getnome());
        jTextField3.setText(cliente_tela.getEndereco());
        jTextField2.setText(cliente_tela.getbairro());
        jTextField4.setText(cliente_tela.getcidade());
        jTextField5.setText(cliente_tela.getestado());
        jTextField6.setText(cliente_tela.getCNPJ());
        jTextField7.setText(cliente_tela.gettelefone());
        jTextField8.setText(cliente_tela.getnumero());
        jTextField9.setText(cliente_tela.getcomplemento());
        jTextField10.setText(cliente_tela.getcep());
        jTextField11.setText(cliente_tela.getcpf());
        jTextField12.setText(cliente_tela.getnasc());
        jTextField13.setText(cliente_tela.getIdCliente());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}

