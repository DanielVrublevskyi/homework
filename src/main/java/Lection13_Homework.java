import java.util.*;

public class Lection13_Homework {
    public static void main(String[] args) {

        String[] array = new String[]{"man", "moon", "good", "night", "good", "night"};
        System.out.println(getLengthOfStrings(array));
        System.out.println(createMap(array));
        System.out.println(countWords(array));
        String[] array2 = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d", "salt", "tea", "soda", "toast"};
        System.out.println(mergeStringsByFirstChar(array2));
        System.out.println(buildResultString(array));


    }

    public static Map<String, Integer> getLengthOfStrings(String[] array) {
        Map<String, Integer> strMap = new LinkedHashMap<>();
        for (String s : array) {
            strMap.put(s, s.length());
        }
        return strMap;
    }

    public static Map<String, String> createMap(String[] array) {
        Map<String, String> strMap = new LinkedHashMap<>();
        for (String s : array) {
            strMap.put(s.substring(0, 1), s.substring(s.length() - 1));
        }
        return strMap;
    }

    public static Map<String, Integer> countWords(String[] array) {
        Map<String, Integer> strMap = new LinkedHashMap<>();
        for (String s : array) {
            if (!strMap.containsKey(s)) {
                strMap.put(s, 1);
            } else {
                strMap.put(s, strMap.get(s) + 1);
            }
        }
        return strMap;
    }

    public static Map<String, String> mergeStringsByFirstChar(String[] array) {
        Map<String, String> strMap = new LinkedHashMap<>();
        for (String firstChar : array) {
            if (!strMap.containsKey(firstChar.substring(0, 1))) {
                strMap.put(firstChar.substring(0, 1), firstChar);
            } else {
                strMap.put(firstChar.substring(0, 1), strMap.get(firstChar.substring(0, 1)) + firstChar);
            }
        }
        return strMap;
    }

    public static TreeSet<String> buildResultString(String[] array) {
        TreeSet<String> strSet = new TreeSet<>();
        Map<String, Integer> strMap = new LinkedHashMap<>();
        for (String s : array) {
            if (!strMap.containsKey(s)) {
                strMap.put(s, 1);
            } else {
                strMap.put(s, strMap.get(s) + 1);
            }
        }
        for (String str : array) {
            if (strMap.get(str) % 2 == 0) {
                strSet.add(str);
            }
        }
        return strSet;
    }
}
