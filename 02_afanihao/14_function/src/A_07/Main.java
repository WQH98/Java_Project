package A_07;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        int[] res = example.get_perfect_square();
        for(int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}
