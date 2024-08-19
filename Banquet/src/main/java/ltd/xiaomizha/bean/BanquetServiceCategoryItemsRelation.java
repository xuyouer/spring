package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会-服务类别-服务项关系表
 *
 * @TableName banquet_service_category_items_relation
 */
public class BanquetServiceCategoryItemsRelation implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会ID
     */
    private Integer bid;

    /**
     * 宴会服务类别-服务项ID
     */
    private Integer siid;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetServiceCategoryItemsRelation() {
    }

    public BanquetServiceCategoryItemsRelation(Integer bid, Integer siid) {
        this.bid = bid;
        this.siid = siid;
    }

    public BanquetServiceCategoryItemsRelation(Integer id, Integer bid, Integer siid) {
        this.id = id;
        this.bid = bid;
        this.siid = siid;
    }

    @Override
    public String toString() {
        return "BanquetServiceCategoryItemsRelation{" +
                "id=" + id +
                ", bid=" + bid +
                ", siid=" + siid +
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
     * 宴会服务类别-服务项ID
     */
    public Integer getSiid() {
        return siid;
    }

    /**
     * 宴会服务类别-服务项ID
     */
    public void setSiid(Integer siid) {
        this.siid = siid;
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
        BanquetServiceCategoryItemsRelation other = (BanquetServiceCategoryItemsRelation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
                && (this.getSiid() == null ? other.getSiid() == null : this.getSiid().equals(other.getSiid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getSiid() == null) ? 0 : getSiid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}