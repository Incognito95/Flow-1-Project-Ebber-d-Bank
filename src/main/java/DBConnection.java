import java.sql.*;
import java.sql.DriverManager;

public class DBConnection {
        public void showBankAccount() {
                    try {

                        Class.forName("com.mysql.jdbc.Driver");

                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                        PreparedStatement createOrder = con.prepareStatement("SELECT customer_id, full_name, city FROM customers");

                        Statement stmt = con.createStatement();
                        String query = "SELECT customer_id, full_name, city FROM customers";
                        ResultSet rs = stmt.executeQuery(query);


                        while (rs.next()) {
                            System.out.println("Customer id: " + rs.getInt("customer_id"));
                            System.out.println("Name: " + rs.getString("full_name"));
                            System.out.println("City: " +  rs.getString("city"));
                            System.out.println("----------");
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
        }
    }