import java.util.Arrays;

public class Lection6_Homework {
    public static void main(String[] args) {

        int[] array = new int[]{2, 2, 10, 4, 5, 2, 30, 6, 40};
        int[] array2 = new int[]{9, 3, 16, 4, 5, 1, 1, 10, 1, 3, 4, 30};
        int[] array3 = new int[]{2, 4, 2, 2};
//        System.out.println("Average value = " + averageArray(array));
//
//        System.out.println("Min value = " + printMin(array));
//        System.out.println("Max value = " + printMax(array));
//        printReverse(array);

//        printMinAndMax(array);
//        System.out.println(ifNumberPresent(array, 10));
//        System.out.println(ifNumberPresent(array, 16));

//        System.out.println(countDifferencesWithin2(array, array2));
//
//        System.out.println(Arrays.toString(leftShiftArray(array)));
//        System.out.println(checkAdjacentTwos(array3));

        System.out.println(Arrays.toString(transformArray(array)));

    }

    public static int[] transformArray(int[] nums) {
        int[] nums1 = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != 0) {
                nums1[i] = nums[i];
                if (i != 0 && nums1[i - 1] % 10 == 0) {
                    nums1[i] = nums1[i - 1];
                }
            } else if (nums[i] % 10 == 0) {
                nums1[i] = nums[i];
            }
        }

        return nums1;
    }

    public static boolean checkAdjacentTwos(int[] nums) {
        boolean res = false;
        if (nums.length < 1) {
            return true;
        }
        if (nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 2 && nums[i + 1] == 2) {
                return false;
            }
            if ((nums[i] == 2 && nums[i + 1] == 2) || (nums[i] != 2 && nums[i + 1] != 2)) {
                res = true;
            }
        }
        return res;
    }

    public static int[] leftShiftArray(int[] nums) {
        if (nums.length < 1) {
            return new int[]{};
        } else {
            int[] nums1 = new int[nums.length];
            for (int i = 0; i < nums.length - 1; i++) {
                nums1[i] = nums[i + 1];
            }
            nums1[nums1.length - 1] = nums[0];
            return nums1;
        }
    }

    public static int countDifferencesWithin2(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[i]) {
            } else if (nums1[i] - nums2[i] <= 2 && nums1[i] - nums2[i] >= -2) {
                count++;
            }
        }
        return count;
    }

    public static double averageArray(int[] ar) {
        double sum = 0;
        for (int i : ar) {
            sum += i;
        }
        return sum / ar.length;
    }

    public static int printMin(int[] ar) {
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }

    public static int printMax(int[] ar) {
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    public static void printMinAndMax(int[] ar) {
        Arrays.sort(ar);
        System.out.println("Min value = " + ar[0]);
        System.out.println("Max value = " + ar[ar.length - 1]);
    }

    public static void printReverse(int[] ar) {
        System.out.print("Reverse array: ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i] + " ");
        }
        System.out.println("");
    }

    public static boolean ifNumberPresent(int[] ar, int num) {
        System.out.print("If number " + num + " present in array? ");
        boolean res = false;
        for (int a : ar) {
            if (a == num) {
                res = true;
            }
        }
        return res;
    }


}
