

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordHash  {

    @Test
    public void TestMD5Hash(){

        String password = "secret";
        Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
        String hashedPassword = passwordEncoder.encodePassword(password, null);
        System.out.println(hashedPassword);

    }

    @Test
    public void TestBCrypt5Hash(){

        String password = "secret";
        BCryptPasswordEncoder cryptPasswordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = cryptPasswordEncoder.encode(password);
        System.out.println(hashedPassword);

    }
}
