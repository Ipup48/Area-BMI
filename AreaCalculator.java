import java.util.Scanner;
public class AreaCalculator {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the base of the triangle : ");
        float base = sc.nextFloat() ;
        System.out.print("Enter the height of the triangle : ");
        float height = sc.nextFloat();
        float triangle = (1/2f) * base * height;
        System.out.println("Area of the triangle : "+ triangle + " square units" );
        System.out.println("---------------------");
        System.out.print("Enter the length of the square : ");
        float length = sc.nextFloat();
        float square = length*length;
        System.out.println("Area of the squareArea "+ square+" square unitsx" );
    }
}