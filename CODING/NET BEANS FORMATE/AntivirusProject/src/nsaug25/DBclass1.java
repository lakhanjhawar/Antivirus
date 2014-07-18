package nsaug25;


import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;


public class DBclass1
{
   static Connection con=null;
   static PreparedStatement pst;
    static ResultSet rs,rs1;
    static String Query=null;
    static Statement st;
    static List dbList=new ArrayList();;

    public static Connection db()
    
    {
        try
        {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:dsn");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
   return con;
    }

    public static  void update1(String s1,String s2)
    {
        try
        {
//            System.out.println("hi selvam");
           // String s=(String)i.next();
            pst=db().prepareStatement("insert into vs values(?,?)");
            pst.setString(1,s1);
            pst.setString(2,s2);
            pst.executeUpdate();
            pst.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static List getData()
    {       
        try
        {
            st=db().createStatement();
            rs1=st.executeQuery("select * from vs");
            while(rs1.next())
            {
                dbList.add(rs1.getString(1).trim());
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return dbList;

    }
 
}
