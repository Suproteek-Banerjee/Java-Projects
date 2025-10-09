
public class Payroll {
    private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
    private int[] hours = new int[7];
    private double[] payRate = new double[7];
    private double[] wages = new double[7];

    public int[] getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int[] employeeId) {
        this.employeeId = employeeId;
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(int[] hours) {
        this.hours = hours;
    }

    public double[] getPayRate() {
        return payRate;
    }

    public void setPayRate(double[] payRate) {
        this.payRate = payRate;
    }

    public double[] getWages() {
        return wages;
    }

    public void setWages(double[] wages) {
        this.wages = wages;
    }

    public double getGrossPay(int employeeId) {
        for (int i = 0; i < this.employeeId.length; i++) {
            if (this.employeeId[i] == employeeId) {
                wages[i] = hours[i] * payRate[i];
                return wages[i];
            }
        }
        return -1; // Employee not found
    }
}
