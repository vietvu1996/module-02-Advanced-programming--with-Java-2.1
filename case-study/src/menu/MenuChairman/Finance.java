package menu.MenuChairman;

public class Finance{
    private double budget;
    private double income;
    private double expenses;
    private double salaryBudget;
    private double transferBudget;
    public Finance(){
    }

    public Finance(double budget, double income, double expenses, double salaryBudget, double transferBudget) {
        this.budget = budget;
        this.income = income;
        this.expenses = expenses;
        this.salaryBudget = budget * 0.5;
        this.transferBudget = budget * 0.5;
    }

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


    public void paySalary(double salary){
        if(salary <= salaryBudget){
            this.salaryBudget -= salary;
            this.expenses += salary;
            System.out.println("Salary " + salary + " Euro of player is paid. Remaining salary budget: " + salaryBudget + " Euro.");
        }
        else {
            System.out.println("Salary " + salary + " Euro of player cannot paid. ");
        }
    }

    public void addIncome(double income){
        this.income += income;
        this.budget += income;
        System.out.println("Added income of " + income + " Euro. Current budget: " + budget + " Euro.");
    }

    public void addTransferBudget(double salary){
        if(salary <= budget){
            this.transferBudget -= salary;
            this.expenses += salary;
            System.out.println("Added player with price " + salary + " Euro. Current budget: " + budget + " Euro.");
        }
        else {
            System.out.println("Price " + salary + " Euro of player is not available to buy");
        }
    }
}
