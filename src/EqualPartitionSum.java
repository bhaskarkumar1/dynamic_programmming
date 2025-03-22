public class EqualPartitionSum {

    public boolean solve(int[] arr){
        int sum=0;
        for(int i : arr) sum+=i;
        if(sum%2!=0) return false;
        sum/=2;
        return helper(arr,sum,arr.length);
    }

    public boolean helper(int[] arr, int sum, int n){
        if(sum==0) return true;
        if(n==0) return false;

        if(sum-arr[n-1]>=0){
            return helper(arr,sum-arr[n-1],n-1) || helper(arr,sum,n-1);
        }else{
            return helper(arr,sum,n-1);
        }
    }
    static Boolean[][] memo;
    public boolean MemoEqualSumPartition(int[] arr){
        int sum=0;
        for(int i: arr) sum+=i;
        if(sum%2!=0) return false;
        memo= new Boolean[arr.length+1][sum/2+1];
        return memoHelper(arr,sum/2,arr.length);
    }

    public boolean memoHelper(int[] arr, int sum, int n){
        if(sum==0) return true;
        if(n==0) return false;

        if(memo[n][sum]!=null) return memo[n][sum];
        if(sum-arr[n-1]>=0){
            return memo[n][sum]= memoHelper(arr,sum-arr[n-1],n-1) || memoHelper(arr,sum,n-1);
        }else{
            return memo[n][sum]= memoHelper(arr,sum,n-1);
        }
    }

    static boolean[][] dp;
    public boolean bottomUpEqualPartition(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        if (sum % 2 != 0) return false;
        sum /= 2;
        dp = new boolean[arr.length + 1][sum + 1];

        for (int i = 1; i <= sum; i++) dp[0][i] = false;
        for (int i = 0; i <= arr.length; i++) dp[i][0] = true;

        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= sum; j++) {

                if (j - arr[i - 1] >= 0) {
                    dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i-1][j];
                }

            }
        }
        return dp[arr.length][sum];
    }


}
