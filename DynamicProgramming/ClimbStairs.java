/**
 * 70. Climbing StairsYou are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 

Example 1:

Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 
 */


package DynamicProgramming;

public class ClimbStairs {
    public static int climbSteps(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int allWays = 0;
        for(int i = 3;i<=n;i++){
           allWays = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = allWays;
        }
        return allWays;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(climbSteps(n));
    }
    
}
