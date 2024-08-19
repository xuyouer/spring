package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 宴会服务项表
 *
 * @TableName banquet_service_items
 */
public class BanquetServiceItems implements Serializable {
    /**
     * 宴会服务项ID
     */
    private Integer iid;

    /**
     * 宴会服务项名
     */
    private String itemName;

    /**
     * 宴会服务项描述
     */
    private String itemDescription;

    /**
     * 宴会服务项价格
     */
    private BigDecimal itemPrice;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetServiceItems() {
    }

    public BanquetServiceItems(String itemName, String itemDescription, BigDecimal itemPrice) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    public BanquetServiceItems(Integer iid, String itemName, String itemDescription, BigDecimal itemPrice) {
        this.iid = iid;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "BanquetServiceItems{" +
                "iid=" + iid +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 宴会服务项名
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 宴会服务项名
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 宴会服务项描述
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * 宴会服务项描述
     */
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    /**
     * 宴会服务项价格
     */
    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    /**
     * 宴会服务项价格
     */
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
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
        BanquetServiceItems other = (BanquetServiceItems) that;
        return (this.getIid() == null ? other.getIid() == null : this.getIid().equals(other.getIid()))
                && (this.getItemName() == null ? other.getItemName() == null : this.getItemName().equals(other.getItemName()))
                && (this.getItemDescription() == null ? other.getItemDescription() == null : this.getItemDescription().equals(other.getItemDescription()))
                && (this.getItemPrice() == null ? other.getItemPrice() == null : this.getItemPrice().equals(other.getItemPrice()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIid() == null) ? 0 : getIid().hashCode());
        result = prime * result + ((getItemName() == null) ? 0 : getItemName().hashCode());
        result = prime * result + ((getItemDescription() == null) ? 0 : getItemDescription().hashCode());
        result = prime * result + ((getItemPrice() == null) ? 0 : getItemPrice().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}