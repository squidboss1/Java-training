import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius lenght: ");

        double r = Double.parseDouble(scan.nextLine());
        double sphereVolume =  (4.0 / 3.0) * Math.PI * Math.pow(r, 3);

        System.out.printf("Sphere volume: %.2f\n", sphereVolume);

    }
}
