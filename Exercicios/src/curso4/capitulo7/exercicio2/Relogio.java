package curso4.capitulo7.exercicio2;

public class Relogio 
{
    public Relogio(int h, int m, int s)
    {
            somarSegundos(s);
            somarMinutos(m);
            somarHoras(h);
    }
    
    private int horas,
                minutos,
                segundos;

    public void somarSegundos(int seg)
    {
        if (seg >= 0)
        {
            if ((this.segundos + seg) > 59)
            {
                somarMinutos( (this.segundos + seg) / 60);
                this.segundos = (this.segundos + seg) % 60;
            }
            else
                this.segundos += seg;
        }
            
    }
    
    public void somarMinutos(int min)
    {
        if (min >= 0)
        {
            if ((this.minutos + min) > 59)
            {
                this.horas += (this.minutos + min) / 60;
                this.minutos = (this.minutos + min) % 60;
            }
            else
                this.minutos += min;
        }

    }
    
    public void somarHoras(int h)
    {
        if (h >= 0)
            this.horas += h;
    }
    
    public void somarRelogio(Relogio r)
    {
        somarSegundos(r.getSegundos());
        somarMinutos(r.getMinutos());
        somarHoras(r.getHoras());
    }
    
    public boolean compararRelogio(Relogio x)
    {
        if (getSegundos() == x.getSegundos() && getMinutos() == x.getMinutos() && getHoras() == x.getHoras())
            return true;
        else
            return false;
    }
    
    public String toString()
    {
        if (getHoras() < 10 && getMinutos() < 10 && getSegundos() < 10)
            return "0" + getHoras() + ":0" + getMinutos() + ":0" + getSegundos();
        else if (getHoras() < 10 && getMinutos() < 10)
            return "0" + getHoras() + ":0" + getMinutos() + ":" + getSegundos();
        else if (getHoras() < 10 && getSegundos() < 10)
            return "0" + getHoras() + ":" + getMinutos() + ":0" + getSegundos();
        else if (getMinutos() < 10 && getSegundos() < 10)
            return getHoras() + ":0" + getMinutos() + ":0" + getSegundos();
        else if (getHoras() < 10)
            return "0" + getHoras() + ":" + getMinutos() + ":" + getSegundos();
        else if (getMinutos() < 10)
            return getHoras() + ":0" + getMinutos() + ":" + getSegundos();
        else if (getSegundos() < 10)
            return getHoras() + ":" + getMinutos() + ":0" + getSegundos();
        else
            return getHoras() + ":" + getMinutos() + ":" + getSegundos();
    }
    
    // Métodos Gets
    public int getHoras() 
    {
        return horas;
    }

    public int getMinutos() 
    {
        return minutos;
    }

    public int getSegundos()
    {
        return segundos;
    }
    
    public static void main(String[] args)
    {
        
    }
}
