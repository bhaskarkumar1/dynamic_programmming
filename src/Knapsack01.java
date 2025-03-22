public class Knapsack01 {
    public int RecKnapsack01(int[] wt,int[] val, int capacity,int n){
        if(n==0) return 0;
        if(capacity==0) return 0;
        if(capacity-wt[n-1]>=0){
            return Math.max(val[n-1]+ RecKnapsack01(wt,val,capacity-wt[n-1],n-1), RecKnapsack01(wt,val,capacity,n-1));
        }else{
            return  RecKnapsack01(wt,val,capacity,n-1);
        }
    }
    static int[][] memo;
    public int MemoKnapsack01(int[] wt, int[] val, int capacity,int n){
       memo =new int[capacity+1][n+1];
       for(int i=0;i<=capacity;i++){
           for(int j=0;j<=n;j++){
               memo[i][j]=-1;
           }
       }

       return HelperMemoKnapsack01(wt,val,capacity,n);
    }
  public int HelperMemoKnapsack01(int[] wt, int[] val, int capacity,int n){
        if(n==0) return 0;
        if(capacity==0) return 0;
        if(memo[capacity][n]!=-1) return memo[capacity][n];
        if(capacity-wt[n-1]>=0){
            return memo[capacity][n]= Math.max(val[n-1]+HelperMemoKnapsack01(wt,val,capacity-wt[n-1],n-1),HelperMemoKnapsack01(wt,val,capacity,n-1));
        }else{
            return memo[capacity][n] =HelperMemoKnapsack01(wt,val,capacity,n-1);
        }
    }

    static int[][] dp;
    public int BottomUpKnapsack01(int[] wt, int[] val,int capacity, int n){
        dp=new int[n+1][capacity+1];

        return helperBottomUp(wt,val,capacity,n);
    }

    public int helperBottomUp(int[] wt, int[] val, int capacity, int n){
//        basecase- intialization
//        if you have item as 0 then you cannot picka anything even you have capacity
        for(int i=0;i<=capacity;i++) dp[0][i]=0;
//        if you have capacity=0 then you cannot achieve anything even you have any no. of items
        for(int j=0;j<=n;j++) dp[j][0]=0;
//        n==i and capacity =j

        for(int i=1;i<=n;i++)
            for(int j=1;j<=capacity;j++) {
                if (j - wt[i - 1] >= 0) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        return dp[n][capacity];

    }




}
