/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Room;
import Model.User;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author NT_Thanh
 */
public class RoomsDAL {
     private DataAccess da;
    public RoomsDAL() {
        da = new DataAccess();
    }
    public ArrayList<Room> GetRoomAll()
    {
        
        ArrayList<Room> list = new ArrayList<>();
        String sql = "SELECT * FROM rooms";
        
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Room s = new Room();
                s.setId(rs.getInt("id"));
                s.setTen(rs.getString("tenphong"));
                s.setPrice(rs.getInt("giaphong"));
                s.setChisodien_old(rs.getInt("chisodien_old"));
                s.setChisodien_new(rs.getInt("chisodien_new"));
                s.setChisonuoc_old(rs.getInt("chisonuoc_old"));
                s.setChisonuoc_new(rs.getInt("chisonuoc_new"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    public int CountRoom() {
        String sql = "Select count(*) from rooms";
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

    public boolean AddRoom(String name, int price) {
        if(FindRoom(name)>0)
        {
            return false;
        }
        
        String sql = "Insert into Rooms (ID,TENPHONG,GIAPHONG,CHISODIEN_OLD, CHISODIEN_NEW, CHISONUOC_OLD, CHISONUOC_NEW)"
                + "values(null,N'"+name+"','"+price+"','"+0+"','"+0+"','"+0+"','"+0+"')";
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
    public int FindRoom(String name)
    {
        String sql = "SELECT count(*) FROM rooms where TENPHONG='"+name+"'";
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                return rs.getInt(1);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return -1;
    }

    public ArrayList<Integer> GetRoomAllNotEmpty() {
        ArrayList<Integer> list = new ArrayList<>();
        String sql = "SELECT DISTINCT guests.ID_PHONG\n" +
                        "FROM rooms\n" +
                        "LEFT JOIN guests\n" +
                        "ON rooms.ID = guests.ID_PHONG;";
        
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getInt(1)!=0)
                {
                    list.add(rs.getInt(1));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }

    public Room GetRoomByID(int index) {
        
        String sql = "SELECT * FROM rooms where ID = '"+index+"'";
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Room s = new Room();
                s.setId(rs.getInt("id"));
                s.setTen(rs.getString("tenphong"));
                s.setPrice(rs.getInt("giaphong"));
                s.setChisodien_old(rs.getInt("chisodien_old"));
                s.setChisodien_new(rs.getInt("chisodien_new"));
                s.setChisonuoc_old(rs.getInt("chisonuoc_old"));
                s.setChisonuoc_new(rs.getInt("chisonuoc_new"));
                return s;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return null;
    }

    public boolean RemoveRoomByID(int id) {
        String sql = "Delete From rooms where id = '"+id+"'";
        try {
            Statement st = da.getConn().createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void UpdateRoomByID(int index, String csd, String csn) {
        String sql = "Update rooms set "
                + "CHISODIEN_OLD = '"+Integer.parseInt(csd)+"', "
                + "CHISONUOC_OLD ='"+Integer.parseInt(csn)+"' "
                + "where ID = '"+index+"'";
        try {
            Statement st = da.getConn().createStatement();
            st.executeUpdate(sql);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public boolean UpdateRoom(String text, int parseInt) {
        
        String sql = "Update rooms set "
                + "GIAPHONG ='"+parseInt+"' "
                + "where TENPHONG = '"+text+"'";
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
