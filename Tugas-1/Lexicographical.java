import java.util.Scanner;

public class Lexicographical {
    public static void compare(String a, String b)
    {
        int result = a.compareToIgnoreCase(b);
        if(result > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        System.out.println(A.length() + B.length());

        compare(A, B);

        String sc1Final = A.substring(0,1).toUpperCase() + A.substring(1);
        String sc2Final = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(sc1Final + " " + sc2Final);

        sc.close();
    }
}
