package curso4.capitulo13.exercicio1;
import curso4.capitulo8.exercicio2.Data;

public class Pedido {
    
    private int numeroPedido;
    private String descricao;
    private double totalPedido;
    private Data dataEntrada;
    private Cliente cliente;
    
    public Pedido(int numeroPedido) {
        
        this.dataEntrada = new Data();
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTotalPedido() {
        return totalPedido;
    }

    public void setTotalPedido(double totalPedido) {
        this.totalPedido = totalPedido;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada.setData(dataEntrada.getDia(), dataEntrada.getMes(), dataEntrada.getAno());
    }
    
    public Data getDataEntrada() {
        
        return this.dataEntrada;
    }
}
