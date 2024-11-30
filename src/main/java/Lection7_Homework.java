import java.util.Arrays;

public class Lection7_Homework {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(repeatEnd(s, 3));
        System.out.println(repeatEnd(s, 2));
        System.out.println(repeatEnd(s, 1));

        mixString("abc", "xyz");
        mixString("abcaaa", "xyz");
        mixString("abc", "xyzbbb");

        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBC"));

        zipZap("zipXzap");
        zipZap("zopzop");
        zipZap("zzzopzop");

        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));
    }

    public static String repeatEnd(String s, int a) {
        int count = 0;
        String b = "";
        while (count < a) {
            b = b + s.substring(s.length() - a);
            count++;
        }
        return b;
    }

    public static void mixString(String a, String b) {
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                System.out.print(a.charAt(i) + "" + b.charAt(i));
            }
        } else if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                System.out.print(a.charAt(i) + "" + b.charAt(i));
            }
            System.out.print(a.substring(b.length()));
        } else {
            for (int i = 0; i < a.length(); i++) {
                System.out.print(a.charAt(i) + "" + b.charAt(i));
            }
            System.out.print(b.substring(a.length()));
        }
        System.out.println("");
    }

    public static boolean xyzMiddle(String s){
        boolean res = false;
        if (s.contains("xyz")){
            String[] subStrings = s.split("xyz");
            if (subStrings[0].length() == subStrings[1].length()
                || subStrings[0].length() - subStrings[1].length() == 1
                || subStrings[0].length() - subStrings[1].length() == -1){
                    res = true;
            }

        }else {
            res = false;
        }
        return res;
    }

    public static void zipZap(String s){
        for (int i = 0; i< s.length(); i++){
            if(s.charAt(i) == 'z' && s.charAt(i+2) == 'p'){
                System.out.print(s.charAt(i));
                i++;
            }else {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println("");
    }

    public static boolean xyzThere(String s){
        boolean res = false;
        if (s.contains(".") && s.indexOf('.') - s.indexOf("xyz") == -1){
            res = false;
        }else {
            res = true;
        }
        return res;
    }
}
