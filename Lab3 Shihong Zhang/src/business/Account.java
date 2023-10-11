/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;
import java.util.Date;

/**
 *
 * @author Shihong Zhang
 */
public class Account {
    private String routingiiuber;
    private String accountnumber;
    private String bankNeme;
    private int balance;
    private Date createdOn;

    public Account() {
        this.createdOn = new Date();
    }
    
    public String getRoutingiiuber() {
        return routingiiuber;
    }

    public void setRoutingiiuber(String routingiiuber) {
        this.routingiiuber = routingiiuber;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBankNeme() {
        return bankNeme;
    }

    public void setBankNeme(String bankNeme) {
        this.bankNeme = bankNeme;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    
    @Override
    public String toString(){
     return bankNeme;
    }
    
}
