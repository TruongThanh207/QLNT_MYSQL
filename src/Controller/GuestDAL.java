/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Guest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NT_Thanh
 */
public class GuestDAL {
     private DataAccess da;
    public GuestDAL() {
        da = new DataAccess();
    }
    public ArrayList<Guest> GetGuestAll()
    {
        
        ArrayList<Guest> list = new ArrayList<>();
        String sql = "SELECT * FROM guests";
        
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Guest s = new Guest();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setSdt(rs.getString("SDT"));
                s.setSex(rs.getInt("sex"));
                s.setCmnd(rs.getString("cmnd"));
                s.setNgaydk(rs.getDate("Ngay_DK"));
                s.setId_phong(rs.getInt("id_phong"));
                list.add(s);
                
            }
            da.getConn().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        return list;
    }
    public int CountGuest() {
        String sql = "Select count(*) from guests";
        int count = 0;
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt(1);
            }
            return count;
           
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return count;
    }
    public ArrayList<Guest> GetGuestByID(int id)
    {
        ArrayList<Guest> listbyid = new ArrayList<>();
        String sql = "SELECT * FROM guests where ID_Phong='"+id+"'";
     
         try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                Guest s = new Guest();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setSdt(rs.getString("SDT"));
                s.setSex(rs.getInt("sex"));
                s.setCmnd(rs.getString("cmnd"));
                s.setNgaydk(rs.getDate("Ngay_DK"));
                s.setId_phong(rs.getInt("id_phong"));
                listbyid.add(s);
            }
            return listbyid;
           
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
         return listbyid;
    }

    public Guest GetByIDPhong(int id) {
        Guest s = new Guest();
        String sql = "SELECT * FROM guests where ID_PHONG='"+id+"'";
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setSdt(rs.getString("SDT"));
                s.setSex(rs.getInt("sex"));
                s.setCmnd(rs.getString("cmnd"));
                s.setNgaydk(rs.getDate("Ngay_DK"));
                s.setId_phong(rs.getInt("id_phong"));
                return s;
            }
            return null;
           
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
         return null;
    }
   
}
