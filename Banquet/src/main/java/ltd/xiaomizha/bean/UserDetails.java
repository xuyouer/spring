package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户详细信息表
 *
 * @TableName user_details
 */
public class UserDetails implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private Integer uid;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 出生日期
     */
    private Date birth;

    /**
     * 性别, 0:男, 1:女
     */
    private Integer gender;

    /**
     * 用户IP
     */
    private String ip;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public UserDetails() {
    }

    public UserDetails(Integer uid) {
        this.uid = uid;
    }

    public UserDetails(Integer uid, String email, String phone, Date birth, Integer gender, String ip) {
        this.uid = uid;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.ip = ip;
    }

    public UserDetails(Integer id, Integer uid, String email, String phone, Date birth, Integer gender, String ip) {
        this.id = id;
        this.uid = uid;
        this.email = email;
        this.phone = phone;
        this.birth = birth;
        this.gender = gender;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", uid=" + uid +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", ip='" + ip + '\'' +
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
     * 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 出生日期
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 出生日期
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 性别, 0:男, 1:女
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别, 0:男, 1:女
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 用户IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * 用户IP
     */
    public void setIp(String ip) {
        this.ip = ip;
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
        UserDetails other = (UserDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
                && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}