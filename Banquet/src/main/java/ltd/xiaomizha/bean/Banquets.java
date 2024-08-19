package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会表
 *
 * @TableName banquets
 */
public class Banquets implements Serializable {
    /**
     * 宴会ID
     */
    private Integer bid;

    /**
     * 宴会名
     */
    private String banquetsName;

    /**
     * 宴会描述
     */
    private String banquetsDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public Banquets() {
    }

    public Banquets(String banquetsName, String banquetsDescription) {
        this.banquetsName = banquetsName;
        this.banquetsDescription = banquetsDescription;
    }

    public Banquets(Integer bid, String banquetsName, String banquetsDescription) {
        this.bid = bid;
        this.banquetsName = banquetsName;
        this.banquetsDescription = banquetsDescription;
    }

    @Override
    public String toString() {
        return "Banquets{" +
                "bid=" + bid +
                ", banquetsName='" + banquetsName + '\'' +
                ", banquetsDescription='" + banquetsDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
    }

    /**
     * 宴会ID
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * 宴会ID
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * 宴会名
     */
    public String getBanquetsName() {
        return banquetsName;
    }

    /**
     * 宴会名
     */
    public void setBanquetsName(String banquetsName) {
        this.banquetsName = banquetsName;
    }

    /**
     * 宴会描述
     */
    public String getBanquetsDescription() {
        return banquetsDescription;
    }

    /**
     * 宴会描述
     */
    public void setBanquetsDescription(String banquetsDescription) {
        this.banquetsDescription = banquetsDescription;
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
        Banquets other = (Banquets) that;
        return (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
                && (this.getBanquetsName() == null ? other.getBanquetsName() == null : this.getBanquetsName().equals(other.getBanquetsName()))
                && (this.getBanquetsDescription() == null ? other.getBanquetsDescription() == null : this.getBanquetsDescription().equals(other.getBanquetsDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBanquetsName() == null) ? 0 : getBanquetsName().hashCode());
        result = prime * result + ((getBanquetsDescription() == null) ? 0 : getBanquetsDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}