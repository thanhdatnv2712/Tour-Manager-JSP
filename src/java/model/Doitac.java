/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author datnvt
 */
public class Doitac extends Thanhvien implements Serializable{
    private int idDT;

    public Doitac() {
        super();
    }

    public Doitac(int idDT) {
        this.idDT = idDT;
    }

    public Doitac(int idDT, int id, String username, String password, String hodem, String tendem, String ten, String gioitinh, String email, String sdt, Date ngaysinh, int dc_id, String vitri) {
        super(id, username, password, hodem, tendem, ten, gioitinh, email, sdt, ngaysinh, dc_id, vitri);
        this.idDT = idDT;
    }

    public int getIdDT() {
        return idDT;
    }

    public void setIdDT(int idDT) {
        this.idDT = idDT;
    }
}
