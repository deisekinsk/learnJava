import java.util.Scanner;
public class forSorteio {
    public static void main (String args[]){
        /**Math.random() retorna um valor numérico aleatóriode 
         * precisão decimal (double) entre 0 e 1.
         * Quando multiplicamos por 10, esse valor passa a ser entre 0 e 10.
         */
        long numero = Math.round(Math.random()*10);
        long chute;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número de 0 a 10");
        
        chute = leitor.nextLong();
        
        for(int i = 1; numero != chute; i += 1){
            //System.out.println(numero);
            System.out.println("Você errou! Tente novamente.");
            chute = leitor.nextLong();
        }
    
        System.out.println("Você acertou. O número é:" + numero);
    }    
    
    
}
