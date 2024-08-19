package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UsersServiceImplTest {
    @Autowired
    private UsersService usersService;

    @Test
    public void getUserByUsernameAndPassword() {
        // String username = "江底溺水的鱼";
        // String password = "1212";
        // Users user = usersService.getUserByUsernameAndPassword(username, password);
        // System.out.println("user = " + user);
    }

    @Test
    public void addUser() {
        // boolean flag = usersService.addUser(new Users("江底溺水的鱼", HashUtil.hashPassword("1212")));
        // System.out.println("flag = " + flag);
    }

    @Test
    public void addUserVo() {
        // String username = "江底溺水的鱼";
        // String password = HashUtil.hashPassword("1212");
        // UserVo userVo = new UserVo();
        // userVo.setUsers(new Users(username, password));
        // userVo.setUserDetails(new UserDetails());
        // userVo.setUserRoleVo(new UserRoleVo(new UserRolesRelation(null, 3)));
        // boolean flag = usersService.addUserVo(userVo);
        // System.out.println("flag = " + flag);
    }

    @Test
    public void getUserVoByParams() {
        // UserVo userVo = usersService.getUserVoByParams(Collections.singletonMap("idCard", "100"));
        // UserVo userVo = usersService.getUserVoByParams(Collections.singletonMap("uid", "10000"));
        // System.out.println("userVo = " + userVo);
    }

    @Test
    public void getUsersVoByParams() {
        // List<UserVo> userVos = usersService.getUsersVoByParams(Collections.singletonMap("roleName", "管理"));
        // List<UserVo> userVos = usersService.getUsersVoByParams(Collections.singletonMap("uid", "10000"));
        // userVos.forEach(System.out::println);
    }
}