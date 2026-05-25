package com.example.ergastiria.lab11.askisi1;

import gr.ihu.iee.oop.lab.UserInput;

import java.util.Arrays;
import java.util.Objects;

public class Employee {
    private String name;
    private String birthDate;
    private int[] workingHours;
    private int[] overtimeHours;
    private double hourlyWage;
    private int childNumber;

    public Employee(String name, String birthDate, double hourlyWage, int childNumber, int[] workingHours, int[] overtimeHours) {
        this.name = name;

        try {
            if(hourlyWage < 0) throw new IllegalArgumentException();
            else this.hourlyWage = hourlyWage;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            do {
                System.out.println("Give new value: ");
                hourlyWage = UserInput.getInteger();
            } while(hourlyWage < 0);
            this.hourlyWage = hourlyWage;
        }

        this.workingHours = workingHours;
        this.overtimeHours = overtimeHours;

        setBirthDate(birthDate);

        try {
            setChildNumber(childNumber);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            do {
                System.out.println("Give new value: ");
                childNumber = UserInput.getInteger();
            } while(childNumber < 0);
            setChildNumber(childNumber);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", workingHours=" + Arrays.toString(workingHours) +
                ", overtimeHours=" + Arrays.toString(overtimeHours) +
                ", hourlyWage=" + hourlyWage +
                ", childNumber=" + childNumber +
                '}';
    }

    private double childBenefitFactor() {
        try {
            if(childNumber == 0) throw new ArithmeticException("Number of children is 0. Child Benefit Factor set to: 0.");
            return (100 - ((double) 50 /this.childNumber))/200d;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double computeMonthlyIncome(int month) {
        return ((this.workingHours[month - 1]+this.overtimeHours[month - 1]) * this.hourlyWage * (1+this.childBenefitFactor()));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Double.compare(getHourlyWage(), employee.getHourlyWage()) == 0 && getChildNumber() == employee.getChildNumber() && Objects.equals(getName(), employee.getName()) && Objects.equals(getBirthDate(), employee.getBirthDate()) && Objects.deepEquals(getWorkingHours(), employee.getWorkingHours()) && Objects.deepEquals(getOvertimeHours(), employee.getOvertimeHours());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        try {
            int day = Integer.parseInt(birthDate.substring(0, 2));
            if (day < 1 || day > 31)
                throw new InvalidBirthdateException(this.name + " birth date is wrong(" + birthDate + "). You have to set the birth date later.");
            int month = Integer.parseInt(birthDate.substring(3, 5));
            if (month < 1 || month > 12)
                throw new InvalidBirthdateException(this.name + " birth date is wrong(" + birthDate + "). You have to set the birth date later.");
            this.birthDate = birthDate;
        } catch (InvalidBirthdateException e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] getWorkingHours() {
        return workingHours;
    }

    public int getWorkingHours(int month) {
        return workingHours[month-1];
    }

    public void setWorkingHours(int month, int workingHours) throws ArrayIndexOutOfBoundsException {
        if(month < 1 || month > 12) throw new ArrayIndexOutOfBoundsException("Wrong month input, should be 1 to 12.");
        else {
            try {
                if(workingHours < 0) throw new IllegalArgumentException();
                else this.workingHours[month-1] = workingHours;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                do {
                    System.out.println("Give new value: ");
                    workingHours = UserInput.getInteger();
                } while(workingHours < 0);
                this.workingHours[month-1] = workingHours;
            }
        }
    }

    public int[] getOvertimeHours() {
        return overtimeHours;
    }

    public int getOvertimeHours(int month) {
        return overtimeHours[month-1];
    }

    public void setOvertimeHours(int month, int overtimeHours) {
        if(month < 1 || month > 12) throw new ArrayIndexOutOfBoundsException("Wrong month input, should be 1 to 12.");
        try {
            if (overtimeHours < 0 || overtimeHours > 80) throw new InvalidOvertimeHoursException("Overtime cannot be negative or exceed 80 hours. Overtime will be set to 0.");
            this.overtimeHours[month - 1] = overtimeHours;
        } catch (InvalidOvertimeHoursException e) {
            System.out.println(e.getMessage());
            this.overtimeHours[month - 1] = 0;
        }
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getChildNumber() {
        return childNumber;
    }

    public void setChildNumber(int childNumber) throws IllegalArgumentException {
        if(childNumber < 0) {
            throw new IllegalArgumentException("Children should be >= 0.");
        } else {
            this.childNumber = childNumber;
        }
    }
}
