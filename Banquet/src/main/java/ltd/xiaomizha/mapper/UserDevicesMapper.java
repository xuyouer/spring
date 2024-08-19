package ltd.xiaomizha.mapper;

import ltd.xiaomizha.bean.UserDevices;

import java.util.List;

/**
 * @author xiaom
 * @description 针对表【user_devices(用户登录设备表)】的数据库操作Mapper
 * @createDate 2024-08-01 22:42:41
 * @Entity ltd.xiaomizha.bean.UserDevices
 */
public interface UserDevicesMapper {
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




