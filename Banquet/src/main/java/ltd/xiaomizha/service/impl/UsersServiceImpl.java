package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.bean.UserDetails;
import ltd.xiaomizha.bean.UserRolesRelation;
import ltd.xiaomizha.bean.Users;
import ltd.xiaomizha.mapper.*;
import ltd.xiaomizha.service.UsersService;
import ltd.xiaomizha.utils.HashUtil;
import ltd.xiaomizha.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private UserDetailsMapper userDetailsMapper;
    @Autowired
    private UserRolesRelationMapper userRolesRelationMapper;
    @Autowired
    private UserVerificationMapper userVerificationMapper;
    @Autowired
    private UserDevicesMapper userDevicesMapper;

    /**
     * 登录功能
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Users getUserByUsernameAndPassword(String username, String password) {
        Users user = null;
        UserVo userVo = usersMapper.getUserVoByParams(Collections.singletonMap("username", username));
        if (userVo != null) {
            String hashedPassword = userVo.getUsers().getPassword();
            if (HashUtil.verifyPassword(password, hashedPassword)) {
                user = usersMapper.getUserByUsernameAndPassword(username, hashedPassword);
            }
        }
        return user;
    }

    /**
     * 注册功能
     *
     * @param users
     * @return
     */
    @Override
    public boolean addUser(Users users) {
        return usersMapper.addUser(users);
    }

    /**
     * 注册功能
     *
     * @param userVo
     * @return
     */
    @Override
    public boolean addUserVo(UserVo userVo) {
        boolean flag = false;
        Integer uid = null;
        try {
            flag = usersMapper.addUser(userVo.getUsers());
            if (flag) {
                uid = usersMapper.getUserVoByParams(Collections.singletonMap("username", userVo.getUsers().getUsername())).getUsers().getUid();

                UserDetails userDetails = userVo.getUserDetails();
                userDetails.setUid(uid);

                UserRolesRelation userRolesRelation = userVo.getUserRoleVo().getUserRolesRelation();
                userRolesRelation.setUid(uid);

                flag = userDetailsMapper.addUserDetails(userDetails) && userRolesRelationMapper.addUserRolesRelation(userRolesRelation);
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.err.println("Error adding user: " + e.getMessage());
        }
        return flag;
    }

    /**
     * 查询单用户信息-身份-详细信息
     *
     * @param params 查询参数的Map, uid、username、email、phone、idcard、roleName
     * @return
     */
    @Override
    public UserVo getUserVoByParams(Map<String, Object> params) {
        return usersMapper.getUserVoByParams(params);
    }

    /**
     * 查询多用户信息-身份-详细信息
     *
     * @param params 查询参数的Map, uid、username、email、phone、idcard、roleName
     * @return
     */
    @Override
    public List<UserVo> getUsersVoByParams(Map<String, Object> params) {
        return usersMapper.getUsersVoByParams(params);
    }
}
