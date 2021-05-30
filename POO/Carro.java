package estudopoo;

/** EXPLICAÇÃO:
 * 
 *
 * @author Deise Kinsk
 */

public class Carro {
        //ATRIBUTOS - Os atributos são alterados por métodos de uma classe.
        String corAtributo;
        String tipo;
        String placa;
        int numPortas;
        int cambio; //testa se o carro ligou.
        
        //inserindo o OBJETO DonoDoCarro nos ATRIBUTOS
        DonoDoCarro dono;
        
         // MAIS DE UM CONSTRUTOR ()
        public Carro(){
            System.out.println("LAVA JATO (ESTUDO DE POO)");
        }
        
        void Funciona(){
            System.out.println("O carro funciona.");
        }
        
        void Defeito(){
            System.out.println("O carro está com defeito.");
        }
        
        //CONSTRUCTOR -  representam o código que roda sempre que você usa a palavra-chave new.      
        public Carro(String corAtributo, String tipo,  String placa, int numPortas){
            //System.out.println("Construtor Carro.");SOBRECARGA
            
        
            
            //THIS = Usa-se a palavra reservada this antes do nome cor, informando ao compilador que estamos referenciando o atributo da classe e não o parâmetro do método.
            this.corAtributo = corAtributo;
            this.tipo = tipo;
            this.placa = placa;
            this.numPortas = numPortas;
        }
        
        //MÉTODO setCor(){}  -  Altera o atributo.
        //PARÂMETRO cor está em laranja. | ATRIBUTO cor está em verde.
        public void setCor(String corParametro){
            //INSTÂNCIAS this.cor
            this.corAtributo = corParametro;
        }
        
        //MÉTODO getCor(){}  -  Retorna o atributo
        public String getCor(){
                return this.corAtributo;
        }
        
        public String getTipo(){
                return tipo;
	}

        public void setTipo(String tipo){
                this.tipo = tipo;
        }

        public String getPlaca(){
                return placa;
        }
        public void setPlaca(String placa){
                this.placa = placa;
        }

        public int getNumPortas(){
                return numPortas;
        }
        public void setNumPortas(int numPortas){
                this.numPortas = numPortas;
        } 
        //Inserindo MÉTODOS para DonoDoCarro
        public DonoDoCarro getDono(){
            return dono;
        }
        
        public void setDono(DonoDoCarro dono){
            this.dono = dono;
        }
        
        public int getCambio(){
            return this.cambio;
        }
        
        public void setCambio(int cambio){
            this.cambio = cambio;
        }
        
        
        
        
 }