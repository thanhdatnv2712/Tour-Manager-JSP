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
public class Dichvudulich implements Serializable{
    private Dichvu dv;
    private int total;
    private Diadiemdulich dddulich;

    public Dichvudulich() {
    }

    public Dichvudulich(Dichvu dv, Diadiemdulich dddulich, int total) {
        this.dv = dv;
        this.dddulich = dddulich;
        this.total = total;
    }

    public Dichvu getDv() {
        return dv;
    }

    public void setDv(Dichvu dv) {
        this.dv = dv;
    }

    public Diadiemdulich getDddulich() {
        return dddulich;
    }

    public void setDddulich(Diadiemdulich dddulich) {
        this.dddulich = dddulich;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
