import java.util.Scanner;

public class Triangle{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double base=scanner.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height=scanner.nextDouble();
        double Area=0.5*base*height;
        System.out.println("Area of the triangle "+Area);
    }
}