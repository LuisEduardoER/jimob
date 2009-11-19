/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.fatecpg.utilitarios;

import java.util.GregorianCalendar;

/**
 *
 * @author okada
 */
public class DataClass {


    GregorianCalendar cal=new GregorianCalendar();


    public String dataAtual(){

    String data,tdia,tmes,tano;


    int dia = cal.get(cal.DAY_OF_MONTH);
    int mes = cal.get(cal.MONTH)+1;
    int ano = cal.get(cal.YEAR);



    tdia = String.valueOf(dia);
    tmes=String.valueOf(mes);
    tano =String.valueOf(ano);


    data = tdia+"/"+tmes+"/"+tano;

    return data;

    }


}
