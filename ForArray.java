import java.util.Scanner;

public class ProgramaNotasArray1 {
	public static void main(String[] args) {
            //1º Lê notas
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a quantidade de notas a serem lidas");
		
            //2º Armazena em nova variável
                int quantidade = leitor.nextInt();
            
            //3º Determina tamanho do Array
		double notas[] = new double[quantidade];
            
            //4º Laço de repetição
                //4.1 Primeiro salva os valores
                for (int i = 0; i < quantidade; i++) {
			System.out.println("Digite a nota de número " + (i+1));
			notas[i] = leitor.nextDouble();
                                             
		}
                //4.2 Segundo imprimi os valores
                for(int i = 0; i < quantidade; i++){
                            System.out.println((notas[i]) + " é a Nota; o índice é " + i + ", e a posição é " + (i + 1));
                        }
		// ... aqui, faz o processamento das notas
                
	}
}
