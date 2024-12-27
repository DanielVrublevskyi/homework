import java.util.*;

public class Lection12_Homework {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(14);
        intList.add(15);
        intList.add(92);
        intList.add(6);
        System.out.println(intList);

        List<String> strList = new ArrayList<>();
        strList.add("First name");
        strList.add("Family name");
        strList.add("Father's name");
        System.out.println(strList);

        Set<Integer> intSet = new TreeSet<>();
        intSet.add(5);
        intSet.add(10);
        intSet.add(5);
        intSet.add(3);
        System.out.println(intSet);

        Map<String, String> codesByCity = new HashMap<>();
        codesByCity.put("Kharkiv", "057");
        codesByCity.put("Kyiv", "044");
        codesByCity.put("Donetsk", "062");
        System.out.println(codesByCity);
    }
}
