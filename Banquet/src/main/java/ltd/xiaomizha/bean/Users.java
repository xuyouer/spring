package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @TableName users
 */
public class Users implements Serializable {
    /**
     * 账户ID
     */
    private Integer uid;

    /**
     * 账户名
     */
    private String username;

    /**
     * 密码哈希值, 初始明码:1212
     */
    private String password;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public Users() {
    }

    public Users(Integer uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 账户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 账户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码哈希值, 初始明码:1212
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码哈希值, 初始明码:1212
     */
    public void setPassword(String password) {
        this.password = password;
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
        Users other = (Users) that;
        return (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}