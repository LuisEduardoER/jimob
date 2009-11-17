/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.corretor;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author okada
 */
public class ControlCorretor {

    conexaoClass conn;

     private PreparedStatement pstm;
     private ResultSet rs;

    private String insereCorretor="insert into tb_corretor(CD_CORRETOR,CD_CRECI,NM_CORRETOR,DT_ADMISSAO,NM_EMAIL,"+
            "NM_ENDERECO,CD_DDD_TELEFONE,CD_TELEFONE,CD_DDD_CELULAR,CD_CELULAR,DT_CADASTRO)"+
            "values (CD_CORRETOR_SQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";


    public void insereCorretor(BeanCorretor bc){
        
        try {

            pstm = conn.conectar().prepareStatement(insereCorretor);
            
            pstm.setInt(1,bc.getCd_creci());
            pstm.setString(2,bc.getNm_corretor());
            pstm.setString(3,bc.getDt_admissao());
            pstm.setString(4,bc.getNm_email());
            



        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Corretor : "+ex);

        }






    }
    


}
