package org.example;

public class Computer {
    RAM ram;
    CPU cpu;
    HDD hdd;

    public Computer(RAM ram, CPU cpu, HDD hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    public Computer() {
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", cpu=" + cpu +
                ", hdd=" + hdd +
                '}';
    }
}
