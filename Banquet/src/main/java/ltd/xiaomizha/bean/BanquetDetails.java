package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 宴会详细信息表
 *
 * @TableName banquet_details
 */
public class BanquetDetails implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会ID
     */
    private Integer bid;

    /**
     * 宴会开始时间
     */
    private Date banquetStartTime;

    /**
     * 宴会结束时间
     */
    private Date banquetEndTime;

    /**
     * 宴会地点
     */
    private String banquetVenue;

    /**
     * 宴会预计客人数量
     */
    private Integer banquetGuestCount;

    /**
     * 宴会预算
     */
    private BigDecimal banquetBudget;

    /**
     * 宴会备注
     */
    private String banquetNotes;

    /**
     * 宴会IP
     */
    private String banquetIp;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetDetails() {
    }

    public BanquetDetails(Integer bid, Date banquetStartTime, Date banquetEndTime, String banquetVenue, Integer banquetGuestCount, BigDecimal banquetBudget, String banquetNotes, String banquetIp) {
        this.bid = bid;
        this.banquetStartTime = banquetStartTime;
        this.banquetEndTime = banquetEndTime;
        this.banquetVenue = banquetVenue;
        this.banquetGuestCount = banquetGuestCount;
        this.banquetBudget = banquetBudget;
        this.banquetNotes = banquetNotes;
        this.banquetIp = banquetIp;
    }

    public BanquetDetails(Integer id, Integer bid, Date banquetStartTime, Date banquetEndTime, String banquetVenue, Integer banquetGuestCount, BigDecimal banquetBudget, String banquetNotes, String banquetIp) {
        this.id = id;
        this.bid = bid;
        this.banquetStartTime = banquetStartTime;
        this.banquetEndTime = banquetEndTime;
        this.banquetVenue = banquetVenue;
        this.banquetGuestCount = banquetGuestCount;
        this.banquetBudget = banquetBudget;
        this.banquetNotes = banquetNotes;
        this.banquetIp = banquetIp;
    }

    @Override
    public String toString() {
        return "BanquetDetails{" +
                "id=" + id +
                ", bid=" + bid +
                ", banquetStartTime=" + banquetStartTime +
                ", banquetEndTime=" + banquetEndTime +
                ", banquetVenue='" + banquetVenue + '\'' +
                ", banquetGuestCount=" + banquetGuestCount +
                ", banquetBudget=" + banquetBudget +
                ", banquetNotes='" + banquetNotes + '\'' +
                ", banquetIp='" + banquetIp + '\'' +
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
     * 宴会开始时间
     */
    public Date getBanquetStartTime() {
        return banquetStartTime;
    }

    /**
     * 宴会开始时间
     */
    public void setBanquetStartTime(Date banquetStartTime) {
        this.banquetStartTime = banquetStartTime;
    }

    /**
     * 宴会结束时间
     */
    public Date getBanquetEndTime() {
        return banquetEndTime;
    }

    /**
     * 宴会结束时间
     */
    public void setBanquetEndTime(Date banquetEndTime) {
        this.banquetEndTime = banquetEndTime;
    }

    /**
     * 宴会地点
     */
    public String getBanquetVenue() {
        return banquetVenue;
    }

    /**
     * 宴会地点
     */
    public void setBanquetVenue(String banquetVenue) {
        this.banquetVenue = banquetVenue;
    }

    /**
     * 宴会预计客人数量
     */
    public Integer getBanquetGuestCount() {
        return banquetGuestCount;
    }

    /**
     * 宴会预计客人数量
     */
    public void setBanquetGuestCount(Integer banquetGuestCount) {
        this.banquetGuestCount = banquetGuestCount;
    }

    /**
     * 宴会预算
     */
    public BigDecimal getBanquetBudget() {
        return banquetBudget;
    }

    /**
     * 宴会预算
     */
    public void setBanquetBudget(BigDecimal banquetBudget) {
        this.banquetBudget = banquetBudget;
    }

    /**
     * 宴会备注
     */
    public String getBanquetNotes() {
        return banquetNotes;
    }

    /**
     * 宴会备注
     */
    public void setBanquetNotes(String banquetNotes) {
        this.banquetNotes = banquetNotes;
    }

    /**
     * 宴会IP
     */
    public String getBanquetIp() {
        return banquetIp;
    }

    /**
     * 宴会IP
     */
    public void setBanquetIp(String banquetIp) {
        this.banquetIp = banquetIp;
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
        BanquetDetails other = (BanquetDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
                && (this.getBanquetStartTime() == null ? other.getBanquetStartTime() == null : this.getBanquetStartTime().equals(other.getBanquetStartTime()))
                && (this.getBanquetEndTime() == null ? other.getBanquetEndTime() == null : this.getBanquetEndTime().equals(other.getBanquetEndTime()))
                && (this.getBanquetVenue() == null ? other.getBanquetVenue() == null : this.getBanquetVenue().equals(other.getBanquetVenue()))
                && (this.getBanquetGuestCount() == null ? other.getBanquetGuestCount() == null : this.getBanquetGuestCount().equals(other.getBanquetGuestCount()))
                && (this.getBanquetBudget() == null ? other.getBanquetBudget() == null : this.getBanquetBudget().equals(other.getBanquetBudget()))
                && (this.getBanquetNotes() == null ? other.getBanquetNotes() == null : this.getBanquetNotes().equals(other.getBanquetNotes()))
                && (this.getBanquetIp() == null ? other.getBanquetIp() == null : this.getBanquetIp().equals(other.getBanquetIp()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getBanquetStartTime() == null) ? 0 : getBanquetStartTime().hashCode());
        result = prime * result + ((getBanquetEndTime() == null) ? 0 : getBanquetEndTime().hashCode());
        result = prime * result + ((getBanquetVenue() == null) ? 0 : getBanquetVenue().hashCode());
        result = prime * result + ((getBanquetGuestCount() == null) ? 0 : getBanquetGuestCount().hashCode());
        result = prime * result + ((getBanquetBudget() == null) ? 0 : getBanquetBudget().hashCode());
        result = prime * result + ((getBanquetNotes() == null) ? 0 : getBanquetNotes().hashCode());
        result = prime * result + ((getBanquetIp() == null) ? 0 : getBanquetIp().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}