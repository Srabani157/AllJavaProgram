//Modulus
import java.util.Scanner;
    public class CalculateModule {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter two Numbers: ");
            int div = scanner.nextInt();
            int divisor = scanner.nextInt();
            int mod = calculateMod(div,divisor);
            System.out.println("Modulus is  : " +mod);
            scanner.close();
        }

        // Function to calc mod
         static int calculateMod(int divident, int divisor) {
            int result = 0, x;
            for(int i = 1; i < divident ; i++){
                x = divisor * i;
                if(x <= divident)
                    result = divident - x;
            }
            return result;
        }
    }

