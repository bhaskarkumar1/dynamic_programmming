//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Knapsack01 kp= new Knapsack01();
        int[] wt={2,3,4,5};int[] val={12,4,321,3};

        int kp01=kp.RecKnapsack01(wt,val,5,wt.length);
        System.out.println(kp01);
    }
}