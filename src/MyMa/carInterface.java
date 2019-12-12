package MyMa;

public interface carInterface {

    int hyundaiMinIncome = 100_000;
    int toyotaMinIncome = 80_000;
    int bmwMinIncome = 110_000;
    int documentationFees = 1_000;

    public String leaseMonthlyCalculator();

    boolean isAligable();

}
