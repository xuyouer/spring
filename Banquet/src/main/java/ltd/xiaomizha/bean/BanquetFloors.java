package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会楼层表
 *
 * @TableName banquet_floors
 */
public class BanquetFloors implements Serializable {
    /**
     * 宴会楼层ID
     */
    private Integer fid;

    /**
     * 宴会楼层号
     */
    private String floorNumber;

    /**
     * 宴会楼层名
     */
    private String floorName;

    /**
     * 宴会楼层描述
     */
    private String floorDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetFloors() {
    }

    public BanquetFloors(String floorNumber, String floorName, String floorDescription) {
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.floorDescription = floorDescription;
    }

    public BanquetFloors(Integer fid, String floorNumber, String floorName, String floorDescription) {
        this.fid = fid;
        this.floorNumber = floorNumber;
        this.floorName = floorName;
        this.floorDescription = floorDescription;
    }

    @Override
    public String toString() {
        return "BanquetFloors{" +
                "fid=" + fid +
                ", floorNumber='" + floorNumber + '\'' +
                ", floorName='" + floorName + '\'' +
                ", floorDescription='" + floorDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 宴会楼层号
     */
    public String getFloorNumber() {
        return floorNumber;
    }

    /**
     * 宴会楼层号
     */
    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    /**
     * 宴会楼层名
     */
    public String getFloorName() {
        return floorName;
    }

    /**
     * 宴会楼层名
     */
    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    /**
     * 宴会楼层描述
     */
    public String getFloorDescription() {
        return floorDescription;
    }

    /**
     * 宴会楼层描述
     */
    public void setFloorDescription(String floorDescription) {
        this.floorDescription = floorDescription;
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
        BanquetFloors other = (BanquetFloors) that;
        return (this.getFid() == null ? other.getFid() == null : this.getFid().equals(other.getFid()))
                && (this.getFloorNumber() == null ? other.getFloorNumber() == null : this.getFloorNumber().equals(other.getFloorNumber()))
                && (this.getFloorName() == null ? other.getFloorName() == null : this.getFloorName().equals(other.getFloorName()))
                && (this.getFloorDescription() == null ? other.getFloorDescription() == null : this.getFloorDescription().equals(other.getFloorDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFid() == null) ? 0 : getFid().hashCode());
        result = prime * result + ((getFloorNumber() == null) ? 0 : getFloorNumber().hashCode());
        result = prime * result + ((getFloorName() == null) ? 0 : getFloorName().hashCode());
        result = prime * result + ((getFloorDescription() == null) ? 0 : getFloorDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}