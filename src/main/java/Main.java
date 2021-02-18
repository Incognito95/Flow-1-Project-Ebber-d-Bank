import javax.security.auth.kerberos.KerberosCredMessage;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Kontrolpanel kontrolpanel;
    static Scanner scan = new Scanner(System.in);
    static int count =0;
    static Customer HH = new Customer("HH");
    Customer Ermin = new Customer("Ermin");
   static Account account1 = new Account(HH);
    Account account2 = new Account(Ermin);


    static DBConnection dbConnection;
    public static void main(String[] args) {
        kontrolpanel = new Kontrolpanel();
       dbConnection = new DBConnection();
        Employee employee = new Employee();
        employee.transferMoney();
        VisKontrolpanel();

        account1.depositAmount(200);
        System.out.println(account1.getBalance());
        System.out.println(account1.getTransactions());
    }
        public static void VisKontrolpanel() {
            kontrolpanel.displayOptions();

            boolean finished = false;
            while (!finished) {

                String choice = scan.nextLine();

                switch (choice) {
                    case "1": // create customer
                        dbConnection.createCustomer();
                        kontrolpanel.displayOptions();
                        break;
                    case "2": // Show customer
                        dbConnection.showCustomers();
                        kontrolpanel.displayOptions();
                        break;
                    case "3": // Insert amount
                        Scanner scanner = new Scanner(System.in);
                        System.out.print("Enter amount: ");
                        String amount = scanner.nextLine();
                        System.out.println(amount);

                        dbConnection.insertAmount(Integer.parseInt(amount));  // Indsæt i DB
                        account1.depositAmount(Integer.parseInt(amount));   // INdsæt i Java arrayliste

                        kontrolpanel.displayOptions();
                        break;
                    case "4": // Show customer
                        dbConnection.showAmount();
                        kontrolpanel.displayOptions();
                        dbConnection.amountCannotBeLessThanZero();
                        break;
                    case "5": // Show customer
                        dbConnection.createEmployee();
                        kontrolpanel.displayOptions();
                        break;
                    case "6": // Show customer
                        dbConnection.showEmployee();
                        kontrolpanel.displayOptions();
                        break;
                    case "0":
                        finished = true;
                        break;
                }
            }
        }
}





