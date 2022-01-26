package folder3;

import java.util.Scanner;

public class for3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;
        for(int i=1; i<num+1; i++){
            result += i;         
        }
        System.out.println(result);
    }
}
