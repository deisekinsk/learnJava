package estudopoo;

/**
 *
 * @author Deise Kinsk
 */
public class FabricaDeCarro {
    //main executa sozinha
    
    public static void main (String[] args){
        //instância CRIA OBJETO | cor , tipo, placa, numPortas
        Carro meuCarro = new Carro("Preto", "Golf 2018", "FDT876534", 4);
        Carro carroAntigo = new Carro();
        
        //DEFINI ATRIBUTOS
        meuCarro.setCor("Preto");
        meuCarro.setTipo("Golf 2018");
        meuCarro.setPlaca("FDT88736998");
        meuCarro.setNumPortas(2);
        
         //MÉTODO GET
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Número de portas: "+meuCarro.getNumPortas());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Tipo: "+meuCarro.getTipo());
        
        //ALTERA OBJETO
        meuCarro.setCor("verde");
        System.out.print("A cor do carro é " + meuCarro.getCor() + ". " + "\n");
        
       
        
     
    }
    
}
