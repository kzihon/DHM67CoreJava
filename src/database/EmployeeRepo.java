package database;

import java.sql.*;

public class EmployeeRepo {

    public Connection getAConnection() throws SQLException {
        String url="jdbc:mysql://localhost:3306/dhm67";
        String user="root";
        String password="Ethiopia12";
        Connection con= DriverManager.getConnection(url,user,password);
        System.out.println("Con: "+con);

//        String query1="show databases";
//        String query2="create database dhm67";
//        String query3="create table employee(id int primary key ,name varchar(30), age int,gender char(1)";
//        String query4="insert into employee values (15,'Jack',60,'F')";
        return con;
    }
    public  void creatEmployee(Connection con, int id, String name, int age, char gender) throws SQLException {

        String g=gender+"";

        Employee employee= new Employee(id,name,age,gender);
        String query="insert into employee values(?,?,?,?)";
        PreparedStatement pmt=con.prepareStatement(query);
        pmt.setInt(1,id);
        pmt.setString(2,name);
        pmt.setInt(3,age);
        pmt.setString(4,g);
        pmt.execute();
    }
    public void updateEmployee(Connection con,int id, Employee employee) throws SQLException {

        String name=employee.getName();
        int age=employee.getAge();
        String query="update employee set name=?, age =? where id=?";
        PreparedStatement pmt=con.prepareStatement(query);

        pmt.setString(1,name);
        pmt.setInt(3,age);
        pmt.setInt(1,id);
        pmt.execute();
    }
    public Employee getEmployee(Connection con,int id) throws SQLException {

        String query = "select id, name, age, gender from employee where id=?";
        PreparedStatement pmt = con.prepareStatement(query);
        pmt.setInt(1, 1);


        ResultSet rs = pmt.getResultSet();
        ResultSetMetaData rsmd = rs.getMetaData();

        int ccount = rsmd.getColumnCount();
        for (int i = 1; i <= ccount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();
        int id1=rs.getInt("id");
        String name=rs.getString("name");
        int age=rs.getInt("age");
        String gender=rs.getString("gender");
        Employee employee=new Employee(id1,name,age,gender.charAt(0));

        while (rs.next()) {
            for (int i = 1; i <= ccount; i++) {
                System.out.print(rs.getString(i) + "\t");
            }
            System.out.println();
        }
        return employee;
    }

    public void deleteEmployee(Connection con,int id) throws SQLException {

        String query="delete from employee where id=?";
        PreparedStatement pmt = con.prepareStatement(query);
        pmt.setInt(1, 1);
        pmt.execute();

    }

}
