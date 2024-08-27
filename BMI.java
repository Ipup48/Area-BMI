import java.util.Scanner;
public class BMI {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kilograms : ");
        float weight = sc.nextFloat();
        System.out.print("Enter your height in meters : ");
        float height = sc.nextFloat();
        double BMI = weight/(height*height);
        System.out.println("Your BMI for weight = "+weight+"kg" +" and height = "+height+"meters is :"+ BMI+" bmi.");
    }
    
}
