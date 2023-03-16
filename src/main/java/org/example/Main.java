package org.example;

public class Main
{
    public static void main( String[] args )
    {   CPU cpu1 = new CPU("Intel","core i7");
        CPU cpu2 = new CPU("AMD","AMD ryzen7");

        RAM ram1 = new RAM();
        ram1.setCapacity("128 GB");
        RAM ram2 = new RAM();
        ram2.setCapacity("256 GB");

        HDD hdd1 = new HDD("Seagate");
        hdd1.setCapacity("1 TB");
        HDD hdd2 =new HDD("Western");
        hdd2.setCapacity("2 TB");

        Computer com1 = new Computer();
        com1.setRam(ram1);
        com1.setCpu(cpu2);
        com1.setHdd(hdd2);

        Computer com2 = new Computer(ram2,cpu1,hdd1);
        Computer com3 = new Computer(ram2,cpu2,hdd2);

        System.out.println("Computer 1");
        System.out.println(com1);
        System.out.println("\nComputer 2");
        System.out.println(com2);
        System.out.println("\nComputer 3");
        System.out.println(com3);
    }
}
