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
                s.setNgaydk(rs.getString("Ngay_DK"));
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
        int flag = 0;
         try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                flag =1;
                Guest s = new Guest();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setSdt(rs.getString("SDT"));
                s.setSex(rs.getInt("sex"));
                s.setCmnd(rs.getString("cmnd"));
                s.setNgaydk(rs.getString("Ngay_DK"));
                s.setId_phong(rs.getInt("id_phong"));
                listbyid.add(s);
            }
            if(flag ==1) return listbyid;
           
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return null;
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
                s.setNgaydk(rs.getString("Ngay_DK"));
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


    public boolean AddGuest(String text, String text0, String text1, int gender, int tem, String datedk) {
        String sql="INSERT INTO `guests`(`ID`, `NAME`, `SDT`, `SEX`, `CMND`, `NGAY_DK`, `ID_PHONG`) VALUES "
                + "(null,'"+text+"','"+text1+"','"+gender+"','"+text0+"','"+datedk+"','"+tem+"')";
         try
        {
            Statement st = da.getConn().createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return false;
    }

    public boolean RemoveRoom(int x) {
         if(FindGuestByID(x))
         {
              String sql = "Delete FROM guests where ID_PHONG='"+x+"'";
                try {
                   Statement st = da.getConn().createStatement();
                   st.executeUpdate(sql);
                   return true;
               } catch (Exception e) {
                   e.printStackTrace();
               }
               return false;
         }
         else
         {
             return false;
         }
        
    }
    public boolean FindGuestByID(int x) {
        
        String sql = "Select * FROM guests where ID_PHONG='"+x+"'";
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean RemoveGuestByName(String cmnd) {
        String sql = "Delete FROM guests where CMND='"+cmnd+"'";
                try {
                   Statement st = da.getConn().createStatement();
                   st.executeUpdate(sql);
                   return true;
               } catch (Exception e) {
                   e.printStackTrace();
               }
               return false;
    }
   
}
