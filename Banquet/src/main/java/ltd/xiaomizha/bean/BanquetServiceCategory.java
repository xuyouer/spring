package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会服务类别表
 *
 * @TableName banquet_service_category
 */
public class BanquetServiceCategory implements Serializable {
    /**
     * 宴会服务类别ID
     */
    private Integer sid;

    /**
     * 宴会服务类别名
     */
    private String categoryName;

    /**
     * 宴会服务类别描述
     */
    private String categoryDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetServiceCategory() {
    }

    public BanquetServiceCategory(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public BanquetServiceCategory(Integer sid, String categoryName, String categoryDescription) {
        this.sid = sid;
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "BanquetServiceCategory{" +
                "sid=" + sid +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDescription='" + categoryDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 宴会服务类别名
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * 宴会服务类别名
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * 宴会服务类别描述
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * 宴会服务类别描述
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
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
        BanquetServiceCategory other = (BanquetServiceCategory) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
                && (this.getCategoryName() == null ? other.getCategoryName() == null : this.getCategoryName().equals(other.getCategoryName()))
                && (this.getCategoryDescription() == null ? other.getCategoryDescription() == null : this.getCategoryDescription().equals(other.getCategoryDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getCategoryName() == null) ? 0 : getCategoryName().hashCode());
        result = prime * result + ((getCategoryDescription() == null) ? 0 : getCategoryDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}