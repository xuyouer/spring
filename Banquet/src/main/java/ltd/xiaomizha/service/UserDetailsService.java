package ltd.xiaomizha.service;

import ltd.xiaomizha.bean.UserDetails;

public interface UserDetailsService {
    /**
     * 添加功能
     *
     * @param userDetails
     * @return
     */
    boolean addUserDetails(UserDetails userDetails);
}
