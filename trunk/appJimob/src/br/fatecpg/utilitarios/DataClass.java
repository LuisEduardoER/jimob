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


    int dia = cal.getTime().getDay();
    int mes = cal.MONTH;
    int ano = cal.YEAR;



    tdia = String.valueOf(dia);
    tmes=String.valueOf(mes);
    tano =String.valueOf(ano);


    data = tdia+"/"+tmes+"/"+tano;

    return data;

    }


}
