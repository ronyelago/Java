package Prova_03_10_2016;

public class Exercicio2
{
    public static void main(String[] args) 
    {
        Obj t1, t2, t3, t4, t5;
        t1 = new Obj(1, "A");
        t2 = t1;
        t3 = new Obj(2, "G");
        t2.x = 200;
        t4 = t1;
        t1.x = 300;
        t1 = new Obj(3, "Z");
        t3 = new Obj(4, "Q");
        t5 = t2;
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
    }
}
