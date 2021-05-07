/*
 * Programação Estruturada
 */
package javaapplication1;

/**
 *
 * @author Deise Kinsk
 */
import java.util.Scanner;
public class maisVelha {
    
       public static void main(String args[]){
           
        String nomeA, nomeB;
        int anoA, anoB;
        int anoAtual = 2021;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");

        nomeA = leitor.nextLine();
        nomeB = leitor.nextLine();

        System.out.println("Digite o ano:");

        anoA = leitor.nextInt();
        anoB = leitor.nextInt();
                
        if (anoA<anoB){
          System.out.println(nomeA + " tem " + (anoAtual - anoA) + " anos e é mais velho que " + nomeB + "("+(anoAtual - anoB)+ "anos.)");
        
        }else {
          System.out.println(nomeB + " tem " + (anoAtual - anoB) + " e é mais velho que " + nomeA + "("+(anoAtual - anoA)+ "anos).");
        }

              

    }
    
}
