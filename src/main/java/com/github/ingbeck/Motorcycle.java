package com.github.ingbeck;

public class Motorcycle extends Vehicle{
    private String type;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
