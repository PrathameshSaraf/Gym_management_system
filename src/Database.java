import java.sql.*;
public class Database {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Hari@2003");
            Statement st = con.createStatement();
            String sql = "insert into stu values ('5','xyz')";

            st.executeUpdate(sql);
            ResultSet r = st.executeQuery("select * from stu");

            while (r.next())
            {
                System.out.println(r.getString(1)+ " : " + r.getString(2));
            }
            con.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
