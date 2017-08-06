package curso4.capitulo17.exercicio1;

public class FuncionarioMensalista extends Funcionario {
    
    private double valorSalarioMinimo;
    private double quantSalarioMinimo;
    
    public FuncionarioMensalista(int numeroRegistro) {
        super(numeroRegistro);
    }
    
    public void setValorSalarioMinimo(double valorSalarioMinimo) {
        this.valorSalarioMinimo = valorSalarioMinimo;
    }
    
    public double getValorSalarioMinimo() {
        return this.valorSalarioMinimo;
    }
    
    public void setQuantSalarioMinimo(double quantSalarioMinimo) {
        this.quantSalarioMinimo = quantSalarioMinimo;
    }
    
    public double getQuantSalarioMinimo() {
        return this.quantSalarioMinimo;
    }
    
    @Override
    public double obterSalarioBruto() {
        return valorSalarioMinimo * quantSalarioMinimo;
    }
    
    public String toString() {
        return super.toString() + "Valor do Salario Minimo: " + 
                                  valorSalarioMinimo +
                                  "\nQuantidade de Salarios: " +
                                  quantSalarioMinimo;
    }
}