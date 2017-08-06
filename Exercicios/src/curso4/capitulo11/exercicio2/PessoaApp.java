package curso4.capitulo11.exercicio2;

public class PessoaApp {
    
    public static void main(String[] args) {
        PessoaPrivada privada = new PessoaPrivada();
        PessoaProtegida protegida = new PessoaProtegida();
        System.out.println(privada);
        System.out.println(protegida);
    }
}
