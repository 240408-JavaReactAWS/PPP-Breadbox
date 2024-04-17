package com.revature.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String username;
    private String password;
    private boolean isAdmin = false;
    @OneToMany(mappedBy = "user")
    private List<Item> items;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //No-args constructor for Jackston databind
    public User(){ }

    public User(int id, String username, String password)
    {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, boolean isAdmin)
    {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getUserId() {
        return this.id;
    }

    public void setUserId(int userId) {
        this.id = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isIsAdmin() {
        return this.isAdmin;
    }

    public boolean getIsAdmin() {
        return this.isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    private String token = null;

    public List<Item> getItems() {
        return this.items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
