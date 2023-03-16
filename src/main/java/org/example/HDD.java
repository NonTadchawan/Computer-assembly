package org.example;

public class HDD {
    private String capacity;
    private String bran;

    public HDD(String bran) {
        this.bran = bran;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "capacity='" + capacity + '\'' +
                ", bran='" + bran + '\'' +
                '}';
    }
}
