public class Lection8_Homework {
    public static void main(String[] args) {
        System.out.println("catDog");
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));
        System.out.println(catDog("ca"));

        System.out.println("centeredAverage");
        int[] numArray = new int[]{1, 2, 3, 4, 100};
        int[] numArray1 = new int[]{1, 1, 5, 5, 10, 8, 7};
        int[] numArray2 = new int[]{-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(numArray));
        System.out.println(centeredAverage(numArray1));
        System.out.println(centeredAverage(numArray2));

        System.out.println("sumIgnoreSections");
        int[] numArray3 = new int[]{1, 2, 2};
        int[] numArray4 = new int[]{1, 2, 2, 6, 99, 99, 7};
        int[] numArray5 = new int[]{1, 1, 6, 7, 2};
        System.out.println(sumIgnoreSections(numArray3));
        System.out.println(sumIgnoreSections(numArray4));
        System.out.println(sumIgnoreSections(numArray5));

        System.out.println("sumWithoutUnlucky13");
        int[] numArray6 = new int[]{1, 2, 2, 1};
        int[] numArray7 = new int[]{1, 2, 2, 1, 13};
        int[] numArray8 = new int[]{1, 1, 13, 7, 2};
        System.out.println(sumWithoutUnlucky13(numArray6));
        System.out.println(sumWithoutUnlucky13(numArray7));
        System.out.println(sumWithoutUnlucky13(numArray8));

        System.out.println("differenceLargestSmallest");
        int[] numArray9 = new int[]{10, 3, 5, 6};
        int[] numArray10 = new int[]{7, 2, 10, 9};
        int[] numArray11 = new int[]{2, 10, 7, 2};
        System.out.println(differenceLargestSmallest(numArray9));
        System.out.println(differenceLargestSmallest(numArray10));
        System.out.println(differenceLargestSmallest(numArray11));

        System.out.println("doubleChars");
        System.out.println(doubleChars("The"));
        System.out.println(doubleChars("AAbb"));
        System.out.println(doubleChars("Hi-There"));

        System.out.println("countHi");
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

        System.out.println("countCode");
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));
        System.out.println(countCode("hi"));

        System.out.println("countEvenInts");
        System.out.println(countEvenInts(numArray3));
        System.out.println(countEvenInts(numArray4));
        System.out.println(countEvenInts(numArray5));

        System.out.println("endsWith");
        System.out.println(endsWith("AbC", "HiaBc"));
        System.out.println(endsWith("abc", "abXabc"));
        System.out.println(endsWith("Hiabc", "abc"));
        System.out.println(endsWith("Hiadbfc", "abc"));
    }

    public static boolean catDog(String str){
        if (str.length()<3){
            System.out.print("str length is less than 3! ");
            return false;
        }
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i<str.length()-2; i++){
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't'){
                catCount++;
            }
            if (str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static int centeredAverage(int[] numArray){
        int sum=0;
        int min = numArray[0];
        int max = numArray[0];
        for (int i = 0; i<numArray.length; i++){
            if (numArray[i] < min){
                min = numArray[i];
            }else if(numArray[i] > max){
                max = numArray[i];
            }
            sum += numArray[i];
        }
        sum = sum-min-max;
        return sum/(numArray.length-2);
    }

    public static int sumIgnoreSections(int[] numArray){
        int sum = 0;
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] != 6) {
                sum += numArray[i];
            }else {
                while (numArray[i] != 7 && i != numArray.length-1) {
                    i++;
                }
            }
        }
        return sum;
    }

    public static int sumWithoutUnlucky13(int[] numArray){
        int sum = 0;
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] != 13) {
                sum += numArray[i];
            }else {
               i++;
            }
        }
        return sum;
    }

    public static int differenceLargestSmallest(int[] numArray){
        int min = numArray[0];
        int max = numArray[0];
        for (int i = 0; i<numArray.length; i++){
            if (numArray[i] < min){
                min = numArray[i];
            }else if(numArray[i] > max){
                max = numArray[i];
            }
        }
        return max-min;
    }

    public static String doubleChars(String str){
        String newString = "";
        for (int i = 0; i < str.length(); i++){
            newString = newString + String.valueOf(str.charAt(i)).repeat(2);
        }
        return newString;
    }

    public static int countHi(String str){
        int hi = 0;
        for (int i = 0; i< str.length()-1; i++){
            if (str.charAt(i) == 'h' && str.charAt(i+1) == 'i'){
                hi ++;
            }
        }
        return hi;
    }

    public static int countCode(String str){
        int count = 0;
        if (str.length() < 4){
            System.out.print("str length is less than 4! ");
            return 0;
        }
        for (int i = 0; i< str.length()-3; i++){
            if (str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                count ++;
            }
        }
        return count;
    }

    public static int countEvenInts(int[] numArray){
        int count = 0;
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }

    public static boolean endsWith(String str1, String str2){
        boolean res = false;
        if (str1.length() > str2.length() && str1.toLowerCase().contains(str2.toLowerCase())){
            for (int i = str2.length()-1; i >=0; i-- ){
                if (str2.toLowerCase().charAt(i) == str1.toLowerCase().charAt(i + str1.length()-str2.length())){
                    res = true;
                }else {
                    return false;
                }
            }
        } else if (str2.length() > str1.length() && str2.toLowerCase().contains(str1.toLowerCase())){
            for (int i = str1.length()-1; i >=0; i-- ){
                if (str1.toLowerCase().charAt(i) == str2.toLowerCase().charAt(i + str2.length()-str1.length())){
                    res = true;
                }else {
                    return false;
                }
            }
        }
        return res;
    }
}
