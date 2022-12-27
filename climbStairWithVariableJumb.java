import java.util.Scanner;

public class climbStairWithVariableJumb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println(findwaysVariableJump(0, n, arr));

    }

    //using recursion
    public static int findwaysVariableJump(int currStep, int totalStep,int []arr){
        if(currStep==totalStep)return 1;
        int ans=0;
        for(int step=1; step<=arr[currStep];step++){
            if(currStep+step<=totalStep){
                ans+=findwaysVariableJump(currStep+step, totalStep, arr);
            }
            
        }
        return ans;
    }
}
