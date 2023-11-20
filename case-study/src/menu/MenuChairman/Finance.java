package menu.MenuChairman;

public class Finance {
    private double budget;
    private double income;
    private double expenses;
    private final double salaryBudget;
    private final double transferBudget;

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public double getSalaryBudget() {
        return salaryBudget;
    }

    public double getTransferBudget() {
        return transferBudget;
    }

    public Finance(){
        this.budget = 2000000;
        this.income = 0;
        this.expenses = 0;
        this.salaryBudget = budget * 0.5;
        this.transferBudget = budget * 0.5;
    }

    public void manageFinance(double expense){
        if(expense <= budget){
            budget -= expense;
            expenses += expense;
            System.out.println("Expense of " + expense + " Euro is approved. Remaining budget: " + budget + " Euro.");
        }
        else {
            System.out.println("Expense of " + expense + " Euro is not approved due to insufficient budget.");
        }
    }

    public void addIncome(double income){
        this.income += income;
        this.budget += income;
        System.out.println("Added income of " + income + " Euro. Current budget: " + budget + " Euro.");
    }

    public void financialReport(){
        System.out.println("Current budget: " + budget + " Euro");
        System.out.println("Total income: " + income + " Euro");
        System.out.println("Total expense: " + expenses + " Euro");
        System.out.println("Salary budget: " + salaryBudget + " Euro");
        System.out.println("Transfer budget: " + transferBudget + " Euro");
    }
}
