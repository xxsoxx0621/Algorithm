package folder1;
import java.util.Scanner;

public class multifiedby{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        System.out.println(a*(b.charAt(2) - '0'));
        System.out.println(a*(b.charAt(1) - '0'));
        System.out.println(a*(b.charAt(0) - '0'));
        System.out.println(a * Integer.parseInt(b));
    }
}