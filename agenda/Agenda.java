/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendaSemEncapsulamento;

/**
 *
 * @author Deise Kinsk
 */
public class Agenda {
    //variaveis Globais
    private int dia;
    private int mes;
    private String anotacao;
    
    //método anotar 
    public void anote(int diaP, int mesP, String anotacaoP){
        this.dia = diaP;
        this.mes = mesP;
        this.anotacao = anotacaoP;
        
        //metodo anote chama o metodo valida data
        validaData();
    
         }
    
    //método valida a Data
    private void validaData() {
        if ((dia<1) ||(dia>31) || (mes<1) || (mes>12)){
        this.dia = 0;
        this.mes = 0;
        this.anotacao = "Data inválida! Anotação não inserida.";
            }    
    }
    //Imprimi
    public void mostraAnotacao(){
        System.out.println(dia+"/"+mes+": "+anotacao);
    }
}
