import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {

        double length,width;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = Double.parseDouble(scan.nextLine());

        System.out.println("Enter the width of the rectangle: ");
        width = Double.parseDouble(scan.nextLine());

        System.out.println("The area of the rectangle is: " + (length*width));

    }
}
