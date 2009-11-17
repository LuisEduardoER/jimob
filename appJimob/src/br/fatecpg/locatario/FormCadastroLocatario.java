/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.locatario;

import br.fatecpg.utilitarios.DataClass;

/**
 *
 * @author claudio ferrini
 */
public class FormCadastroLocatario extends javax.swing.JInternalFrame {
    
    /** Creates new form FormTemplate */
    DataClass dt = new DataClass();

    public FormCadastroLocatario() {
        initComponents();
        habilitacampos();
        desabilitacampos();
        limpacampos();
    }

    private void mostraData(){


this.dtCadastroLocatarioFormatted.setText(dt.dataAtual());
    }

    private void desabilitacampos(){

        this.dtCadastroLocatarioFormatted.setEditable(false);
        this.nomeLocatarioTextField.setEditable(false);
        this.sobrenomeLocatarioTextField.setEditable(false);
        this.tipoLogradouroLocatárioComboBox.setEnabled(false);
        this.logradouroLocatarioTextField.setEditable(false);
        this.numeroLogradouroLocaratioTextField.setEditable(false);
        this.complementoLogradouroLocatarioTextField.setEditable(false);
        this.bairroLocatarioTextField.setEditable(false);
        this.cidadeLocatarioTextField.setEditable(false);
        this.ufLocatarioComboBox.setEnabled(false);
        this.cepLocatarioTextFielld.setEditable(false);
        this.dddfoneLocatarioTextField.setEditable(false);
        this.foneLocatarioTextField.setEditable(false);
        this.dddcelularLocatarioTextField.setEditable(false);
        this.celularLocatarioTextField.setEditable(false);
        this.dtNascimentoLocatarioFormatted.setEditable(false);
        this.nacionalidadeLocatarioTextField.setEditable(false);
        this.estadocivilLoctarioTextField.setEditable(false);
        this.profissaoLocatarioTextField.setEditable(false);
        this.cpfLocatarioTextField.setEditable(false);
        this.rgLocatarioTextField.setEditable(false);
        this.orgaoEmissorRgLocatarioTextField.setEditable(false);
        this.rendaLocatarioTextField.setEditable(false);
        this.emailLocatarioTextField.setEditable(false);
        this.LimparButton.setEnabled(false);
        this.CancelarButton.setEnabled(false);
        this.SalvarButton.setEnabled(false);

    }

    private void habilitacampos(){

         this.dtCadastroLocatarioFormatted.setEditable(true);
        this.nomeLocatarioTextField.setEditable(true);
        this.sobrenomeLocatarioTextField.setEditable(true);
        this.tipoLogradouroLocatárioComboBox.setEnabled(true);
        this.logradouroLocatarioTextField.setEditable(true);
        this.numeroLogradouroLocaratioTextField.setEditable(true);
        this.complementoLogradouroLocatarioTextField.setEditable(true);
        this.bairroLocatarioTextField.setEditable(true);
        this.cidadeLocatarioTextField.setEditable(true);
        this.ufLocatarioComboBox.setEnabled(true);
        this.cepLocatarioTextFielld.setEditable(true);
        this.dddfoneLocatarioTextField.setEditable(true);
        this.foneLocatarioTextField.setEditable(true);
        this.dddcelularLocatarioTextField.setEditable(true);
        this.celularLocatarioTextField.setEditable(true);
        this.dtNascimentoLocatarioFormatted.setEditable(true);
        this.nacionalidadeLocatarioTextField.setEditable(true);
        this.estadocivilLoctarioTextField.setEditable(true);
        this.profissaoLocatarioTextField.setEditable(true);
        this.cpfLocatarioTextField.setEditable(true);
        this.rgLocatarioTextField.setEditable(true);
        this.orgaoEmissorRgLocatarioTextField.setEditable(true);
        this.rendaLocatarioTextField.setEditable(true);
        this.emailLocatarioTextField.setEditable(true);

    }

    private void limpacampos(){

        this.dtCadastroLocatarioFormatted.setText("");
        this.nomeLocatarioTextField.setText("");
        this.sobrenomeLocatarioTextField.setText("");
        this.tipoLogradouroLocatárioComboBox.setToolTipText("");
        this.logradouroLocatarioTextField.setText("");
        this.numeroLogradouroLocaratioTextField.setText("");
        this.complementoLogradouroLocatarioTextField.setText("");
        this.bairroLocatarioTextField.setText("");
        this.cidadeLocatarioTextField.setText("");
        this.ufLocatarioComboBox.setToolTipText("");
        this.cepLocatarioTextFielld.setText("");
        this.dddfoneLocatarioTextField.setText("");
        this.foneLocatarioTextField.setText("");
        this.dddcelularLocatarioTextField.setText("");
        this.celularLocatarioTextField.setText("");
        this.dtNascimentoLocatarioFormatted.setText("");
        this.nacionalidadeLocatarioTextField.setText("");
        this.estadocivilLoctarioTextField.setText("");
        this.profissaoLocatarioTextField.setText("");
        this.cpfLocatarioTextField.setText("");
        this.rgLocatarioTextField.setText("");
        this.orgaoEmissorRgLocatarioTextField.setText("");
        this.rendaLocatarioTextField.setText("");
        this.emailLocatarioTextField.setText("");
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
        NomeLocatarioLabel = new javax.swing.JLabel();
        nomeLocatarioTextField = new javax.swing.JTextField();
        sobrenomeLocatarioLabel = new javax.swing.JLabel();
        sobrenomeLocatarioTextField = new javax.swing.JTextField();
        tipoLogradouroLocatárioLabel = new javax.swing.JLabel();
        tipoLogradouroLocatárioComboBox = new javax.swing.JComboBox();
        logradouroLocatarioLabel = new javax.swing.JLabel();
        logradouroLocatarioTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        numeroLogradouroLocaratioTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        complementoLogradouroLocatarioTextField = new javax.swing.JTextField();
        bairroLocatarioTextField = new javax.swing.JTextField();
        bairroLocatarioLabel = new javax.swing.JLabel();
        cidadeLocatarioLabel = new javax.swing.JLabel();
        cidadeLocatarioTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ufLocatarioComboBox = new javax.swing.JComboBox();
        cepLocatarioLabel = new javax.swing.JLabel();
        cepLocatarioTextFielld = new javax.swing.JTextField();
        DDDfoneLocatarioLabel = new javax.swing.JLabel();
        dddfoneLocatarioTextField = new javax.swing.JTextField();
        foneLocatarioLabel = new javax.swing.JLabel();
        foneLocatarioTextField = new javax.swing.JTextField();
        dddcelularLocatarioLabel = new javax.swing.JLabel();
        dddcelularLocatarioTextField = new javax.swing.JTextField();
        celularLocatarioLabel = new javax.swing.JLabel();
        celularLocatarioTextField = new javax.swing.JTextField();
        dtNascimentoLocatarioLabel = new javax.swing.JLabel();
        dtNascimentoLocatarioFormatted = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        nacionalidadeLocatarioTextField = new javax.swing.JTextField();
        estadocivilLocatarioLabel = new javax.swing.JLabel();
        estadocivilLoctarioTextField = new javax.swing.JTextField();
        professaoLocatarioLabel = new javax.swing.JLabel();
        profissaoLocatarioTextField = new javax.swing.JTextField();
        cpfLocatarioTextField = new javax.swing.JTextField();
        cpfLocatarioLabel = new javax.swing.JLabel();
        rgLocatarioLabel = new javax.swing.JLabel();
        rgLocatarioTextField = new javax.swing.JTextField();
        orgaoEmissorRGLocatarioLabel = new javax.swing.JLabel();
        orgaoEmissorRgLocatarioTextField = new javax.swing.JTextField();
        emailLocatarioLabel = new javax.swing.JLabel();
        emailLocatarioTextField = new javax.swing.JTextField();
        rendaLocatarioLabel = new javax.swing.JLabel();
        rendaLocatarioTextField = new javax.swing.JTextField();
        dtCadastroLabel = new javax.swing.JLabel();
        dtCadastroLocatarioFormatted = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        NovoButton = new javax.swing.JButton();
        SalvarButton = new javax.swing.JButton();
        LimparButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        setTitle("Cadastro  de Locatário");

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel3.setBackground(new java.awt.Color(173, 190, 206));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        NomeLocatarioLabel.setText("Nome");

        sobrenomeLocatarioLabel.setText("Sobrenome");

        tipoLogradouroLocatárioLabel.setText("Tipo Logradouro");

        tipoLogradouroLocatárioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        logradouroLocatarioLabel.setText("Logradouro");

        jLabel5.setText("Nº");

        jLabel6.setText("Complemento");

        bairroLocatarioLabel.setText("Bairro");

        cidadeLocatarioLabel.setText("Cidade");

        jLabel9.setText("UF");

        ufLocatarioComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cepLocatarioLabel.setText("CEP");

        DDDfoneLocatarioLabel.setText("DDD");

        foneLocatarioLabel.setText("Telefone");

        foneLocatarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foneLocatarioTextFieldActionPerformed(evt);
            }
        });

        dddcelularLocatarioLabel.setText("DDD");

        celularLocatarioLabel.setText("Celular");

        dtNascimentoLocatarioLabel.setText("Data Nasc.");

        jLabel16.setText("Nacionalidade");

        estadocivilLocatarioLabel.setText("Estado Civil");

        professaoLocatarioLabel.setText("Profissão");

        cpfLocatarioLabel.setText("CPF");

        rgLocatarioLabel.setText("R.G.");

        orgaoEmissorRGLocatarioLabel.setText("Órgão Emissor");

        emailLocatarioLabel.setText("e-mail");

        rendaLocatarioLabel.setText("Renda");

        dtCadastroLabel.setText("Data de Cadastro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NomeLocatarioLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sobrenomeLocatarioLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sobrenomeLocatarioTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(tipoLogradouroLocatárioLabel)
                                                .addGap(38, 38, 38))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(tipoLogradouroLocatárioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(logradouroLocatarioLabel)
                                            .addComponent(logradouroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(4, 4, 4)))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(numeroLogradouroLocaratioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(complementoLogradouroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bairroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bairroLocatarioLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cidadeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cidadeLocatarioLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ufLocatarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cpfLocatarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(emailLocatarioLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(emailLocatarioTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                                    .addComponent(cepLocatarioLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(dtNascimentoLocatarioFormatted, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                            .addComponent(cepLocatarioTextFielld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                            .addComponent(cpfLocatarioTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(nacionalidadeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rgLocatarioLabel)
                                                    .addComponent(rgLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(estadocivilLoctarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(estadocivilLocatarioLabel))
                                                        .addGap(10, 10, 10)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(professaoLocatarioLabel)
                                                            .addComponent(profissaoLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(orgaoEmissorRGLocatarioLabel)
                                                            .addComponent(orgaoEmissorRgLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(rendaLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(rendaLocatarioLabel)))))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jLabel16))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DDDfoneLocatarioLabel)
                                                    .addComponent(dddfoneLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(foneLocatarioLabel)
                                                    .addComponent(foneLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(dddcelularLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(dddcelularLocatarioLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(celularLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(celularLocatarioLabel)))))
                                    .addComponent(dtNascimentoLocatarioLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(31, 31, 31)))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dtCadastroLabel)
                        .addContainerGap(380, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(dtCadastroLocatarioFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(dtCadastroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtCadastroLocatarioFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLocatarioLabel)
                    .addComponent(sobrenomeLocatarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenomeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoLogradouroLocatárioLabel)
                    .addComponent(logradouroLocatarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoLogradouroLocatárioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(bairroLocatarioLabel)
                    .addComponent(cidadeLocatarioLabel)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroLogradouroLocaratioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(complementoLogradouroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bairroLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidadeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ufLocatarioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLocatarioLabel)
                    .addComponent(foneLocatarioLabel)
                    .addComponent(DDDfoneLocatarioLabel)
                    .addComponent(dddcelularLocatarioLabel)
                    .addComponent(celularLocatarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepLocatarioTextFielld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foneLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dddfoneLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dddcelularLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtNascimentoLocatarioLabel)
                    .addComponent(jLabel16)
                    .addComponent(estadocivilLocatarioLabel)
                    .addComponent(professaoLocatarioLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtNascimentoLocatarioFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nacionalidadeLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadocivilLoctarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profissaoLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfLocatarioLabel)
                            .addComponent(rgLocatarioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rgLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emailLocatarioLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rendaLocatarioLabel)
                            .addComponent(orgaoEmissorRGLocatarioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orgaoEmissorRgLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rendaLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLocatarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(NovoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LimparButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CancelarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(SairButton)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NovoButton)
                    .addComponent(SalvarButton)
                    .addComponent(LimparButton)
                    .addComponent(CancelarButton)
                    .addComponent(SairButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoButtonActionPerformed
        habilitacampos();
        this.NovoButton.setEnabled(false);
        this.LimparButton.setEnabled(true);
        this.CancelarButton.setEnabled(true);
        this.SalvarButton.setEnabled(true);
        this.SairButton.setEnabled(false);
    }//GEN-LAST:event_NovoButtonActionPerformed

    private void LimparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparButtonActionPerformed
        limpacampos();
    }//GEN-LAST:event_LimparButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        limpacampos();
        desabilitacampos();
        this.NovoButton.setEnabled(true);
        this.SalvarButton.setEnabled(false);
        this.LimparButton.setEnabled(false);
        this.CancelarButton.setEnabled(false);
        this.SairButton.setEnabled(true);

    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        limpacampos();
        desabilitacampos();
        this.setVisible(false);
    }//GEN-LAST:event_SairButtonActionPerformed

    private void foneLocatarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foneLocatarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foneLocatarioTextFieldActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JLabel DDDfoneLocatarioLabel;
    private javax.swing.JButton LimparButton;
    private javax.swing.JLabel NomeLocatarioLabel;
    private javax.swing.JButton NovoButton;
    private javax.swing.JButton SairButton;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JLabel bairroLocatarioLabel;
    private javax.swing.JTextField bairroLocatarioTextField;
    private javax.swing.JLabel celularLocatarioLabel;
    private javax.swing.JTextField celularLocatarioTextField;
    private javax.swing.JLabel cepLocatarioLabel;
    private javax.swing.JTextField cepLocatarioTextFielld;
    private javax.swing.JLabel cidadeLocatarioLabel;
    private javax.swing.JTextField cidadeLocatarioTextField;
    private javax.swing.JTextField complementoLogradouroLocatarioTextField;
    private javax.swing.JLabel cpfLocatarioLabel;
    private javax.swing.JTextField cpfLocatarioTextField;
    private javax.swing.JLabel dddcelularLocatarioLabel;
    private javax.swing.JTextField dddcelularLocatarioTextField;
    private javax.swing.JTextField dddfoneLocatarioTextField;
    private javax.swing.JLabel dtCadastroLabel;
    private javax.swing.JFormattedTextField dtCadastroLocatarioFormatted;
    private javax.swing.JFormattedTextField dtNascimentoLocatarioFormatted;
    private javax.swing.JLabel dtNascimentoLocatarioLabel;
    private javax.swing.JLabel emailLocatarioLabel;
    private javax.swing.JTextField emailLocatarioTextField;
    private javax.swing.JLabel estadocivilLocatarioLabel;
    private javax.swing.JTextField estadocivilLoctarioTextField;
    private javax.swing.JLabel foneLocatarioLabel;
    private javax.swing.JTextField foneLocatarioTextField;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logradouroLocatarioLabel;
    private javax.swing.JTextField logradouroLocatarioTextField;
    private javax.swing.JTextField nacionalidadeLocatarioTextField;
    private javax.swing.JTextField nomeLocatarioTextField;
    private javax.swing.JTextField numeroLogradouroLocaratioTextField;
    private javax.swing.JLabel orgaoEmissorRGLocatarioLabel;
    private javax.swing.JTextField orgaoEmissorRgLocatarioTextField;
    private javax.swing.JLabel professaoLocatarioLabel;
    private javax.swing.JTextField profissaoLocatarioTextField;
    private javax.swing.JLabel rendaLocatarioLabel;
    private javax.swing.JTextField rendaLocatarioTextField;
    private javax.swing.JLabel rgLocatarioLabel;
    private javax.swing.JTextField rgLocatarioTextField;
    private javax.swing.JLabel sobrenomeLocatarioLabel;
    private javax.swing.JTextField sobrenomeLocatarioTextField;
    private javax.swing.JComboBox tipoLogradouroLocatárioComboBox;
    private javax.swing.JLabel tipoLogradouroLocatárioLabel;
    private javax.swing.JComboBox ufLocatarioComboBox;
    // End of variables declaration//GEN-END:variables
    
}
