package ru.stetsenko;

/**
 * Created by Alesha on 10.09.2015.
 */
public class Main {
    public static void main (String[] argc){
        Point A = new Point('A',2,0);
        Point B = new Point('B',0,-8);
        Point O = new Point('O',0,0);
        System.out.println(A);
        System.out.println(B);
        System.out.println("Расстояние между точками = " + A.howLong(B));
        double c = A.howLong(O);
        double d = B.howLong(O);
        if(c<d)
            System.out.println("Точка A ближе");
        else
            System.out.println("Точка B ближе");
    }
}
