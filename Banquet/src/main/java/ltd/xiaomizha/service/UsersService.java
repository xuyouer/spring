package ltd.xiaomizha.service;

import ltd.xiaomizha.bean.Users;
import ltd.xiaomizha.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersService {
    /**
     * 登录功能
     *
     * @param username
     * @param password
     * @return
     */
    Users getUserByUsernameAndPassword(@Param("username") String username,
                                       @Param("password") String password);

    /**
     * 注册功能
     *
     * @param users
     * @return
     */
    boolean addUser(Users users);

    /**
     * 注册功能
     *
     * @param userVo
     * @return
     */
    boolean addUserVo(UserVo userVo);

    /**
     * 查询单用户信息-身份-详细信息
     *
     * @param params 查询参数的Map, uid、username、email、phone、idCard、roleName
     * @return
     */
    UserVo getUserVoByParams(@Param("params") Map<String, Object> params);

    /**
     * 查询多用户信息-身份-详细信息
     *
     * @param params 查询参数的Map, uid、username、email、phone、idCard、roleName
     * @return
     */
    List<UserVo> getUsersVoByParams(@Param("params") Map<String, Object> params);
}
