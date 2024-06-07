package com.codestates.seb.electricityBill.V2;
public class Main {
    public static void main(String[] args) {
        ElectricityBill test = new ElectricityBill();
        test.printStartMessage();
        double useWh = test.inputUseWh();
        double price = Math.floor(test.calculatePrice(useWh));
        test.printFinishMessage(price);
    }
}
