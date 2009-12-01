/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTemplate.java
 *
 * Created on 20/10/2009, 19:58:39
 */

package br.fatecpg.fiador;

import br.fatecpg.utilitarios.DataClass;
import br.fatecpg.conexao.oracle.conexaoClass;
import br.fatecpg.utilitarios.comboboxClass;
import javax.swing.JOptionPane;

/**
 *
 * @author claudio ferrini
 */
public class FormCadastroFiador extends javax.swing.JInternalFrame {
    
    /** Creates new form FormTemplate */

    DataClass dt = new DataClass();
    conexaoClass conn = new conexaoClass();



    public FormCadastroFiador() {
        initComponents();
        desabitaCampos();
        limpaCampos();

    }

    private void mostraData(){

DataClass dta = new DataClass();
this.datacadastroFiadorFormattedText.setText(dta.dataAtual());
    }


    private void relacionaEstados(){

    comboboxClass ufc =new comboboxClass();
    ufc.mostraUFs(this.ufFiadorComboBox);


    }



   private void desabitaCampos(){
   this.locatarioFiadorComboBox.setEnabled(false);
   this.datacadastroFiadorFormattedText.setEditable(false);
   this.nomeFiadorTextField.setEditable(false);
   this.sobrenomeFiadorTextField.setEditable(false);
   this.cpfFiadorFormatted.setEditable(false);
   this.rgFiadorFormattedText.setEditable(false);
   this.orgaoexpedidorFiadorTextField.setEditable(false);
   this.tipologradouroFiadorComboBox.setEnabled(false);
   this.logradouroFiadorTextField.setEditable(false);
   this.numerologradouroFiadorTextField.setEditable(false);
   this.complementoFiadorTextField.setEditable(false);
   this.cepFiadorFormattedText.setEditable(false);
   this.bairroFiadorTextField.setEditable(false);
   this.cidadeFiadorTextField.setEditable(false);
   this.ufFiadorComboBox.setEnabled(false);
   this.dddfoneFiadorTextField.setEditable(false);
   this.fonefixoFiadorFormatted.setEditable(false);
   this.dddcelularTextField.setEditable(false);
   this.celularFiadorFormatted.setEditable(false);
   this.emailFiadorTextField.setEditable(false);
   this.profissaoFiadorTextField.setEditable(false);
   this.rendaFiadorFormatted.setEditable(false);
   this.novoButton.setEnabled(true);
   this.sairButton.setEnabled(true);
   this.limparButton.setEnabled(false);
   this.salvarButton.setEnabled(false);
   this.cancelarButton.setEnabled(false);
   

  
   }


   private void habilitaCampos(){

   this.locatarioFiadorComboBox.setEnabled(true);
   this.datacadastroFiadorFormattedText.setEditable(true);
   this.nomeFiadorTextField.setEditable(true);
   this.sobrenomeFiadorTextField.setEditable(true);
   this.cpfFiadorFormatted.setEditable(true);
   this.rgFiadorFormattedText.setEditable(true);
   this.orgaoexpedidorFiadorTextField.setEditable(true);
   this.tipologradouroFiadorComboBox.setEnabled(true);
   this.logradouroFiadorTextField.setEditable(true);
   this.numerologradouroFiadorTextField.setEditable(true);
   this.complementoFiadorTextField.setEditable(true);
   this.cepFiadorFormattedText.setEditable(true);
   this.bairroFiadorTextField.setEditable(true);
   this.cidadeFiadorTextField.setEditable(true);
   this.ufFiadorComboBox.setEnabled(true);
   this.dddfoneFiadorTextField.setEditable(true);
   this.fonefixoFiadorFormatted.setEditable(true);
   this.dddcelularTextField.setEditable(true);
   this.celularFiadorFormatted.setEditable(true);
   this.emailFiadorTextField.setEditable(true);
   this.profissaoFiadorTextField.setEditable(true);
   this.rendaFiadorFormatted.setEditable(true);
   this.novoButton.setEnabled(false);
   this.limparButton.setEnabled(true);
   this.salvarButton.setEnabled(true);
   this.cancelarButton.setEnabled(true);
   this.sairButton.setEnabled(false);
   this.relacionaEstados();
   this.mostraData();
   comboLocatario();
   
  
   }


   private void limpaCampos(){

   this.locatarioFiadorComboBox.setToolTipText("");
   this.nomeFiadorTextField.setText("");
   this.sobrenomeFiadorTextField.setText("");
   this.cpfFiadorFormatted.setText("");
   this.rgFiadorFormattedText.setText("");
   this.orgaoexpedidorFiadorTextField.setText("");
   this.tipologradouroFiadorComboBox.setToolTipText("");
   this.logradouroFiadorTextField.setText("");
   this.numerologradouroFiadorTextField.setText("");
   this.complementoFiadorTextField.setText("");
   this.cepFiadorFormattedText.setText("");
   this.bairroFiadorTextField.setText("");
   this.cidadeFiadorTextField.setText("");
   this.ufFiadorComboBox.setToolTipText("");
   this.dddfoneFiadorTextField.setText("");
   this.fonefixoFiadorFormatted.setText("");
   this.dddcelularTextField.setText("");
   this.celularFiadorFormatted.setText("");
   this.emailFiadorTextField.setText("");
   this.profissaoFiadorTextField.setText("");
   this.rendaFiadorFormatted.setText("");
  

   }

private void salvarCampos(){

    try {




    BeanFiador beanf = new BeanFiador();
    ControlFiador ctrlf = new ControlFiador();


   
    beanf.setCd_locatario(this.pegaCodLocatario());

    beanf.setNm_fiador(this.nomeFiadorTextField.getText().toUpperCase().trim());
    beanf.setNm_sobrenome_fiador(this.sobrenomeFiadorTextField.getText().toUpperCase().trim());

    int cpf = Integer.parseInt(this.cpfFiadorFormatted.getText().trim());
    beanf.setCd_cpf(cpf);

    int rg = Integer.parseInt(this.rgFiadorFormattedText.getText().trim());
    beanf.setCd_registro_geral(rg);

    beanf.setSg_orgao_expedidor_registro_geral(this.orgaoexpedidorFiadorTextField.getText().toUpperCase().trim());
    beanf.setNm_tipo_logradouro(this.tipologradouroFiadorComboBox.getSelectedItem().toString());
    beanf.setNm_logradouro(this.logradouroFiadorTextField.getText().toUpperCase().trim());
    beanf.setQt_numero_logradouro(this.numerologradouroFiadorTextField.getText().toUpperCase().trim());
    beanf.setNm_complemento(this.complementoFiadorTextField.getText().toUpperCase().trim());

    int cep = Integer.parseInt(this.cepFiadorFormattedText.getText().toUpperCase().trim());
    beanf.setCd_cep(cep);

    beanf.setNm_bairro(this.bairroFiadorTextField.getText().toUpperCase().trim());
    beanf.setNm_cidade(this.cidadeFiadorTextField.getText().toUpperCase().trim());
    beanf.setSg_unidade_federativa(this.ufFiadorComboBox.getSelectedItem().toString());
    beanf.setCd_ddd_telefone_fixo(this.dddfoneFiadorTextField.getText().toUpperCase().trim());
    beanf.setCd_telefone_fixo(this.fonefixoFiadorFormatted.getText().toUpperCase().trim());
    beanf.setCd_ddd_celular(this.dddcelularTextField.getText().trim());
    beanf.setCd_celular(this.celularFiadorFormatted.getText().trim());
    beanf.setNm_email(this.emailFiadorTextField.getText().toLowerCase().trim());
    beanf.setNm_profissao(this.profissaoFiadorTextField.getText().toUpperCase().trim());

    float renda = Float.parseFloat(this.rendaFiadorFormatted.getText().trim());
    beanf.setVl_renda(renda);
    beanf.setDt_cadastro(this.datacadastroFiadorFormattedText.getText().toUpperCase().trim());

ctrlf.inserirFiador(beanf);


 } catch (Exception e) {

     JOptionPane.showMessageDialog(null,"Erro no método salvar campos : "+e);

    }

}


private void comboLocatario(){

ControlFiador conComb = new ControlFiador();

conComb.mostraLocatario(this.locatarioFiadorComboBox);





}

private int pegaCodLocatario(){

        String cdS = (String) this.locatarioFiadorComboBox.getSelectedItem().toString().subSequence(0,1);
        String cdSt = (String)cdS;
        cdSt.trim();
        int cdI = Integer.parseInt(cdSt);

        return cdI;

}

@SuppressWarnings("unchecked")

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dadolocatarioFiadorPanel = new javax.swing.JPanel();
        locatarioFiadorComboBox = new javax.swing.JComboBox();
        cdlocatarioFiadorLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nomeFiadorLabel = new javax.swing.JLabel();
        nomeFiadorTextField = new javax.swing.JTextField();
        sobrenomeFiadorLabel = new javax.swing.JLabel();
        sobrenomeFiadorTextField = new javax.swing.JTextField();
        cpfFiadorLabel = new javax.swing.JLabel();
        cpfFiadorFormatted = new javax.swing.JFormattedTextField();
        rgFiadorLabel = new javax.swing.JLabel();
        rgFiadorFormattedText = new javax.swing.JFormattedTextField();
        orgaoexpedidorFiadorLabel = new javax.swing.JLabel();
        orgaoexpedidorFiadorTextField = new javax.swing.JTextField();
        tipologradouroFiadorLabel = new javax.swing.JLabel();
        tipologradouroFiadorComboBox = new javax.swing.JComboBox();
        logradouroFiadorLabel = new javax.swing.JLabel();
        logradouroFiadorTextField = new javax.swing.JTextField();
        numerologradouroFiador = new javax.swing.JLabel();
        numerologradouroFiadorTextField = new javax.swing.JTextField();
        complementoFiadorLabel = new javax.swing.JLabel();
        complementoFiadorTextField = new javax.swing.JTextField();
        bairroFiadorLabel = new javax.swing.JLabel();
        bairroFiadorTextField = new javax.swing.JTextField();
        cidadeFiadorLabel = new javax.swing.JLabel();
        cidadeFiadorTextField = new javax.swing.JTextField();
        cepFiadorLabel1 = new javax.swing.JLabel();
        cepFiadorFormattedText = new javax.swing.JFormattedTextField();
        ufFiadorLabel = new javax.swing.JLabel();
        ufFiadorComboBox = new javax.swing.JComboBox();
        dddfoneFiadorLabel = new javax.swing.JLabel();
        dddfoneFiadorTextField = new javax.swing.JTextField();
        fonefixoFiadorLabel = new javax.swing.JLabel();
        fonefixoFiadorFormatted = new javax.swing.JFormattedTextField();
        dddcelularLabel = new javax.swing.JLabel();
        celularFiadorFormatted = new javax.swing.JFormattedTextField();
        dddcelularTextField = new javax.swing.JTextField();
        celularFiadorLabel = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        emailFiadorTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        profissaoFiadorTextField = new javax.swing.JTextField();
        datacadastroFiadorLabel = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        rendaFiadorFormatted = new javax.swing.JFormattedTextField();
        datacadastroFiadorFormattedText = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        novoButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        limparButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Cadastro de Fiador");

        jPanel1.setBackground(new java.awt.Color(173, 190, 206));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        dadolocatarioFiadorPanel.setBackground(new java.awt.Color(173, 190, 206));
        dadolocatarioFiadorPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Locatário"));

        locatarioFiadorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        locatarioFiadorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locatarioFiadorComboBoxActionPerformed(evt);
            }
        });

        cdlocatarioFiadorLabel.setText("Locatário");

        javax.swing.GroupLayout dadolocatarioFiadorPanelLayout = new javax.swing.GroupLayout(dadolocatarioFiadorPanel);
        dadolocatarioFiadorPanel.setLayout(dadolocatarioFiadorPanelLayout);
        dadolocatarioFiadorPanelLayout.setHorizontalGroup(
            dadolocatarioFiadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadolocatarioFiadorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dadolocatarioFiadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(locatarioFiadorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdlocatarioFiadorLabel))
                .addContainerGap(497, Short.MAX_VALUE))
        );
        dadolocatarioFiadorPanelLayout.setVerticalGroup(
            dadolocatarioFiadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dadolocatarioFiadorPanelLayout.createSequentialGroup()
                .addComponent(cdlocatarioFiadorLabel)
                .addGap(8, 8, 8)
                .addComponent(locatarioFiadorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(173, 190, 206));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        nomeFiadorLabel.setText("Nome");

        nomeFiadorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFiadorTextFieldActionPerformed(evt);
            }
        });

        sobrenomeFiadorLabel.setText("Sobrenome");

        cpfFiadorLabel.setText("CPF");

        rgFiadorLabel.setText("R.G.");

        orgaoexpedidorFiadorLabel.setText("Órgão Expedidor");

        tipologradouroFiadorLabel.setText("Tipo Logradouro");

        logradouroFiadorLabel.setText("Logradouro");

        numerologradouroFiador.setText("Nº");

        complementoFiadorLabel.setText("Complemento");

        bairroFiadorLabel.setText("Bairro");

        cidadeFiadorLabel.setText("Cidade");

        cepFiadorLabel1.setText("C.E.P");

        ufFiadorLabel.setText("U.F.");

        dddfoneFiadorLabel.setText("DDD");

        fonefixoFiadorLabel.setText("Telefone Fixo");

        dddcelularLabel.setText("DDD");

        celularFiadorLabel.setText("Celular");

        jLabel18.setText("E-mail");

        jLabel19.setText("Renda");

        datacadastroFiadorLabel.setText("Cadastrado em:");

        jLabel21.setText("Profissão");

        datacadastroFiadorFormattedText.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datacadastroFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datacadastroFiadorLabel))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(nomeFiadorLabel))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeFiadorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sobrenomeFiadorLabel)
                            .addComponent(sobrenomeFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dddfoneFiadorLabel)
                            .addComponent(tipologradouroFiadorComboBox, 0, 108, Short.MAX_VALUE)
                            .addComponent(cpfFiadorFormatted, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(tipologradouroFiadorLabel)
                            .addComponent(cpfFiadorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dddcelularLabel)
                                    .addComponent(dddcelularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(celularFiadorLabel)
                                    .addComponent(celularFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(logradouroFiadorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                    .addComponent(logradouroFiadorLabel)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rgFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rgFiadorLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(orgaoexpedidorFiadorTextField)
                                            .addComponent(orgaoexpedidorFiadorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numerologradouroFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numerologradouroFiador))
                                .addGap(185, 185, 185))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dddfoneFiadorTextField)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fonefixoFiadorLabel)
                            .addComponent(fonefixoFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(profissaoFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(rendaFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailFiadorTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(complementoFiadorLabel)
                                .addComponent(complementoFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cepFiadorLabel1)
                                .addComponent(cepFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bairroFiadorLabel)
                                .addComponent(bairroFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cidadeFiadorTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addComponent(cidadeFiadorLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ufFiadorLabel)
                                .addComponent(ufFiadorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeFiadorLabel)
                    .addComponent(datacadastroFiadorLabel)
                    .addComponent(nomeFiadorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sobrenomeFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datacadastroFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgFiadorLabel)
                    .addComponent(orgaoexpedidorFiadorLabel)
                    .addComponent(cpfFiadorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgaoexpedidorFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroFiadorLabel)
                    .addComponent(numerologradouroFiador)
                    .addComponent(tipologradouroFiadorLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logradouroFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerologradouroFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipologradouroFiadorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(cepFiadorLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cepFiadorFormattedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(complementoFiadorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complementoFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dddfoneFiadorLabel)
                            .addComponent(celularFiadorLabel)
                            .addComponent(fonefixoFiadorLabel)
                            .addComponent(dddcelularLabel)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeFiadorLabel)
                            .addComponent(bairroFiadorLabel)
                            .addComponent(ufFiadorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidadeFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bairroFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ufFiadorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dddfoneFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fonefixoFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celularFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dddcelularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(profissaoFiadorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rendaFiadorFormatted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dadolocatarioFiadorPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dadolocatarioFiadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limparButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelarButton)
                .addGap(65, 65, 65)
                .addComponent(sairButton)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelarButton, limparButton, novoButton, sairButton, salvarButton});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novoButton)
                    .addComponent(salvarButton)
                    .addComponent(limparButton)
                    .addComponent(cancelarButton)
                    .addComponent(sairButton))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-761)/2, (screenSize.height-648)/2, 761, 648);
    }// </editor-fold>//GEN-END:initComponents




    private void locatarioFiadorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locatarioFiadorComboBoxActionPerformed
        
    }//GEN-LAST:event_locatarioFiadorComboBoxActionPerformed

    private void nomeFiadorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFiadorTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_nomeFiadorTextFieldActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
habilitaCampos();
}//GEN-LAST:event_novoButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
      limpaCampos();
      desabitaCampos();
      this.setVisible(false);
      conn.desconectar();
}//GEN-LAST:event_sairButtonActionPerformed

    private void limparButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparButtonActionPerformed
       limpaCampos();
}//GEN-LAST:event_limparButtonActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        limpaCampos();
        desabitaCampos();
}//GEN-LAST:event_cancelarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        salvarCampos();
        limpaCampos();
        desabitaCampos();
    }//GEN-LAST:event_salvarButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bairroFiadorLabel;
    private javax.swing.JTextField bairroFiadorTextField;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JLabel cdlocatarioFiadorLabel;
    private javax.swing.JFormattedTextField celularFiadorFormatted;
    private javax.swing.JLabel celularFiadorLabel;
    private javax.swing.JFormattedTextField cepFiadorFormattedText;
    private javax.swing.JLabel cepFiadorLabel1;
    private javax.swing.JLabel cidadeFiadorLabel;
    private javax.swing.JTextField cidadeFiadorTextField;
    private javax.swing.JLabel complementoFiadorLabel;
    private javax.swing.JTextField complementoFiadorTextField;
    private javax.swing.JFormattedTextField cpfFiadorFormatted;
    private javax.swing.JLabel cpfFiadorLabel;
    private javax.swing.JPanel dadolocatarioFiadorPanel;
    private javax.swing.JFormattedTextField datacadastroFiadorFormattedText;
    private javax.swing.JLabel datacadastroFiadorLabel;
    private javax.swing.JLabel dddcelularLabel;
    private javax.swing.JTextField dddcelularTextField;
    private javax.swing.JLabel dddfoneFiadorLabel;
    private javax.swing.JTextField dddfoneFiadorTextField;
    private javax.swing.JTextField emailFiadorTextField;
    private javax.swing.JFormattedTextField fonefixoFiadorFormatted;
    private javax.swing.JLabel fonefixoFiadorLabel;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton limparButton;
    private javax.swing.JComboBox locatarioFiadorComboBox;
    private javax.swing.JLabel logradouroFiadorLabel;
    private javax.swing.JTextField logradouroFiadorTextField;
    private javax.swing.JLabel nomeFiadorLabel;
    private javax.swing.JTextField nomeFiadorTextField;
    private javax.swing.JButton novoButton;
    private javax.swing.JLabel numerologradouroFiador;
    private javax.swing.JTextField numerologradouroFiadorTextField;
    private javax.swing.JLabel orgaoexpedidorFiadorLabel;
    private javax.swing.JTextField orgaoexpedidorFiadorTextField;
    private javax.swing.JTextField profissaoFiadorTextField;
    private javax.swing.JFormattedTextField rendaFiadorFormatted;
    private javax.swing.JFormattedTextField rgFiadorFormattedText;
    private javax.swing.JLabel rgFiadorLabel;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton salvarButton;
    private javax.swing.JLabel sobrenomeFiadorLabel;
    private javax.swing.JTextField sobrenomeFiadorTextField;
    private javax.swing.JComboBox tipologradouroFiadorComboBox;
    private javax.swing.JLabel tipologradouroFiadorLabel;
    private javax.swing.JComboBox ufFiadorComboBox;
    private javax.swing.JLabel ufFiadorLabel;
    // End of variables declaration//GEN-END:variables
    
}
