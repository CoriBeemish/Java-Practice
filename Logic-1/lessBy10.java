// Completed on January 10th, 2019

// Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

// lessBy10(1, 7, 11) → true
// lessBy10(1, 7, 10) → false
// lessBy10(11, 1, 7) → true

public class lessBy10 {

    public static void main(String[] args) {
        lessBy10 test = new lessBy10();

        System.out.println(test.lessBy10(1, 7, 11));
        System.out.println(test.lessBy10(1, 7, 10));
        System.out.println(test.lessBy10(11, 1, 7));
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 ||  Math.abs(b - c) >= 10);
    }

}
