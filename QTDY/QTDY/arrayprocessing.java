class InvalidIndexException extends Exception {
    InvalidIndexException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    InvalidNameException(String message) {
        super(message);
    }
}

public class arrayprocessing {

    // Overloaded method to process an integer array
    static void processArray(int[] values) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find maximum and minimum values in the array
        for (int value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        // Check for division by zero
        try {
            if (min == 0) {
                throw new ArithmeticException("Division by zero error");
            }
            double result = (double) max / min;
            System.out.println("Division of maximum and minimum value: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Overloaded method to process an array of strings (names)
    static void processArray(String[] values) {
        for (String value : values) {
            try {
                // Check if name contains a numeric value
                if (value.matches(".*\\d+.*")) {
                    throw new InvalidNameException("Invalid name contains a numeric value: " + value);
                }
                System.out.println("Processed name: " + value);
            } catch (InvalidNameException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = {10, 5, 0, 8, 3};

        String[] namesArray = {"John", "Alice", "Jack2Smith", "Mary", "Tom"};

        // Demonstrate overloading by calling both overloaded methods
        processArray(intArray);
        processArray(namesArray);
    }
}
