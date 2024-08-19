package ltd.xiaomizha.mapper;

import ltd.xiaomizha.bean.UserVerification;

/**
 * @author xiaom
 * @description 针对表【user_verification(用户实名认证表)】的数据库操作Mapper
 * @createDate 2024-08-01 22:42:41
 * @Entity ltd.xiaomizha.bean.UserVerification
 */
public interface UserVerificationMapper {
    /**
     * 添加功能
     *
     * @param userVerification
     * @return
     */
    boolean addUserVerification(UserVerification userVerification);
}




