package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        StringBuilder command = new StringBuilder();
        do {
            System.out.print("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            command.replace(0, command.length(), scanner.next());

            if("/exit".contentEquals(command)) {
               System.out.println("/exit");
               return;
            }

            if("/from".contentEquals(command)) {
                System.out.print("Enter number in decimal system: ");
                int decimal = scanner.nextInt();

                System.out.print("Enter target base: ");
                int base = scanner.nextInt();

                System.out.println(convertFromDecimal(decimal, base));
            }

            if("/to".contentEquals(command)) {
                System.out.println("Enter source number: ");
                String source = scanner.next();

                System.out.println("Enter source base: ");
                int base = scanner.nextInt();

                System.out.println(convertToDecimal(base, source));
            }

        } while (!"/exit".contentEquals(command));



    }
    public static StringBuilder convertFromDecimal(int decimal, int base) {
        StringBuilder string = new StringBuilder("Conversion result: ");
        if (base == 2) {
            string.append(Integer.toBinaryString(decimal));
        }

        if(base == 8) {
            string.append(Integer.toOctalString(decimal));
        }

        if(base == 16) {
            string.append(Integer.toHexString(decimal));
        }

        return string;
    }

    public static StringBuilder convertToDecimal(int base, String value){
        StringBuilder string = new StringBuilder("Conversion to decimal result: ");
            string.append(Integer.parseInt(value, base));
        return string;
    }
}

