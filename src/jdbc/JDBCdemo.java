package jdbc;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/user_db";
        String username="root";
        String password="root";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            //-------------------------------------------------------------------------

            //-------------------INSERT using executeUpdate------------------
            //int i = statement.executeUpdate("INSERT INTO user(user_id,user_name) VALUES (2,'PRADEEP')");
            //System.out.println(i);
            //----------------------INSERT using execute----------------------
            //boolean execute = statement.execute("INSERT INTO user(user_id,user_name) VALUES (3,'NIDHI')");
            //System.out.println(execute);

            //---------------------------------------------------------------------------

            //-----------------------VIEW-------------------------------------------------
            boolean execute = statement.execute("SELECT * FROM USER");
            ResultSet resultSet = statement.getResultSet();
            while(resultSet.next())
            {
                System.out.println("id: "+resultSet.getInt("user_id")+" "+"name: "+resultSet.getString("user_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //-------------------------------------------------------------------------------------------------------------
    }
}
