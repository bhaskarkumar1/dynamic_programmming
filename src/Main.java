//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Knapsack01 kp= new Knapsack01();
        int[] wt={2,3,4,5};int[] val={12,4,321,3};

        int kp01=kp.RecKnapsack01(wt,val,5,wt.length);
        System.out.println(kp01);


        //IsSubsetSum
        int[] arr1={3, 34, 4, 12, 5, 2};
        IsSubsetSum subset=new IsSubsetSum();
        boolean Recursionsb=subset.RecursionIsSubsetSum(arr1,9,arr1.length);
        System.out.println("is arr1 have subset with given sum ? : "+Recursionsb);
        boolean memo=subset.MemoIsSubset(arr1,212,arr1.length);
        System.out.println("memofunc is arr1 have subset with given sum  ? : "+memo);
        boolean topdown=subset.topDownIsSubset(arr1,9,arr1.length);
        System.out.println("topDownfunc is arr1 have subset with given sum  ? : "+topdown);

        //equal sum partition
//        int[] arr4= {1, 5, 11, 5};
        int[] arr4={1, 3, 5};
        EqualPartitionSum eq=new EqualPartitionSum();
        boolean eqs=eq.solve(arr4);
        System.out.println("Is it have equal sum partition ? "+ eqs);
        boolean eqsMemo=eq.MemoEqualSumPartition(arr4);
        System.out.println("memoFunc Is it have equal sum partition  ? "+ eqsMemo);

        boolean eqsBottomUp=eq.bottomUpEqualPartition(arr4);
        System.out.println("bottomUpFunc Is it have equal sum partition  ? "+ eqsBottomUp);
    }


}