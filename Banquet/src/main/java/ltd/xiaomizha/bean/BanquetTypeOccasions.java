package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会类型-场合关系表
 *
 * @TableName banquet_type_occasions
 */
public class BanquetTypeOccasions implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会类型ID
     */
    private Integer tid;

    /**
     * 宴会场合ID
     */
    private Integer oid;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetTypeOccasions() {
    }

    public BanquetTypeOccasions(Integer tid, Integer oid) {
        this.tid = tid;
        this.oid = oid;
    }

    public BanquetTypeOccasions(Integer id, Integer tid, Integer oid) {
        this.id = id;
        this.tid = tid;
        this.oid = oid;
    }

    @Override
    public String toString() {
        return "BanquetTypeOccasions{" +
                "id=" + id +
                ", tid=" + tid +
                ", oid=" + oid +
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
     * 宴会类型ID
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 宴会类型ID
     */
    public void setTid(Integer tid) {
        this.tid = tid;
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
        BanquetTypeOccasions other = (BanquetTypeOccasions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
                && (this.getOid() == null ? other.getOid() == null : this.getOid().equals(other.getOid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getOid() == null) ? 0 : getOid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}