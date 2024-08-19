package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实名认证表
 *
 * @TableName user_verification
 */
public class UserVerification implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 账户ID
     */
    private Integer uid;

    /**
     * 实名真实姓名
     */
    private String realName;

    /**
     * 实名身份证号
     */
    private String idCard;

    /**
     * 认证是否已验证, 0:未验证, 1:已验证
     */
    private Integer verified;

    /**
     * 认证验证日期
     */
    private Date verificationDate;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public UserVerification() {
    }

    public UserVerification(Integer uid, String realName, String idCard) {
        this.uid = uid;
        this.realName = realName;
        this.idCard = idCard;
    }

    public UserVerification(Integer uid, String realName, String idCard, Integer verified, Date verificationDate) {
        this.uid = uid;
        this.realName = realName;
        this.idCard = idCard;
        this.verified = verified;
        this.verificationDate = verificationDate;
    }

    public UserVerification(Integer id, Integer uid, String realName, String idCard) {
        this.id = id;
        this.uid = uid;
        this.realName = realName;
        this.idCard = idCard;
    }

    public UserVerification(Integer id, Integer uid, String realName, String idCard, Integer verified, Date verificationDate) {
        this.id = id;
        this.uid = uid;
        this.realName = realName;
        this.idCard = idCard;
        this.verified = verified;
        this.verificationDate = verificationDate;
    }

    @Override
    public String toString() {
        return "UserVerification{" +
                "id=" + id +
                ", uid=" + uid +
                ", realName='" + realName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", verified=" + verified +
                ", verificationDate=" + verificationDate +
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
     * 实名真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 实名真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 实名身份证号
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 实名身份证号
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 认证是否已验证, 0:未验证, 1:已验证
     */
    public Integer getVerified() {
        return verified;
    }

    /**
     * 认证是否已验证, 0:未验证, 1:已验证
     */
    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    /**
     * 认证验证日期
     */
    public Date getVerificationDate() {
        return verificationDate;
    }

    /**
     * 认证验证日期
     */
    public void setVerificationDate(Date verificationDate) {
        this.verificationDate = verificationDate;
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
        UserVerification other = (UserVerification) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getRealName() == null ? other.getRealName() == null : this.getRealName().equals(other.getRealName()))
                && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
                && (this.getVerified() == null ? other.getVerified() == null : this.getVerified().equals(other.getVerified()))
                && (this.getVerificationDate() == null ? other.getVerificationDate() == null : this.getVerificationDate().equals(other.getVerificationDate()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getRealName() == null) ? 0 : getRealName().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getVerified() == null) ? 0 : getVerified().hashCode());
        result = prime * result + ((getVerificationDate() == null) ? 0 : getVerificationDate().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}