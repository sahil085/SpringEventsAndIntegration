package com.ATMApplication;

/**
 * Created by ankur on 16/7/17.
 */
public interface UserDao {
    boolean withdrawal(User user, double money);
    boolean changeATMPIN(User user, int PIN);
    boolean changeMobileNumber(User user, long mobileNumber);
    void insert(User user);
}
