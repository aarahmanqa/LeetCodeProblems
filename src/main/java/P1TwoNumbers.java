import java.util.*;

public class P1TwoNumbers {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    public static List<Integer> twoSum(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr) {
            int remainingValue = n - i;
            if(map.get(i) != null) {
                return Arrays.asList(map.get(i), i);
            } else {
                map.put(remainingValue, i);
            }
        }
        return Collections.emptyList();
    }
}
