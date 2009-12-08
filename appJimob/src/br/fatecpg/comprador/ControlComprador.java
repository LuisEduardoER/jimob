/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.comprador;

/**
 *
 * @author claudio ferrini
 */


import br.fatecpg.principal.FormMDI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ControlComprador {


    private FormMDI fMdi = new FormMDI();


    

    private PreparedStatement pstm;
    private Statement st;
    ResultSet rs;


    private String inserirComprador = "insert into tb_comprador (cd_comprador,nm_comprador,nm_tipo_logradouro,nm_logradouro,"+
            "qt_numero_logradouro,nm_bairro,nm_cidade,sg_unidade_federativa,cd_ddd_telefone,cd_telefone,dt_cadastro)"+
            "values(cd_comprador_sq.NEXTVAL,?,?,?,?,?,?,?,?,?,?)";


    private String atualizarComprador ="update tb_comprador set mn_comprador = ?, nm_tipo_logradouro = ?, nm_logradouro = ?,"+
            "qt_numero_logradouro=?,nm_bairro=?,nm_cidade=?,sg_unidade_federativa=?,cd_ddd_telefone=?,cd_telefone=?,"+
            "dt_cadastro=? where cd_comprador = ? ";


    private String queryComprador = "select * from tb_comprador";


    public List<BeanComprador> listaComprador(){

    List<BeanComprador> comprador = new ArrayList();

        try {

        st = fMdi.getConection().createStatement();
        rs = st.executeQuery(queryComprador);

        BeanComprador beanComp;

        while(rs.next()){

        beanComp = new BeanComprador();

        beanComp.setCd_comprador(rs.getInt("cd_comprador"));
        beanComp.setNm_comprador(rs.getString("nm_comprador"));
        beanComp.setNm_tipo_logradouro(rs.getString("nm_tipo_logradouro"));
        beanComp.setNm_logradouro(rs.getString("nm_logradouro"));
        beanComp.setQt_numero_logradouro(rs.getString("QT_NUMERO_LOGRADOURO"));
        beanComp.setNm_bairro(rs.getString("NM_BAIRRO"));
        beanComp.setNm_cidade(rs.getString("NM_CIDADE"));
        beanComp.setSg_unidade_federativa(rs.getString("SG_UNIDADE_FEDERATIVA"));
        beanComp.setCd_ddd_telefone(rs.getString("CD_DDD_TELEFONE"));
        beanComp.setCd_telefone(rs.getString("CD_TELEFONE"));
        beanComp.setDt_cadastro(rs.getString("DT_CADASTRO"));

        comprador.add(beanComp);
        }
        st.close();
        rs.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro no metodo listar comprador : " +e);
        }


    return comprador;
    }



    public void insereComprador(BeanComprador bc){

        try{
            pstm = fMdi.getConection().prepareStatement(inserirComprador);
      

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

    public void atualizaComprador(BeanComprador bc){

        try{
            pstm = fMdi.getConection().prepareStatement(atualizarComprador);


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
            pstm.setInt(11,bc.getCd_comprador());

            pstm.execute();
            pstm.close();
        }

        catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,"Erro ao tentar atualizar registros na tabela Comprador : "+ex);

        }



    }

}
