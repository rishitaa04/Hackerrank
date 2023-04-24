import java.util.*;

// import javax.swing.plaf.synth.SynthSpinnerUI;

// import java.util.*;
public class inputoutputII {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of d : ");
        double d = sc.nextDouble();
        System.out.print("Enter value of s : ");
        sc.nextLine();
        String s = sc.nextLine();

        System.out.println("integer value is " + a);
        System.out.println("Double value is " + d);
        System.out.println("String value is " + s);
        sc.close();
    }
}
