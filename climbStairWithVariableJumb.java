import java.util.Arrays;
import java.util.Scanner;

public class climbStairWithVariableJumb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] mem = new int[n + 1];
        Arrays.fill(mem, -1);
        // System.out.println(climbStairsVarJump_recur(0, n, arr));
        System.out.println(climbStairsVarJump_memo(0, n, arr, mem));
    }


    // using recursion
    public static int climbStairsVarJump_recur(int currStep, int totalStep, int[] arr) {
        if (currStep == totalStep)
            return 1;
        if (currStep > totalStep)
            return 0;
        int ans = 0;
        for (int step = 1; step <= arr[currStep]; step++) {
            // if(currStep+step<=totalStep){
            ans += climbStairsVarJump_recur(currStep + step, totalStep, arr);
            // }
        }
        return ans;
    }

    // using memoization
    public static int climbStairsVarJump_memo(int currStep, int totalStep, int[] arr, int[] mem) {
        if (currStep == totalStep) {
            return mem[currStep] = 1;
        }
        if (mem[currStep] != -1) {
            return mem[currStep];
        }
        int ans = 0;
        for (int step = 1; step <= arr[currStep]; step++) {
            if (currStep + step <= totalStep) {
                ans += climbStairsVarJump_memo(currStep + step, totalStep, arr, mem);
            }
        }
        return mem[currStep] = ans;
    }
}
