package database;
import java.sql.*;
public class TestJdbc1 {
    public static void main(String[] args) throws SQLException {
//step-1 Establish a connection from database
      //  String url="jdbc:mysql://localhost:3306/mysql";
        //after you create a database, comment the above url and use your created database(dhm67)instead of mysql now
        String url="jdbc:mysql://localhost:3306/dhm67";
        String user="root";
        String password="Ethiopia12";
       Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Con: "+con);
       // String query="show databases";
       // String query="create database dhm67";
       // String query="create table employee(id int primary key ,name varchar(30), age int,salary float)";
      //  String query="insert into employee values (15,'kki',60,190000)";
       // String query="update employee set name='Remish ku' where id=23";
       // String query="delete from employee where id=23";
        String query="select name, id from employee";
        Statement stmt=con.createStatement();
        con.setAutoCommit(false);
        try {


            System.out.println("Stmt: " + stmt);
            stmt.execute("insert into employee values (9,'DEF',56,79000.0)");
            System.out.println("done 1st");
            stmt.execute("update employee set name='Rmmlllllmm' where id=15");
            //stmt.execute(query);
            // stmt.executeUpdate(query);//id quenries are gonna modify the table or database use ececuteUpdate method instead of ececute
            //inernal metadata/ hpw many colums and rows are their?
//            ResultSet rs = stmt.executeQuery(query);//loading statment
//            ResultSetMetaData rsmd = rs.getMetaData();
//            int ccount = rsmd.getColumnCount();
//            for (int i = 1; i <= ccount; i++) {
//                System.out.print(rsmd.getColumnName(i) + "\t");
//            }
//            System.out.println();
//            //    ResultSet rs = stmt.getResultSet();
//            while (rs.next()) {
//                for (int i = 1; i <= ccount; i++) {
//                    System.out.print(rs.getString(i) + "\t");
//                }
//                System.out.println();
//            System.out.print(rs.getString(1)+"\t");
//            System.out.println(rs.getString(2));

           // }
            con.commit();
        }catch (SQLException e){
            e.printStackTrace();

        }
    }
}
