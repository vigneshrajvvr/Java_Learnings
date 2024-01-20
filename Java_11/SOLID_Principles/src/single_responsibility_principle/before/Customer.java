package single_responsibility_principle.before;

public class Customer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // This is a Responsibility
    public void storeCustomer(String customerName) {
        // Store customer data into database
    }

    // This is another Responsibility
    public void generateCustomerReport(String customerName) {
        // Generate a report
    }
}
