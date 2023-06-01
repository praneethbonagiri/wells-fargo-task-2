package com.wellsfargo.counselor.entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;
    
    @JoinColumn(name = "portfolioId")
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(long portfolioId, String name, String category, long purchasePrice, Date purchaseDate, long quantity){
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityid() {
        return securityId;
    }

    public void setPortfolioId(long portfolioId){
        this.portfolioId = portfolioId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatrgory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasePrice(long purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public Long getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchaseDate(Date purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setQuantity(long quantity){
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return quantity;
    }
}
