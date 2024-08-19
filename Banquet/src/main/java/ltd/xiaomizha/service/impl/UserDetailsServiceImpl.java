package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.bean.UserDetails;
import ltd.xiaomizha.mapper.UserDetailsMapper;
import ltd.xiaomizha.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDetailsMapper userDetailsMapper;

    /**
     * 添加功能
     *
     * @param userDetails
     * @return
     */
    @Override
    public boolean addUserDetails(UserDetails userDetails) {
        return userDetailsMapper.addUserDetails(userDetails);
    }
}
