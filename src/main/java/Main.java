import javax.security.auth.kerberos.KerberosCredMessage;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Kontrolpanel kontrolpanel;
    static Scanner scan = new Scanner(System.in);
    static int count =0;


    static DBConnection dbConnection;
    public static void main(String[] args) {
        kontrolpanel = new Kontrolpanel();
       dbConnection = new DBConnection();
        VisKontrolpanel();

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
                    case "3": // Show customer
                        dbConnection.insertAmount();
                        kontrolpanel.displayOptions();
                        break;
                    case "4": // Show customer
                        dbConnection.showAmount();
                        kontrolpanel.displayOptions();
                        break;
                    case "0":
                        finished = true;
                        break;
                }
            }
        }
}





