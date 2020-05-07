/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author NT_Thanh
 */
public class Room {
    private int id;
    private String ten;
    private int songuoi;
    private int price;
    private int chisodien_old;
    private int chisodien_new;
    private int chisonuoc_old;
    private int chisonuoc_new;

    public Room(int id, String ten, int songuoi, int price, int chisodien_old, int chisodien_new, int chisonuoc_old, int chisonuoc_new) {
        this.id = id;
        this.ten = ten;
        this.songuoi = songuoi;
        this.price = price;
        this.chisodien_old = chisodien_old;
        this.chisodien_new = chisodien_new;
        this.chisonuoc_old = chisonuoc_old;
        this.chisonuoc_new = chisonuoc_new;
    }

    public int getChisodien_old() {
        return chisodien_old;
    }

    public void setChisodien_old(int chisodien_old) {
        this.chisodien_old = chisodien_old;
    }

    public int getChisodien_new() {
        return chisodien_new;
    }

    public void setChisodien_new(int chisodien_new) {
        this.chisodien_new = chisodien_new;
    }

    public int getChisonuoc_old() {
        return chisonuoc_old;
    }

    public void setChisonuoc_old(int chisonuoc_old) {
        this.chisonuoc_old = chisonuoc_old;
    }

    public int getChisonuoc_new() {
        return chisonuoc_new;
    }

    public void setChisonuoc_new(int chisonuoc_new) {
        this.chisonuoc_new = chisonuoc_new;
    }
    

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;
    }
    
}
