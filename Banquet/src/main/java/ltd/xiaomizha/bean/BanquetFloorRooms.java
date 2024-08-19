package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会楼层-包间关系表
 *
 * @TableName banquet_floor_rooms
 */
public class BanquetFloorRooms implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会楼层ID
     */
    private Integer fid;

    /**
     * 宴会包间ID
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

    public BanquetFloorRooms() {
    }

    public BanquetFloorRooms(Integer fid, Integer rid) {
        this.fid = fid;
        this.rid = rid;
    }

    public BanquetFloorRooms(Integer id, Integer fid, Integer rid) {
        this.id = id;
        this.fid = fid;
        this.rid = rid;
    }

    @Override
    public String toString() {
        return "BanquetFloorRooms{" +
                "id=" + id +
                ", fid=" + fid +
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
     * 宴会楼层ID
     */
    public Integer getFid() {
        return fid;
    }

    /**
     * 宴会楼层ID
     */
    public void setFid(Integer fid) {
        this.fid = fid;
    }

    /**
     * 宴会包间ID
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * 宴会包间ID
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
        BanquetFloorRooms other = (BanquetFloorRooms) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
                && (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}