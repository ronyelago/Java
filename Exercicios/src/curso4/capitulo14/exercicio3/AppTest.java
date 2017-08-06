package curso4.capitulo14.exercicio3;

public class AppTest {
    
    public static void main(String[] args) {
        
        Pedido nota = new Pedido();
        
        Produto snickers = new Produto();
        snickers.setIdProduto(1);
        snickers.setNome("Snickers");
        snickers.setPreco(2.00);
        snickers.setUnidade("150g");
        
        Produto coxinha = new Produto();
        coxinha.setIdProduto(2);
        coxinha.setNome("Coxinha");
        coxinha.setPreco(1.50);
        coxinha.setUnidade("100g");
        
        Produto hotDog = new Produto();
        hotDog.setIdProduto(3);
        hotDog.setNome("Hot Dog");
        hotDog.setPreco(1.50);
        hotDog.setUnidade("200g");
        
        Produto suco = new Produto();
        suco.setIdProduto(4);
        suco.setNome("Suco");
        suco.setPreco(5.00);
        suco.setUnidade("500ml");
        
        ItemPedido item1 = new ItemPedido();
        item1.setProduto(snickers);
        item1.setQuantidade(10);
        
        ItemPedido item2 = new ItemPedido();
        item2.setProduto(coxinha);
        item2.setQuantidade(10);
        
        ItemPedido item3 = new ItemPedido();
        item3.setProduto(hotDog);
        item3.setQuantidade(10);
        
        nota.getItens().add(item1);
        nota.getItens().add(item2);
        nota.getItens().add(item3);
        
        nota.addItemPedido(suco, 2);
        
        double total = nota.getPreco();
    }
}
