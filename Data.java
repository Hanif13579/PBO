import java.util.Scanner;

public class Data {
    public static void checkFit(String val)
    {
        try {
            long longVal = Long.parseLong(val);
            System.out.println(val + " can be fitted in:");
            if (longVal >= Short.MIN_VALUE && longVal <= Short.MAX_VALUE) {
                System.out.println("* Short");
            }
            if (longVal >= Integer.MIN_VALUE && longVal <= Integer.MAX_VALUE) {
                System.out.println("* Int");
            }
            System.out.println("* Long");
        } catch (NumberFormatException e) {
            System.out.println(val + " can't be fitted in anywhere");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; ++i)
        {
            String input = sc.nextLine();
            checkFit(input);
        }
        sc.close();
    }
}