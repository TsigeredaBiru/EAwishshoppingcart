package edu.mum.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="generatedamount")
public class GeneratedAmount {
    @Id
    @GeneratedValue
    private int genId;
    private String accountNumber;
    @OneToMany
    @JoinColumn(name="GA_Id")
    private List<User> users = new ArrayList<>();
    private double profitPercentage;
    private long profitAmount;

    public GeneratedAmount() {
    }

    public GeneratedAmount(String accountNumber, List<User> users, double profitPercentage, long profitAmount) {
        this.accountNumber = accountNumber;
        this.users = users;
        this.profitPercentage = profitPercentage;
        this.profitAmount = profitAmount;
    }

    public int getGenId() {
        return genId;
    }

    public void setGenId(int genId) {
        this.genId = genId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }
    public double getProfitPercentage() {
        return profitPercentage;
    }
    public void setProfitPercentage(double profitPercentage) {
        this.profitPercentage = profitPercentage;
    }
    public long getProfitAmount() {
        return profitAmount;
    }
    public void setProfitAmount(long profitAmount) {
        this.profitAmount = profitAmount;
    }
}
