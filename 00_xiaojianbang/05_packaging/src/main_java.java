import com.xiaojianbang.java.Account;

public class main_java {

    // 封装
    public static void main(String[] args) {
        Account account = new Account("xxx", "1245s6", 50000);
        System.out.println("姓名为：" + account.getName());
        System.out.println("密码为：" + account.getPassword());
        System.out.println("余额为：" + account.getBalance());
    }
}
