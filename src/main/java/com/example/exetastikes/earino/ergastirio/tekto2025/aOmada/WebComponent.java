package com.example.exetastikes.earino.ergastirio.tekto2025.aOmada;

public class WebComponent implements IModule {
    private int componentType;
    private float duration;

    public WebComponent(int componentType, float duration) {
        this.componentType = componentType;
        this.duration = duration;
    }

    public WebComponent() {
    }

    @Override
    public float getTaskCost() {
        float cost = 0;

        switch (componentType) {
            case 1:
                cost = 10_000f;
                break;
            case 2:
                cost = 15_000f;
                break;
            case 3:
                cost = 20_000f;
                break;
        }

        return cost;
    }

    public int getComponentType() {
        return componentType;
    }

    public void setComponentType(int componentType) throws InvalidComponentTypeException {
//        if(componentType != 1 && componentType != 2 && componentType != 3)
//            throw new InvalidComponentTypeException("Invalid Component Type, give 1 or 2 or 3.");
//
//        do {
//            System.out.println("Give correct component type: ");
//            componentType = UserInput.getInteger();
//        } while (componentType != 1 && componentType != 2 && componentType != 3);
        this.componentType = componentType;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }
}
