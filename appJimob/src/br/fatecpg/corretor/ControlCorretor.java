/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.corretor;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author okada
 */
public class ControlCorretor {

    conexaoClass conn;
   

     private PreparedStatement pstm;
    

     private String inserirCorretor="insert into tb_corretor(CD_CORRETOR,CD_CRECI,NM_CORRETOR,DT_ADMISSAO,NM_EMAIL,"+
            "NM_ENDERECO,CD_DDD_TELEFONE,CD_TELEFONE,CD_DDD_CELULAR,CD_CELULAR,DT_CADASTRO)"+
            "values (CD_CORRETOR_SQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";


     public void insereCorretor(BeanCorretor bc){
        
        try {

            pstm = conn.conectar().prepareStatement(inserirCorretor);
            
            pstm.setInt(1,bc.getCd_creci());
            pstm.setString(2,bc.getNm_corretor());
            pstm.setString(3,bc.getDt_admissao());
            pstm.setString(4,bc.getNm_email());
            pstm.setString(5,bc.getNm_endereco());
            pstm.setString(6,bc.getCd_ddd_telefone());
            pstm.setString(7,bc.getCd_telefone());
            pstm.setString(8,bc.getCd_ddd_celular());
            pstm.setString(9,bc.getCd_celular());
            pstm.setString(10,bc.getDt_cadastro());
            
            pstm.execute();
            pstm.close();
            

            

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Corretor : "+ex);

        }


    }
    


}
