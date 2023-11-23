// Custom exception for invalid age
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

// Driver class
class Driver {
    private int id;
    private String name;
    private static int totalDrivers = 0;

    // Default constructor
    Driver() {
        totalDrivers++;
    }

    // Parameterized constructor
    Driver(int id, String name) {
        this.id = id;
        this.name = name;
        totalDrivers++;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Method to print driver details
    public void printDetails() {
        System.out.println("Driver ID: " + id);
        System.out.println("Driver Name: " + name);
    }

    // Method to get total number of drivers registered
    public static int getTotalDrivers() {
        return totalDrivers;
    }
}

// CabDriver class derived from Driver
class CabDriver extends Driver {
    private int age;
    private String vehicleNumber;
    private String address;

    // Default constructor
    CabDriver() {
        super();
    }

    // Parameterized constructor
    CabDriver(int id, String name, int age, String vehicleNumber, String address) throws InvalidAgeException {
        super(id, name);
        if (age < 21) {
            throw new InvalidAgeException("Age should be 21 or above.");
        }
        this.age = age;
        this.vehicleNumber = vehicleNumber;
        this.address = address;
    }

    // Method to print driver details including age, vehicle number, and address
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Driver Age: " + age);
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Address: " + address);
    }
}

public class DriverRegistrationApp {
    public static void main(String[] args) {
        try {
            // Creating a CabDriver object
            CabDriver cabDriver = new CabDriver(101, "John Doe", 25, "ABC1234", "123 Main St");

            // Display driver details
            cabDriver.printDetails();

            // Creating another CabDriver object
            CabDriver anotherDriver = new CabDriver(102, "Alice Smith", 19, "XYZ5678", "456 Elm St");

            // Displaying details of anotherDriver (Exception should be thrown here)
            anotherDriver.printDetails();
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        }

        // Get total number of registered drivers
        System.out.println("Total Drivers Registered: " + Driver.getTotalDrivers());
    }
}
