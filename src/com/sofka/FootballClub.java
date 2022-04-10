/**
 * @description: class FootballClub is defined with its attributes and its methods.
 * @author: coronadoapps
 * @date: april-2022
 */

package com.sofka;

public class FootballClub {
    /**
     * Attributes defined for class FootballClub
     */
    private String clubName;
    private String country;
    protected int players;
    public int cups;
    private float budget;

    /**
     * Constructor
     */
    public FootballClub(String clubName, String country) {
        this.clubName = clubName;
        this.country = country;
    }

    /**
     * Overloaded constructor
     */
    public FootballClub(String clubName, String country, int players) {
        this(clubName, country);
        this.players = players;
    }

    /**
     * Another overloaded constructor
     */
    public FootballClub(String clubName, String country, int players, int cups, float budget) {
        this(clubName, country, players);
        this.cups = cups;
        this.budget = budget;
    }

    /**
     * Getter method is defined
     * @param void
     * @return clubName value
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * Getter method is defined
     * @param void
     * @return country of club
     */
    public String getCountry() {
        return country;
    }

    /**
     * Getter method is defined
     * @param void
     * @return number of players of club
     */
    public int getPlayers() {
        return players;
    }

    /**
     * Getter method is defined
     * @param void
     * @return total cups
     */
    public int getCups() {
        return cups;
    }

    /**
     * Getter method is defined
     * @param void
     * @return club budget
     */
    public float getBudget() {
        return budget;
    }

    /**
     * Setter method is defined
     * @param players
     * @return void
     */
    public void setPlayers(int players) {
        this.players = players;
    }

    /**
     * Setter method is defined
     * @param cups
     * @return void
     */
    public void setCups(int cups) {
        this.cups = cups;
    }
}
