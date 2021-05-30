public class Principal {
    
    public static void main(String[] args){
        //instância CRIA OBJETO 
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
        
         //DEFINI ATRIBUTOS | executa o método anote
        agenda1.anote(12,10,"Dia das Crianças.");
        agenda2.anote(7,15,"Independência do Brasil.");
        
        //MÉTODO GET
        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
    
}
