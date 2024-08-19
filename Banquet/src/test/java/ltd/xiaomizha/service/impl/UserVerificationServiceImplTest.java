package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.service.UserVerificationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserVerificationServiceImplTest {
    @Autowired
    private UserVerificationService userVerificationService;

    @Test
    public void addUserVerification() {
        // boolean flag = userVerificationService.addUserVerification(new UserVerification(10002, "許慧敏", "102"));
        // System.out.println("flag = " + flag);
    }
}