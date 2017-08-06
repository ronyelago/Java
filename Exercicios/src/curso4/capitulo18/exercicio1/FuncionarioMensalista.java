package curso4.capitulo18.exercicio1;

public class FuncionarioMensalista extends Funcionario {
    
    public FuncionarioMensalista(int numeroRegistro) {
        super(numeroRegistro);
    }
    
    private double valorSalarioMinimo;
    private double quantSalarioMinimo;

    public double getValorSalarioMinimo() {
        return valorSalarioMinimo;
    }

    public void setValorSalarioMinimo(double valorSalarioMinimo) {
        this.valorSalarioMinimo = valorSalarioMinimo;
    }

    public double getQuantSalarioMinimo() {
        return quantSalarioMinimo;
    }

    public void setQuantSalarioMinimo(double quantSalarioMinimo) {
        this.quantSalarioMinimo = quantSalarioMinimo;
    }
    
    @Override
    public double obterSalarioBruto() {
        return valorSalarioMinimo * quantSalarioMinimo;
    }
    
    public String toString() {
        return super.toString() + 
               "Valor do Salario Minimo: " + valorSalarioMinimo +
               "Quantidade de Salarios: " + quantSalarioMinimo;
    }
}
