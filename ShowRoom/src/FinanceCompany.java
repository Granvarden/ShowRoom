public class FinanceCompany {
    private String name;

    // Constructor Method
    public FinanceCompany(String name) {
        this.name = name;
    }
    
    // Plan buy car
    public double plan_A(double loanAmount) {
        double interestRate = 0.07; // rate 7% 
        int loanTerm = 3; // Or 36 months loan term
        double totalInterest = (loanAmount * interestRate) * loanTerm;
        double totalPayment = loanAmount + totalInterest;
        // double payPerMonth = totalPayment / (loanTerm * 12);

        return totalPayment;
    }
    public double plan_B(double loanAmount, int loanTerm) {
        if (loanTerm < 5) {
            loanTerm = 5; // minimum loan term 5 years or 60 months
        }
        double interestRate = 0.045; // rate 4.5% 
        double totalInterest = (loanAmount * interestRate) * loanTerm;
        double totalPayment = loanAmount + totalInterest;
        // double payPerMonth = totalPayment / (loanTerm * 12);

        return totalPayment;
    }
}
