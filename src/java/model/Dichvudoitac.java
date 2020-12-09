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
public class Dichvudoitac implements Serializable{
    private int id, soluong;
    private float gia;
    private String mota;
    private Doitac doitac;

    public Dichvudoitac() {
    }

    public Dichvudoitac(int id, int soluong, float gia, String mota, Doitac doitac) {
        this.id = id;
        this.soluong = soluong;
        this.gia = gia;
        this.mota = mota;
        this.doitac = doitac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public Doitac getDoitac() {
        return doitac;
    }

    public void setDoitac(Doitac doitac) {
        this.doitac = doitac;
    }
}
