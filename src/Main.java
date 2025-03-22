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


    }
}