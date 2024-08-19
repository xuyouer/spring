package ltd.xiaomizha.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * 宴会类型表
 *
 * @TableName banquet_types
 */
public class BanquetTypes implements Serializable {
    /**
     * 宴会类型ID
     */
    private Integer tid;

    /**
     * 宴会类型名
     */
    private String typeName;

    /**
     * 宴会类型描述
     */
    private String typeDescription;

    /**
     * 建档时间
     */
    private Date createtime;

    /**
     * 最后更新时间
     */
    private Date lastmodifytime;

    private static final long serialVersionUID = 1L;

    public BanquetTypes() {
    }

    public BanquetTypes(String typeName, String typeDescription) {
        this.typeName = typeName;
        this.typeDescription = typeDescription;
    }

    public BanquetTypes(Integer tid, String typeName, String typeDescription) {
        this.tid = tid;
        this.typeName = typeName;
        this.typeDescription = typeDescription;
    }

    @Override
    public String toString() {
        return "BanquetTypes{" +
                "tid=" + tid +
                ", typeName='" + typeName + '\'' +
                ", typeDescription='" + typeDescription + '\'' +
                ", createtime=" + createtime +
                ", lastmodifytime=" + lastmodifytime +
                '}';
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
     * 宴会类型名
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 宴会类型名
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 宴会类型描述
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * 宴会类型描述
     */
    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
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
        BanquetTypes other = (BanquetTypes) that;
        return (this.getTid() == null ? other.getTid() == null : this.getTid().equals(other.getTid()))
                && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
                && (this.getTypeDescription() == null ? other.getTypeDescription() == null : this.getTypeDescription().equals(other.getTypeDescription()))
                && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
                && (this.getLastmodifytime() == null ? other.getLastmodifytime() == null : this.getLastmodifytime().equals(other.getLastmodifytime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTid() == null) ? 0 : getTid().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getTypeDescription() == null) ? 0 : getTypeDescription().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getLastmodifytime() == null) ? 0 : getLastmodifytime().hashCode());
        return result;
    }

}