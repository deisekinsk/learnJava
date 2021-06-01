package automovel;

/**
 *
 * @author Deise Kinsk
 */
public class Automovel {
    //instancia objetos das classes Motor e Direção
    private Motor motor;
    private Direcao direcao;
    
    
    
    //instância CRIA OBJETO | 
    public static void main (String[] args){
            //CASO 1 - Possibilidades de criação da classe Motor para uso pela classe Automóvel
            Automovel automovel = new Automovel();
            //Automovel automovel = new Automovel(1600);

            /** //CASO 2
            Automovel automovel = new Automovel();
            automovel.ligarPrimeiraVez();
                    //outra maneira
            automovel.ligarPrimeiraVez(1600);

            //CASO 3
            Automovel automovel = new Automovel();
            Motor motor = new Motor();
                    //outra maneira
            Motor motor = new Motor (1600);
            automovel.setMotor(motor); */
    }
        

    //MÉTODO GET
    public Motor getMotor(){
        return this.motor;
    }
    
       public Direcao getDirecao(){
        return this.direcao;
    }
    
    //MÉTODO SET
    public void setMotor (Motor motorP){
        this.motor = motorP;
    }
       
    public void setDirecao( Direcao direcaoP){
        this.direcao = direcaoP;
    }
    
    }
    

