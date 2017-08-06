package curso4.capitulo19.exercicio2;

public class CambioImpl implements Cambio {
    
    private final int[] marchas = { -1, 0, 1, 2, 3, 4 };
    private int marcha;
    
    public int[] getMarchas() {
        return this.marchas;
    }
    
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
    public int getMarcha() {
        return this.marcha;
    }
}
