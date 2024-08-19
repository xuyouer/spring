package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户身份表
 *
 * @TableName user_roles
 */
public class UserRoles implements Serializable {
    /**
     * 身份ID
     */
    private Integer rid;

    /**
     * 身份名
     */
    private String roleName;

    /**
     * 身份描述
     */
    private String roleDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public UserRoles() {
    }

    public UserRoles(String roleName, String roleDescription) {
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    public UserRoles(Integer rid, String roleName, String roleDescription) {
        this.rid = rid;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
    }

    @Override
    public String toString() {
        return "UserRoles{" +
                "rid=" + rid +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 身份名
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 身份名
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 身份描述
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * 身份描述
     */
    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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
        UserRoles other = (UserRoles) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
                && (this.getRoleDescription() == null ? other.getRoleDescription() == null : this.getRoleDescription().equals(other.getRoleDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getRoleDescription() == null) ? 0 : getRoleDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}