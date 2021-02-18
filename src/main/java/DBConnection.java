
import java.sql.*;
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

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO customers SET name = ?, city = ?")) {
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
        public void insertAmount (int amount) {

            try {


                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO account SET account_id = ?, date = ?")) {
                    statement.setInt(1, amount);
                    statement.setDate(2, (Date) new java.util.Date());
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

                // amount cannot be less than 0
                if (query == null) {
                    System.out.println("amount cannot be less than 0");
                }

                while (rs.next()) {
                    System.out.println("Amount: " + rs.getString("amount"));
                    System.out.println("Date: " +  rs.getString("date"));
                    System.out.println("----------");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }


        public void transferAmount() {
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

        public void createEmployee() {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.println(name);
                System.out.print("Enter amount: ");
                String amount = scanner.nextLine();
                System.out.println(amount);

                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                     PreparedStatement statement = connection.prepareStatement("INSERT INTO employee SET name = ?, amount = ?")) {
                    statement.setString(1, name);
                    statement.setString(2, amount);
                    int rows = statement.executeUpdate();
                } catch (SQLException ex) {
                    System.out.println("Error while communicating with the database");
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }


    public void showEmployee() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
            PreparedStatement sql = con.prepareStatement("SELECT employee_id, name, amount FROM employee");

            Statement stmt = con.createStatement();
            String query = "SELECT employee_id, name, amount FROM employee";
            ResultSet rs = stmt.executeQuery(query);


            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getString("employee_id"));
                System.out.println("Name: " +  rs.getString("name"));
                System.out.println("amount: " +  rs.getString("amount"));
                System.out.println("----------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }





        public void amountCannotBeLessThanZero() {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/edderodbank", "root", "root");
                PreparedStatement sql = con.prepareStatement("SELECT amount FROM transaction WHERE amount <= 0");

                Statement stmt = con.createStatement();
                String query = "SELECT amount FROM transaction WHERE amount <= 0";
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
            insertAmount(100); // create - insert amount
            showAmount(); // read - show amount
            transferAmount(); // transfer amount from one
            amountCannotBeLessThanZero(); // amount cannot be less than 0
            createEmployee(); // create - create employee
            showEmployee(); // read - show employee

        }
    }