
import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.print("Weird");
        } else {
            if (n % 2 == 0)
                if (n > 2 && n < 5) {
                    // n > 2 && n < 5 ;
                    System.out.println("Not Weird");
                }
            if (n > 6 && n < 20) {
                System.out.println("Weird");
            }
            if (n > 20) {
                System.out.println("Not weird");
            }
        }
        sc.close();
    }
}
