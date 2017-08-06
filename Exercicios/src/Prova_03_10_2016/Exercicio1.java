package Prova_03_10_2016;

import java.util.ArrayList;

public class Exercicio1 
{
    public static void main(String[] args) 
    {
        Obj o1 = new Obj(1, "AAAA");
        Obj o2 = new Obj(2, "BBBB");
        Obj o3 = new Obj(3, "CCCC");
        Obj o4 = new Obj(4, "DDDD");
        Obj o5 = new Obj(5, "FFFF");

        ArrayList<Obj> lista = new ArrayList<Obj>();
        
        lista.add(o1);
        lista.add(o2);
        lista.add(o3);
        lista.add(o4);
        lista.add(o5);
        
        String v[] = new String[lista.size()];
        
        for (int i = lista.size() -1; i >= 0; i = i - 2)
        {
            v[i] = lista.get(i).toString();
        }
        
        for(String aux : v)
        {
            System.out.println(aux);
        }

    }    
}
