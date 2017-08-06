package curso4.capitulo14.exercicio3;

public class Cliente {
    
    private int idCliente;
    private String nome;
    private String cpf;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String toString() {
        return "ID do Cliente" + getIdCliente() +
               "\nNome: " + getNome() +
               "\nCPF: " + getCpf();
    }
}
