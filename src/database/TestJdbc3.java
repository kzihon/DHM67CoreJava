package database;
import java.sql.*;

public class TestJdbc3 {
    public static void main(String[] args) throws SQLException {
//step-1 Establish a connection from database
      //  String url="jdbc:mysql://localhost:3306/mysql";
        //after you create a database, comment the above url and use your created database(dhm67)instead of mysql now
        String url="jdbc:mysql://localhost:3306/dhm67";
        String user="root";
        String password="Ethiopia12";
       Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Con: "+con);
       // String query="insert into employee values(?,?,?,?)";
//        String query="create  procedure updateEmployee1(in id1 int, in name1 varchar(30))begin update employee set name=name1 where id=id1;end";
//        Statement pmt=con.createStatement();

//        String query="call updateEmployee1(?,?)";
//        CallableStatement csmt=con.prepareCall(query);
//        csmt.setInt(1,15);
//        csmt.setString(2,"Rem kum");
//        csmt.execute();
        String query="{call countemployeeid1(?)}";
        CallableStatement csmt= con.prepareCall(query);
      //  csmt.registerOutParameter(1,Types.NUMERIC);
        csmt.execute();
        int c=csmt.getInt(1);
        System.out.println("count : "+c);

//        String query="{call showEmployee()}";
//        CallableStatement csmt=con.prepareCall(query);
//        csmt.execute();
//        ResultSet rs=csmt.getResultSet();
//        while (rs.next()){
//            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
//        }

    }
}
