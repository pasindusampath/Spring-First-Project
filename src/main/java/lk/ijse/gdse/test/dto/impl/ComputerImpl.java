package lk.ijse.gdse.test.dto.impl;

import lk.ijse.gdse.test.dto.Computer;

public class ComputerImpl implements Computer {
    private double price;
    private String brand;

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getBrandName() {
        return brand;
    }
}
