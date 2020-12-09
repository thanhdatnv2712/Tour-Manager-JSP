/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author datnvt
 */
public class Diachi implements Serializable{
    private int id;
    private String xomthon, phuongxa, quanhuyen, tinhthanh;

    public Diachi() {
    }

    public Diachi(int id, String xomthon, String phuongxa, String quanhuyen, String tinhthanh) {
        this.id = id;
        this.xomthon = xomthon;
        this.phuongxa = phuongxa;
        this.quanhuyen = quanhuyen;
        this.tinhthanh = tinhthanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getXomthon() {
        return xomthon;
    }

    public void setXomthon(String xomthon) {
        this.xomthon = xomthon;
    }

    public String getPhuongxa() {
        return phuongxa;
    }

    public void setPhuongxa(String phuongxa) {
        this.phuongxa = phuongxa;
    }

    public String getQuanhuyen() {
        return quanhuyen;
    }

    public void setQuanhuyen(String quanhuyen) {
        this.quanhuyen = quanhuyen;
    }

    public String getTinhthanh() {
        return tinhthanh;
    }

    public void setTinhthanh(String tinhthanh) {
        this.tinhthanh = tinhthanh;
    }
}
