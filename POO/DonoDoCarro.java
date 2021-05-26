package estudopoo;

/**
 *
 * @author Deise Kinsk
 */
public class DonoDoCarro {
        String marca;
        String nacionalidade;
        int quantidadeDeCarros;
        //inserir Objeto
        Carro carro;
    
        public String getMarca() {
            return marca;
        }
        
        //inserir o PARAMÊTRO
        public void setMarca(String marca) {
            this.marca = marca;
        }
        //
        public String getNacionalidade() {
            return nacionalidade;
        }
        
     
        public void setNacionalidade(String nacionalidade) {
            this.nacionalidade = nacionalidade;
        }
        
        public int getQuantidadeDeCarros() {
            return quantidadeDeCarros;
        }
        
     
        public void setQuantidadeDeCarros(int quantidadeDeCarros) {
            this.quantidadeDeCarros = quantidadeDeCarros;
        }
        
        public Carro getCarro(){
            return carro;
        }
        
        public void setCarro(Carro carroParametro){
            this.carro= carroParametro;
        }
        //MÉTODOS
        void funciona(){
            carro.Funciona();
        }
        
        void defeito(){
            carro.Defeito();
        }

        void setCambio(int cambio) {
            carro.setCambio(cambio);
    }
    
    
}
