package curso4.capitulo13.exercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class Cliente {
    
    private int codigoCliente;
    private String nomeCliente;
    private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    
    public Cliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }
    
    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public Iterator getPedidosIterator() {
        return pedidos.iterator();
    } 

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public int getQuantidadePedidos() {
        return pedidos.size();
    }
    
    public double getTotalPedidos() {
        double total = 0;
        for (int i = 0; i < pedidos.size(); i++) {
            total += pedidos.get(i).getTotalPedido();
        }
        
        return total;
    }
    
    public String toString() { 
        Iterator<Pedido> i = getPedidosIterator(); 
        String mensagem = "Codigo Cliente: " + getCodigoCliente() + 
                          "Nome Cliente: " + getNomeCliente();

        while (i.hasNext()) { 
        Pedido aux = (Pedido) i.next(); 
        mensagem += aux.getTotalPedido() + " " + 
                    aux.getNumeroPedido() + " " + 
                    aux.getDescricao() + " " + 
                    aux.getDataEntrada() + " " + 
                    getQuantidadePedidos(); 
        } 

        return mensagem + getTotalPedidos(); 
    } 
}

