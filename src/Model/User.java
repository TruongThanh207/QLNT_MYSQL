/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author NT_Thanh
 */
public class User implements Serializable{
    private int id;
    private String user;
    private String pass;
    private String fullname;
    private int permissive;

    public User() {
    }

    
    public User(int id, String user, String pass, String fullname, int permissive) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.fullname = fullname;
        this.permissive = permissive;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getPermissive() {
        return permissive;
    }

    public void setPermissive(int permissive) {
        this.permissive = permissive;
    }
    
}
