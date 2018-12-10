package com.sheygam.masa_2018_g1_10_12_18_part2;

public class Address {
    private String city;
    private int houseNumber;

    public Address() {
    }

    public Address(String city, int houseNumber) {
        this.city = city;
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
