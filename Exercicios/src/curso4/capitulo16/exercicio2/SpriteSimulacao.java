package curso4.capitulo16.exercicio2;


public class SpriteSimulacao extends Sprite {
    
    public SpriteSimulacao(int angulo, int velocidade, int centroX, int centroY,
            int altura, int largura) {
        this.setAngulo(angulo);
        this.velocidade = velocidade;
        this.setCentroX(centroX);
        this.setCentroY(centroY);
        this.setAltura(altura);
        this.setLargura(largura);
    }
    
    public SpriteSimulacao(){}
    
    private int angulo;
    private int velocidade;

    public int getAngulo() {
        return angulo;
    }

    public void setAngulo(int angulo) {    
    
        int tmp;  
        
        if(angulo < -360 || angulo > 360)  
        {  
            tmp = angulo % 360;  
        }  
        else  
        {  
            tmp = angulo;
        }  

        if(tmp < 0)  
        {  
            this.angulo = tmp + 360;  
        }  
        else  
        {  
            this.angulo = tmp;  
        }  
    } 

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}