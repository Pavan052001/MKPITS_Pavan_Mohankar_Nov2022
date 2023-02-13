import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Switch_case_Dynamic_dataSQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded succesfully");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_info", "root", "pavan");
            System.out.println("database connected succesfully");

            Statement st = con.createStatement();
            Scanner sc=new Scanner(System.in);
            System.out.println("press 1 for insert");
            System.out.println("press 2 for update");
            System.out.println("press 3 for delete");
            System.out.println("Enter your choice");
            int choice= sc.nextInt();
            switch(choice){
                case 1:
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("enter id");
                    int id1= sc.nextInt();
                    System.out.println("Enter user_name");
                    String user_name= sc.next();
                    System.out.println("enter user_pass");
                    String user_pass= sc.next();
                    int r=st.executeUpdate("insert into emp_table values ("+id1+",'"+user_name+"','"+user_pass+"')");
                    break;
                case 2:
                    Scanner sc2=new Scanner(System.in);
                    System.out.println("enter id");
                    int id= sc.nextInt();
                    System.out.println("Enter user_name");
                    String user_name2= sc.next();
                    System.out.println("enter user_pass");
                    String user_pass3= sc.next();
                    int r1=st.executeUpdate("update emp_table set user_name='"+user_name2+"',user_pass='"+user_pass3+"' where id="+id+"");
                    break;
                case 3:
                    System.out.println("Enter the id");
                    Scanner sc3= new Scanner(System.in);
                    int id3= sc3.nextInt();
                    int r4=st.executeUpdate("delete from emp_table where id='"+id3+"' ");




                default:


            }


        }
        catch (Exception pp){
            System.out.println(pp);
        }

    }
}
