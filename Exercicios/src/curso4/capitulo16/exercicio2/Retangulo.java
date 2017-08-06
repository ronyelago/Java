package curso4.capitulo16.exercicio2;

public class Retangulo {
    
    public Retangulo(int altura, int largura) {
        this.setAltura(altura);
        this.setLargura(largura);
    }
    
    public Retangulo(){}
    
    private int altura;
    private int largura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura < 0) {
            this.altura = -altura;
        }
        else if (altura == 0) {
            altura = 1;
            this.altura = altura;
        }
        else {
            this.altura = altura;
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura < 0) {
            this.largura = -largura;
        }
        else if (largura == 0) {
            largura = 1;
            this.largura = largura;
        }
        else {
            this.largura = largura;
        }
    }    
}
