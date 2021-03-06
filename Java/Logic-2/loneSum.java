// Completed on January 18th, 2019

// Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.

// loneSum(1, 2, 3) → 6
// loneSum(3, 2, 3) → 2
// loneSum(3, 3, 3) → 0

public class loneSum {

    public static void main(String[] args) {
        loneSum test = new loneSum();

        System.out.println(test.loneSum(1, 2, 3));
        System.out.println(test.loneSum(3, 2, 3));
        System.out.println(test.loneSum(3, 3, 3));
    }

    public int loneSum(int a, int b, int c) {

        int sum = 0;
        if(a == b && b == c){
            sum = 0;
        }
        else if(a == b){
            sum = c;
        }
        else if (a == c){
            sum = b;
        }
        else if (b == c){
            sum = a;
        }
        else{
            sum = a + b + c;
        }

        return sum;
    }

}
