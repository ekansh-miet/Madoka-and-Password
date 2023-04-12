import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int type;
        if (n % 3 == 1)
            type = 1;
        else
            type = 2;
        int sum = 0;
        while (sum != n) {
            System.out.print(type);
            sum += type;
            type = 3 - type;
        }
    }
}