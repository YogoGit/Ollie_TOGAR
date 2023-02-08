package edu.carroll.cs389application.jpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="logindata")
public class login {
    private static final long serialVersionUID = 1L;

    public login(){

    }

    public login(String username){
        this.username = username;
    }

    //Our keyvalue
    @Id
    @GeneratedValue
    private Integer id;

    //Column in DB for username and stored along side the ID
    @Column(name = "username", nullable = false, unique = true)
    private String username;


    /**
     * Returns the keyvalue for the row in database
     * @return id of row in database
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the id for the row in DB
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the username from the column in database
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Use to set the username, used for creating new users or modifying usernames
     * @param username takes the old username as a parameter
     */
    public void setUsername(String username) {
        this.username = username;
    }

    //Useful for debugging objects and errors
    private static final String EOL = System.lineSeparator();
    private static final String TAB = "\t";

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Login @ ").append(super.toString()).append("[").append(EOL);
        builder.append(TAB).append("username=").append(username).append(EOL);
        builder.append("]").append(EOL);
        return builder.toString();
    }

}
