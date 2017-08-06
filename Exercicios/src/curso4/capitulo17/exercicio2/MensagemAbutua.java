package curso4.capitulo17.exercicio2;

public class MensagemAbutua extends Mensagem {
    
    public MensagemAbutua() { 
        super.setMensagem("<tratamento><nome>, seja bem vindo(a). Cordialmente, Abutua."); 
    } 
    
    @Override
    protected String processaMensagem() {
        String msg = super.processaMensagem();
        return msg.replace("<tratamento>", "Caro(a) "); 
    }
}