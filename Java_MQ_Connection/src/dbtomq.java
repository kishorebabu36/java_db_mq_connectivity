import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  

class dbtomq{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/kishore","root","GKmb1@34");  

Statement stmt=con.createStatement();  


ResultSet rs=stmt.executeQuery("select * from tutorials_tbl");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getDate(4));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  

