package com.example.exetastikes.earino.ergastirio.tekto2025.aOmada;

import gr.ihu.iee.oop.lab.UserInput;

import java.util.Arrays;

public class WebProject extends FinancialOffer {
    private String customerName;
    private String projectName;
    private double budget;
    private float totalDuration;
    private int developerCount;
    private WebComponent[] webComponents;

    public WebProject(String customerName, double budget, String projectName, float totalDuration, int developerCount, WebComponent[] webComponents) {
        super(customerName, budget);
        this.customerName = customerName;
        this.projectName = projectName;
        this.budget = budget;
        this.totalDuration = totalDuration;
        this.developerCount = developerCount;
        this.webComponents = webComponents;
    }

    public void addWebComponent(int componentType, int pos) throws InvalidComponentTypeException {
        if(componentType != 1 && componentType != 2 && componentType != 3)
            throw new InvalidComponentTypeException("Invalid Component Type, give 1 or 2 or 3.");
        else {
            WebComponent comp = new WebComponent();
            comp.setComponentType(componentType);

            System.out.println("Give component duration: ");
            int duration = UserInput.getInteger();
            comp.setDuration(duration);

            System.out.println("Give how many developers are neeeded for this component: ");
            int devs = UserInput.getInteger();

            this.developerCount += devs;
            this.totalDuration += duration;
            this.webComponents[pos] = comp;
        }
    }

    @Override
    public String toString() {
        return "WebProject{" +
                "customerName='" + customerName + '\'' +
                ", projectName='" + projectName + '\'' +
                ", budget=" + budget +
                ", totalDuration=" + totalDuration +
                ", developerCount=" + developerCount +
                ", webComponents=" + Arrays.toString(webComponents) +
                '}';
    }
}
