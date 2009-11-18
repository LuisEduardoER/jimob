/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.corretor;

import br.fatecpg.conexao.oracle.conexaoClass;
import br.fatecpg.utilitarios.DataClass;

/**
 *
 * @author okada
 */
public class FormCadastroCorretor extends javax.swing.JInternalFrame {

    DataClass dt = new DataClass();
    conexaoClass c = new conexaoClass();


    public FormCadastroCorretor() {
        initComponents();
        desabilitaCampos();
        


    }

    private void mostraData(){

    
    this.dataCadastroCorretorJFormat.setText(dt.dataAtual());
    }

    private void desabilitaCampos(){
   
   this.dataCadastroCorretorJFormat.setEditable(false);
   this.celularCorretorTextField.setEditable(false);
   this.creciCorretorTextField.setEditable(false);
   this.dataAdmissaoCorretorJFormat.setEditable(false);
   this.dddCelularCorretorTextField.setEditable(false);
   this.dddTelefoneCorretorTextField.setEditable(false);
   this.emailCorretorTextField.setEditable(false);
   this.enderecoCorretorTextField.setEditable(false);
   this.nomeCorretorTextField.setEditable(false);
   this.telefoneCorretorTextField.setEditable(false);
   this.cancelarCadastroCorretorButton.setEnabled(false);
   this.salvarCadastroCorretorButton.setEnabled(false);
   this.limparCadastroCorretorButton.setEnabled(false);
   this.novoCadastroCorretorButton.setEnabled(true);
   this.sairCadastroCorretorButton.setEnabled(true);
   
   }

    private void habilitaCampos(){

   this.dataCadastroCorretorJFormat.setEditable(true);
   this.celularCorretorTextField.setEditable(true);
   this.creciCorretorTextField.setEditable(true);
   this.dataAdmissaoCorretorJFormat.setEditable(true);
   this.dddCelularCorretorTextField.setEditable(true);
   this.dddTelefoneCorretorTextField.setEditable(true);
   this.emailCorretorTextField.setEditable(true);
   this.enderecoCorretorTextField.setEditable(true);
   this.nomeCorretorTextField.setEditable(true);
   this.telefoneCorretorTextField.setEditable(true);
   this.cancelarCadastroCorretorButton.setEnabled(true);
   this.salvarCadastroCorretorButton.setEnabled(true);
   this.limparCadastroCorretorButton.setEnabled(true);
   this.novoCadastroCorretorButton.setEnabled(false);
   this.sairCadastroCorretorButton.setEnabled(false);



}

private void limparCampos(){

   this.dataCadastroCorretorJFormat.setText("");
   this.celularCorretorTextField.setText("");
   this.creciCorretorTextField.setText("");
   this.dataAdmissaoCorretorJFormat.setText("");
   this.dddCelularCorretorTextField.setText("");
   this.dddTelefoneCorretorTextField.setText("");
   this.emailCorretorTextField.setText("");
   this.enderecoCorretorTextField.setText("");
   this.nomeCorretorTextField.setText("");
   this.telefoneCorretorTextField.setText("");
}

private void salvarCampos(){

BeanCorretor beanc = new BeanCorretor();
ControlCorretor ctr = new ControlCorretor();

beanc.setCd_celular(this.celularCorretorTextField.getText());
int creci = Integer.parseInt(this.creciCorretorTextField.getText());
beanc.setCd_creci(creci);
beanc.setCd_ddd_celular(this.dddCelularCorretorTextField.getText());
beanc.setCd_ddd_telefone(this.dddTelefoneCorretorTextField.getText());
beanc.setCd_telefone(this.telefoneCorretorTextField.getText());
beanc.setDt_admissao(this.dataAdmissaoCorretorJFormat.getText());
beanc.setDt_cadastro(this.dataCadastroCorretorJFormat.getText());
beanc.setNm_corretor(this.nomeCorretorTextField.getText());
beanc.setNm_email(this.nomeCorretorTextField.getText());
beanc.setNm_endereco(this.enderecoCorretorTextField.getText());


ctr.insereCorretor(beanc);



}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroCorretorPanelComponentes = new javax.swing.JPanel();
        dadosCadastraisCorretorPanel = new javax.swing.JPanel();
        nomeCorretorLabel = new javax.swing.JLabel();
        nomeCorretorTextField = new javax.swing.JTextField();
        creciCorretorLabel = new javax.swing.JLabel();
        creciCorretorTextField = new javax.swing.JTextField();
        daraAdmissaoCorretorLabel = new javax.swing.JLabel();
        enderecoCorretorLabel = new javax.swing.JLabel();
        enderecoCorretorTextField = new javax.swing.JTextField();
        dataAdmissaoCorretorJFormat = new javax.swing.JFormattedTextField();
        contatoCorretorPanel = new javax.swing.JPanel();
        telefoneCorretorLabel = new javax.swing.JLabel();
        dddTelefoneCorretorTextField = new javax.swing.JTextField();
        telefoneCorretorTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dddCelularCorretorTextField = new javax.swing.JTextField();
        celularCorretorTextField = new javax.swing.JTextField();
        emailCorretorLabel = new javax.swing.JLabel();
        emailCorretorTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        dataCadastroCorretorLabel = new javax.swing.JLabel();
        dataCadastroCorretorJFormat = new javax.swing.JFormattedTextField();
        cadastroCorretorPanelBotoes = new javax.swing.JPanel();
        novoCadastroCorretorButton = new javax.swing.JButton();
        salvarCadastroCorretorButton = new javax.swing.JButton();
        limparCadastroCorretorButton = new javax.swing.JButton();
        cancelarCadastroCorretorButton = new javax.swing.JButton();
        sairCadastroCorretorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Cadastro de Corretores");

        cadastroCorretorPanelComponentes.setBackground(new java.awt.Color(173, 190, 206));
        cadastroCorretorPanelComponentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        dadosCadastraisCorretorPanel.setBackground(new java.awt.Color(173, 190, 206));
        dadosCadastraisCorretorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cadastrais"));

        nomeCorretorLabel.setText("Nome");

        nomeCorretorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCorretorTextFieldActionPerformed(evt);
            }
        });

        creciCorretorLabel.setText("Creci");

        daraAdmissaoCorretorLabel.setText("Data de Admissão");

        enderecoCorretorLabel.setText("Endereço");

        enderecoCorretorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCorretorTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dadosCadastraisCorretorPanelLayout = new javax.swing.GroupLayout(dadosCadastraisCorretorPanel);
        dadosCadastraisCorretorPanel.setLayout(dadosCadastraisCorretorPanelLayout);
        dadosCadastraisCorretorPanelLayout.setHorizontalGroup(
            dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosCadastraisCorretorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCorretorLabel)
                    .addComponent(enderecoCorretorLabel)
                    .addGroup(dadosCadastraisCorretorPanelLayout.createSequentialGroup()
                        .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creciCorretorLabel)
                            .addComponent(creciCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                        .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataAdmissaoCorretorJFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(daraAdmissaoCorretorLabel))
                        .addGap(28, 28, 28))
                    .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nomeCorretorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enderecoCorretorTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dadosCadastraisCorretorPanelLayout.setVerticalGroup(
            dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadosCadastraisCorretorPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creciCorretorLabel)
                    .addComponent(daraAdmissaoCorretorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dadosCadastraisCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creciCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataAdmissaoCorretorJFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCorretorLabel)
                .addGap(4, 4, 4)
                .addComponent(nomeCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoCorretorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        contatoCorretorPanel.setBackground(new java.awt.Color(173, 190, 206));
        contatoCorretorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        telefoneCorretorLabel.setText("Telefone");

        telefoneCorretorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneCorretorTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Celular");

        emailCorretorLabel.setText("E-mail");

        javax.swing.GroupLayout contatoCorretorPanelLayout = new javax.swing.GroupLayout(contatoCorretorPanel);
        contatoCorretorPanel.setLayout(contatoCorretorPanelLayout);
        contatoCorretorPanelLayout.setHorizontalGroup(
            contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                        .addComponent(emailCorretorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contatoCorretorPanelLayout.createSequentialGroup()
                        .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                                .addComponent(dddTelefoneCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefoneCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefoneCorretorLabel))
                        .addGap(51, 51, 51)
                        .addComponent(dddCelularCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(celularCorretorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)))
                    .addComponent(emailCorretorTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                .addGap(122, 122, 122))
        );
        contatoCorretorPanelLayout.setVerticalGroup(
            contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                        .addComponent(telefoneCorretorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dddTelefoneCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contatoCorretorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contatoCorretorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(celularCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dddCelularCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailCorretorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailCorretorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        dataCadastroCorretorLabel.setText("Data de Cadastro");

        dataCadastroCorretorJFormat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataCadastroCorretorJFormat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataCadastroCorretorJFormatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dataCadastroCorretorJFormat, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataCadastroCorretorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(dataCadastroCorretorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataCadastroCorretorJFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout cadastroCorretorPanelComponentesLayout = new javax.swing.GroupLayout(cadastroCorretorPanelComponentes);
        cadastroCorretorPanelComponentes.setLayout(cadastroCorretorPanelComponentesLayout);
        cadastroCorretorPanelComponentesLayout.setHorizontalGroup(
            cadastroCorretorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCorretorPanelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroCorretorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contatoCorretorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dadosCadastraisCorretorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cadastroCorretorPanelComponentesLayout.setVerticalGroup(
            cadastroCorretorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCorretorPanelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dadosCadastraisCorretorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contatoCorretorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cadastroCorretorPanelBotoes.setBackground(new java.awt.Color(173, 190, 206));
        cadastroCorretorPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novoCadastroCorretorButton.setText("Novo");
        novoCadastroCorretorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCadastroCorretorButtonActionPerformed(evt);
            }
        });

        salvarCadastroCorretorButton.setText("Salvar");
        salvarCadastroCorretorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCadastroCorretorButtonActionPerformed(evt);
            }
        });

        limparCadastroCorretorButton.setText("Limpar");
        limparCadastroCorretorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCadastroCorretorButtonActionPerformed(evt);
            }
        });

        cancelarCadastroCorretorButton.setText("Cancelar");
        cancelarCadastroCorretorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroCorretorButtonActionPerformed(evt);
            }
        });

        sairCadastroCorretorButton.setText("Sair");
        sairCadastroCorretorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairCadastroCorretorButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroCorretorPanelBotoesLayout = new javax.swing.GroupLayout(cadastroCorretorPanelBotoes);
        cadastroCorretorPanelBotoes.setLayout(cadastroCorretorPanelBotoesLayout);
        cadastroCorretorPanelBotoesLayout.setHorizontalGroup(
            cadastroCorretorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCorretorPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoCadastroCorretorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarCadastroCorretorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparCadastroCorretorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarCadastroCorretorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(sairCadastroCorretorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cadastroCorretorPanelBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelarCadastroCorretorButton, limparCadastroCorretorButton, novoCadastroCorretorButton, sairCadastroCorretorButton, salvarCadastroCorretorButton});

        cadastroCorretorPanelBotoesLayout.setVerticalGroup(
            cadastroCorretorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCorretorPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cadastroCorretorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoCadastroCorretorButton)
                    .addComponent(salvarCadastroCorretorButton)
                    .addComponent(limparCadastroCorretorButton)
                    .addComponent(cancelarCadastroCorretorButton)
                    .addComponent(sairCadastroCorretorButton))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroCorretorPanelComponentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroCorretorPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroCorretorPanelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastroCorretorPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-523)/2, (screenSize.height-567)/2, 523, 567);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCorretorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCorretorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCorretorTextFieldActionPerformed

    private void enderecoCorretorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCorretorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCorretorTextFieldActionPerformed

    private void telefoneCorretorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneCorretorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneCorretorTextFieldActionPerformed

    private void dataCadastroCorretorJFormatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataCadastroCorretorJFormatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataCadastroCorretorJFormatActionPerformed

    private void novoCadastroCorretorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCadastroCorretorButtonActionPerformed
    habilitaCampos(); 
    mostraData();// TODO add your handling code here:
    }//GEN-LAST:event_novoCadastroCorretorButtonActionPerformed

    private void sairCadastroCorretorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairCadastroCorretorButtonActionPerformed
       this.setVisible(false);
        desabilitaCampos();
        limparCampos();
       
    }//GEN-LAST:event_sairCadastroCorretorButtonActionPerformed

    private void cancelarCadastroCorretorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroCorretorButtonActionPerformed
       desabilitaCampos();
       limparCampos();
    }//GEN-LAST:event_cancelarCadastroCorretorButtonActionPerformed

    private void limparCadastroCorretorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCadastroCorretorButtonActionPerformed
       limparCampos();
    }//GEN-LAST:event_limparCadastroCorretorButtonActionPerformed

    private void salvarCadastroCorretorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCadastroCorretorButtonActionPerformed
        salvarCampos();
        desabilitaCampos();
        limparCampos();
        
    }//GEN-LAST:event_salvarCadastroCorretorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastroCorretorPanelBotoes;
    private javax.swing.JPanel cadastroCorretorPanelComponentes;
    private javax.swing.JButton cancelarCadastroCorretorButton;
    private javax.swing.JTextField celularCorretorTextField;
    private javax.swing.JPanel contatoCorretorPanel;
    private javax.swing.JLabel creciCorretorLabel;
    private javax.swing.JTextField creciCorretorTextField;
    private javax.swing.JPanel dadosCadastraisCorretorPanel;
    private javax.swing.JLabel daraAdmissaoCorretorLabel;
    private javax.swing.JFormattedTextField dataAdmissaoCorretorJFormat;
    private javax.swing.JFormattedTextField dataCadastroCorretorJFormat;
    private javax.swing.JLabel dataCadastroCorretorLabel;
    private javax.swing.JTextField dddCelularCorretorTextField;
    private javax.swing.JTextField dddTelefoneCorretorTextField;
    private javax.swing.JLabel emailCorretorLabel;
    private javax.swing.JTextField emailCorretorTextField;
    private javax.swing.JLabel enderecoCorretorLabel;
    private javax.swing.JTextField enderecoCorretorTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limparCadastroCorretorButton;
    private javax.swing.JLabel nomeCorretorLabel;
    private javax.swing.JTextField nomeCorretorTextField;
    private javax.swing.JButton novoCadastroCorretorButton;
    private javax.swing.JButton sairCadastroCorretorButton;
    private javax.swing.JButton salvarCadastroCorretorButton;
    private javax.swing.JLabel telefoneCorretorLabel;
    private javax.swing.JTextField telefoneCorretorTextField;
    // End of variables declaration//GEN-END:variables

}
