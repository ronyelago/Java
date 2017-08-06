package curso4.capitulo14.exercicio2;
import javax.swing.JOptionPane;
import curso4.capitulo14.exercicio1.Carro;
import curso4.capitulo14.exercicio1.Motor;
import curso4.capitulo14.exercicio1.Pneu;

public class AppTeste {
    
    public static void main(String[] args) {
        
        Carro car = new Carro();
        car.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Codigo: ")));
        car.setModelo(JOptionPane.showInputDialog("Modelo: "));
        
        Motor motor = new Motor();
        motor.setNumeroSerie(JOptionPane.showInputDialog("Numero de Serie: "));
        motor.setPotencia(Double.parseDouble(JOptionPane.showInputDialog("Potencia: ")));
        
        Pneu[] pneus = new Pneu[5];
        for (int i = 0; i < pneus.length; i++){
            pneus[i] = new Pneu(15);
            pneus[i].setFabricante("BOM PNEU");
        }
        
        car.setMotor(motor);
        car.setPneus(pneus);
        
        System.out.println(car);
    }
}
