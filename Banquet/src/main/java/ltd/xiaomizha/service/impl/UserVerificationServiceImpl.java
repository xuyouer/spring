package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.bean.UserVerification;
import ltd.xiaomizha.mapper.UserVerificationMapper;
import ltd.xiaomizha.service.UserVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserVerificationServiceImpl implements UserVerificationService {
    @Autowired
    private UserVerificationMapper userVerificationMapper;

    /**
     * 添加功能
     *
     * @param userVerification
     * @return
     */
    @Override
    public boolean addUserVerification(UserVerification userVerification) {
        return userVerificationMapper.addUserVerification(userVerification);
    }
}
