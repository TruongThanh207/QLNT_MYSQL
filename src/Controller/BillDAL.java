/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bill;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author NT_Thanh
 */
public class BillDAL {
    private DataAccess da;
    public BillDAL() {
        da = new DataAccess();
    }
//  kiem tra bill phong A da co chua?
    public int FindBillExsistFirst(String name) {
       String sql ="Select count(*) from Bills where PHONG = '"+name+"'";
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
    //kiem tra bill sau khi tra phong => set date begin cho bill ke tiep
    public Date GetDateEndLast(String name)
    {
       String sql ="Select * from Bills where PHONG='"+name+"' Order by ID DESC";
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                Date t = rs.getDate("date_end");
                rs.close();
                st.close();
                da.getConn().close();
                return t;
            }
            
           
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return null;
    }
    
}
