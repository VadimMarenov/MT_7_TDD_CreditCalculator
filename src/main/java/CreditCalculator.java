public class CreditCalculator {
    public double getPaymentPerMonth(double creditValue, double creditRate, double creditTerm) {
        double creditRatePerMonth = creditRate / creditTerm / 100;
        double koef = (creditRatePerMonth * Math.pow(1 + creditRatePerMonth, creditTerm)) /
                (Math.pow(1 + creditRatePerMonth, creditTerm) - 1);
        double paimentPerMonth = creditValue * koef;
        return paimentPerMonth;
    }

    public double getFullCreditCost(double creditValue, double creditRate, double creditTerm) {
        return getPaymentPerMonth(creditValue, creditRate, creditTerm) * creditTerm;
    }

    public double getLoanRepayment(double creditValue, double creditRate, double creditTerm) {
        return getFullCreditCost(creditValue, creditRate, creditTerm) - creditValue;
    }

}