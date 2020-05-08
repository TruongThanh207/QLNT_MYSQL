/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author NT_Thanh
 */
public class Guest {
    private int id;
    private String name;
    private String sdt;
    private int sex;
    private String cmnd;
    private String ngaydk;
    private int id_phong;

    public Guest(int id, String name, String sdt, int sex, String cmnd, String ngaydk, int id_phong) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.sex = sex;
        this.cmnd = cmnd;
        this.ngaydk = ngaydk;
        this.id_phong = id_phong;
    }

    public Guest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgaydk() {
        return ngaydk;
    }

    public void setNgaydk(String ngaydk) {
        this.ngaydk = ngaydk;
    }

    public int getId_phong() {
        return id_phong;
    }

    public void setId_phong(int id_phong) {
        this.id_phong = id_phong;
    }
    
}
