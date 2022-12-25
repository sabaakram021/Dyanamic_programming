import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findNth_fibonacci(n);
        System.out.println(ans);
    }

    // fibonacci using Recursion
    public static int findNth_fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans = findNth_fibonacci(n-1) + findNth_fibonacci(n-2);
        return ans;
    }
}
