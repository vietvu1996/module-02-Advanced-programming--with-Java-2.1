package menu.MenuChairman;

import constant.Constants;
import service.GSON.FileHandler;
import service.GSON.JsonFileHandler;

public class Finance {
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
        this.salaryBudget = salaryBudget;
        this.transferBudget = transferBudget;
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

    public static void main(String[] args) {
        Finance finance = new Finance();

    }
}
