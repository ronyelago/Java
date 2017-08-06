package curso4.capitulo17.exercicio1;

public class FuncionarioHorista extends Funcionario {
    
    public FuncionarioHorista(int numeroRegistro) {
        super(numeroRegistro);
    }
    
    private double valorHora;
    private double horasTrabalhadas;
    
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
    
    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    @Override
    public double obterSalarioBruto() {
        return valorHora * horasTrabalhadas;
    }
    
    public String toString() {
        return super.toString() + "\nValor da Hora: " + valorHora +
                                  "\nHoras Trabalhadas: " + horasTrabalhadas +
                                  "\nSalario Bruto: " + obterSalarioBruto();
    }
}
