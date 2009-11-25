/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.venda;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author okada
 */
public class FormVenda extends javax.swing.JInternalFrame {
    
    /** Creates new form FormTemplate */
    public FormVenda() {
        initComponents();
        habilitaCampos();
        limpaCampos();

    }
    
  private void habilitaCampos(){
      
      this.imovelVendaComboBox.setEnabled(true);
      this.compradorVendaComboBox.setEnabled(true);
      this.corretorVendaComboBox.setEnabled(true);
      this.dataCadastroVendaFormated.setEditable(true);
      this.dataVendaFormatted.setEditable(true);
      this.valorVendaFormatted.setEditable(true);
      this.limparButton.setEnabled(true);
      this.salvarButton.setEnabled(true);
      this.cancelarButton.setEnabled(true);
      this.novoButton.setEnabled(false);
      this.sairButton.setEnabled(false);
      
  }
  
  private void desabilitaCampos(){
      
      this.imovelVendaComboBox.setEnabled(false);
      this.compradorVendaComboBox.setEnabled(false);
      this.corretorVendaComboBox.setEnabled(false);
      this.imovelVendaComboBox.setEnabled(false);
      this.dataCadastroVendaFormated.setEditable(false);
      this.dataVendaFormatted.setEnabled(false);
      this.valorVendaFormatted.setEditable(false);
      this.novoButton.setEnabled(true);
      this.sairButton.setEnabled(true);
      this.limparButton.setEnabled(false);
      this.salvarButton.setEnabled(false);
      this.cancelarButton.setEnabled(false);
  }

  private void limpaCampos(){

      this.imovelVendaComboBox.setToolTipText("");
      this.compradorVendaComboBox.setToolTipText("");
      this.corretorVendaComboBox.setToolTipText("");
      this.imovelVendaComboBox.setToolTipText("");
      this.dataVendaFormatted.setText("");
      this.valorVendaFormatted.setText("");
  }

  private void salvaCampos(){

      BeanVenda beanv = new BeanVenda();
      ControlVenda cv = new ControlVenda();

      int imovel = Integer.parseInt(this.imovelVendaComboBox.getSelectedItem().toString());
       beanv.setCd_imovel(imovel);

      int comprador = Integer.parseInt(this.compradorVendaComboBox.getSelectedItem().toString());
      beanv.setCd_comprador(comprador);

      int corretor = Integer.parseInt(this.corretorVendaComboBox.getSelectedItem().toString());
      beanv.setCd_corretor(corretor);

      beanv.setDt_cadastro(this.dataCadastroVendaFormated.getText().toUpperCase().trim());
      beanv.setDt_venda(this.dataVendaFormatted.getText().toUpperCase().trim());

      double venda = Double.parseDouble(this.valorVendaFormatted.getText().trim());
      beanv.setVl_venda(venda);

      cv.insereVenda(beanv);

  }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dataCadastroVendaLabel = new javax.swing.JLabel();
        imovelVendaComboBox = new javax.swing.JComboBox();
        compradorVendaLabel = new javax.swing.JLabel();
        compradorVendaComboBox = new javax.swing.JComboBox();
        corretorVendaLabel = new javax.swing.JLabel();
        corretorVendaComboBox = new javax.swing.JComboBox();
        ValorVendaLabel = new javax.swing.JLabel();
        valorVendaFormatted = new javax.swing.JFormattedTextField();
        dataVendaLabel = new javax.swing.JLabel();
        dataVendaFormatted = new javax.swing.JFormattedTextField();
        cdImovelVendaLabel = new javax.swing.JLabel();
        dataCadastroVendaFormated = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        novoButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(173, 190, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Venda"));

        dataCadastroVendaLabel.setText("Data de cadastro");

        imovelVendaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        compradorVendaLabel.setText("Comprador");

        compradorVendaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        corretorVendaLabel.setText("Corretor");

        corretorVendaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ValorVendaLabel.setText("Valor");

        dataVendaLabel.setText("Data da Venda");

        cdImovelVendaLabel.setText("Imóvel");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(compradorVendaComboBox, 0, 405, Short.MAX_VALUE)
                    .addComponent(compradorVendaLabel)
                    .addComponent(corretorVendaLabel)
                    .addComponent(corretorVendaComboBox, 0, 405, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataCadastroVendaFormated, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataCadastroVendaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cdImovelVendaLabel)
                            .addComponent(imovelVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorVendaLabel)
                            .addComponent(valorVendaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataVendaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataVendaLabel))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastroVendaLabel)
                    .addComponent(cdImovelVendaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataCadastroVendaFormated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imovelVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(compradorVendaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(compradorVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(corretorVendaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(corretorVendaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValorVendaLabel)
                    .addComponent(dataVendaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorVendaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVendaFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(173, 190, 206));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(sairButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton)
                    .addComponent(salvarButton)
                    .addComponent(limparButton)
                    .addComponent(cancelarButton)
                    .addComponent(sairButton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
       salvaCampos();
       limpaCampos();
       desabilitaCampos();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
       limpaCampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
       habilitaCampos();
    }//GEN-LAST:event_novoButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        limpaCampos();
        desabilitaCampos();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        limpaCampos();
        desabilitaCampos();
        this.setVisible(false);
    }//GEN-LAST:event_sairButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ValorVendaLabel;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel cdImovelVendaLabel;
    private javax.swing.JComboBox compradorVendaComboBox;
    private javax.swing.JLabel compradorVendaLabel;
    private javax.swing.JComboBox corretorVendaComboBox;
    private javax.swing.JLabel corretorVendaLabel;
    private javax.swing.JFormattedTextField dataCadastroVendaFormated;
    private javax.swing.JLabel dataCadastroVendaLabel;
    private javax.swing.JFormattedTextField dataVendaFormatted;
    private javax.swing.JLabel dataVendaLabel;
    private javax.swing.JComboBox imovelVendaComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton limparButton;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JFormattedTextField valorVendaFormatted;
    // End of variables declaration//GEN-END:variables
    
}
