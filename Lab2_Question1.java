import java.util.Scanner;

public class Lab2_Question1 {
    static final double PI = 3.14159;

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for radius: ");
        double radius = sc.nextDouble();
        double area = radius * radius * PI;
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }
}
