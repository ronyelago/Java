package curso4.capitulo15.exercicio1;

public class Cliente extends Pessoa {
    
    private double saldo;
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public String toString() {
        return "Saldo: " + this.saldo + " " + super.toString();
    }
}
