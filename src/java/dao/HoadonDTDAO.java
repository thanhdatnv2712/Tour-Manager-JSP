/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.Diachi;
import model.Diadiem;
import model.Diadiemdulich;
import model.Dichvu;
import model.Dichvuchangtour;
import model.Dichvudoitac;
import model.Dichvudulich;
import model.Doitac;
import model.HoadonDT;

/**
 *
 * @author datnvt
 */
public class HoadonDTDAO extends DAO{

    public HoadonDTDAO() {
        super();
    }
    
    public HoadonDT getHoadonDT(Doitac dt) {
        HoadonDT hd = new HoadonDT();
        String sql = "{call getDichvuchuaTT(?)}";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, dt.getId());

            ResultSet rs = ps.executeQuery();
            ArrayList <Dichvuchangtour> list = new ArrayList<>();
            float total = 0;
            while (rs.next()) {
                Diachi dc = new Diachi(rs.getInt("dc.id"), rs.getString("dc.xomthon"), rs.getString("dc.phuongxa"), rs.getString("dc.quanhuyen"), rs.getString("dc.tinhthanh"));
                Diadiem dd = new Diadiem(rs.getInt("dd.id"), rs.getString("dd.ten"), rs.getString("dd.mota"), dc);
                Diadiemdulich dddl = new Diadiemdulich(rs.getInt("dddl.id"), rs.getString("dddl.ten"), rs.getString("dddl.mota"), dd);
                Dichvudoitac dvdt = new Dichvudoitac(rs.getInt("dvdt.id"), rs.getInt("dvdt.soluong"), rs.getFloat("dvdt.gia"), rs.getString("dvdt.mota"), dt);
                Dichvu dv = new Dichvu(rs.getInt("dv.id"), rs.getString("dv.ten"), rs.getString("dddl.mota"), dvdt.getGia(), dvdt);
                Dichvudulich dvdl = new Dichvudulich(dv, dddl, rs.getInt("t.soluong"));
                Dichvuchangtour dvct = new Dichvuchangtour(rs.getInt("dvct.id"), dvdl, rs.getInt("dvct.thanhtoan"));
                list.add(dvct);
                total+= dvdt.getGia() * rs.getInt("t.soluong");
            }
            hd.setDoitac(dt);
            hd.setDvctList(list);
            hd.setTongtien(total);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hd;
    }
    
    public int luuhoadon(HoadonDT hd) {
        int result = -99;
        String sql = "INSERT INTO Hoadondt (ngaythanhtoan, Doitac_ThanhVien_id) VALUES (?, ?);";
        Date now = new Date();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);     	
        String mysqlDateString = formatter.format(now);
        
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            System.out.println(ps);
            ps.setString(1, mysqlDateString);
            ps.setInt(2, hd.getDoitac().getId());
            result = ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (Dichvuchangtour obj : hd.getDvctList()) {
            obj.setThanhtoan(1);
            DichvuchangtourDAO o = new DichvuchangtourDAO();
            int res= o.saveDVCT(obj);
            if (res != -99) {
                result = 1;
            }
            else {
                break;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        HoadonDTDAO o = new HoadonDTDAO();
        Doitac dt = new Doitac();
        dt.setId(5);
        HoadonDT hd = o.getHoadonDT(dt);
        System.out.println(hd.getDvctList().toString());
    }
}
