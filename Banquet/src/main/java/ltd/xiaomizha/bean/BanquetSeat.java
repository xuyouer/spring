package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会-楼层-包间-坐席关系表
 *
 * @TableName banquet_seat
 */
public class BanquetSeat implements Serializable {
    /**
     * 记录ID
     */
    private Integer id;

    /**
     * 宴会ID
     */
    private Integer bid;

    /**
     * 宴会楼层-包间ID
     */
    private Integer frid;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 宴会桌号
     */
    private Integer tableNumber;

    /**
     * 宴会座位号
     */
    private Integer seatNumber;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetSeat() {
    }

    public BanquetSeat(Integer bid, Integer frid, Integer uid, Integer tableNumber, Integer seatNumber) {
        this.bid = bid;
        this.frid = frid;
        this.uid = uid;
        this.tableNumber = tableNumber;
        this.seatNumber = seatNumber;
    }

    public BanquetSeat(Integer id, Integer bid, Integer frid, Integer uid, Integer tableNumber, Integer seatNumber) {
        this.id = id;
        this.bid = bid;
        this.frid = frid;
        this.uid = uid;
        this.tableNumber = tableNumber;
        this.seatNumber = seatNumber;
    }

    @Override
    public String toString() {
        return "BanquetSeat{" +
                "id=" + id +
                ", bid=" + bid +
                ", frid=" + frid +
                ", uid=" + uid +
                ", tableNumber=" + tableNumber +
                ", seatNumber=" + seatNumber +
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
     * 宴会楼层-包间ID
     */
    public Integer getFrid() {
        return frid;
    }

    /**
     * 宴会楼层-包间ID
     */
    public void setFrid(Integer frid) {
        this.frid = frid;
    }

    /**
     * 用户ID
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 用户ID
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 宴会桌号
     */
    public Integer getTableNumber() {
        return tableNumber;
    }

    /**
     * 宴会桌号
     */
    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    /**
     * 宴会座位号
     */
    public Integer getSeatNumber() {
        return seatNumber;
    }

    /**
     * 宴会座位号
     */
    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
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
        BanquetSeat other = (BanquetSeat) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getBid() == null ? other.getBid() == null : this.getBid().equals(other.getBid()))
                && (this.getFrid() == null ? other.getFrid() == null : this.getFrid().equals(other.getFrid()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getTableNumber() == null ? other.getTableNumber() == null : this.getTableNumber().equals(other.getTableNumber()))
                && (this.getSeatNumber() == null ? other.getSeatNumber() == null : this.getSeatNumber().equals(other.getSeatNumber()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());
        result = prime * result + ((getFrid() == null) ? 0 : getFrid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getTableNumber() == null) ? 0 : getTableNumber().hashCode());
        result = prime * result + ((getSeatNumber() == null) ? 0 : getSeatNumber().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}