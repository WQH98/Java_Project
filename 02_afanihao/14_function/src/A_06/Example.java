package A_06;

public class Example {
    public int get_min(int[] arr) {
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(res > arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }
}
