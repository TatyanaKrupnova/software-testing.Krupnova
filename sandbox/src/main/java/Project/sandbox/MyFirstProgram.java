package Project.sandbox;

import static java.lang.Math.sqrt;

public class  MyFirstProgram
{

   public static void main(String[] args) {

       Point p1 = new Point(15.8,10);
       Point p2 = new Point(-15.8,10);
       System.out.println(" Расстояние между точками p1 и p2 равно "  + p1.distance(p2));

       Point p3 = new Point(1,1);
       Point p4 = new Point(1,10);
       System.out.println(" Расстояние между точками p3 и p4 равно "  + p3.distance(p4));
  }


}