package com.codestates.seb.electricityBill.V2;

import java.util.Scanner;

public class ElectricityBill {
    //TODO:
    // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)
    // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)

    // 입력을 위한 스캐너 생성
    private Scanner sc = new Scanner(System.in);
    // 단위별 사용량에 대한 요금을 변수에 할당
    public static double wh100 = 60.7;
    public static double wh200 = 125.9;
    public static double wh300 = 280.6;
    public static double wh400 = 417.7;
    public static double wh500 = 670.6;

    // 시작 안내 메세지 출력 메서드
    public void printStartMessage(){
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));
    }
    // 사용량을 입력받는 메서드
    public double inputUseWh(){
        System.out.println("전력 사용량을 입력하세요");
        return Double.parseDouble(sc.nextLine());
    }
    // 종료 안내 메세지 출력 메서드
    public void printFinishMessage(double price){
        System.out.printf("전기 요금은 %.0f원 입니다.",price);
    }
    // 사용량에 따라 전기 요금을 계산하는 메서드
    public double calculatePrice (double wh) {
        if (wh < 100) {
            return wh * ElectricityBill.wh100;
        } else if (100 < wh && wh < 200) {
            return 100 * ElectricityBill.wh100 + (wh - 100) * ElectricityBill.wh200;
        } else if (200 < wh && wh < 300) {
            return 100 * ElectricityBill.wh100 + 100 * ElectricityBill.wh200 + (wh - 200) * ElectricityBill.wh300;
        } else if (300 < wh && wh < 400) {
            return 100 * ElectricityBill.wh100 + 100 * ElectricityBill.wh200 + 100 * ElectricityBill.wh300 + (wh - 300) * ElectricityBill.wh400;
        } else if (400 < wh && wh < 500) {
            return 100 * ElectricityBill.wh100 + 100 * ElectricityBill.wh200 + 100 * ElectricityBill.wh300 + 100 * ElectricityBill.wh400 + (wh - 400) * ElectricityBill.wh500;
        } else {
            return 100 * ElectricityBill.wh100 + 100 * ElectricityBill.wh200 + 100 * ElectricityBill.wh300 + 100 * ElectricityBill.wh400 + 100 * ElectricityBill.wh500 + (wh - 500) * ElectricityBill.wh500;
        }
    }
}
