import java.util.Scanner;
class constructor
{
     constructor()
     {
        System.out.println("this is default constructor");
      }
     constructor(float a)
     {
        System.out.println("area of square = "+(a*a));
      }
      constructor(float l,float h)
       {
        System.out.println("area of rectangle = "+(l*h));
      }
      constructor(float r,float h)
       {
        System.out.println("area of cylinder = "+(2*(3.14F)*r*(h+r)));
      }      
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the value of side of square:");
       float a=s.nextInt();
       System.out.println("Enter the value of height:");
       float h=s.nextInt();
       System.out.println("Enter the value of radius:");
       float r=s.nextFloat();
       System.out.println("Enter the value of length:");
       float l=s.nextInt();
       constructor c=new constructor(a);
       constructor d=new constructor(l,h);
       constructor e=new constructor(r,h);
     }
}
