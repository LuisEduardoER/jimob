/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormMDI.java
 *
 * Created on 20/10/2009, 20:03:25
 */

package br.fatecpg.principal;


import br.fatecpg.comprador.FormCadastroComprador;
import br.fatecpg.corretor.FormCadastroCorretor;
import br.fatecpg.corretor.FormManutencaoCorretor;
import br.fatecpg.fiador.FormCadastroFiador;
import br.fatecpg.locacao.FormCadastroLocacao;
import br.fatecpg.locatario.FormCadastroLocatario;
import br.fatecpg.usuario.FormCadastroUsuario;
import br.fatecpg.venda.FormVenda;
import javax.swing.JFrame;

/**
 *
 * @author claudio ferrini
 */
public class FormMDI extends javax.swing.JFrame {

    FormCadastroCorretor formCadCorretor;
    FormCadastroComprador formCadComprador;
    FormCadastroFiador formCadFiador;
    FormCadastroLocacao formCadLocacao;
    FormCadastroLocatario formCadLocatario;
    FormCadastroUsuario formCadUsuario;
    FormVenda formVenda;
    FormManutencaoCorretor formManCorretor;




    public FormMDI() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMDIPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        subMenuCadastroComprador = new javax.swing.JMenuItem();
        subMenuCadastroCorretor = new javax.swing.JMenuItem();
        submenuFormCadastroFiador = new javax.swing.JMenuItem();
        subMenuFormCadastroLocação = new javax.swing.JMenuItem();
        subMenuFormCadastroLocatário = new javax.swing.JMenuItem();
        subMenuCadastroUsuario = new javax.swing.JMenuItem();
        vendamenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        subMenuManutencaoComprador = new javax.swing.JMenuItem();
        subMenuManutencaoCorretor = new javax.swing.JMenuItem();
        subMenuManutencaoFiador = new javax.swing.JMenuItem();
        subMenuManutencaoLocacao = new javax.swing.JMenuItem();
        subMenuManutencaoLocatario = new javax.swing.JMenuItem();
        subMenuManutencaoUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastro");

        subMenuCadastroComprador.setText("Comprador");
        subMenuCadastroComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCadastroCompradorActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuCadastroComprador);

        subMenuCadastroCorretor.setText("Corretor");
        subMenuCadastroCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCadastroCorretorActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuCadastroCorretor);

        submenuFormCadastroFiador.setText("Fiador");
        submenuFormCadastroFiador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuFormCadastroFiadorActionPerformed(evt);
            }
        });
        menuCadastro.add(submenuFormCadastroFiador);

        subMenuFormCadastroLocação.setText("Locação");
        subMenuFormCadastroLocação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormCadastroLocaçãoActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuFormCadastroLocação);

        subMenuFormCadastroLocatário.setText("Locatário");
        subMenuFormCadastroLocatário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuFormCadastroLocatárioActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuFormCadastroLocatário);

        subMenuCadastroUsuario.setText("Usuário");
        subMenuCadastroUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuCadastroUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(subMenuCadastroUsuario);

        vendamenu.setText("Venda");
        vendamenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendamenuActionPerformed(evt);
            }
        });
        menuCadastro.add(vendamenu);

        jMenuBar1.add(menuCadastro);

        jMenu1.setText("Manutenção");

        subMenuManutencaoComprador.setText("Comprador");
        jMenu1.add(subMenuManutencaoComprador);

        subMenuManutencaoCorretor.setText("Corretor");
        subMenuManutencaoCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuManutencaoCorretorActionPerformed(evt);
            }
        });
        jMenu1.add(subMenuManutencaoCorretor);

        subMenuManutencaoFiador.setText("Fiador");
        jMenu1.add(subMenuManutencaoFiador);

        subMenuManutencaoLocacao.setText("Locação");
        jMenu1.add(subMenuManutencaoLocacao);

        subMenuManutencaoLocatario.setText("Locatário");
        jMenu1.add(subMenuManutencaoLocatario);

        subMenuManutencaoUsuario.setText("Usuários");
        jMenu1.add(subMenuManutencaoUsuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatórios");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ferramentas");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Ajuda");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Sair");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMDIPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMDIPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void abreFormCadastroComprador(){

    if(formCadComprador == null){

        formCadComprador = new FormCadastroComprador();
        panelMDIPrincipal.add(formCadComprador);
        formCadComprador.setVisible(true);

    }else{
        formCadComprador.setVisible(true);
    }
   }

   private void abreManutencaoCorretor(){

   if(formManCorretor == null){

        formManCorretor = new FormManutencaoCorretor();
        panelMDIPrincipal.add(formManCorretor);
        formManCorretor.setVisible(true);

    }else{
        formManCorretor.setVisible(true);
    }
   }
   private void abreFormVenda(){

   if(formVenda == null){

        formVenda = new FormVenda();
        panelMDIPrincipal.add(formVenda);
        formVenda.setVisible(true);

    }else{
        formVenda.setVisible(true);
    }

   }

    private void subMenuCadastroCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCadastroCompradorActionPerformed
        abreFormCadastroComprador();
    }//GEN-LAST:event_subMenuCadastroCompradorActionPerformed

    private void subMenuCadastroCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCadastroCorretorActionPerformed
        abreFormCadastroCorretor();
    }//GEN-LAST:event_subMenuCadastroCorretorActionPerformed

    private void submenuFormCadastroFiadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuFormCadastroFiadorActionPerformed
      abreFormCadastroFiador();
}//GEN-LAST:event_submenuFormCadastroFiadorActionPerformed

    private void subMenuFormCadastroLocaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormCadastroLocaçãoActionPerformed
        abreFormCadastroLocacao();
    }//GEN-LAST:event_subMenuFormCadastroLocaçãoActionPerformed

    private void subMenuFormCadastroLocatárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuFormCadastroLocatárioActionPerformed
        abreFormCadastroLocatario();
    }//GEN-LAST:event_subMenuFormCadastroLocatárioActionPerformed

    private void subMenuCadastroUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuCadastroUsuarioActionPerformed
      abreFormCadastroUsuario();
    }//GEN-LAST:event_subMenuCadastroUsuarioActionPerformed

    private void subMenuManutencaoCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuManutencaoCorretorActionPerformed
        abreManutencaoCorretor();
    }//GEN-LAST:event_subMenuManutencaoCorretorActionPerformed

    private void vendamenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendamenuActionPerformed
        abreFormVenda();
    }//GEN-LAST:event_vendamenuActionPerformed

    private void abreFormCadastroFiador(){

    if(formCadFiador == null){

        formCadFiador = new FormCadastroFiador();
        panelMDIPrincipal.add(formCadFiador);
        formCadFiador.setVisible(true);

    }else{
        formCadFiador.setVisible(true);
    }
   }

    private void abreFormCadastroCorretor(){

    if(formCadCorretor == null){

        formCadCorretor = new FormCadastroCorretor();
        panelMDIPrincipal.add(formCadCorretor);
        formCadCorretor.setVisible(true);

    }else{
        formCadCorretor.setVisible(true);
      }
    }

    private void abreFormCadastroLocacao(){

    if(formCadLocacao == null){

        formCadLocacao = new FormCadastroLocacao();
        panelMDIPrincipal.add(formCadLocacao);
        formCadLocacao.setVisible(true);

    }else{
        formCadLocacao.setVisible(true);
    }
   }

    private void abreFormCadastroLocatario(){

    if(formCadLocatario == null){

        formCadLocatario = new FormCadastroLocatario();
        panelMDIPrincipal.add(formCadLocatario);
        formCadLocatario.setVisible(true);

    }else{
        formCadLocatario.setVisible(true);
    }
   }

    private void abreFormCadastroUsuario(){

    if(formCadUsuario == null){

        formCadUsuario = new FormCadastroUsuario();
        panelMDIPrincipal.add(formCadUsuario);
        formCadUsuario.setVisible(true);

    }else{
        formCadUsuario.setVisible(true);
    }
   }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JDesktopPane panelMDIPrincipal;
    private javax.swing.JMenuItem subMenuCadastroComprador;
    private javax.swing.JMenuItem subMenuCadastroCorretor;
    private javax.swing.JMenuItem subMenuCadastroUsuario;
    private javax.swing.JMenuItem subMenuFormCadastroLocatário;
    private javax.swing.JMenuItem subMenuFormCadastroLocação;
    private javax.swing.JMenuItem subMenuManutencaoComprador;
    private javax.swing.JMenuItem subMenuManutencaoCorretor;
    private javax.swing.JMenuItem subMenuManutencaoFiador;
    private javax.swing.JMenuItem subMenuManutencaoLocacao;
    private javax.swing.JMenuItem subMenuManutencaoLocatario;
    private javax.swing.JMenuItem subMenuManutencaoUsuario;
    private javax.swing.JMenuItem submenuFormCadastroFiador;
    private javax.swing.JMenuItem vendamenu;
    // End of variables declaration//GEN-END:variables

}