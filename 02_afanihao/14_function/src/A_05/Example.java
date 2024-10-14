package A_05;

public class Example {
    public int get_sum(int[] arr, int[] arr2) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            res += arr2[i];
        }
        return res;
    }
}
