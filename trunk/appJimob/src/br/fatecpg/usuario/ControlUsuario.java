/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.usuario;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author claudio ferrini
 */
public class ControlUsuario {

    conexaoClass conn = new conexaoClass();

    private PreparedStatement pstm;

    private String insereUsuario = "insert into tb_usuario (cd_usuario, nm_login, nm_senha, cd_nivel, dt_cadastro) values" +
            "(cd_usuario_sq.nextval,?,?,?,?)";

    public void insereUsuario(BeanUsuario beanuser){

        try{

            pstm.setString(1,beanuser.getNm_login());
            pstm.setString(2, beanuser.getNm_senha());
            pstm.setString(3, beanuser.getCd_nivel());
            pstm.setString(4, beanuser.getDt_cadastro());

            pstm.execute();
            pstm.close();
        }

        catch(SQLException ex){

                        JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Usuário : "+ex);
                        
        }
    }


}
