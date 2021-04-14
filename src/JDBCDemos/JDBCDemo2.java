package JDBCDemos;

import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String user ="root";
        String pass ="root";
        String url ="jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();

        String sql = "select * from student"; // DDL query
        ResultSet rs =  st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("id")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("branch")+" ");
            System.out.print(rs.getInt("marks"));
            System.out.println();
        }

    }
}
