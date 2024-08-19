package ltd.xiaomizha.mapper;

import ltd.xiaomizha.bean.Users;
import ltd.xiaomizha.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author xiaom
 * @description 针对表【users(用户表)】的数据库操作Mapper
 * @createDate 2024-08-01 21:12:34
 * @Entity ltd.xiaomizha.bean.Users
 */
public interface UsersMapper {
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

    /**
     * 添加三方账户
     *
     * @param authUser
     * @return
     */
    // AuthUser addAuthUser(AuthUser authUser);

    /**
     * 更新单用户三方账户
     *
     * @param authUser
     * @return
     */
    // boolean updateAuthUser(AuthUser authUser);
}




