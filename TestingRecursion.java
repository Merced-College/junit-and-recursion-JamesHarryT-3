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

    public static int countHi(String str) {
        return 1;
    }

    public static int countHi2(String str) {
        return 1;
    }
    
    public static int strCount(String str, String sub) {
        return 1;
    }

    public static String stringClean(String str) {
        return "Test working";
    }
}