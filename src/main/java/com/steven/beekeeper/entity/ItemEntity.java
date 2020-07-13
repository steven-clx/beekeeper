package com.steven.beekeeper.entity;

import com.steven.beekeeper.constant.DateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="item")
public class ItemEntity {

    @Id
    @Column(name = "iid", nullable = false)
    private String iid;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "spent_at")
    private Date spentAt;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "category_id", nullable = false)
    private String categoryId;

    @Column(name = "pay_service_id", nullable = false)
    private String payServiceId;

    @Column(name = "is_big")
    private Boolean isBig;

    @Column(name = "details")
    private String details;

    public ItemEntity setIid(String iid) {
        this.iid = iid;
        return this;
    }

    public ItemEntity setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ItemEntity setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public ItemEntity setSpentAt(Date spentAt) {
        this.spentAt = spentAt;
        return this;
    }

    public ItemEntity setAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    public ItemEntity setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public ItemEntity setPayServiceId(String payServiceId) {
        this.payServiceId = payServiceId;
        return this;
    }

    public ItemEntity setIsBig(Boolean isBig) {
        this.isBig = isBig;
        return this;
    }

    public ItemEntity setDetails(String details) {
        this.details = details;
        return this;
    }

    public String getIid() {
        return iid;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public Date getSpentAt() {
        return spentAt;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getPayServiceId() {
        return payServiceId;
    }

    public Boolean getIsBig() {
        return isBig;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "ItemEntity{" +
                "iid=" + (iid == null ? null : '\'' + iid + '\'') +
                ", createdAt=" + DateFormat.COMMON_DATE_FORMAT.format(createdAt) +
                ", updatedAt=" + DateFormat.COMMON_DATE_FORMAT.format(updatedAt) +
                ", spentAt=" + DateFormat.COMMON_DATE_FORMAT.format(spentAt) +
                ", amount=" + amount +
                ", categoryId=" + (categoryId == null ? null : '\'' + categoryId + '\'') +
                ", payServiceId=" + (payServiceId == null ? null : '\'' + payServiceId + '\'') +
                ", isBig=" + isBig +
                ", details='" + (details == null ? null : '\'' + details + '\'') +
                '}';
    }
}