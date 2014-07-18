

package nsaug25;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class DBpartition
{
    static Connection con=null;
    static PreparedStatement pst=null;
    static Statement st;
      static List dbList=new ArrayList();
    static ResultSet rs;
    public static Connection dataBasePartion()
    {
        try
        {
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    con=DriverManager.getConnection("jdbc:odbc:databasePartion","LAKHAN","lakhan");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }



public static void updateShort(String str1,String str2)
    {
      try
       {
             
          pst=dataBasePartion().prepareStatement("insert into vsShort values(?,?) ");
          pst.setString(1,str1);
          pst.setString(2,str2);
          pst.executeUpdate();
          pst.close();

       }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }
public static void updateLong(String str1,String str2)
    {
    try
    {
        pst=dataBasePartion().prepareStatement("insert into vsLong values(?,?)");
        pst.setString(1, str1);
        pst.setString(2, str2);
        pst.executeUpdate();
        pst.close();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }

    }

public static List getShort()
    {
    try
    {
     st=dataBasePartion().createStatement();
     rs=st.executeQuery("select * from vsShort");
     while(rs.next())
     {
         dbList.add(rs.getString(1).trim());
     }

    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return dbList;

    }

public static List getLong()
    {
    try
    {
     st=dataBasePartion().createStatement();
     rs=st.executeQuery("select * from vsLong");
     while(rs.next())
     {
         dbList.add(rs.getString(1).trim());
     }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    return dbList;
    }



}
