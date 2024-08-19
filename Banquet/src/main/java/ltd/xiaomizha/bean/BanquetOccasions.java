package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会场合表
 *
 * @TableName banquet_occasions
 */
public class BanquetOccasions implements Serializable {
    /**
     * 宴会场合ID
     */
    private Integer oid;

    /**
     * 宴会场合名
     */
    private String occasionName;

    /**
     * 宴会场合描述
     */
    private String occasionDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetOccasions() {
    }

    public BanquetOccasions(String occasionName, String occasionDescription) {
        this.occasionName = occasionName;
        this.occasionDescription = occasionDescription;
    }

    public BanquetOccasions(Integer oid, String occasionName, String occasionDescription) {
        this.oid = oid;
        this.occasionName = occasionName;
        this.occasionDescription = occasionDescription;
    }

    @Override
    public String toString() {
        return "BanquetOccasions{" +
                "oid=" + oid +
                ", occasionName='" + occasionName + '\'' +
                ", occasionDescription='" + occasionDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
    }

    /**
     * 宴会场合ID
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * 宴会场合ID
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * 宴会场合名
     */
    public String getOccasionName() {
        return occasionName;
    }

    /**
     * 宴会场合名
     */
    public void setOccasionName(String occasionName) {
        this.occasionName = occasionName;
    }

    /**
     * 宴会场合描述
     */
    public String getOccasionDescription() {
        return occasionDescription;
    }

    /**
     * 宴会场合描述
     */
    public void setOccasionDescription(String occasionDescription) {
        this.occasionDescription = occasionDescription;
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
        BanquetOccasions other = (BanquetOccasions) that;
        return (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
                && (this.getOccasionName() == null ? other.getOccasionName() == null : this.getOccasionName().equals(other.getOccasionName()))
                && (this.getOccasionDescription() == null ? other.getOccasionDescription() == null : this.getOccasionDescription().equals(other.getOccasionDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getOccasionName() == null) ? 0 : getOccasionName().hashCode());
        result = prime * result + ((getOccasionDescription() == null) ? 0 : getOccasionDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}