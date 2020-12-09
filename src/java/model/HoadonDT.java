/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author datnvt
 */
public class HoadonDT implements Serializable{
    private int id;
    private Date ngaythanhtoan;
    private Doitac doitac;
    private ArrayList<Dichvuchangtour> dvctList;
    private float tongtien;

    public HoadonDT() {
        dvctList= new ArrayList<Dichvuchangtour>();
    }

    public HoadonDT(int id, Date ngaythanhtoan, Doitac doitac, ArrayList<Dichvuchangtour> dvctList, float tongtien) {
        this.id = id;
        this.ngaythanhtoan = ngaythanhtoan;
        this.doitac = doitac;
        this.dvctList = dvctList;
        this.tongtien = tongtien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(Date ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public Doitac getDoitac() {
        return doitac;
    }

    public void setDoitac(Doitac doitac) {
        this.doitac = doitac;
    }

    public ArrayList<Dichvuchangtour> getDvctList() {
        return dvctList;
    }

    public void setDvctList(ArrayList<Dichvuchangtour> dvctList) {
        this.dvctList = dvctList;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return "HoadonDT{" + "id=" + id + ", ngaythanhtoan=" + ngaythanhtoan + ", doitac=" + doitac + ", dvctList=" + dvctList + ", tongtien=" + tongtien + '}';
    }
}
