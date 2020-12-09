/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Dichvu;
import model.Doitac;

/**
 *
 * @author datnvt
 */
public class DoitacDAO extends DAO{

    public DoitacDAO() {
        super();
    }
    
    public ArrayList <Doitac> getDTwithName(String key) {
        ArrayList<Doitac> result = new ArrayList<Doitac>();
        String sql = "SELECT * FROM ThanhVien INNER JOIN Doitac ON Doitac.ThanhVien_id = ThanhVien.id WHERE ten LIKE ?";
        try{
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + key + "%");
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                        Doitac u = new Doitac();
                        u.setId(rs.getInt("id"));
                        u.setTen(rs.getString("ten"));
                        u.setHodem(rs.getString("hodem"));
                        u.setTendem(rs.getString("tendem"));
                        u.setGioitinh(rs.getString("gioitinh"));
                        u.setEmail(rs.getString("email"));
                        u.setSdt(rs.getString("sdt"));
                        u.setDc_id(rs.getInt("Diachi_id"));
                        u.setNgaysinh(rs.getDate("ngaysinh"));
                        result.add(u);
                }
        }catch(Exception e){
                e.printStackTrace();
        }
        System.out.println(result.size());
        return result;  
    }
    
    public static void main(String[] args) {
        DoitacDAO o = new DoitacDAO();
        ArrayList<Doitac> result = o.getDTwithName("C");
        System.out.println(result.size());
    }
}
