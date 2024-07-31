public class array {
    public static void main(String[] args) {
        int[] arr = {100, 700, 600, 400, 500};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
