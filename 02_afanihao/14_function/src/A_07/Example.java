package A_07;

public class Example {
    public int[] get_perfect_square() {
        int[] res = new int[22];
        int j = 0;
        for(int i = 10; ; i++) {
            if(i * i < 999) {
                res[j++] = i * i;
            }else {
                break;
            }
        }
        return res;
    }
}
