import java.util.Scanner;

public class climbStairWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []mem = new int[n+1];
        // System.out.println(findWays(n)); 
        // System.out.println(findWays_memo(n,mem));
        System.out.println(findWays_tabu(n));
    }

    //climb stair using recursion
    public static int findWays(int n){
        if(n==0)return 1;
        if(n<0)return 0;
        int one_step = findWays(n-1);
        int two_step = findWays(n-2);
        int three_step = findWays(n-3);

        return one_step+two_step+three_step;
    }

    //using memoization
    public static int findWays_memo(int n, int []mem){
        if(n==0){
            mem[n]=1;
            return 1;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        int one_step=findWays(n-1);
        int two_step=findWays(n-2);
        int three_step=findWays(n-3);
        return mem[n] = one_step+two_step+three_step;
    }

    //using tabulaton
    public static int findWays_tabu(int n){
        int []mem = new int[n+1];
        for(int i=0;i<=n;i++){
            if(i==0 || i==1){
                mem[i]=1;
            }else if(i==2){
                mem[i]=2;
            }else{
                mem[i]=mem[i-1]+mem[i-2]+mem[i-3];
            }
        }
        return mem[n];
    }

}
