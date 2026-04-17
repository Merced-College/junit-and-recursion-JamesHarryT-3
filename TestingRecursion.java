/*
Name: Harrison Tinley
Date: 4/16/2026

Class Name: TestingRecursion
*/

public class TestingRecursion {



    public static int count8(int n) {

        //base case
        if (n<10) {
            if (n==8) {
                return 1;
            }
            else {
                return 0;
            }
        }

        int onesPlace = n % 10; //gives ones place
        n /= 10; //gets rid of ones place to get ready for tens place
        int tensPlace = n % 10;

        if (onesPlace == 8) {
            if (tensPlace == 8) {
                return 2 + count8(n);
            }
            else {
                return 1 + count8(n);
            }
        }
        else {
            return count8(n);
        }
    } //end count8 method

    // did countHi2 first, so basically same logic as that but don't need to check for "xhi"
    public static int countHi(String str) {
        //base case
        if (str.length() < 2) { //nothing more to check, "hi" can't be there so finish
            return 0;    
        }

        // check for "hi" and increase the count if found
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi(str.substring(2)); // skips ahead 2 characters
        }
        
        // if nothing is found just move forward 1 character
        return countHi(str.substring(1));
    } //end of countHi2 method

    public static int countHi2(String str) {
        //base case
        if (str.length() < 2) { //nothing more to check, "hi" can't be there so finish
            return 0;    
        }

        // check for "xhi" first and then if it's found skip it so it doesn't count
        if (str.length() >= 3 && str.substring(0, 3).equals("xhi")) {
            return countHi2(str.substring(3));
        }

        // check for "hi" and increase the count if found
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHi2(str.substring(2)); // skips ahead 2 characters
        }
        
        // if nothing is found just move forward 1 character
        return countHi2(str.substring(1));

    } //end of countHi2 method
    
    public static int strCount(String str, String sub) {
        //base case
        if(str.length() < sub.length()) {
            return 0;
        }

        if (str.substring(0, sub.length()).equals(sub)) { //checks if string starts with sub
            return 1 + strCount(str.substring(sub.length()), sub);
        }
        else { // doesn't start with sub so moves forward one letter and checks everything again
            return strCount(str.substring(1), sub);
        }
    } // end of strCount method

    public static String stringClean(String str) {
        return "Test working";
    } //end of stringClean method

    public static void main(String[] args) {
        //System.out.println(strCount("cowcatcat", "cat"));
        //System.out.println(countHi2("xhiahi"));
        System.out.println(countHi("hihihihi"));
    } //end of main method

}