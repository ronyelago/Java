package curso4.capitulo18.exercicio1;

public class FuncionarioHorista extends Funcionario {
    
    public FuncionarioHorista(int numeroRegistro) {
        super(numeroRegistro);
    }
    
    private double valorHora;
    private double horasTrabalhadas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double obterSalarioBruto() {
        return horasTrabalhadas * valorHora;
    }
    
    public String toString() {
        return super.toString() + 
               "Valor da Hora: " + valorHora +
               "Horas Trabalhadas" + horasTrabalhadas +
               "Salario Bruto: " + this.obterSalarioBruto();
    }
}