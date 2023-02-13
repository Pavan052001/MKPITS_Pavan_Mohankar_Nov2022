import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Static_querySQL {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded succesfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_info", "root", "pavan");
            System.out.println("database connected succesfully");

            Statement st = con.createStatement();
            int r=st.executeUpdate("INSERT INTO emp_table values (8,'akash','mankar')");
            int e=st.executeUpdate("update emp_table set user_name='Shubhan',user_pass='katre' where id=4");
            int t=st.executeUpdate("delete from emp_table where id='8' ");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
