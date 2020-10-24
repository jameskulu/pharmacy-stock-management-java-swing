package pharmacy;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Database {
    
    public Connection conn=null;
    PreparedStatement pstmt=null;
     ResultSet rs=null;
    
    public Database()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pharmacy","root","");
            System.out.println("Connected");
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
    
    public int save( String medicine_name,String company_name,int quantity,String manufacture_date, String expiry_date)
 
    {
        int result=0;
        try {
            pstmt=conn.prepareStatement("insert into Medicine values(?,?,?,?,?,?)");
            pstmt.setInt(1,0);
            pstmt.setString(2,medicine_name);
            pstmt.setString(3,company_name);
            pstmt.setInt(4,quantity);
            pstmt.setString(5,manufacture_date);
            pstmt.setString(6,expiry_date);    
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
    
    
     public int update_medicine(String medicine_name,String company_name,int quantity,String manufacture_date, String expiry_date,String value)
 
    {
        
        int result=0;
        try {
           
            pstmt=conn.prepareStatement("update Medicine set medicine_name=?, company_name=?, quantity=?, manufacture_date=?, expiry_date=? where medicine_id="+value);
//            pstmt.setInt(1,0);
            pstmt.setString(1,medicine_name);
            pstmt.setString(2,company_name);
            pstmt.setInt(3,quantity);
            pstmt.setString(4,manufacture_date);
            pstmt.setString(5,expiry_date);    
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
           
            return result;
        
    }
     
     
     public int delete(String value)
    {        
     int result=0;
        try {
           
            pstmt=conn.prepareStatement("delete from Medicine where medicine_id="+value);
            result=pstmt.executeUpdate();
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
            return result;
        
    }
    
   
         
         public ResultSet FetchData(String query){
         try{
         pstmt=conn.prepareStatement(query);
         rs=pstmt.executeQuery();
         }
         catch(Exception e)
         {
         }
         return rs;
    
    }
         
     
     }
            

         
         