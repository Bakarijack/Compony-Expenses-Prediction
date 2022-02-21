package com.example.prediction;

import java.text.DecimalFormat;

public class DataRecord {
    private int year;
    private int employees;
    private Double totalSalary;
    private Double totalExpenditure;

    public DataRecord(){}
    
    public DataRecord(int year,int employees,Double totalSalary, Double totalExpenditure){
        this.year = year;
        this.employees = employees;
        this.totalSalary = totalSalary;
        this.totalExpenditure = totalExpenditure;
    }

    DecimalFormat formatter = new DecimalFormat();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public String getTotalSalary() {
        return formatter.format(totalSalary);
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getTotalExpenditure() {
        return formatter.format(totalExpenditure);
    }

    public void setTotalExpenditure(Double totalExpenditure) {
        this.totalExpenditure = totalExpenditure;
    }
}
