package curso4.capitulo17.exercicio2;

public class Mensagem {
    
    private String destinatario = "Ronye";
    private String mensagem = "<nome> seja bem vindo.";

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getMensagem() {
        String msg = processaMensagem();
        return msg;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    protected String processaMensagem() {
        return this.mensagem.replace("<nome>", destinatario);
    }  
}