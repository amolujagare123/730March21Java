package JDBCDemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String user ="root";
        String pass ="root";
        String url ="jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(url,user,pass);

        Statement st = con.createStatement();

        String sql = "Insert into student values(4, 'xyz','IT', 89)";
        st.executeUpdate(sql);

        st.close();
        con.close();

    }
}
