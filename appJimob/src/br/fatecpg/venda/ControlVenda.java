/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.venda;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author elaineokada
 */
public class ControlVenda {

    conexaoClass conn = new conexaoClass();

    private PreparedStatement pstm;

    private String insereVenda= "insert into tb_venda (cd_venda, cd_imovel, " +
            "cd_comprador, cd_corretor, dt_venda, vl_venda, dt_cadastro) values " +
            "(cd_venda.nextval,?,?,?,?,?,?)";

    public void insereVenda(BeanVenda bv){

        try{

            pstm = conn.conectar().prepareStatement(insereVenda);

            pstm.setInt(1,bv.getCd_imovel());
            pstm.setInt(2,bv.getCd_comprador());
            pstm.setInt(3, bv.getCd_corretor());
            pstm.setString(4, bv.getDt_venda());
            pstm.setFloat(5, (float) bv.getVl_venda());
            pstm.setString(6, bv.getDt_cadastro());

            pstm.execute();
            pstm.close();
        }catch(SQLException ex){

                   JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Vendas : "+ex);
        }
    }

}
