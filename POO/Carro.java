public class Carro {
        //ATRIBUTOS - Os atributos são alterados por métodos de uma classe.
        String corAtributo;
        String tipo;
        String placa;
        int numPortas;
        
         // MAIS DE UM CONSTRUTOR ()
        public Carro(){
            System.out.println("LAVA JATO (ESTUDO DE POO)");
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
        void setCor(String corParametro){
            //INSTÂNCIAS this.cor
            this.corAtributo = corParametro;
        }
        
        //MÉTODO getCor(){}  -  Retorna o atributo
        String getCor(){
            return this.corAtributo;
        }
        
        String getTipo(){
		return tipo;
	}

	void setTipo(String tipo){
		this.tipo = tipo;
	}

	String getPlaca(){
		return placa;
	}
	void setPlaca(String placa){
		this.placa = placa;
	}

	int getNumPortas(){
		return numPortas;
	}
	void setNumPortas(int numPortas){
		this.numPortas = numPortas;
	}  
 }
