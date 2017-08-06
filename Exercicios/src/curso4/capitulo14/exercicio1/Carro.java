package curso4.capitulo14.exercicio1;

public class Carro 
{
    private int codigo;
    private String modelo;
    private Motor motor;
    private Pneu[] pneus = new Pneu[5];
    
    public Carro(){};

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public Pneu[] getPneu(){
        return this.pneus;
    }
    
    public void setPneus(Pneu[] pneus) {
        this.pneus = pneus;
    }

    public String toString() {
        String listaPneus = "\n" + "Pneus: \n";
        
        for (Pneu pneu : pneus) {
            listaPneus += "Tamanho: " + pneu.getTamanho() + ", Fabricante: " + pneu.getFabricante() + "\n";
        }
        
        return "Código: " + getCodigo() + 
               ", Modelo: " + getModelo() +
               ", Motor: " + getMotor() + listaPneus;
    }    
}