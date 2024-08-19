package ltd.xiaomizha.mapper;

import ltd.xiaomizha.bean.UserDetails;

/**
 * @author xiaom
 * @description 针对表【user_details(用户详细信息表)】的数据库操作Mapper
 * @createDate 2024-08-01 22:42:41
 * @Entity ltd.xiaomizha.bean.UserDetails
 */
public interface UserDetailsMapper {
    /**
     * 添加功能
     *
     * @param userDetails
     * @return
     */
    boolean addUserDetails(UserDetails userDetails);
}




