package org.example;

public class RAM {
    String capacity;

    public RAM() {
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "capacity='" + capacity + '\'' +
                '}';
    }
}
