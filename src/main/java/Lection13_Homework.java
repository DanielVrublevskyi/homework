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

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(2);
        intList.add(0);
        intList.add(7);
        intList.add(7);
        intList.add(7);
        intList.add(3);
        intList.add(7);
        System.out.println("The most frequent value from the list: " + frequentElement(intList));

        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(5);
        set2.add(6);

        System.out.println(ifOneOfTheValuesExists(set1, set2));


        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(2);
        treeSet1.add(3);
        treeSet1.add(4);
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(3);
        treeSet2.add(5);
        treeSet2.add(6);
        System.out.println(newSet(treeSet1, treeSet2));

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

    public static int frequentElement(List<Integer> intList) {
        int i = 0;
        Map<Integer, Integer> strMap = new LinkedHashMap<>();
        for (int a : intList) {
            if (!strMap.containsKey(a)) {
                strMap.put(a, 1);
            } else {
                strMap.put(a, strMap.get(a) + 1);
            }
        }
        List<Integer> values = new ArrayList<>(strMap.values());
        int maxValue = Collections.max(values);
        for (Map.Entry<Integer, Integer> entry : strMap.entrySet()) {
            if (entry.getValue() == maxValue) {
                i = entry.getKey();
            }
        }
        return i;
    }

    public static boolean ifOneOfTheValuesExists(LinkedHashSet<Integer> set1, LinkedHashSet<Integer> set2) {
        boolean res = false;
        for (int intSet1 : set1) {
            for (int intSet2 : set2) {
                if (intSet1 == intSet2) {
                    System.out.println("set 1 value: " + intSet1 + ", set 2 value: " + intSet2);
                    return true;
                }
            }
        }
        return res;
    }

    public static TreeSet<Integer> newSet(TreeSet<Integer> set1, TreeSet<Integer> set2) {
        TreeSet<Integer> mergedTreeSet = new TreeSet<>(set1);
        mergedTreeSet.addAll(set2);
        return mergedTreeSet;
    }
}
