/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.comprador;

import br.fatecpg.utilitarios.DataClass;
import br.fatecpg.conexao.oracle.conexaoClass;
import javax.swing.JOptionPane;

/**
 *
 * @author claudio ferrini
 */
public class FormCadastroComprador extends javax.swing.JInternalFrame {

    /** Creates new form FormTemplate */

    DataClass dt = new DataClass();
    conexaoClass conn = new conexaoClass();
    
    public FormCadastroComprador() {
        initComponents();
        desabilitacampos();
        limpacampos();
    }

    private void mostraData(){
    DataClass dt = new DataClass();

    this.data_cadastroCompradorJFormat.setText(dt.dataAtual());
    }

    private void desabilitacampos(){

        this.nomeCompradorField.setEditable(false);
        this.tipo_logradouroCompradorComboBox.setEnabled(false);
        this.enderecoCompradorTextField.setEditable(false);
        this.numeroCompradorTextField.setEditable(false);
        this.bairroCompradorTextField.setEditable(false);
        this.cidadeCompradorTextField.setEditable(false);
        this.estadoCompradorComboBox.setEnabled(false);
        this.ddd_foneCompradorjTextField2.setEditable(false);
        this.foneCompradorjFormattedTextField2.setEditable(false);
        this.data_cadastroCompradorJFormat.setEditable(false);
        this.salvarCompradorButton.setEnabled(false);
        this.limparButton.setEnabled(false);
        this.cancelarCompradorButton.setEnabled(false);
    }

    private void habilitacampos(){

        this.nomeCompradorField.setEditable(true);
        this.tipo_logradouroCompradorComboBox.setEnabled(true);
        this.enderecoCompradorTextField.setEditable(true);
        this.numeroCompradorTextField.setEditable(true);
        this.bairroCompradorTextField.setEditable(true);
        this.cidadeCompradorTextField.setEditable(true);
        this.estadoCompradorComboBox.setEnabled(true);
        this.ddd_foneCompradorjTextField2.setEditable(true);
        this.foneCompradorjFormattedTextField2.setEditable(true);
        this.data_cadastroCompradorJFormat.setEditable(true);
        this.salvarCompradorButton.setEnabled(true);
        this.limparButton.setEnabled(true);
        this.cancelarCompradorButton.setEnabled(true);



        
    }

    private void limpacampos(){

        this.nomeCompradorField.setText("");
        this.enderecoCompradorTextField.setText("");
        this.numeroCompradorTextField.setText("");
        this.bairroCompradorTextField.setText("");
        this.cidadeCompradorTextField.setText("");
        this.ddd_foneCompradorjTextField2.setText("");
        this.foneCompradorjFormattedTextField2.setText("");
       
    }

    private void salvarCampos(){

        BeanComprador beanc = new BeanComprador();
        ControlComprador ctrc = new ControlComprador();

        beanc.setNm_comprador(this.nomeCompradorField.getText().toUpperCase().trim());
        beanc.setNm_tipo_logradouro(this.tipo_logradouroCompradorComboBox.getSelectedItem().toString());
        beanc.setNm_logradouro(this.enderecoCompradorTextField.getText().toUpperCase().trim());
        beanc.setQt_numero_logradouro(this.numeroCompradorTextField.getText().toUpperCase().trim());
        beanc.setNm_bairro(this.bairroCompradorTextField.getText().toUpperCase().trim());
        beanc.setNm_cidade(this.cidadeCompradorTextField.getText().toUpperCase().trim());
        beanc.setSg_unidade_federativa(this.estadoCompradorComboBox.getSelectedItem().toString());
        beanc.setCd_ddd_telefone(this.ddd_foneCompradorjTextField2.getText().toUpperCase().trim());
        beanc.setCd_telefone(this.foneCompradorjFormattedTextField2.getText().toUpperCase().trim());
        beanc.setDt_cadastro(this.data_cadastroCompradorJFormat.getText().toUpperCase().trim());
        
        ctrc.insereComprador(beanc);


    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadastroCompradorPanelComponentes = new javax.swing.JPanel();
        dadospessoaisCompradorPanel = new javax.swing.JPanel();
        nomeCompradorLabel = new javax.swing.JLabel();
        nomeCompradorField = new javax.swing.JTextField();
        data_cadastroCompradorjLabel2 = new javax.swing.JLabel();
        data_cadastroCompradorJFormat = new javax.swing.JFormattedTextField();
        enderecoCompradorPanel = new javax.swing.JPanel();
        tipo_logradouroCompradorComboBox = new javax.swing.JComboBox();
        tipo_logradouroCompradorLabel = new javax.swing.JLabel();
        enderecoCompradorTextField = new javax.swing.JTextField();
        enderecoCompradorLabel = new javax.swing.JLabel();
        numero_logradouroCompradorLabel = new javax.swing.JLabel();
        numeroCompradorTextField = new javax.swing.JTextField();
        bairroCompradorLabel = new javax.swing.JLabel();
        bairroCompradorTextField = new javax.swing.JTextField();
        cidadeCompradorLabel = new javax.swing.JLabel();
        cidadeCompradorTextField = new javax.swing.JTextField();
        estadoCompradorComboBox = new javax.swing.JComboBox();
        estadoCompradorLabel = new javax.swing.JLabel();
        telefoneCompradorPanel = new javax.swing.JPanel();
        ddd_foneCompradorjLabel2 = new javax.swing.JLabel();
        foneCompradorjLabel3 = new javax.swing.JLabel();
        foneCompradorjFormattedTextField2 = new javax.swing.JFormattedTextField();
        ddd_foneCompradorjTextField2 = new javax.swing.JTextField();
        cadastroCompradorPanelBotoes = new javax.swing.JPanel();
        novoCompradorButton = new javax.swing.JButton();
        salvarCompradorButton = new javax.swing.JButton();
        cancelarCompradorButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        SairButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Cadastro de Comprador");

        cadastroCompradorPanelComponentes.setBackground(new java.awt.Color(173, 190, 206));
        cadastroCompradorPanelComponentes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        dadospessoaisCompradorPanel.setBackground(new java.awt.Color(173, 190, 206));
        dadospessoaisCompradorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        nomeCompradorLabel.setText("Nome");

        data_cadastroCompradorjLabel2.setText("Data Cadastro");

        data_cadastroCompradorJFormat.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout dadospessoaisCompradorPanelLayout = new javax.swing.GroupLayout(dadospessoaisCompradorPanel);
        dadospessoaisCompradorPanel.setLayout(dadospessoaisCompradorPanelLayout);
        dadospessoaisCompradorPanelLayout.setHorizontalGroup(
            dadospessoaisCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadospessoaisCompradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadospessoaisCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCompradorField, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
                    .addComponent(data_cadastroCompradorJFormat, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCompradorLabel)
                    .addComponent(data_cadastroCompradorjLabel2))
                .addContainerGap())
        );
        dadospessoaisCompradorPanelLayout.setVerticalGroup(
            dadospessoaisCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dadospessoaisCompradorPanelLayout.createSequentialGroup()
                .addComponent(data_cadastroCompradorjLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(data_cadastroCompradorJFormat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeCompradorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeCompradorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        enderecoCompradorPanel.setBackground(new java.awt.Color(173, 190, 206));
        enderecoCompradorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        tipo_logradouroCompradorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AEROPORTO", "ALAMEDA", "APARTAMENTO", "AVENIDA", "BECO", "BLOCO", "CAMINHO", "ESCADINHA", "ESTAÇÃO", "ESTRADA", "FAZENDA", "FORTALEZA", "GALERIA", "LADEIRA", "LARGO", "PRAÇA", "PARQUE", "PRAIA", "QUADRA", "QUILÔMETRO", "QUINTA", "RODOVIA", "RUA", "SUPER QUADRA", "TRAVESSA", "VIADUTO", "VILA", " " }));

        tipo_logradouroCompradorLabel.setText("Tipo Logradouro");

        enderecoCompradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCompradorTextFieldActionPerformed(evt);
            }
        });

        enderecoCompradorLabel.setText("Logradouro");

        numero_logradouroCompradorLabel.setText("Número");

        numeroCompradorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCompradorTextFieldActionPerformed(evt);
            }
        });

        bairroCompradorLabel.setText("Bairro");

        cidadeCompradorLabel.setText("Cidade");

        estadoCompradorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO", " " }));

        estadoCompradorLabel.setText("Estado");

        javax.swing.GroupLayout enderecoCompradorPanelLayout = new javax.swing.GroupLayout(enderecoCompradorPanel);
        enderecoCompradorPanel.setLayout(enderecoCompradorPanelLayout);
        enderecoCompradorPanelLayout.setHorizontalGroup(
            enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo_logradouroCompradorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipo_logradouroCompradorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enderecoCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enderecoCompradorLabel)))
                    .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bairroCompradorLabel)
                            .addComponent(bairroCompradorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(cidadeCompradorLabel))
                            .addComponent(cidadeCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero_logradouroCompradorLabel)
                    .addComponent(numeroCompradorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(estadoCompradorLabel)
                    .addComponent(estadoCompradorComboBox, 0, 38, Short.MAX_VALUE))
                .addContainerGap())
        );
        enderecoCompradorPanelLayout.setVerticalGroup(
            enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_logradouroCompradorLabel)
                    .addComponent(enderecoCompradorLabel)
                    .addComponent(numero_logradouroCompradorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo_logradouroCompradorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enderecoCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                        .addComponent(bairroCompradorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bairroCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(enderecoCompradorPanelLayout.createSequentialGroup()
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeCompradorLabel)
                            .addComponent(estadoCompradorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(enderecoCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeCompradorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(estadoCompradorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        telefoneCompradorPanel.setBackground(new java.awt.Color(173, 190, 206));
        telefoneCompradorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefones"));

        ddd_foneCompradorjLabel2.setText("DDD");

        foneCompradorjLabel3.setText("Telefone");

        javax.swing.GroupLayout telefoneCompradorPanelLayout = new javax.swing.GroupLayout(telefoneCompradorPanel);
        telefoneCompradorPanel.setLayout(telefoneCompradorPanelLayout);
        telefoneCompradorPanelLayout.setHorizontalGroup(
            telefoneCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telefoneCompradorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(telefoneCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telefoneCompradorPanelLayout.createSequentialGroup()
                        .addComponent(ddd_foneCompradorjLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(foneCompradorjLabel3))
                    .addGroup(telefoneCompradorPanelLayout.createSequentialGroup()
                        .addComponent(ddd_foneCompradorjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foneCompradorjFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        telefoneCompradorPanelLayout.setVerticalGroup(
            telefoneCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telefoneCompradorPanelLayout.createSequentialGroup()
                .addGroup(telefoneCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddd_foneCompradorjLabel2)
                    .addComponent(foneCompradorjLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(telefoneCompradorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ddd_foneCompradorjTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foneCompradorjFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cadastroCompradorPanelComponentesLayout = new javax.swing.GroupLayout(cadastroCompradorPanelComponentes);
        cadastroCompradorPanelComponentes.setLayout(cadastroCompradorPanelComponentesLayout);
        cadastroCompradorPanelComponentesLayout.setHorizontalGroup(
            cadastroCompradorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastroCompradorPanelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastroCompradorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(telefoneCompradorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dadospessoaisCompradorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(enderecoCompradorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        cadastroCompradorPanelComponentesLayout.setVerticalGroup(
            cadastroCompradorPanelComponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCompradorPanelComponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadospessoaisCompradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enderecoCompradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(telefoneCompradorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        cadastroCompradorPanelBotoes.setBackground(new java.awt.Color(173, 190, 206));
        cadastroCompradorPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        novoCompradorButton.setText("Novo");
        novoCompradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoCompradorButtonActionPerformed(evt);
            }
        });

        salvarCompradorButton.setText("Salvar");
        salvarCompradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCompradorButtonActionPerformed(evt);
            }
        });

        cancelarCompradorButton.setText("Cancelar");
        cancelarCompradorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCompradorButtonActionPerformed(evt);
            }
        });

        limparButton.setText("Limpar");
        limparButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparButtonActionPerformed(evt);
            }
        });

        SairButton.setText("Sair");
        SairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroCompradorPanelBotoesLayout = new javax.swing.GroupLayout(cadastroCompradorPanelBotoes);
        cadastroCompradorPanelBotoes.setLayout(cadastroCompradorPanelBotoesLayout);
        cadastroCompradorPanelBotoesLayout.setHorizontalGroup(
            cadastroCompradorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCompradorPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novoCompradorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarCompradorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarCompradorButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(SairButton)
                .addContainerGap())
        );
        cadastroCompradorPanelBotoesLayout.setVerticalGroup(
            cadastroCompradorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroCompradorPanelBotoesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(cadastroCompradorPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoCompradorButton)
                    .addComponent(salvarCompradorButton)
                    .addComponent(limparButton)
                    .addComponent(cancelarCompradorButton)
                    .addComponent(SairButton))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cadastroCompradorPanelBotoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastroCompradorPanelComponentes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastroCompradorPanelComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastroCompradorPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-631)/2, (screenSize.height-545)/2, 631, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoCompradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCompradorTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_enderecoCompradorTextFieldActionPerformed

    private void numeroCompradorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCompradorTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_numeroCompradorTextFieldActionPerformed

    private void novoCompradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoCompradorButtonActionPerformed
        habilitacampos();
        mostraData();
    }//GEN-LAST:event_novoCompradorButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
       limpacampos();
    }//GEN-LAST:event_limparButtonActionPerformed

    private void cancelarCompradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCompradorButtonActionPerformed
        limpacampos();
        desabilitacampos();
        
    }//GEN-LAST:event_cancelarCompradorButtonActionPerformed

    private void SairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairButtonActionPerformed
        limpacampos();
        desabilitacampos();
        this.setVisible(false);
    }//GEN-LAST:event_SairButtonActionPerformed

    private void salvarCompradorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCompradorButtonActionPerformed
        salvarCampos();
        limpacampos();
        desabilitacampos();

        

    }//GEN-LAST:event_salvarCompradorButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SairButton;
    private javax.swing.JLabel bairroCompradorLabel;
    private javax.swing.JTextField bairroCompradorTextField;
    private javax.swing.JPanel cadastroCompradorPanelBotoes;
    private javax.swing.JPanel cadastroCompradorPanelComponentes;
    private javax.swing.JButton cancelarCompradorButton;
    private javax.swing.JLabel cidadeCompradorLabel;
    private javax.swing.JTextField cidadeCompradorTextField;
    private javax.swing.JPanel dadospessoaisCompradorPanel;
    private javax.swing.JFormattedTextField data_cadastroCompradorJFormat;
    private javax.swing.JLabel data_cadastroCompradorjLabel2;
    private javax.swing.JLabel ddd_foneCompradorjLabel2;
    private javax.swing.JTextField ddd_foneCompradorjTextField2;
    private javax.swing.JLabel enderecoCompradorLabel;
    private javax.swing.JPanel enderecoCompradorPanel;
    private javax.swing.JTextField enderecoCompradorTextField;
    private javax.swing.JComboBox estadoCompradorComboBox;
    private javax.swing.JLabel estadoCompradorLabel;
    private javax.swing.JFormattedTextField foneCompradorjFormattedTextField2;
    private javax.swing.JLabel foneCompradorjLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limparButton;
    private javax.swing.JTextField nomeCompradorField;
    private javax.swing.JLabel nomeCompradorLabel;
    private javax.swing.JButton novoCompradorButton;
    private javax.swing.JTextField numeroCompradorTextField;
    private javax.swing.JLabel numero_logradouroCompradorLabel;
    private javax.swing.JButton salvarCompradorButton;
    private javax.swing.JPanel telefoneCompradorPanel;
    private javax.swing.JComboBox tipo_logradouroCompradorComboBox;
    private javax.swing.JLabel tipo_logradouroCompradorLabel;
    // End of variables declaration//GEN-END:variables

}
