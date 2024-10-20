package prog1;

/**
 *
 * @author Prajwal Bagewadi
 * 
 * Q2. Write a JDBC program to insert the records into the table Employee (ID, name,
salary) using PreparedStatement interface. Accept details of Employees from user. [20 
Marks
 * 
 * 
 */
import java.lang.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Prog1Main {
    public static void main(String[] args)throws ClassNotFoundException,SQLException{
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","123");
        Statement st=con.createStatement();
        //st.executeQuery("create table emp(id int,name varchar(20),salary real)");
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EMP ID:");
        int id=sc.nextInt();
        System.out.println("Enter EMP NAME:");
        String name =sc.next();
        System.out.println("Enter EMP SALARY:");
        double sal=sc.nextDouble();
        String q1="insert into emp(id,name,salary) values(?,?,?)";
        PreparedStatement pstm=con.prepareStatement(q1);
        pstm.setInt(1,id);
        pstm.setString(2,name);
        pstm.setDouble(3,sal);
        pstm.executeUpdate();
        System.out.println("query execution successful");
        
        ResultSet rs=st.executeQuery("select * from emp");
        while(rs.next()){
            System.out.println("id="+rs.getInt("id")+"\t"+"name="+rs.getString("name")+"\t"+"salary="+rs.getDouble("salary"));
        }
       // System.out.println("rs="+rs);
       pstm.close();
       st.close();
       rs.close();
       con.close();
    }
}
