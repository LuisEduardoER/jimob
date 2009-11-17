/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.locacao;

import br.fatecpg.utilitarios.DataClass;

/**
 *
 * @author claudio ferrini
 */
public class FormCadastroLocacao extends javax.swing.JInternalFrame {
    
    /** Creates new form FormTemplate */
    DataClass dt = new DataClass();

    public FormCadastroLocacao() {
        initComponents();
        habilitaCampos();
        desabilitaCampos();
        limpaCampos();
    }

    private void mostraData(){


this.dtcadastroFormated.setText(dt.dataAtual());
    }

    private void desabilitaCampos(){

        this.dtcadastroFormated.setEditable(false);
        this.cdContratoTextField.setEditable(false);
        this.cdImovelTextField.setEditable(false);
        this.cdLocatarioComboBox.setEnabled(false);
        this.cdCorretorComboBox.setEnabled(false);
        this.dtInicioContratoFormatted.setEditable(false);
        this.dtFimContratoFormatted.setEditable(false);
        this.vlLocacaoFormatted.setEditable(false);
        this.multaAtrasoTextField.setEditable(false);
        this.multaRescisaoTextField.setEditable(false);
        this.LimparButton.setEnabled(false);
        this.SalvarButton.setEnabled(false);
        this.CancelarButton.setEnabled(false);

    }

    private void habilitaCampos(){

        this.dtcadastroFormated.setEditable(true);
        this.cdContratoTextField.setEditable(true);
        this.cdImovelTextField.setEditable(true);
        this.cdLocatarioComboBox.setEnabled(true);
        this.cdCorretorComboBox.setEnabled(true);
        this.dtInicioContratoFormatted.setEditable(true);
        this.dtFimContratoFormatted.setEditable(true);
        this.vlLocacaoFormatted.setEditable(true);
        this.multaAtrasoTextField.setEditable(true);
        this.multaRescisaoTextField.setEditable(true);
    }

    private void limpaCampos(){

        this.dtcadastroFormated.setText("");
        this.cdContratoTextField.setText("");
        this.cdImovelTextField.setText("");
        this.cdLocatarioComboBox.setToolTipText("");
        this.cdCorretorComboBox.setToolTipText("");
        this.dtInicioContratoFormatted.setText("");
        this.dtFimContratoFormatted.setText("");
        this.vlLocacaoFormatted.setText("");
        this.multaAtrasoTextField.setText("");
        this.multaRescisaoTextField.setText("");
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cdImovelLabel = new javax.swing.JLabel();
        cdImovelTextField = new javax.swing.JTextField();
        cdLocatarioLabel = new javax.swing.JLabel();
        cdLocatarioComboBox = new javax.swing.JComboBox();
        cdCorretorLabel = new javax.swing.JLabel();
        cdCorretorComboBox = new javax.swing.JComboBox();
        cdContratoLabel = new javax.swing.JLabel();
        cdContratoTextField = new javax.swing.JTextField();
        dtInicioContratoLabel = new javax.swing.JLabel();
        dtInicioContratoFormatted = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        dtFimContratoFormatted = new javax.swing.JFormattedTextField();
        vlLocacaoLabel = new javax.swing.JLabel();
        vlLocacaoFormatted = new javax.swing.JFormattedTextField();
        multaAtrasoLabel = new javax.swing.JLabel();
        multaAtrasoTextField = new javax.swing.JTextField();
        multaRescisaoLabel = new javax.swing.JLabel();
        multaRescisaoTextField = new javax.swing.JTextField();
        dtcadastroLabel = new javax.swing.JLabel();
        dtcadastroFormated = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        NovoButton = new javax.swing.JButton();
        SalvarButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        setBorder(null);
        setTitle("Cadastro de Locação");

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(173, 190, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Locação"));

        cdImovelLabel.setText("Imóvel");

        cdLocatarioLabel.setText("Locatário");

        cdLocatarioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cdCorretorLabel.setText("Corretor");

        cdCorretorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cdContratoLabel.setText("Contrato");

        dtInicioContratoLabel.setText("Início Contrato");

        jLabel1.setText("Fim Contrato");

        vlLocacaoLabel.setText("Valor Locação");

        multaAtrasoLabel.setText("Multa - Atraso (%)");

        multaRescisaoLabel.setText("Multa - Rescisão (%)");

        dtcadastroLabel.setText("Data Cadastro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtcadastroFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtcadastroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdContratoLabel)
                            .addComponent(cdContratoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdImovelLabel)
                            .addComponent(cdImovelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdLocatarioLabel)
                            .addComponent(cdLocatarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdCorretorLabel)
                            .addComponent(cdCorretorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(multaAtrasoTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multaAtrasoLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(multaRescisaoLabel)
                            .addComponent(multaRescisaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtInicioContratoLabel)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(dtInicioContratoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(dtFimContratoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vlLocacaoLabel)
                            .addComponent(vlLocacaoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtcadastroLabel)
                            .addComponent(cdContratoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtcadastroFormated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdContratoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cdLocatarioLabel)
                            .addComponent(cdCorretorLabel)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cdImovelLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cdImovelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdLocatarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdCorretorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtInicioContratoLabel)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtInicioContratoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multaAtrasoLabel)
                            .addComponent(multaRescisaoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(multaAtrasoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multaRescisaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(vlLocacaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vlLocacaoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dtFimContratoFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(173, 190, 206));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NovoButton.setText("Novo");
        NovoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoButtonActionPerformed(evt);
            }
        });

        SalvarButton.setText("Salvar");

        LimparButton.setText("Limpar");
        LimparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparButtonActionPerformed(evt);
            }
        });

        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NovoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalvarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LimparButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SairButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoButton)
                    .addComponent(SalvarButton)
                    .addComponent(LimparButton)
                    .addComponent(CancelarButton)
                    .addComponent(SairButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoButtonActionPerformed
        habilitaCampos();
        this.NovoButton.setEnabled(false);
        this.SairButton.setEnabled(false);
        this.LimparButton.setEnabled(true);
        this.SalvarButton.setEnabled(true);
        this.CancelarButton.setEnabled(true);
    }//GEN-LAST:event_NovoButtonActionPerformed

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        limpaCampos();
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        limpaCampos();
        desabilitaCampos();
        this.NovoButton.setEnabled(true);
        this.SalvarButton.setEnabled(false);
        this.LimparButton.setEnabled(false);
        this.CancelarButton.setEnabled(false);
        this.SairButton.setEnabled(true);
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        limpaCampos();
        desabilitaCampos();
        this.setVisible(false);

    }//GEN-LAST:event_SairButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton LimparButton;
    private javax.swing.JButton NovoButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel cdContratoLabel;
    private javax.swing.JTextField cdContratoTextField;
    private javax.swing.JComboBox cdCorretorComboBox;
    private javax.swing.JLabel cdCorretorLabel;
    private javax.swing.JLabel cdImovelLabel;
    private javax.swing.JTextField cdImovelTextField;
    private javax.swing.JComboBox cdLocatarioComboBox;
    private javax.swing.JLabel cdLocatarioLabel;
    private javax.swing.JFormattedTextField dtFimContratoFormatted;
    private javax.swing.JFormattedTextField dtInicioContratoFormatted;
    private javax.swing.JLabel dtInicioContratoLabel;
    private javax.swing.JFormattedTextField dtcadastroFormated;
    private javax.swing.JLabel dtcadastroLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel multaAtrasoLabel;
    private javax.swing.JTextField multaAtrasoTextField;
    private javax.swing.JLabel multaRescisaoLabel;
    private javax.swing.JTextField multaRescisaoTextField;
    private javax.swing.JFormattedTextField vlLocacaoFormatted;
    private javax.swing.JLabel vlLocacaoLabel;
    // End of variables declaration//GEN-END:variables
    
}
