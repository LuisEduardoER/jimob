/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.usuario;

import br.fatecpg.utilitarios.DataClass;
import javax.swing.JOptionPane;

/**
 *
 * @author claudio ferrini
 */
public class FormCadastroUsuario extends javax.swing.JInternalFrame {
    
    /** Creates new form FormTemplate */

    DataClass dt = new DataClass();

    public FormCadastroUsuario() {
        initComponents();
        desabilitaCampos();
        limparCampos();
        mostraData();
    }

    private void mostraData(){

DataClass dta = new DataClass();
this.dtCadastruUsuarioFormated.setText(dta.dataAtual());
    }
    private void desabilitaCampos(){

        this.dtCadastruUsuarioFormated.setEditable(false);
        this.nomeUsuarioTextField.setEditable(false);
        this.senhaUsuarioTextField.setEditable(false);
        this.nivelacessoUsuarioComboBox.setEnabled(false);
        this.salvarusuarioButton.setEnabled(false);
        this.limparUsuarioButton.setEnabled(false);
        this.cancelarUsuarioButton.setEnabled(false);
        this.novoUsuarioButton.setEnabled(true);
        this.sairusuarioButton.setEnabled(true);
    }

    private void habilitaCampos(){

        this.dtCadastruUsuarioFormated.setEditable(true);
        this.nomeUsuarioTextField.setEditable(true);
        this.senhaUsuarioTextField.setEditable(true);
        this.nivelacessoUsuarioComboBox.setEnabled(true);
        this.salvarusuarioButton.setEnabled(true);
        this.limparUsuarioButton.setEnabled(true);
        this.cancelarUsuarioButton.setEnabled(true);
        this.novoUsuarioButton.setEnabled(false);
        this.sairusuarioButton.setEnabled(false);
    }

    private void limparCampos(){

        this.dtCadastruUsuarioFormated.setText("");
        this.nomeUsuarioTextField.setText("");
        this.senhaUsuarioTextField.setText("");
        this.nivelacessoUsuarioComboBox.setToolTipText("");
    }

    public void salvarCampos(){

        BeanUsuario beanuser = new BeanUsuario();
        ControlUsuario ctrluser = new ControlUsuario();
        
        beanuser.setNm_login(this.nomeUsuarioTextField.getText().trim());
        beanuser.setNm_senha(this.senhaUsuarioTextField.getText().trim());
        beanuser.setDt_cadastro(this.dtCadastruUsuarioFormated.getText().trim());
       
        beanuser.setCd_nivel(this.nivelacessoUsuarioComboBox.getSelectedItem().toString());

        ctrluser.insereUsuario(beanuser);

        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        nomeUsuarioLabel = new javax.swing.JLabel();
        nomeUsuarioTextField = new javax.swing.JTextField();
        dtCadastroUsuarioLabel = new javax.swing.JLabel();
        dtCadastruUsuarioFormated = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        senhaUsuarioTextField = new javax.swing.JTextField();
        nivelacessoUsuarioLabel = new javax.swing.JLabel();
        nivelacessoUsuarioComboBox = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        novoUsuarioButton = new javax.swing.JButton();
        salvarusuarioButton = new javax.swing.JButton();
        limparUsuarioButton = new javax.swing.JButton();
        cancelarUsuarioButton = new javax.swing.JButton();
        sairusuarioButton = new javax.swing.JButton();

        setTitle("Cadastro de Usuário");

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(173, 190, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        nomeUsuarioLabel.setText("Usuário (login)");

        dtCadastroUsuarioLabel.setText("Data de Cadastro");

        jLabel3.setText("Senha");

        nivelacessoUsuarioLabel.setText("Nível de acesso");

        nivelacessoUsuarioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Corretor" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                .addComponent(nomeUsuarioLabel)
                                .addComponent(jLabel3)
                                .addComponent(senhaUsuarioTextField)
                                .addComponent(nivelacessoUsuarioLabel)
                                .addComponent(nivelacessoUsuarioComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(dtCadastruUsuarioFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(233, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dtCadastroUsuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(330, 330, 330))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(dtCadastroUsuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtCadastruUsuarioFormated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeUsuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addComponent(senhaUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nivelacessoUsuarioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nivelacessoUsuarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(173, 190, 206));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novoUsuarioButton.setText("Novo");
        novoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoUsuarioButtonActionPerformed(evt);
            }
        });

        salvarusuarioButton.setText("Salvar");
        salvarusuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarusuarioButtonActionPerformed(evt);
            }
        });

        limparUsuarioButton.setText("Limpar");
        limparUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparUsuarioButtonActionPerformed(evt);
            }
        });

        cancelarUsuarioButton.setText("Cancelar");
        cancelarUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarUsuarioButtonActionPerformed(evt);
            }
        });

        sairusuarioButton.setText("Sair");
        sairusuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairusuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoUsuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarusuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparUsuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarUsuarioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(sairusuarioButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoUsuarioButton)
                    .addComponent(salvarusuarioButton)
                    .addComponent(limparUsuarioButton)
                    .addComponent(cancelarUsuarioButton)
                    .addComponent(sairusuarioButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-487)/2, (screenSize.height-450)/2, 487, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void novoUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoUsuarioButtonActionPerformed
        habilitaCampos();
        
       
    }//GEN-LAST:event_novoUsuarioButtonActionPerformed

    private void limparUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparUsuarioButtonActionPerformed
        limparCampos();
    }//GEN-LAST:event_limparUsuarioButtonActionPerformed

    private void cancelarUsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarUsuarioButtonActionPerformed
        limparCampos();
        desabilitaCampos();
        
    }//GEN-LAST:event_cancelarUsuarioButtonActionPerformed

    private void sairusuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairusuarioButtonActionPerformed
        limparCampos();
        desabilitaCampos();
        this.setVisible(false);
    }//GEN-LAST:event_sairusuarioButtonActionPerformed

    private void salvarusuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarusuarioButtonActionPerformed
       salvarCampos();
       limparCampos();
       desabilitaCampos();
      
    }//GEN-LAST:event_salvarusuarioButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarUsuarioButton;
    private javax.swing.JLabel dtCadastroUsuarioLabel;
    private javax.swing.JFormattedTextField dtCadastruUsuarioFormated;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limparUsuarioButton;
    private javax.swing.JComboBox nivelacessoUsuarioComboBox;
    private javax.swing.JLabel nivelacessoUsuarioLabel;
    private javax.swing.JLabel nomeUsuarioLabel;
    private javax.swing.JTextField nomeUsuarioTextField;
    private javax.swing.JButton novoUsuarioButton;
    private javax.swing.JButton sairusuarioButton;
    private javax.swing.JButton salvarusuarioButton;
    private javax.swing.JTextField senhaUsuarioTextField;
    // End of variables declaration//GEN-END:variables
    
}
