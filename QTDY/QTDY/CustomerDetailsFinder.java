import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CustomerDetailsFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name to search: ");
        String searchName = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader("CustomerDetails.txt"))) {
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] customerDetails = line.split(",");

                if (customerDetails.length >= 3 && customerDetails[0].equalsIgnoreCase(searchName.trim())) {
                    found = true;
                    String name = customerDetails[0];
                    String address = customerDetails[1];
                    String phoneNumber = customerDetails[2];

                    System.out.println("Customer Name: " + name);
                    System.out.println("Address: " + address);
                    System.out.println("Phone Number: " + phoneNumber);
                    break; // Stop searching after finding the customer
                }
            }

            if (!found) {
                System.out.println("Customer not found with the provided name.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
