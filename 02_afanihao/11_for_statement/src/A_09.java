//打印出100~200之间，前10个能被7整除的数。
//注：能被7整除的数可能有很多个。这里只要求打印出前10个。
public class A_09 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 100; i < 200; i++) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
                count++;
                if(count >= 10) {
                    return;
                }
            }
        }
    }
}
