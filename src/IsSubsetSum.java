public class IsSubsetSum {
    public boolean RecursionIsSubsetSum(int[] arr,int sum,int n){
        if(sum==0) return true;
        if(n==0) return false;

        if(sum-arr[n-1]>=0) {
            return RecursionIsSubsetSum(arr, sum - arr[n - 1], n - 1) || RecursionIsSubsetSum(arr, sum, n - 1);
        }else{
            return RecursionIsSubsetSum(arr,sum,n-1);
        }

    }


    static Boolean[][] memo;
    public boolean MemoIsSubset(int[] arr, int sum, int n){
        memo=new Boolean[arr.length+1][sum+1];

        return helperMemoIsSubset(arr,sum,n);
    }
    public boolean helperMemoIsSubset(int[] arr, int sum, int n){
        if(sum==0) return true;
        if(n==0) return false;

        if(memo[n][sum]!=null) return memo[n][sum];
        if(sum-arr[n-1]>=0){
            return memo[n][sum]= helperMemoIsSubset(arr, sum-arr[n-1],n-1) || helperMemoIsSubset(arr,sum,n-1);
        }else{
            return memo[n][sum]= helperMemoIsSubset(arr,sum,n-1);
        }
    }
    static boolean[][] dp;
    public boolean topDownIsSubset(int[] arr, int sum, int n){
        dp=new boolean[n+1][sum+1];
        return helperTopDownIsSubset(arr,sum,n);
    }
    public boolean helperTopDownIsSubset(int[] arr,int sum,int n){
        //intialize the base case when sum=0 then the subset of 0 is always possible
        for(int i=0;i<=n;i++) dp[i][0]=true;
        //intialize the base case when item size==0 then you can only achieve at sum=0 and sum get bigger then its impossible
        for(int i=1;i<=sum;i++) dp[0][i]=false;
        // i==n j==sum
        for(int i=1;i<=n;i++)
            for(int j=1;j<=sum;j++) {
                if (j - arr[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        return dp[n][sum];
    }

}
