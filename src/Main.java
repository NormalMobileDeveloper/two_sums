import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        var main = new Main();

        var arr = new int[]{1,2,5,6,7,8};
        main.twoSums(arr, 13);
    }


    public void twoSums(int[] arr, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i ++) {
            int key = target - arr[i];
            Integer value = myMap.get(key);
            if(value != null) {
                System.out.println(value + " + " + key + " = " + target);
                break;
            }
            myMap.put(arr[i],i);
        }
    }
}