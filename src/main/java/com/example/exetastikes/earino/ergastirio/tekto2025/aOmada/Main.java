package com.example.exetastikes.earino.ergastirio.tekto2025.aOmada;

import gr.ihu.iee.oop.lab.UserInput;

public class Main {
    public static void main(String[] args) throws InvalidComponentTypeException {
        System.out.println("Give customer name: ");
        String customerName = UserInput.getString();
        System.out.println("Give project name: ");
        String projectName = UserInput.getString();
        System.out.println("Give budget: ");
        double budget = UserInput.getDouble();
        System.out.println("Give total duration: ");
        float totalDuration = UserInput.getFloat();
        System.out.println("Give developer count: ");
        int developerCount = UserInput.getInteger();
        WebComponent[] components = new WebComponent[2];

        WebProject project = new WebProject(customerName, budget, projectName, totalDuration, developerCount, components);

        for (int i = 0; i < components.length; i++) {
            System.out.println("Give position: ");
            int pos = UserInput.getInteger();

            System.out.println("Give component type: ");
            int componentType = UserInput.getInteger();

            try {
                project.addWebComponent(componentType, pos);
            } catch (InvalidComponentTypeException e) {
                System.out.println(e.getMessage());

                do {
                    System.out.println("Give correct component type: ");
                    componentType = UserInput.getInteger();
                } while (componentType != 1 && componentType != 2 && componentType != 3);

                project.addWebComponent(componentType, pos);
            }
        }

        System.out.println(project.toString());
    }
}
