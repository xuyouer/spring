package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.service.UserDevicesService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserDevicesServiceImplTest {
    @Autowired
    private UserDevicesService userDevicesService;

    @Test
    public void addUserDevices() {
        // boolean flag = userDevicesService.addUserDevices(new UserDevices(10001, "OnePlus Ace 2", "MOBILE", 0, ""));
        // System.out.println("flag = " + flag);
    }

    @Test
    public void getUserDevicesByUid() {
        // List<UserDevices> userDevices = userDevicesService.getUserDevicesByUid(10000);
        // userDevices.forEach(System.out::println);
    }
}