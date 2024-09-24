import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex008 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number a: ");
            float a = Float.parseFloat(br.readLine());
            System.out.println("Enter number b: ");
            float b = Float.parseFloat(br.readLine());

            float sum = a + b;
            float subtraction = a - b;
            float multiplication = a * b;
            float dividing = a / b;

            System.out.printf("Sum: %,.2f\nSubstraction: %,.2f\nMultiplication: %,.2f\nDividing: %,.2f\n", sum, subtraction, multiplication, dividing);
        } catch (Exception e) {
            System.out.println("You got an error: " + e);
        }
    }
}
