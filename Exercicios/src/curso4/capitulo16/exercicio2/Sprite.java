package curso4.capitulo16.exercicio2;

public class Sprite extends Retangulo {
    
    public Sprite(int centroX, int centroY, int altura, int largura) {
        super(altura, largura);
        this.centroX = centroX;
        this.centroY = centroY;
    }
    
    public Sprite(){}
    
    private int centroX;
    private int centroY;

    public int getCentroX() {
        return centroX;
    }

    public void setCentroX(int centroX) {
        this.centroX = centroX;
    }

    public int getCentroY() {
        return centroY;
    }

    public void setCentroY(int centroY) {
        this.centroY = centroY;
    }
    
    public int getCentroRealX() {
        return super.getLargura() / 2;
    }
    
        public int getCentroRealY() {
        return super.getAltura() / 2;
    }
}