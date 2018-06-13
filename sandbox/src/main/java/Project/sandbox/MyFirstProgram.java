package Project.sandbox;

import static java.lang.Math.sqrt;

public class  MyFirstProgram
{

   public static void main(String[] args) {

        System.out.println("Hello, world!");

        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 1;
        p1.y = 2;
        p2.x = 3;
        p2.y = 4;

        System.out.println(" Расстояние между точками p1 и p2 равно "  + distance(p1, p2));


  }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
    }

}