package curso4.capitulo14.exercicio3;
import java.util.ArrayList;

public class Pedido {
    
    private int idPedido;
    private ArrayList<ItemPedido> itens = new ArrayList<ItemPedido>();
    private Cliente cliente = new Cliente();

    public int getIdPedido() 
    {
        return idPedido;
    }

    public void setIdPedido(int idPedido) 
    {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() 
    {
        return cliente;
    }

    public void setCliente(Cliente cliente) 
    {
        this.cliente = cliente;
    }
    
    public void addItemPedido(Produto produto, int quantidade) 
    {
        ItemPedido itemPedido = new ItemPedido();
        itemPedido.setProduto(produto);
        itemPedido.setQuantidade(quantidade);
        
        if (buscaItemPedido(produto) != null) 
        {
            for (int i = 0; i < itens.size(); i++)
            {
                if (itens.get(i).getProduto().getIdProduto() == produto.getIdProduto())
                {
                    itens.get(i).setQuantidade(itens.get(i).getQuantidade() + quantidade);
                    break;
                }
            }
        }
        else 
        {
            itens.add(itemPedido);
        }
    }
    
    public ItemPedido buscaItemPedido(Produto produto) 
    {
        ItemPedido itemPedido = null;
        for (int i = 0; i < itens.size(); i++) 
        {
            if (itens.get(i).getProduto().getIdProduto() == produto.getIdProduto())
            {
                itemPedido = itens.get(i);
                return itemPedido;
            }
        }
        
        return itemPedido;
    }
    
    public void removeItemPedido(Produto produto) 
    {
        for (int i = 0; i < itens.size(); i++) 
        {
            if (itens.get(i).getProduto().getIdProduto() == produto.getIdProduto()) 
            {
                itens.remove(i);
                break;
            }
        }
    }
    
    public double getPreco() 
    {
        double total = 0;
        
        for (int i = 0; i < itens.size(); i++) 
        {
            total += itens.get(i).getPreco();
        }
        
        return total;
    }
    
    public ArrayList<ItemPedido> getItens()
    {
        return this.itens;
    }
    
    public void setItens(ArrayList<ItemPedido> itens) 
    {
        this.itens = itens;
    }
}
