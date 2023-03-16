package org.example;

public class CPU {
   private String bran;
   private String model;

    public CPU(String bran, String model) {
        this.bran = bran;
        this.model = model;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "bran='" + bran + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
