/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.venda;

import br.fatecpg.conexao.oracle.conexaoClass;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


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

    private String consultaComprador = "select nm_comprador from tb_comprador";

    private String consultaCorretor = "select nm_corretor from tb_corretor";

    public void insereVenda(BeanVenda bv){

        try{

            pstm = conn.conectar().prepareStatement(insereVenda);

            pstm.setInt(1,bv.getCd_imovel());
            pstm.setInt(2,bv.getCd_comprador());
            pstm.setInt(3, bv.getCd_corretor());
            pstm.setString(4, bv.getDt_venda());
            pstm.setDouble(5, (float) bv.getVl_venda());
            pstm.setString(6, bv.getDt_cadastro());

            pstm.execute();
            pstm.close();
        }catch(SQLException ex){

                   JOptionPane.showMessageDialog(null,"Erro ao tentar inserir registros na tabela Vendas : "+ex);
        }
    }

      public void mostraComprador(JComboBox jc){

    PreparedStatement pstmLoc;
    ResultSet rsLoc;
        try {
            pstmLoc = conn.conectar().prepareStatement(consultaComprador);

            rsLoc = pstmLoc.executeQuery();

            while (rsLoc.next()){

                jc.addItem(rsLoc.getString("nm_comprador"));

            }
        rsLoc.close();
        pstmLoc.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControlVenda.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
          public void mostraCorretor(JComboBox jc){

    PreparedStatement pstmLoc;
    ResultSet rsLoc;
        try {
            pstmLoc = conn.conectar().prepareStatement(consultaComprador);

            rsLoc = pstmLoc.executeQuery();

            while (rsLoc.next()){

                jc.addItem(rsLoc.getString("nm_corretor"));

            }
        rsLoc.close();
        pstmLoc.execute();

        } catch (SQLException ex) {
            Logger.getLogger(ControlVenda.class.getName()).log(Level.SEVERE, null, ex);
        }




    }


}
