package curso4.capitulo15.exercicio2;

public class Sprite extends Retangulo {
    
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
