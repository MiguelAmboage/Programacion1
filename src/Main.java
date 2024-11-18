//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número n: ");
        int n = scanner.nextInt();

        System.out.println("Números primos entre 0 y " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}






