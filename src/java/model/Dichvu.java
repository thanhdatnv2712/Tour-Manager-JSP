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
public class Dichvu implements Serializable{
    private int id;
    private String ten, mota;
    private float gia;
    private Dichvudoitac dvdoitac;

    public Dichvu() {
    }

    public Dichvu(int id, String ten, String mota, float gia, Dichvudoitac dvdoitac) {
        this.id = id;
        this.ten = ten;
        this.mota = mota;
        this.gia = gia;
        this.dvdoitac = dvdoitac;
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

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public Dichvudoitac getDvdoitac() {
        return dvdoitac;
    }

    public void setDvdoitac(Dichvudoitac dvdoitac) {
        this.dvdoitac = dvdoitac;
    }

    @Override
    public String toString() {
        return "Dichvu{" + "id=" + id + ", ten=" + ten + ", mota=" + mota + ", gia=" + gia + ", dvdoitac=" + dvdoitac + '}';
    }
}
