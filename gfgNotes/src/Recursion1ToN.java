public class Recursion1ToN {
    static void fun1(int n){
        if(n == 0)
            return ;
        // System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }
    // static void recTest(int n, int k) {
    //     if (n == k) {
    //         return;
    //     } else {
    //         if (n < k) {
    //             n++;
    //             System.out.println(n + " " + k);
    //             recTest (n,k);
    //         }
    //         if (k > n) {
    //             k--;
    //             System.out.println(n + " " + k);
    //             recTest (n,k);
    //         }
    //     }
    // }
    public static void main(String[] args){
               int n = 8;  
               fun1(n);
        // recTest(3, 5);
    }
}
