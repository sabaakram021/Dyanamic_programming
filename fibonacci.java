import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []memo = new int[n+1];
        // System.out.println(findNth_fibonacci(n));
        // System.out.println(findNth_fibonacci_memo(n,memo));
        System.out.println(findNth_fibonacci_tabu(n));
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

    //using Tabulation
    public static int findNth_fibonacci_tabu(int n){
        int []mem = new int[n+1];
        for(int i=0; i<=n; i++){
            if(i==0 || i==1){
                mem[i]=i;
            }else{
                mem[i]=mem[i-1]+mem[i-2];
            }
        }
        return mem[n];
    }

}
