/**
 * @description: class UserAccount is defined with its attributes and its methods.
 * @author: coronadoapps
 * @date: april-2022
 */

package com.sofka;

public class UserAccount {
    /**
     * Attributes defined for class UserAccount
     */
    private String user;
    private String password;
    protected boolean admin;
    protected int followers;

    /**
     * Constructor
     */
    public UserAccount(String user, String password) {
        this.user = user;
        this.password = password;
    }

    /**
     * Overloaded constructor
     */
    public UserAccount(String user, String password, boolean admin, int followers) {
        this(user, password);
        this.admin = admin;
        this.followers = followers;
    }

    /**
     * Getter method is defined
     * @param void
     * @return user value
     */
    public String getUser() {
        return user;
    }

    /**
     * Getter method is defined
     * @param void
     * @return admin status
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * Setter method is defined
     * @param admin
     * @return void
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    /**
     * Getter method is defined
     * @param void
     * @return followers value
     */
    public int getFollowers() {
        return followers;
    }

}
