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

    private String insereCorretor="insert into tb_corretor values (CD_CORRETOR_SQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";


    public void insereCorretor(BeanCorretor bc){
        
        try {

            pstm = conn.conectar().prepareStatement(insereCorretor);
            rs = pstm.getResultSet();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Corretor : "+ex);

        }

        



    }
    


}
