package menu.MenuChairman;

import service.ChangeandUpdate.Observer;

public class FinanceSingleton {
    private final Finance finance;
    private static FinanceSingleton instance;

    private FinanceSingleton() {
        this.finance = FinancialManagement.getInstance().getFinance();
    }

    public static FinanceSingleton getInstance() {
        if (instance == null) {
            instance = new FinanceSingleton();
        }
        return instance;
    }

    public Finance getFinance() {
        return finance;
    }
}
