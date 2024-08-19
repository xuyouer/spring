package ltd.xiaomizha.service;

import ltd.xiaomizha.bean.UserDevices;

import java.util.List;

public interface UserDevicesService {
    /**
     * 添加功能
     *
     * @param userDevices
     * @return
     */
    boolean addUserDevices(UserDevices userDevices);

    /**
     * 查询单用户多条登录记录
     *
     * @param uid
     * @return
     */
    List<UserDevices> getUserDevicesByUid(Integer uid);
}
