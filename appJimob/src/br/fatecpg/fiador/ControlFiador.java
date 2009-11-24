/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.fiador;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author claudio ferrini
 */
public class ControlFiador {

    conexaoClass conn = new conexaoClass();

    private  PreparedStatement pstm;
    private ResultSet rs;

    private String insereFiador = "insert into tb_fiador (cd_fiador, cd_locatario, nm_fiador, nm_sobrenome, cd_cpf, cd_registro_geral,"+
            "sg_orgao_expedidor, nm_tipo_logradouro, nm_logradouro, qt_numero_logradouro, nm_complemento, nm_bairro, nm_cidade"+
            "cd_cep, sg_unidade_federativa, cd_ddd_telefone_fixo, cd_telefone_fixo, cd_ddd_celular, cd_celular, nm_email, nm_profissao"+
            "vl_renda, dt_cadastro)values (cd_fiador_sq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    private String consultaFiador = "select * from tb_fiador";

    private String consultarNomeLocatario = "select l.nm_locatario|| ' ' ||l.nm_sobrenome from locatario l, fiador f " +
            "where f.cd_locatario = l.cd_locatario";

    public void inserirFiador(BeanFiador bc){

        try{

            pstm = conn.conectar().prepareStatement(insereFiador);

            pstm.setInt(1,bc.getCd_locatario());
            pstm.setString(2,bc.getNm_fiador());
            pstm.setString(3, bc.getNm_sobrenome_fiador());
            pstm.setInt(4,bc.getCd_cpf());
            pstm.setInt(5,bc.getCd_registro_geral());
            pstm.setString(6,bc.getSg_orgao_expedidor_registro_geral());
            pstm.setString(7,bc.getNm_tipo_logradouro());
            pstm.setString(8,bc.getNm_logradouro());
            pstm.setString(9,bc.getQt_numero_logradouro());
            pstm.setString(10,bc.getNm_complemento());
            pstm.setString(11,bc.getNm_bairro());
            pstm.setString(12,bc.getNm_cidade());
            pstm.setInt(13,bc.getCd_cep());
            pstm.setString(14,bc.getSg_unidade_federativa());
            pstm.setString(15,bc.getCd_ddd_telefone_fixo());
            pstm.setString(16,bc.getCd_telefone_fixo());
            pstm.setString(17,bc.getCd_ddd_celular());
            pstm.setString(18,bc.getCd_celular());
            pstm.setString(19,bc.getNm_email());
            pstm.setString(20,bc.getNm_profissao());
            pstm.setFloat(21,(float) bc.getVl_renda());
            pstm.setString(22,bc.getDt_cadastro());

            pstm.execute();
            pstm.close();
          } catch(SQLException ex){

               JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Fiador : "+ex);


          }


    }


    public void mostraLocatario(JComboBox jc){

    PreparedStatement pstmLoc;
    ResultSet rsLoc;
        try {
            pstmLoc = conn.conectar().prepareStatement(consultarNomeLocatario);


            rsLoc = pstmLoc.executeQuery();

            while (rsLoc.next()){

                jc.addItem(rsLoc.getString("nm_locatario"));
                

            


            }
rsLoc.close();
pstmLoc.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControlFiador.class.getName()).log(Level.SEVERE, null, ex);
        }





    }





}
