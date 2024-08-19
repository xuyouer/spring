package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会服务类别-服务项关系表
 *
 * @TableName banquet_service_category_items
 */
public class BanquetServiceCategoryItems implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会服务类别ID
     */
    private Integer sid;

    /**
     * 宴会服务项ID
     */
    private Integer iid;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetServiceCategoryItems() {
    }

    public BanquetServiceCategoryItems(Integer sid, Integer iid) {
        this.sid = sid;
        this.iid = iid;
    }

    public BanquetServiceCategoryItems(Integer id, Integer sid, Integer iid) {
        this.id = id;
        this.sid = sid;
        this.iid = iid;
    }

    @Override
    public String toString() {
        return "BanquetServiceCategoryItems{" +
                "id=" + id +
                ", sid=" + sid +
                ", iid=" + iid +
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
     * 宴会服务类别ID
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 宴会服务类别ID
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 宴会服务项ID
     */
    public Integer getIid() {
        return iid;
    }

    /**
     * 宴会服务项ID
     */
    public void setIid(Integer iid) {
        this.iid = iid;
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
        BanquetServiceCategoryItems other = (BanquetServiceCategoryItems) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
                && (this.getIid() == null ? other.getIid() == null : this.getIid().equals(other.getIid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getIid() == null) ? 0 : getIid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}