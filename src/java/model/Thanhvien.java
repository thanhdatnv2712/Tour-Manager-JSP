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
public class Thanhvien implements Serializable{
    protected int id, dc_id;
    protected String username, password, hodem, tendem, ten, gioitinh, email, sdt, vitri;
    protected Date ngaysinh;

    public Thanhvien() {
    }

    public Thanhvien(int id, String username, String password, String hodem, String tendem, String ten, String gioitinh, String email, String sdt, Date ngaysinh, int dc_id, String vitri) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hodem = hodem;
        this.tendem = tendem;
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.email = email;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.dc_id = dc_id;
        this.vitri = vitri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHodem() {
        return hodem;
    }

    public void setHodem(String hodem) {
        this.hodem = hodem;
    }

    public String getTendem() {
        return tendem;
    }

    public void setTendem(String tendem) {
        this.tendem = tendem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getDc_id() {
        return dc_id;
    }

    public void setDc_id(int dc_id) {
        this.dc_id = dc_id;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    @Override
    public String toString() {
        return "Thanhvien{" + "id=" + id + ", dc_id=" + dc_id + ", username=" + username + ", password=" + password + ", hodem=" + hodem + ", tendem=" + tendem + ", ten=" + ten + ", gioitinh=" + gioitinh + ", email=" + email + ", sdt=" + sdt + ", vitri=" + vitri + ", ngaysinh=" + ngaysinh + '}';
    }
}
