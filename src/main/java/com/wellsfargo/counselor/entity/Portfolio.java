package com.wellsfargo.counselor.entity;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long portfolioId;

    @JoinColumn(name = "clientId")
    private long clientId;

    @Column(nullable = false)
    private Date creationDate; 

    protected Portfolio() {

    }

    public Portfolio(long clientId, Date creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId(){
        return portfolioId;
    }

    public void setClientId(long clientId){
        this.clientId = clientId;
    }

    public Long getClientId() {
        return clientId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
