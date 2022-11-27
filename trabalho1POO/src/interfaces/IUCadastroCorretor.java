/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package interfaces;

import controladores.Controlador;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Corretor;

/**
 *
 * @author Martines
 */
public class IUCadastroCorretor extends javax.swing.JFrame {

    /** Creates new form IUCadastroCorretor */
    public IUCadastroCorretor() {
        initComponents();
        lblMensagem.setVisible(false); 
        lblDigCodigo.setVisible(false);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCadastroCorretpr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCEPCorretor = new javax.swing.JFormattedTextField();
        txtEmailCorretor = new javax.swing.JFormattedTextField();
        txtTelefoneCorretor = new javax.swing.JFormattedTextField();
        txtEnderecoCorretor = new javax.swing.JFormattedTextField();
        txtRGCorretor = new javax.swing.JFormattedTextField();
        txtCPFCorretor = new javax.swing.JFormattedTextField();
        txtCodigoCorretor = new javax.swing.JFormattedTextField();
        txtNomeCorretor = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDadaNascCorretor = new javax.swing.JFormattedTextField();
        btnCadastroCorretor = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtCreciCorretor = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPISCorretor = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        Salário = new javax.swing.JLabel();
        txtSalario = new javax.swing.JFormattedTextField();
        txtDataAdmissao = new javax.swing.JFormattedTextField();
        lblMensagem = new javax.swing.JLabel();
        lblDigCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblCadastroCorretpr.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCadastroCorretpr.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroCorretpr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroCorretpr.setText("Cadastro de Corretores");
        lblCadastroCorretpr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Nome ");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("CPF");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("RG");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("CEP");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Endereço");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Email");

        try {
            txtCEPCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEPCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCEPCorretorActionPerformed(evt);
            }
        });

        try {
            txtTelefoneCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefoneCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneCorretorActionPerformed(evt);
            }
        });

        try {
            txtRGCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCPFCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtCodigoCorretor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoCorretorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoCorretorFocusLost(evt);
            }
        });

        txtNomeCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCorretorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Data Nascimento");

        try {
            txtDadaNascCorretor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDadaNascCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDadaNascCorretorActionPerformed(evt);
            }
        });

        btnCadastroCorretor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastroCorretor.setText("Cadastrar");
        btnCadastroCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroCorretorActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel11.setText("Creci");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel12.setText("PIS");

        txtPISCorretor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel13.setText("Data Admissão");

        Salário.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        Salário.setText("Salário");

        try {
            txtDataAdmissao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblMensagem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagem.setText("ESTE CÓDIGO JA POSSUI UM CADASTRO");

        lblDigCodigo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        lblDigCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblDigCodigo.setText("Digite o código!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneCorretor)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCEPCorretor))
                            .addComponent(txtEmailCorretor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreciCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Salário)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSalario))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDadaNascCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataAdmissao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPISCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCadastroCorretpr, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCPFCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDigCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigoCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCorretor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRGCorretor)))
                        .addGap(14, 14, 14)))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnCadastroCorretor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lblMensagem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblCadastroCorretpr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblMensagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(lblDigCodigo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txtRGCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEnderecoCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCEPCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefoneCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtEmailCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDadaNascCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtDataAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salário)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCreciCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtPISCorretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnCadastroCorretor)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCEPCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCEPCorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCEPCorretorActionPerformed

    private void txtTelefoneCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneCorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneCorretorActionPerformed

    private void txtDadaNascCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDadaNascCorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDadaNascCorretorActionPerformed

    private void btnCadastroCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroCorretorActionPerformed
        
        if((txtCodigoCorretor.getText().length() == 0 )||(txtCPFCorretor.getText().length() == 0)||
           (txtRGCorretor.getText().length() == 0)||(txtEnderecoCorretor.getText().length() == 0)||
           (txtEmailCorretor.getText().length() == 0)||(txtDataAdmissao.getText().length() == 0)||
           (txtDadaNascCorretor.getText().length() == 0 )||(txtCEPCorretor.getText().length() == 0)||
           (txtTelefoneCorretor.getText().length() == 0 )||(txtCreciCorretor.getText().length() == 0)||
           (txtPISCorretor.getText().length() == 0 )||(txtSalario.getText().length() == 0)||
           (txtNomeCorretor.getText().length() == 0 )){
                
            JOptionPane.showMessageDialog(null,"Preencha todos os campos!" , "Erro no Cadastro!", NORMAL);
        }else{
        
        
        int codigo = Integer.parseInt(txtCodigoCorretor.getText());
        String nome = txtNomeCorretor.getText();
        String cpf = txtCPFCorretor.getText();
        String rg = txtRGCorretor.getText();
        String endereco = txtEnderecoCorretor.getText();
        String email = txtEmailCorretor.getText();
        String dataAdmissao = txtDataAdmissao.getText();
        String dataNasc = txtDadaNascCorretor.getText();
        String cep = txtCEPCorretor.getText();
        String telefone =  txtTelefoneCorretor.getText();
        String creci = txtCreciCorretor.getText(); 
        String pis = txtPISCorretor.getText();
        float salario = Float.parseFloat(txtSalario.getText());
        
        LocalDate dateNasc =  LocalDate.parse(dataNasc,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dateAdmissao = LocalDate.parse(dataAdmissao,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Corretor corretores = new Corretor(creci, salario, pis, dateAdmissao, codigo, nome, cpf, rg, 
        dateNasc, endereco, cep, telefone, email);
        
        Controlador control = new Controlador();
        control.addCorretor(corretores);
        control.getTodosCOrretores();
        
        }
    }//GEN-LAST:event_btnCadastroCorretorActionPerformed

    private void txtNomeCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCorretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeCorretorActionPerformed

    private void txtCodigoCorretorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoCorretorFocusLost
        
        if(txtCodigoCorretor.getText().length()!= 0){
            lblDigCodigo.setVisible(false); 
            int codigoCorretor = Integer.parseInt(txtCodigoCorretor.getText()); 
            Controlador control = new Controlador(); 
            Corretor cor = control.buscaCorretorPorCodigo(codigoCorretor);
            
            if (cor != null){
                String salario = Float.toString(cor.getSalario()); 

                LocalDate dataNasc = cor.getDataNascimento();
                Date date = Date.valueOf(dataNasc);
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); 
                String dataNascimento = format.format(date); 

                LocalDate dataAdmissao = cor.getDataAdmissao();
                Date date2 = Date.valueOf(dataAdmissao);
                SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy"); 
                String dataAdmissao2 = format2.format(date2); 



                 btnCadastroCorretor.setEnabled(false);
                 btnCadastroCorretor.requestFocus();
                 lblMensagem.setVisible(true);

                 txtCEPCorretor.setText(cor.getCep());
                 txtCPFCorretor.setText(cor.getCpf());
                 txtCreciCorretor.setText(cor.getCreci());
                 txtDadaNascCorretor.setText(dataNascimento);
                 txtDataAdmissao.setText(dataAdmissao2);
                 txtEmailCorretor.setText(cor.getEmail());
                 txtEnderecoCorretor.setText(cor.getEndereco());
                 txtNomeCorretor.setText(cor.getNome());
                 txtPISCorretor.setText(cor.getPis());
                 txtRGCorretor.setText(cor.getRg());
                 txtSalario.setText(salario);
                 txtTelefoneCorretor.setText(cor.getTelefone());

            }else{
                btnCadastroCorretor.setEnabled(true);
                txtCEPCorretor.setText("");
                txtCPFCorretor.setText("");
                txtCreciCorretor.setText("");
                txtDadaNascCorretor.setText("");
                txtDataAdmissao.setText("");
                txtEmailCorretor.setText("");
                txtEnderecoCorretor.setText("");
                txtNomeCorretor.setText("");
                txtPISCorretor.setText("");
                txtRGCorretor.setText("");
                txtSalario.setText("");
                txtTelefoneCorretor.setText(""); 
            }
        }else if(txtCodigoCorretor.getText().length() == 0){
            txtCodigoCorretor.requestFocus();
            lblDigCodigo.setVisible(true);
        }
    }//GEN-LAST:event_txtCodigoCorretorFocusLost

    private void txtCodigoCorretorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoCorretorFocusGained
            lblMensagem.setVisible(false);
            txtCEPCorretor.setText("");
            txtCPFCorretor.setText("");
            txtCreciCorretor.setText("");
            txtDadaNascCorretor.setText("");
            txtDataAdmissao.setText("");
            txtEmailCorretor.setText("");
            txtEnderecoCorretor.setText("");
            txtNomeCorretor.setText("");
            txtPISCorretor.setText("");
            txtRGCorretor.setText("");
            txtSalario.setText("");
            txtTelefoneCorretor.setText(""); 
    }//GEN-LAST:event_txtCodigoCorretorFocusGained

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
            java.util.logging.Logger.getLogger(IUCadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroCorretor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroCorretor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salário;
    private javax.swing.JButton btnCadastroCorretor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCadastroCorretpr;
    private javax.swing.JLabel lblDigCodigo;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JFormattedTextField txtCEPCorretor;
    private javax.swing.JFormattedTextField txtCPFCorretor;
    private javax.swing.JFormattedTextField txtCodigoCorretor;
    private javax.swing.JFormattedTextField txtCreciCorretor;
    private javax.swing.JFormattedTextField txtDadaNascCorretor;
    private javax.swing.JFormattedTextField txtDataAdmissao;
    private javax.swing.JFormattedTextField txtEmailCorretor;
    private javax.swing.JFormattedTextField txtEnderecoCorretor;
    private javax.swing.JFormattedTextField txtNomeCorretor;
    private javax.swing.JFormattedTextField txtPISCorretor;
    private javax.swing.JFormattedTextField txtRGCorretor;
    private javax.swing.JFormattedTextField txtSalario;
    private javax.swing.JFormattedTextField txtTelefoneCorretor;
    // End of variables declaration//GEN-END:variables

}
