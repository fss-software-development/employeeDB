package com.user.usermanagement.dto;

import javax.persistence.*;

@Entity
@Table(name="account")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="accountId")
    private Long accountId;
    @Column(name="accountNumber")
    private String accountNumber;
    @Column(name="availableBalance")
    private Long availableBalance;


    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Long availableBalance) {
        this.availableBalance = availableBalance;
    }
}
