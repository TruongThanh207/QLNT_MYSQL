/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author NT_Thanh
 */
public class UserDAL {
    private DataAccess da;
    public UserDAL() {
        da = new DataAccess();
    }
    
    public ArrayList<User> GetUserAll()
    {
        
        ArrayList<User> list = new ArrayList<>();
        String sql = "SELECT * FROM users";
        
        try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                User s = new User();
                s.setId(rs.getInt("id"));
                s.setUser(rs.getString("username"));
                s.setPass(rs.getString("password"));
                s.setFullname(rs.getString("fullname"));
                s.setPermissive(rs.getInt("permissive"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    public int FindUser(String user, String pass)
    {
        String sql = "SELECT * FROM users where username='"+user+"'";
         try {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {   User s = new User();  
                s.setPermissive(rs.getInt("permissive"));
                if(pass.equals(rs.getString("password")))
                {
                    if(s.getPermissive()==1)
                    return 1;
                    else
                        return 0;
                }
                else
                    return 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 2;
        
    }

    public User SingleUser(String user) {
        String sql = "SELECT * FROM users where username ='"+user+"'";
        User s = new User();
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                
                s.setId(rs.getInt(1));
                s.setUser(rs.getString(2));
                s.setPass(rs.getString(3));
                s.setFullname(rs.getString(4));
                s.setPermissive(rs.getInt(5));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
         
        return s;
    }

    public boolean SetPassword(String pass, String newpass) {
       String sql = "Update users set password = '"+newpass+"' where password ='"+pass+"'";
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

    public int CountUser() {
        String sql = "Select count(*) from users where permissive = 0";
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
    public boolean AddUser(String name, String username, String password, int permiss)
    {
        if(FindUser(username)>0)
        {
             return false;
        }
        String sql = "Insert into users (id,username,password,fullname,permissive)"
                + "values(null, '"+username+"','"+password+"',N'"+name+"', '"+permiss+"')";
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
    public boolean RemoveUserByUser(String user) {
        String sql = "DELETE FROM `users` WHERE username ='"+user+"'";
        try {
            Statement st = da.getConn().createStatement();
            st.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public int FindUser(String user)
    {
        String sql = "SELECT count(*) FROM users where username='"+user+"'";
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
}
