package curso4.capitulo1.exercicio4;
import javax.swing.JOptionPane;

public class Exercicio4 
{
    
    public static void main(String args[])
    {
       double salario = 0;
       double qKwatts = 0;
       double precoKw = 0;
       double total = 0;
       int tipo = 0;
       int consumidores = 0;
       
       salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
       precoKw = salario / 8;
       System.out.println("Valor do Quilowatt:" + precoKw);
       
        do 
        {
            qKwatts = Double.parseDouble(JOptionPane.showInputDialog("Quantidade de Quilowatts: "));
            if (qKwatts > 0)
            {
                tipo = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Consumidor: "));
            
                if (tipo == 1)
                {
                    total = qKwatts * precoKw;
                    total += (total * 5) / 100;
                }
                if (tipo == 2)
                {
                    total = qKwatts * precoKw;
                    total += (total * 10) / 100;
                }
                if (tipo == 3)
                {
                    total = qKwatts * precoKw;
                    total += (total * 15) / 100;
                }

                if (total >= 500 && total <= 1000)
                    consumidores++;

                System.out.println(precoKw);
            }
        } while (qKwatts != 0);
        
        System.out.println(consumidores);
    }
}