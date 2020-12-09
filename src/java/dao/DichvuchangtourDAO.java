/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.conn;
import java.sql.PreparedStatement;
import model.Dichvuchangtour;

/**
 *
 * @author datnvt
 */
public class DichvuchangtourDAO extends DAO{

    public DichvuchangtourDAO() {
        super();
    }
    
    public int saveDVCT(Dichvuchangtour dvct) {
        int result = -99;
        String sql = "UPDATE Dichvuchangtour" +
        " SET thanhtoan = ? " +
        "WHERE id = ?;";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println(ps);
            ps.setInt(1, dvct.getThanhtoan());
            ps.setInt(2, dvct.getId());

            result = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;        
    }
}
