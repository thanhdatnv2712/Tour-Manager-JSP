/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Dichvu;

/**
 *
 * @author datnvt
 */
public class DichvuDAO extends DAO{

    public DichvuDAO() {
        super();
    }
    
    public ArrayList <Dichvu> getDVwithName(String key) {
        ArrayList<Dichvu> result = new ArrayList<Dichvu>();
        String sql = "SELECT * FROM Dichvu WHERE ten LIKE ?";
        try{
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + key + "%");
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                        Dichvu dv = new Dichvu();
                        dv.setId(rs.getInt("id"));
                        dv.setTen(rs.getString("ten"));
                        dv.setMota(rs.getString("mota"));
                        dv.setGia(rs.getFloat("gia"));
                        result.add(dv);
                }
        }catch(Exception e){
                e.printStackTrace();
        }
        System.out.println(result.size());
        return result;        
    }
    
    public int updateDichvu(Dichvu dv){
        int result = -99;
        String sql = "UPDATE Dichvu" +
        " SET ten = ?, mota = ?, gia = ? " +
        "WHERE id = ?;";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, dv.getTen());
            ps.setString(2, dv.getMota());
            ps.setFloat(3, dv.getGia());
            ps.setInt(4, dv.getId());

            result = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
    public static void main(String[] args) {
        DichvuDAO o = new DichvuDAO();
        Dichvu dv = new Dichvu();
        dv.setId(5);
        dv.setTen("Lặn 100m");
        dv.setMota("phê");
        dv.setGia(400);
        System.out.println(o.updateDichvu(dv));
    }
}
