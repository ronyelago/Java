package curso4.capitulo17.exercicio2;

public class Processador {
    
    public static void main(String[] args) {
        
        String nomes[] = { "Ronye", "Aline", "Olivia", "Fernanda", "Renan", "Lucas" };
        Mensagem mensagem = new Mensagem();
        MensagemAbutua mensagemAbutua = new MensagemAbutua();
        
        marketing(nomes, mensagem);
        marketing(nomes, mensagemAbutua);
    }
    
    public static void marketing(String destinatarios[], Mensagem mensagem) {
        
        for (String nome : destinatarios) {
            mensagem.setDestinatario(nome);
            System.out.println(mensagem.getMensagem());
        }
    }
}
