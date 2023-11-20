package menu.MenuChairman;

import entity.Player;

public class FinancialManagement implements FinancialOperations{
    private final Finance finance;

    public FinancialManagement() {
        this.finance = new Finance();
    }

    @Override
    public void manageFinance(double expense) {
        finance.manageFinance(expense);
    }

    @Override
    public void addIncome(double income) {
        finance.addIncome(income);
    }

    @Override
    public void financialReport() {
        finance.financialReport();
    }
}
