/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.comprador;

/**
 *
 * @author claudio ferrini
 */

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControlComprador {

    conexaoClass conn = new conexaoClass();

    private PreparedStatement pstm;

    private String inserirComprador = "insert into tb_comprador (cd_comprador,nm_comprador,nm_tipo_logradouro,nm_logradouro,"+
            "qt_numero_logradouro,nm_bairro,nm_cidade,sg_unidade_federativa,cd_ddd_telefone,cd_telefone,dt_cadastro)"+
            "values(cd_comprador_sq.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";

    public void insereComprador(BeanComprador bc){

        try{
            pstm = conn.conectar().prepareStatement(inserirComprador);

            pstm.setString(1,bc.getNm_comprador());
            pstm.setString(2,bc.getNm_tipo_logradouro());
            pstm.setString(3,bc.getNm_logradouro());
            pstm.setString(4,bc.getQt_numero_logradouro());
            pstm.setString(5,bc.getNm_bairro());
            pstm.setString(6, bc.getNm_cidade());
            pstm.setString(7,bc.getSg_unidade_federativa());
            pstm.setString(8, bc.getCd_ddd_telefone());
            pstm.setString(9,bc.getCd_telefone());
            pstm.setString(10, bc.getDt_cadastro());

            pstm.execute();
            pstm.close();
        }

        catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Comprador : "+ex);

        }
    }



}
