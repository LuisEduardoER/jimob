/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.fiador;


import br.fatecpg.principal.FormMDI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author claudio ferrini
 */
public class ControlFiador {

    private FormMDI fMdi = new FormMDI();

    private  PreparedStatement pstm;
    private ResultSet rs;

    private String insereFiador = "insert into tb_fiador (cd_fiador, cd_locatario, nm_fiador, nm_sobrenome, cd_cpf, cd_registro_geral,"+
            "sg_orgao_expedidor, nm_tipo_logradouro, nm_logradouro, qt_numero_logradouro, nm_complemento, nm_bairro, nm_cidade,"+
            "cd_cep, sg_unidade_federativa, cd_ddd_telefone_fixo, cd_telefone_fixo, cd_ddd_celular, cd_celular, nm_email, nm_profissao,"+
            "vl_renda, dt_cadastro) values (cd_fiador_sq.nextval,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

 
    private String consultarNomeLocatario = "select cd_locatario, nm_locatario|| ' ' ||nm_sobrenome as locatario "+
"from tb_locatario";


    


    public void inserirFiador(BeanFiador bc){
        try {
            pstm = fMdi.getConection().prepareStatement(insereFiador);

            

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
            pstm.setDouble(21,bc.getVl_renda());
            pstm.setString(22,bc.getDt_cadastro());

            pstm.execute();
            pstm.close();
            
          
} catch (SQLException ex) {
            Logger.getLogger(ControlFiador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    public void mostraLocatario(JComboBox jc){


    Statement st;
    ResultSet rsLoc;

    int n;
        try {
            st = fMdi.getConection().createStatement();
            



            rsLoc = st.executeQuery(consultarNomeLocatario);

            while (rsLoc.next()){

                jc.addItem(rsLoc.getString("cd_locatario")+" "+rsLoc.getString("locatario")+"");
                
            }



rsLoc.close();
st.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao tentar carregar o combobox de locatário , ERRO : "+ ex);
        }





    }





}
