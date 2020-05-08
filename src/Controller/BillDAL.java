/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bill;
import View.BillPanel;
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

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
    public Bill GetDateEndLast(String name) 
    {
       String sql ="Select * from Bills where PHONG='"+name+"' Order by ID_BILL DESC";
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                Bill s= new Bill();
                s.setId(rs.getInt("ID_USER"));
                s.setPhong(rs.getString("PHONG"));
                s.setNguoidaidien(rs.getString("NGUOIDAIDIEN"));
                s.setDate_begin(rs.getString("DATE_BEGIN"));
                s.setDate_end(rs.getString("DATE_END"));
                s.setMonth(rs.getInt("MONTH"));
                s.setYear(rs.getInt("YEAR"));
                s.setTotal_csd(rs.getInt("TOTAL_CSD"));
                s.setTotal_csn(rs.getInt("TOTAL_CSN"));
                s.setMoney(rs.getInt("MONEY"));
                return s;
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return null;
    }
    

    public void ReportBill(int id) {
        try {
               Map param = new HashMap();
               JasperReport report = JasperCompileManager.compileReport("src/View/BillReport.jrxml");
               param.put("ID_BILL", id);
               JasperPrint print=JasperFillManager.fillReport(report, param, da.getConn());
               JasperViewer.viewReport(print,false);
        } 
        catch (JRException ex) {
               ex.printStackTrace();
        }
    }
    public int GetIDEndLast() 
    {
       String sql ="Select * from Bills Order by ID_BILL DESC";
        try
        {
            Statement st = da.getConn().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next())
            {
                int t = rs.getInt("ID_BILL");
                return t;
            } 
        }
        catch(Exception e)
        {
            e.printStackTrace();  
        }
        return -1;
    }

    public boolean AddBill(int id, String tenphong, String nguoidaidien, String t, String date, int month, int year, int total_CSD, int total_CSN, float money, String iuser) {
        String sql = "INSERT INTO `bills`(`ID_BILL`, `PHONG`, `NGUOIDAIDIEN`, `DATE_BEGIN`, `DATE_END`, `MONTH`, `YEAR`, `Total_CSD`, `Total_CSN`, `MONEY`,`ID_USER`) "
                + "VALUES (null,'"+tenphong+"','"+nguoidaidien+"','"+t+"','"+date+"','"+month+"','"+year+"','"+total_CSD+"','"+total_CSN+"','"+money+"',(SELECT ID FROM users WHERE username = '"+iuser+"'))";
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
    
}
