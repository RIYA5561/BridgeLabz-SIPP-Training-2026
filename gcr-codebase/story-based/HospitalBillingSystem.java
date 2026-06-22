
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {

    
    public static void makePayment(double billAmount, double paidAmount)
            throws InsufficientFundsException {

        if (paidAmount < billAmount) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient funds. Need ₹"
                            + (billAmount - paidAmount) + " more.");
        }

        System.out.println("Payment Successful!");
    }

    public static void main(String[] args) {

        
        String[] patients = {"Riya", "Aman", "Priya"};

        
        try {
            int totalBill = 5000;
            int items = 0;

            double costPerItem = totalBill / items;

            System.out.println("Cost Per Item: " + costPerItem);

        } catch (ArithmeticException e) {
            System.out.println(
                    "Billing Error: Number of bill items cannot be zero.");
        }

       
        try {
            int patientIndex = 5;

            System.out.println("Patient: " + patients[patientIndex]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                    "Patient Error: Invalid patient index entered.");
        }

  
        try {
            String input = "ABC";

            int amount = Integer.parseInt(input);

            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println(
                    "Input Error: Please enter a valid numeric value.");
        }

    
        try {
            makePayment(5000, 3000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hospital Billing System Running Safely.");
    }
}
