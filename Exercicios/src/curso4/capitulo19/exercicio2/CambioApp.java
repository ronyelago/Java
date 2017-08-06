package curso4.capitulo19.exercicio2;

public class CambioApp {
    
    public static void main(String[] args) {
        
        imprimeMarchas(new CambioImpl());
        imprimeMarchas(new CambioTracaoImpl());
    }
    
    public static void imprimeMarchas(Cambio cambio) { 
    
        if(cambio instanceof CambioTracao) { 
            ((CambioTracao)cambio).setTracao4x4(true);
        } 
        
        for(int i = 0; i < cambio.getMarchas().length; i++) {
            
            cambio.setMarcha(cambio.getMarchas()[i]);
            System.out.println(cambio.getMarcha());
        }
    }
}
