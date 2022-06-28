import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCreditCalculator {
    private final double creditValue = 100000;  //rubbles
    private final double creditRate = 13;   //%
    private final double creditTerm = 12; //months

    CreditCalculator sut = new CreditCalculator();

    @Test
    void getPaymentPerMonthTest() {
        double expected = 8931.727571174955;
        double actual = sut.getPaymentPerMonth(creditValue, creditRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getFullCreditCostTest() {
        double expected = 107180.73085409947;
        double actual = sut.getFullCreditCost(creditValue, creditRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLoanRepaymentTest() {
        double expected = 7180.730854099471;
        double actual = sut.getLoanRepayment(creditValue, creditRate, creditTerm);
        Assertions.assertEquals(expected, actual);
    }


}
