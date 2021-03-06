// Completed on January 4th, 2019

// Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

// seeColor("redxx") → "red"
// seeColor("xxred") → ""
// seeColor("blueTimes") → "blue"

public class seeColor {

    public static void main(String[] args) {
        seeColor test = new seeColor();

        System.out.println(test.seeColor("redxx"));
        System.out.println(test.seeColor("xxred"));
        System.out.println(test.seeColor("blueTimes"));
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        }
        else if (str.startsWith("blue")) {
            return "blue";
        }
        else {
            return "";
        }
    }

}
