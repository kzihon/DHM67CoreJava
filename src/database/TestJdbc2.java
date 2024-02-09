package database;
import java.sql.*;

public class TestJdbc2 {
    public static void main(String[] args) throws SQLException {
//step-1 Establish a connection from database
      //  String url="jdbc:mysql://localhost:3306/mysql";
        //after you create a database, comment the above url and use your created database(dhm67)instead of mysql now
        String url="jdbc:mysql://localhost:3306/dhm67";
        String user="root";
        String password="Ethiopia12";
       Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Con: "+con);

       //String query="insert into employee values(?,?,?,?)";//pmt.setInt(1,26); here 1 is for the 1st question mark
      //  String query="update employee set name=? where id=?";
        String query="select id, name from employee where id=?";
       PreparedStatement pmt=con.prepareStatement(query);
pmt.setInt(1,26);
//      pmt.setString(1,"Ramish");
//     pmt.setInt(2,30);
//       pmt.setInt(3,23);
//       pmt.setFloat(4,12000.5f);
    pmt.execute();
//
//        pmt.setInt(1,21);
//        pmt.setString(2,"Kidist");
//        pmt.setInt(3,23);
//        pmt.setFloat(4,12000.5f);
//        pmt.execute();
      // ResultSet rs =    stmt.executeQuery(query);//loading statment
        ResultSet rs=pmt.getResultSet();
        ResultSetMetaData rsmd=rs.getMetaData();
        int ccount=rsmd.getColumnCount();
        for(int i=1;i<=ccount;i++){
            System.out.print(rsmd.getColumnName(i)+"\t");
        }
        System.out.println();
        //    ResultSet rs = stmt.getResultSet();
        while (rs.next()){
            for (int i = 1; i <= ccount; i++) {
                System.out.print(rs.getString(i)+"\t");
            }
            System.out.println();
//            System.out.print(rs.getString(1)+"\t");
//            System.out.println(rs.getString(2));

        }
    }
}
