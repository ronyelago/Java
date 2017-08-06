package curso4.capitulo16.exercicio2;

public class SpriteGrafico extends Sprite {
    
    public SpriteGrafico(int posicaoX, int posicaoY, int centroX, int centroY,
            int altura, int largura) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.setCentroX(centroX);
        this.setCentroY(centroY);
        this.setAltura(altura);
        this.setLargura(largura);
    }
    
    public SpriteGrafico(){}
    
    private int posicaoX;
    private int posicaoY;

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
}
