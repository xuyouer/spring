package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户-身份关系表
 *
 * @TableName user_roles_relation
 */
public class UserRolesRelation implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private Integer uid;

    /**
     * 身份ID
     */
    private Integer rid;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public UserRolesRelation() {
    }

    public UserRolesRelation(Integer uid, Integer rid) {
        this.uid = uid;
        this.rid = rid;
    }

    public UserRolesRelation(Integer id, Integer uid, Integer rid) {
        this.id = id;
        this.uid = uid;
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "UserRolesRelation{" +
                "id=" + id +
                ", uid=" + uid +
                ", rid=" + rid +
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
     * 身份ID
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 身份ID
     */
    public void setRid(Integer rid) {
        this.rid = rid;
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
        UserRolesRelation other = (UserRolesRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}