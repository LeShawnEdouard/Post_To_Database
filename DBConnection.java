import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    // DB Connection variables

    static Connection connection = null;
    static String databaseName = "namedb";
    static String url = "jdbc:mysql://localhost:3306/" + databaseName;

    static String username = "root";
    static String password = "The1992vision";

    public static void main(String[] args) {
        // Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = null;
        Statement  state = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);

            System.out.println("Connecting to database...");
            state = conn.createStatement();
            String sql;
            sql = "SELECT User FROM namedb.user WHERE id=2";

            // Next steps below. Follow example from link Kelly provided
            // Execute query
            // Retrieve and print results
        }
        catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
         }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
         }finally{
            //finally block used to close resources
            try{
               if(stmt!=null)
                  state.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
               if(conn!=null)
                  conn.close();
            }catch(SQLException se){
               se.printStackTrace();
            }//end finally try
    }
    
}
