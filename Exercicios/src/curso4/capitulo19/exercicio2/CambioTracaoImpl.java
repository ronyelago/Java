package curso4.capitulo19.exercicio2;

public class CambioTracaoImpl implements CambioTracao, Cambio {
    
    public CambioTracaoImpl() {}
    
    private final int[] marchas = { -1, 0, 1, 2, 3 };
    private int marcha;
    private boolean tracao;
    
    public int[] getMarchas() {
        return this.marchas;
    }
    
    public int getMarcha() {
        return this.marcha;
    }
    
    public void setMarcha(int marcha) {
        
        if (this.tracao) {
            this.marcha = marcha * 10;
        }
        else {
            this.marcha = marcha;
        }
    }
    
    public boolean getTracao4x4() {
        return this.tracao;
    }
    
    public void setTracao4x4(boolean tracao) {
        this.tracao = tracao;
    }
}
