/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Deise Kinsk
 */

import java.util.Scanner;
public class useSwitch {
    
    public static void main(String args[]){
        //Variáveis
        String multiplica = "m", entrada;
        
        int numA, numB;
        
        //Scanner
        Scanner leitor = new Scanner(System.in);
        
        //Input
        System.out.println("Insira dois números: ");
        
        numA = leitor.nextInt();
        numB = leitor.nextInt();
        
        System.out.println("Digite: multiplica ou s = Somar: ");
        
        entrada = leitor.next();
        
                        
        //conditions
        if( entrada.equals(multiplica)){
            System.out.print(numA + "x" + numB + "=" + (numA*numB));
        }else{
         
            System.out.print(numA + "+" + numB + "=" + (numA+numB));
        }        
            
    }
}
