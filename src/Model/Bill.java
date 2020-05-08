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
public class Bill {
    private int id_bill;
    private String phong;
    private String nguoidaidien;
    private String date_begin;
    private String date_end;
    private int month;
    private int year;
    private int total_csd;
    private int total_csn;
    private float money;
    private int id_user;

    public Bill(int id_bill, String phong, String nguoidaidien, String date_begin, String date_end, int month, int year, int total_csd, int total_csn, float money, int id_user) {
        this.id_bill = id_bill;
        this.phong = phong;
        this.nguoidaidien = nguoidaidien;
        this.date_begin = date_begin;
        this.date_end = date_end;
        this.month = month;
        this.year = year;
        this.total_csd = total_csd;
        this.total_csn = total_csn;
        this.money = money;
        this.id_user = id_user;
    }

    public Bill() {
    }

    public int getId() {
        return id_bill;
    }

    public void setId(int id_bill) {
        this.id_bill = id_bill;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getNguoidaidien() {
        return nguoidaidien;
    }

    public void setNguoidaidien(String nguoidaidien) {
        this.nguoidaidien = nguoidaidien;
    }

    public String getDate_begin() {
        return date_begin;
    }

    public void setDate_begin(String date_begin) {
        this.date_begin = date_begin;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTotal_csd() {
        return total_csd;
    }

    public void setTotal_csd(int total_csd) {
        this.total_csd = total_csd;
    }

    public int getTotal_csn() {
        return total_csn;
    }

    public void setTotal_csn(int total_csn) {
        this.total_csn = total_csn;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    

    
    
}
