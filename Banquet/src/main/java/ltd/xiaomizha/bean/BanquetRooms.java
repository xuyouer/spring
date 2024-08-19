package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会包间表
 *
 * @TableName banquet_rooms
 */
public class BanquetRooms implements Serializable {
    /**
     * 宴会包间ID
     */
    private Integer rid;

    /**
     * 宴会包间号
     */
    private String roomNumber;

    /**
     * 宴会包间名
     */
    private String roomName;

    /**
     * 宴会包间描述
     */
    private String roomDescription;

    /**
     * 宴会包间最大容纳人数
     */
    private Integer roomCapacity;

    /**
     * 宴会包间状态, 0:可用, 1:预定, 2:正在使用, 3:维修, 4:清洁, 5:布置, 6:封闭
     */
    private Integer roomStatus;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetRooms() {
    }

    public BanquetRooms(String roomNumber, String roomName, String roomDescription, Integer roomCapacity, Integer roomStatus) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomCapacity = roomCapacity;
        this.roomStatus = roomStatus;
    }

    public BanquetRooms(Integer rid, String roomNumber, String roomName, String roomDescription, Integer roomCapacity, Integer roomStatus) {
        this.rid = rid;
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.roomCapacity = roomCapacity;
        this.roomStatus = roomStatus;
    }

    @Override
    public String toString() {
        return "BanquetRooms{" +
                "rid=" + rid +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomName='" + roomName + '\'' +
                ", roomDescription='" + roomDescription + '\'' +
                ", roomCapacity=" + roomCapacity +
                ", roomStatus=" + roomStatus +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 宴会包间号
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * 宴会包间号
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    /**
     * 宴会包间名
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 宴会包间名
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 宴会包间描述
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * 宴会包间描述
     */
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    /**
     * 宴会包间最大容纳人数
     */
    public Integer getRoomCapacity() {
        return roomCapacity;
    }

    /**
     * 宴会包间最大容纳人数
     */
    public void setRoomCapacity(Integer roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    /**
     * 宴会包间状态, 0:可用, 1:预定, 2:正在使用, 3:维修, 4:清洁, 5:布置, 6:封闭
     */
    public Integer getRoomStatus() {
        return roomStatus;
    }

    /**
     * 宴会包间状态, 0:可用, 1:预定, 2:正在使用, 3:维修, 4:清洁, 5:布置, 6:封闭
     */
    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
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
        BanquetRooms other = (BanquetRooms) that;
        return (this.getRid() == null ? other.getRid() == null : this.getRid().equals(other.getRid()))
                && (this.getRoomNumber() == null ? other.getRoomNumber() == null : this.getRoomNumber().equals(other.getRoomNumber()))
                && (this.getRoomName() == null ? other.getRoomName() == null : this.getRoomName().equals(other.getRoomName()))
                && (this.getRoomDescription() == null ? other.getRoomDescription() == null : this.getRoomDescription().equals(other.getRoomDescription()))
                && (this.getRoomCapacity() == null ? other.getRoomCapacity() == null : this.getRoomCapacity().equals(other.getRoomCapacity()))
                && (this.getRoomStatus() == null ? other.getRoomStatus() == null : this.getRoomStatus().equals(other.getRoomStatus()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRid() == null) ? 0 : getRid().hashCode());
        result = prime * result + ((getRoomNumber() == null) ? 0 : getRoomNumber().hashCode());
        result = prime * result + ((getRoomName() == null) ? 0 : getRoomName().hashCode());
        result = prime * result + ((getRoomDescription() == null) ? 0 : getRoomDescription().hashCode());
        result = prime * result + ((getRoomCapacity() == null) ? 0 : getRoomCapacity().hashCode());
        result = prime * result + ((getRoomStatus() == null) ? 0 : getRoomStatus().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}