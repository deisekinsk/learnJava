import java.util.Scanner;
public class ProgramaMatriz2 {
    public static void main (String args[]){
      Scanner leitor2 = new Scanner(System.in);
     //1ºArmazena a quantidade de vezes
        System.out.println("Quantas LINHAS? ");
        int linha = leitor2.nextInt();
                
        System.out.println("Quantas COLUNAS? ");
        int coluna = leitor2.nextInt();
        
     //Declara matriz 
    Scanner leitor = new Scanner(System.in);
    int matriz [][] = new int [linha][coluna];
    //Para cada elemento do for externo...
    for (int i= 0; i<linha; i++){
        //... o for interno  executa sua quantidade de reperições | i = 5*(5j)
        for (int j= 0; j<coluna; j++){
            if(i==j){
                matriz[i][j] = 1;
            }else {
                matriz[i][j] = 0;
            }
        }
    }
    //
    for (int i= 0; i<linha; i++){
        for (int j= 0; j<coluna; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
