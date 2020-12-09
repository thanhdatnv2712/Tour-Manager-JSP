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
public class Dichvuchangtour implements Serializable{
    private int id;
    private Dichvudulich dvdulich;
    private int thanhtoan;

    public Dichvuchangtour() {
    }

    public Dichvuchangtour(int id, Dichvudulich dvdulich, int thanhtoan) {
        this.id = id;
        this.dvdulich = dvdulich;
        this.thanhtoan = thanhtoan;
    }

    public Dichvudulich getDvdulich() {
        return dvdulich;
    }

    public void setDvdulich(Dichvudulich dvdulich) {
        this.dvdulich = dvdulich;
    }

    public int getThanhtoan() {
        return thanhtoan;
    }

    public void setThanhtoan(int thanhtoan) {
        this.thanhtoan = thanhtoan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
