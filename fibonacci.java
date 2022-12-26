import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []memo = new int[n+1];
        // System.out.println(findNth_fibonacci(n));
        System.out.println(findNth_fibonacci_memo(n,memo));
    }

    // fibonacci using Recursion
    public static int findNth_fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int ans = findNth_fibonacci(n-1) + findNth_fibonacci(n-2);
        return ans;
    }

    //using Memoization
    public static int findNth_fibonacci_memo(int n,int []memo){
        if(n==0 || n==1){
            memo[n]=n;
            return n;
        }
        if(memo[n]!=0){
            return memo[n];
        }
        int ans=findNth_fibonacci_memo(n-1, memo) + findNth_fibonacci_memo(n-2, memo);
        return memo[n]=ans;
    }

}
