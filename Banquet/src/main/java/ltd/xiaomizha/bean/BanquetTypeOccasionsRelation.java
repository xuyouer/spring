package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会-类型-场合关系表
 *
 * @TableName banquet_type_occasions_relation
 */
public class BanquetTypeOccasionsRelation implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会ID
     */
    private Integer bid;

    /**
     * 宴会类型-场合记录ID
     */
    private Integer toid;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetTypeOccasionsRelation() {
    }

    public BanquetTypeOccasionsRelation(Integer bid, Integer toid) {
        this.bid = bid;
        this.toid = toid;
    }

    public BanquetTypeOccasionsRelation(Integer id, Integer bid, Integer toid) {
        this.id = id;
        this.bid = bid;
        this.toid = toid;
    }

    @Override
    public String toString() {
        return "BanquetTypeOccasionsRelation{" +
                "id=" + id +
                ", bid=" + bid +
                ", toid=" + toid +
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
     * 宴会类型-场合记录ID
     */
    public Integer getToid() {
        return toid;
    }

    /**
     * 宴会类型-场合记录ID
     */
    public void setToid(Integer toid) {
        this.toid = toid;
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
        BanquetTypeOccasionsRelation other = (BanquetTypeOccasionsRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
                && (this.getToid() == null ? other.getToid() == null : this.getToid().equals(other.getToid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getToid() == null) ? 0 : getToid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}