/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.conexao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author okada
 */
public class conexaoClass {


    private String drive ="oracle.jdbc.driver.OracleDriver";
    private String url ="jdbc:oracle:thin:@127.0.0.1:1521:XE";
    private String login="jimob";
    private String senha="jimob";
    private Connection con;



    public Connection conectar(){
            try {

            Class.forName(drive);
            con = DriverManager.getConnection(url, login, senha);
            JOptionPane.showMessageDialog(null,"COnectou");

            } catch (SQLException exSQL) {

                JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados :"+exSQL);
            }
              catch (ClassNotFoundException exClass) {

                  JOptionPane.showMessageDialog(null,"Erro com o driver de conexão: "+exClass);
        }

    return con;


    }


public void desconectar(){
        try {
            con.close();
        } catch (SQLException exDesc) {
          JOptionPane.showMessageDialog(null,"Erro ao desconectar com o banco de dados : "+exDesc);
        }


}




}
