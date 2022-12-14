/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import controladores.Controlador;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelos.Aluguel;
import modelos.Cartao;
import modelos.Cliente;
import modelos.Venda;

/**
 *
 * @author Martines
 */
public class IUCadastroVenda extends javax.swing.JFrame {

    /**
     * Creates new form IUCadastroVenda
     */
    public IUCadastroVenda() {
        initComponents();
        
        lblDigCodigo1.setVisible(false); 
        lblMensagem.setVisible(false); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPagamento = new javax.swing.ButtonGroup();
        lblCadastroVenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoVenda = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodCliente = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txtImovel = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodCorretores = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jBtnCartão = new javax.swing.JRadioButton();
        jBtnDinheiro = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeCartao = new javax.swing.JTextField();
        txtBandeira = new javax.swing.JTextField();
        TxtNumeroCartao = new javax.swing.JTextField();
        btnCadastroVendas = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JTextField();
        btnBuscaCliente = new javax.swing.JButton();
        btnBuscaCorretor = new javax.swing.JButton();
        btnBuscaImovel = new javax.swing.JButton();
        lblMensagem = new javax.swing.JLabel();
        lblDigCodigo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lblCadastroVenda.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lblCadastroVenda.setForeground(new java.awt.Color(0, 0, 0));
        lblCadastroVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadastroVenda.setText("Cadastro de Vendas");
        lblCadastroVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel1.setText("Código Venda");

        txtCodigoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoVendaFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel2.setText("Código Cliente");

        txtCodCliente.setEnabled(false);
        txtCodCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodClienteFocusLost(evt);
            }
        });
        txtCodCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel3.setText("Código Imóvel");

        txtImovel.setEnabled(false);
        txtImovel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtImovelFocusLost(evt);
            }
        });
        txtImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImovelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel4.setText("Código Corretor");

        txtCodCorretores.setEnabled(false);
        txtCodCorretores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodCorretoresActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel9.setText("Data Venda");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataVendaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel5.setText("Valor Total");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Métodos de Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 0, 12))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N

        buttonGroupPagamento.add(jBtnCartão);
        jBtnCartão.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jBtnCartão.setText("Cartão");
        jBtnCartão.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnCartãoMouseClicked(evt);
            }
        });
        jBtnCartão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCartãoActionPerformed(evt);
            }
        });

        buttonGroupPagamento.add(jBtnDinheiro);
        jBtnDinheiro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jBtnDinheiro.setText("Dinheiro");
        jBtnDinheiro.setEnabled(false);
        jBtnDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDinheiroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel6.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel7.setText("Bandeira: ");

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jLabel8.setText("Número:");

        txtNomeCartao.setEnabled(false);

        txtBandeira.setEnabled(false);

        TxtNumeroCartao.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnCartão, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeCartao))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnCartão))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnDinheiro)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TxtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtBandeira, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnCadastroVendas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnCadastroVendas.setText("Cadastrar");
        btnCadastroVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroVendasActionPerformed(evt);
            }
        });

        txtValorTotal.setEnabled(false);

        btnBuscaCliente.setText("Consultar Cliente");
        btnBuscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaClienteActionPerformed(evt);
            }
        });

        btnBuscaCorretor.setText("Consultar Corretor");
        btnBuscaCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCorretorActionPerformed(evt);
            }
        });

        btnBuscaImovel.setText("Consultar Imóvel");
        btnBuscaImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaImovelActionPerformed(evt);
            }
        });

        lblMensagem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 51));
        lblMensagem.setText("ESTE CÓDIGO JA POSSUI UM CADASTRO");

        lblDigCodigo1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 10)); // NOI18N
        lblDigCodigo1.setForeground(new java.awt.Color(255, 0, 0));
        lblDigCodigo1.setText("Digite o código!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataVenda)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCadastroVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDigCodigo1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscaImovel)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodCorretores, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCodCliente)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscaCorretor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(btnCadastroVendas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblCadastroVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCliente))
                .addGap(5, 5, 5)
                .addComponent(lblDigCodigo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodCorretores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscaCorretor)
                    .addComponent(btnBuscaImovel))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnCadastroVendas)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteActionPerformed

    private void txtCodCorretoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodCorretoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodCorretoresActionPerformed

    private void txtImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImovelActionPerformed

    private void txtDataVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataVendaActionPerformed

    private void jBtnCartãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCartãoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnCartãoActionPerformed

    private void jBtnDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnDinheiroActionPerformed

    private void btnCadastroVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroVendasActionPerformed

          
        if((txtCodigoVenda.getText().length() == 0 )||(txtCodCliente.getText().length() == 0)||
           (txtImovel.getText().length() == 0)||(txtCodCorretores.getText().length() == 0)||
           (txtDataVenda.getText().length() == 0)||(txtValorTotal.getText().length() == 0)){
            
           JOptionPane.showMessageDialog(null,"Preencha todos os campos!" , "Erro no Cadastro!", NORMAL);
        }else{
            
            int codigoVenda = Integer.parseInt(txtCodigoVenda.getText());
            int codigoCliente = Integer.parseInt(txtCodCliente.getText());
            int codigoCorretor = Integer.parseInt(txtCodCorretores.getText());
            int codigoImovel = Integer.parseInt(txtImovel.getText()); 
            float ValorTotalVenda = Float.parseFloat(txtValorTotal.getText()); 
    
            String dateVenda = txtDataVenda.getText(); 
            LocalDate dataVenda = LocalDate.parse(dateVenda,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            
            if (!(jBtnCartão.isSelected())){
              JOptionPane.showMessageDialog(null, "Esolha uma forma de pagamento"); 
            }else{
                if((txtNomeCartao.getText().length() == 0 )||(txtBandeira.getText().length() == 0 )||(TxtNumeroCartao.getText().length() == 0 )){
                    JOptionPane.showMessageDialog(null, "Preencha todos os dados do cartão!"); 
                }else{
                String tipoPagamento = "Cartão"; 
                String nome = txtNomeCartao.getText();
                String bandeira = txtBandeira.getText(); 
                String numeroCartao = TxtNumeroCartao.getText(); 
            
                Controlador control = new Controlador();
            
                Cartao cartoes = new Cartao(nome, bandeira, numeroCartao, tipoPagamento);
            
                Venda venda = new Venda(codigoVenda,control.buscaClientePorCodigo(codigoCliente), 
                control.buscaCorretorPorCodigo(codigoCorretor), control.buscaImovelPorCodigo(codigoImovel), 
                dataVenda, ValorTotalVenda, cartoes);
            
                control.addVenda(venda);
                //control.listaTodasVendas();
                }
                    
            }
        }          
    }//GEN-LAST:event_btnCadastroVendasActionPerformed

    private void jBtnCartãoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnCartãoMouseClicked
        TxtNumeroCartao.setEnabled(true);
        txtBandeira.setEnabled(true);
        txtNomeCartao.setEnabled(true);
    }//GEN-LAST:event_jBtnCartãoMouseClicked

    private void btnBuscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaClienteActionPerformed
        IUConsultaClientes consulCli = new IUConsultaClientes(null, true);
        consulCli.setVisible(true);
        
        String codCliente = consulCli.getCodCliente();
        txtCodCliente.setText(codCliente);
    }//GEN-LAST:event_btnBuscaClienteActionPerformed

    private void btnBuscaCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCorretorActionPerformed
        // TODO add your handling code here:
        IUConsultaCorretores consulCorret = new IUConsultaCorretores(null, true);
        consulCorret.setVisible(true);
        
        String codCorretor = consulCorret.getCodCorretor();
        txtCodCorretores.setText(codCorretor);
    }//GEN-LAST:event_btnBuscaCorretorActionPerformed

    private void btnBuscaImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaImovelActionPerformed
        // TODO add your handling code here:
        IUConsultaImovel consulImov = new IUConsultaImovel(null, true);
        consulImov.setVisible(true);
        String codImovel = consulImov.getCodigoImovel();
        String valorTotal = consulImov.getValorTotal();
        txtImovel.setText(codImovel);
        txtValorTotal.setText(valorTotal);
    }//GEN-LAST:event_btnBuscaImovelActionPerformed

    private void txtImovelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtImovelFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImovelFocusLost

    private void txtCodClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodClienteFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodClienteFocusLost

    private void txtCodigoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoVendaFocusLost
        if(txtCodigoVenda.getText().length()!= 0){
            lblDigCodigo1.setVisible(false); 
            int codigoVend = Integer.parseInt(txtCodigoVenda.getText()); 
            Controlador control = new Controlador(); 
            Venda venda = control.buscaAVendaPorCodigo(codigoVend);
            
            if (venda != null){
                lblDigCodigo1.setVisible(false); 
            //txtBandeira.setEnabled(false);
                txtCodCliente.setEnabled(false);
                txtCodCorretores.setEnabled(false);
                txtDataVenda.setEnabled(false);
                txtImovel.setEnabled(false);
                

                lblMensagem.setVisible(true);
                btnCadastroVendas.setEnabled(false);
                btnCadastroVendas.requestFocus(); 
            }else{
                lblMensagem.setVisible(false); 
                btnCadastroVendas.setEnabled(true);
            }
        }else if(txtCodigoVenda.getText().length() == 0){
            txtCodigoVenda.requestFocus();
            lblDigCodigo1.setVisible(true);
        }                
    }//GEN-LAST:event_txtCodigoVendaFocusLost

    private void txtCodigoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoVendaFocusGained
            lblMensagem.setVisible(false);

            //txtBandeira.setEnabled(true);
            txtCodCliente.setEnabled(true);
            txtCodCorretores.setEnabled(true);
            txtCodigoVenda.setEnabled(true);
            txtDataVenda.setEnabled(true);
            txtImovel.setEnabled(true);
            
            
    }//GEN-LAST:event_txtCodigoVendaFocusGained
    

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
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUCadastroVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUCadastroVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtNumeroCartao;
    private javax.swing.JButton btnBuscaCliente;
    private javax.swing.JButton btnBuscaCorretor;
    private javax.swing.JButton btnBuscaImovel;
    private javax.swing.JButton btnCadastroVendas;
    private javax.swing.ButtonGroup buttonGroupPagamento;
    private javax.swing.JRadioButton jBtnCartão;
    private javax.swing.JRadioButton jBtnDinheiro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCadastroVenda;
    private javax.swing.JLabel lblDigCodigo1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtBandeira;
    private javax.swing.JFormattedTextField txtCodCliente;
    private javax.swing.JFormattedTextField txtCodCorretores;
    private javax.swing.JFormattedTextField txtCodigoVenda;
    private javax.swing.JFormattedTextField txtDataVenda;
    private javax.swing.JFormattedTextField txtImovel;
    private javax.swing.JTextField txtNomeCartao;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
