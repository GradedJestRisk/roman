package roman;
import java.util.Objects;
import java.util.Scanner;

public class Roman {
    public static String decimalToRoman(Integer i) {
        if(i==1){
            return "I";
        }
        return "V";
    }
    public static void main(String[] arguments) {
        if(arguments.length != 1){
            printUsage();
        }
        int decimal = 0;
        try{
            String input = arguments[0];
            decimal = Integer.parseInt(input);
        } catch (Error error) {
            printUsage();
        }

        String roman = decimalToRoman(decimal);
        System.out.println("roman numeral for " + decimal +  " is " + roman);

    }

    private static void printUsage(){
        System.out.println("Enter a decimal number, up to 3000");
        System.out.println("Roman 10");
        System.exit(1);
    }
}
