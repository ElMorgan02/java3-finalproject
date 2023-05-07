package com.morgan.login;

import com.morgan.weaponry.Weapon;

import java.io.Serializable;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// Java Bean
public class User implements Serializable {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private char[] password;
    private String status;
    private String privileges;

    private Set<Long> favorites;

    public User() {
        this(0,"John","Doe","john@example.com","Passw0rd".toCharArray(), "inactive", "none");
    }

    public User(int id, String first_name, String last_name, String email,char[] password, String status, String privileges) {
        setId(id);
        setFirst_name(first_name);
        setLast_name(last_name);
        setEmail(email);
        setPassword(password);
        setStatus(status);
        setPrivileges(privileges);
    }

    public User(int id, String first_name, String last_name, String email, String status, String privileges) {
        setId(id);
        setFirst_name(first_name);
        setLast_name(last_name);
        setEmail(email);
        setStatus(status);
        setPrivileges(privileges);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0) {
            throw new IllegalArgumentException("Invalid User ID");
        }
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        if(first_name.length() == 0) {
            throw new IllegalArgumentException("First name required");
        }
        if(first_name.length() > 100) {
            throw new IllegalArgumentException("Last name cannot have more than 100 characters");
        }
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        if(last_name.length() == 0) {
            throw new IllegalArgumentException("Last name required");
        }
        if(last_name.length() > 100) {
            throw new IllegalArgumentException("Last name cannot have more than 100 characters");
        }
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //Set the email pattern string
        Pattern p = Pattern.compile("(?:[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[A-Za-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\\.)+[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[A-Za-z0-9-]*[A-Za-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");
        //Match the given string with the pattern
        Matcher m = p.matcher(email);
        //Check whether match is found
        if(!m.matches()) {
            throw new IllegalArgumentException("Invalid email address");
        }
        if(email.length() > 100) {
            throw new IllegalArgumentException("Email cannot have more than 100 characters");
        }
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        String passwordStr = String.valueOf(password);
        Pattern p = Pattern.compile("^" +
                "(?=.*[0-9])" + // a digit must occur at least once
                "(?=.*[a-z])" + // a lower case letter must occur at least once
                "(?=.*[A-Z])" + // an upper case letter must occur at least once
                // "(?=.*[@#$%^&+=])" + // a special character must occur at least once
                // "(?=\\S+$)" + // no whitespace allowed in the entire string
                ".{8,}" + // anything, at least eight characters
                "$");
        Matcher m = p.matcher(passwordStr);
        if(!m.matches()) {
            throw new IllegalArgumentException("Password must contain at least 8 characters, with 1 digit, 1 lowercase,and 1 uppercase letter");
        }
        this.password = passwordStr.toCharArray();
    }

    public void setPasswordFromDB(String password) {
        this.password = password.toCharArray();
    }

    public void unsetPassword() {
        password = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if(!status.equals("inactive") && !status.equals("active") && !status.equals("locked")) {
            throw new IllegalArgumentException("Invalid status");
        }
        this.status = status;
    }

    public String getPrivileges() {
        return privileges;
    }

    public void setPrivileges(String privileges) {
        if(!privileges.equals("none") && !privileges.equals("editor") && !privileges.equals("admin") && !privileges.equals("premium")) {
            throw new IllegalArgumentException("Invalid privileges");
        }
        this.privileges = privileges;
    }

    public boolean getFavorites(Weapon weapon) {
        return favorites.contains(weapon.getId());
    }

    public void setFavorites(Set<Long> favorites) {
        this.favorites = favorites;
    }

    public Set<Long> getFavorites() {
        return favorites;
    }
}