package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number in decimal system: ");
        int decimal = scanner.nextInt();

        System.out.print("Enter target base: ");
        int base = scanner.nextInt();


        if (base == 2) {
            System.out.println("Conversion result: " + Integer.toBinaryString(decimal));
        }

        if(base == 8) {
            System.out.println("Conversion result: " + Integer.toOctalString(decimal));
        }

        if(base == 16) {
            System.out.println("Conversion result: " + Integer.toHexString(decimal));
        }

    }
}
