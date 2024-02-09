package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        EmployeeRepo repo= new EmployeeRepo();
        Connection con =repo.getAConnection();

        String query="create table employee(id int primary key ,name varchar(30), age int,gender char(1)";
        PreparedStatement pmt=con.prepareStatement(query);
        pmt.execute();
    }
}
