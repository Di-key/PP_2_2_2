package web.models;

import java.util.Objects;

public class Car {
    private String color;
    private String model;
    private int price;

    private int year;

    public Car() {
    }

    public Car(String model, String color, int price, int year) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.year = year;
    }



    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getPrice() == car.getPrice() && getYear() == car.getYear() &&
                getColor().equals(car.getColor()) && getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getModel(), getPrice(), getYear());
    }
}