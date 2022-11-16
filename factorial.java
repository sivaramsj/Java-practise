import java.util.Scanner;

class calculateFactorial {
    int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}

public class factorial {
    public static void main(String args[]) {
        int limit;
        Scanner in = new Scanner(System.in);
        calculateFactorial f = new calculateFactorial();
        System.out.print("Enter the Limit : ");
        limit = in.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println("Factorial of "+i+" : " + f.fact(i));
        }
    }
}