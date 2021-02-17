import java.sql.*;
import java.sql.DriverManager;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DBConnection {

        // create - create customer
        public void createCustomer () {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter customer name: ");
                String customerName = scanner.nextLine();
                System.out.println(customerName);
                System.out.print("Enter city: ");
                String city = scanner.nextLine();
                System.out.println(city);

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO customers SET full_name = ?, city = ?")) {
                    statement.setString(1, customerName);
                    statement.setString(2, city);
                    int rows = statement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println("Error while communicating with the database");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }


       // read - show customer
        public void showCustomers() {

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


        // create - insert amount
        public void insertAmount () {

            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter amount: ");
                String amount = scanner.nextLine();
                System.out.println(amount);
                System.out.print("Enter date: ");
                String date = scanner.nextLine();
                System.out.println(date);

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO transaction SET amount = ?, date = ?")) {
                    statement.setString(1, amount);
                    statement.setString(2, date);
                    int rows = statement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println("Error while communicating with the database");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }


        // read - show amount
        public void showAmount() {

            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                PreparedStatement sql = con.prepareStatement("SELECT amount, date FROM transaction");

                Statement stmt = con.createStatement();
                String query = "SELECT amount, date FROM transaction";
                ResultSet rs = stmt.executeQuery(query);


                while (rs.next()) {
                    System.out.println("Amount: " + rs.getString("amount"));
                    System.out.println("Date: " +  rs.getString("date"));
                    System.out.println("----------");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }


        public void cannotShowAmountBelowZero() {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                PreparedStatement sql = con.prepareStatement("SELECT amount, CASE WHEN amount <= 0 THEN 'amount cannot be less than 0' END AS transaction FROM transaction");

                Statement stmt = con.createStatement();
                String query = "SELECT amount, CASE WHEN amount <= 0 THEN 'amount cannot be less than 0' END AS transaction FROM transaction";
                ResultSet rs = stmt.executeQuery(query);


                while (rs.next()) {
                    System.out.println("Amount: " + rs.getString("amount"));
                    System.out.println("Date: " +  rs.getString("date"));
                    System.out.println("----------");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

        public void runMySQL(){
            createCustomer(); // create - create customer
            showCustomers(); // read - show customers
            insertAmount(); // create - insert amount
            showAmount(); // read - show amount
            cannotShowAmountBelowZero(); // create - prevent payment from being below 0
        }
    }