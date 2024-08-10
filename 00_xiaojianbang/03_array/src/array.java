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


        // 随机数
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int)(Math.random() * 100);
        }
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
