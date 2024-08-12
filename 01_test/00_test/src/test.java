import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.spec.DESKeySpec;



public class test {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        String data = "65102933";
        md.update(data.getBytes());
        DESKeySpec dsk = new DESKeySpec(md.digest());

        System.out.println(dsk);
    }
}
