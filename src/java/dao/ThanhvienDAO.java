/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Thanhvien;

/**
 *
 * @author datnvt
 */
public class ThanhvienDAO extends DAO{

    public ThanhvienDAO() {
        super();
    }

    public boolean kiemtraDN(Thanhvien u){
        boolean result = false;
        String sql = "SELECT * From ThanhVien INNER JOIN Nhanvien ON Nhanvien.ThanhVien_id = ThanhVien.id WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                u.setId(rs.getInt("id"));
                u.setTen(rs.getString("ten"));
                u.setHodem(rs.getString("hodem"));
                u.setTendem(rs.getString("tendem"));
                u.setGioitinh(rs.getString("gioitinh"));
                u.setEmail(rs.getString("email"));
                u.setSdt(rs.getString("sdt"));
                u.setDc_id(rs.getInt("Diachi_id"));
                u.setNgaysinh(rs.getDate("ngaysinh"));
                u.setVitri(rs.getString("vitri"));
            }
            result = true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
