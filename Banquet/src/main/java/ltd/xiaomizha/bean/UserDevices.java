package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户登录设备表
 *
 * @TableName user_devices
 */
public class UserDevices implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private Integer uid;

    /**
     * 登录设备ID
     */
    private String deviceId;

    /**
     * 登录设备类型
     */
    private String deviceType;

    /**
     * 登录设备方式, 0:账密登录, 1:手机验证码登录, 2:扫码登录, 3:邮箱登录, 4:身份证号登录, 5:三方登录
     */
    private Integer deviceLoginMethod;

    /**
     * 登录设备IP
     */
    private String deviceLoginIp;

    /**
     * 最后一次登录时间
     */
    private Date deviceLastlogin;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public UserDevices() {
    }

    public UserDevices(Integer uid, String deviceId, String deviceType, Integer deviceLoginMethod, String deviceLoginIp) {
        this.uid = uid;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceLoginMethod = deviceLoginMethod;
        this.deviceLoginIp = deviceLoginIp;
    }

    public UserDevices(Integer id, Integer uid, String deviceId, String deviceType, Integer deviceLoginMethod, String deviceLoginIp) {
        this.id = id;
        this.uid = uid;
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.deviceLoginMethod = deviceLoginMethod;
        this.deviceLoginIp = deviceLoginIp;
    }

    @Override
    public String toString() {
        return "UserDevices{" +
                "id=" + id +
                ", uid=" + uid +
                ", deviceId='" + deviceId + '\'' +
                ", deviceType='" + deviceType + '\'' +
                ", deviceLoginMethod=" + deviceLoginMethod +
                ", deviceLoginIp='" + deviceLoginIp + '\'' +
                ", deviceLastlogin=" + deviceLastlogin +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
    }

    /**
     * 记录ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 记录ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 账户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 账户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 登录设备ID
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * 登录设备ID
     */
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    /**
     * 登录设备类型
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * 登录设备类型
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    /**
     * 登录设备方式, 0:账密登录, 1:手机验证码登录, 2:扫码登录, 3:邮箱登录, 4:身份证号登录, 5:三方登录
     */
    public Integer getDeviceLoginMethod() {
        return deviceLoginMethod;
    }

    /**
     * 登录设备方式, 0:账密登录, 1:手机验证码登录, 2:扫码登录, 3:邮箱登录, 4:身份证号登录, 5:三方登录
     */
    public void setDeviceLoginMethod(Integer deviceLoginMethod) {
        this.deviceLoginMethod = deviceLoginMethod;
    }

    /**
     * 登录设备IP
     */
    public String getDeviceLoginIp() {
        return deviceLoginIp;
    }

    /**
     * 登录设备IP
     */
    public void setDeviceLoginIp(String deviceLoginIp) {
        this.deviceLoginIp = deviceLoginIp;
    }

    /**
     * 最后一次登录时间
     */
    public Date getDeviceLastlogin() {
        return deviceLastlogin;
    }

    /**
     * 最后一次登录时间
     */
    public void setDeviceLastlogin(Date deviceLastlogin) {
        this.deviceLastlogin = deviceLastlogin;
    }

    /**
     * 建档时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 建档时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * 最后更新时间
     */
    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    /**
     * 最后更新时间
     */
    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UserDevices other = (UserDevices) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
                && (this.getDeviceType() == null ? other.getDeviceType() == null : this.getDeviceType().equals(other.getDeviceType()))
                && (this.getDeviceLoginMethod() == null ? other.getDeviceLoginMethod() == null : this.getDeviceLoginMethod().equals(other.getDeviceLoginMethod()))
                && (this.getDeviceLoginIp() == null ? other.getDeviceLoginIp() == null : this.getDeviceLoginIp().equals(other.getDeviceLoginIp()))
                && (this.getDeviceLastlogin() == null ? other.getDeviceLastlogin() == null : this.getDeviceLastlogin().equals(other.getDeviceLastlogin()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getDeviceType() == null) ? 0 : getDeviceType().hashCode());
        result = prime * result + ((getDeviceLoginMethod() == null) ? 0 : getDeviceLoginMethod().hashCode());
        result = prime * result + ((getDeviceLoginIp() == null) ? 0 : getDeviceLoginIp().hashCode());
        result = prime * result + ((getDeviceLastlogin() == null) ? 0 : getDeviceLastlogin().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }
}