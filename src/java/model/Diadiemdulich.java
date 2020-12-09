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
public class Diadiemdulich implements Serializable{
    private int id;
    private String ten, mota;
    private Diadiem diadiem;

    public Diadiemdulich() {
    }

    public Diadiemdulich(int id, String ten, String mota, Diadiem diadiem) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.diadiem = diadiem;
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

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Diadiem getDiadiem() {
        return diadiem;
    }

    public void setDiadiem(Diadiem diadiem) {
        this.diadiem = diadiem;
    }
}
