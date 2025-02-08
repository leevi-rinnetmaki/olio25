package assignment4_2;

class Calculator {
    private int total;

    // Constructor initializes total to zero
    public Calculator() {
        this.total = 0;
    }

    // Method to reset the calculator
    public void reset() {
        this.total = 0;
    }

    // Method to add a positive integer to the calculator
    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed.");
        }
        this.total += number;
    }

    // Method to get the current value
    public int getTotal() {
        return this.total;
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            calculator.add(10);
            calculator.add(20);
            calculator.add(5);
            System.out.println("Total: " + calculator.getTotal()); // Should print 35

            // Uncomment the next line to test exception
            // calculator.add(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
