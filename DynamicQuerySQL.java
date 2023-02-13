import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;



public class DynamicQuerySQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded succesfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_info", "root", "pavan");
            System.out.println("database connected succesfully");

            Statement st = con.createStatement();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id");
            int id= sc.nextInt();
            System.out.println("Enter user_name");
            String user_name = sc.next();
            System.out.println("Enter user_pass");
            String user_pass= sc.next();

            int r=st.executeUpdate("insert into emp_table values ("+id+",'"+user_name+"','"+user_pass+"')");
            int pp=st.executeUpdate("update emp_table set user_name='Shubhan',user_pass='katre' where id=5");
            int rr=st.executeUpdate("delete from emp_table where id='5' ");
        }
        catch(Exception  y) {
            System.out.println(y);

        }

    }
}
