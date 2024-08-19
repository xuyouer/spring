package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.bean.UserDevices;
import ltd.xiaomizha.mapper.UserDevicesMapper;
import ltd.xiaomizha.service.UserDevicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDevicesServiceImpl implements UserDevicesService {
    @Autowired
    private UserDevicesMapper userDevicesMapper;

    /**
     * 添加功能
     *
     * @param userDevices
     * @return
     */
    @Override
    public boolean addUserDevices(UserDevices userDevices) {
        return userDevicesMapper.addUserDevices(userDevices);
    }

    /**
     * 查询单用户多条登录记录
     *
     * @param uid
     * @return
     */
    @Override
    public List<UserDevices> getUserDevicesByUid(Integer uid) {
        return userDevicesMapper.getUserDevicesByUid(uid);
    }
}
