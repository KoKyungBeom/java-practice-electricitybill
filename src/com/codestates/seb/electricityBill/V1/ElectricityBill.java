package com.codestates.seb.electricityBill.V1;

import java.util.Scanner;

public class ElectricityBill {
  public static void main(String[] args) {
    //TODO:
    // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)
    // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)
    System.out.println("=".repeat(25));
    System.out.println(" 주택용 전기요금(저압) 계산기 ");
    System.out.println("=".repeat(25));
    Scanner sc = new Scanner(System.in);
    System.out.println("전력 사용량을 입력하세요");
    double useWh = Double.parseDouble(sc.nextLine());
    ElectricityBill test = new ElectricityBill();
    double price = test.electricityBill(useWh);
    System.out.printf("전기 요금은 %.3f원 입니다.",price);
  }
  public double electricityBill(double wh){
    double price = 0;
    double wh100 = 60.7;
    double wh200 = 125.9;
    double wh300 = 280.6;
    double wh400 = 417.7;
    double wh500 = 670.6;
    if(wh < 100){
      price = wh * wh100;
    } else if (100 < wh && wh <200) {
      price = 100 * wh100 + (wh-100) * wh200;
    } else if (200 < wh && wh <300) {
      price = 100 * wh100 + 100 * wh200 + (wh-200) * wh300;
    } else if (300 < wh && wh <400) {
      price = 100 * wh100 + 100 * wh200 + 100 * wh300 + (wh-300) * wh400;
    } else if (400 < wh && wh <500) {
      price = 100 * wh100 + 100 * wh200 + 100 * wh300 + 100 * wh400 + (wh-400) * wh500;
    } else if (500 < wh) {
      price = 100 * wh100 + 100 * wh200 + 100 * wh300 + 100 * wh400 + 100 * wh500 + (wh-500) * wh500;
    }
    return price;
  }
}
//클래스를 나누어 볼까?
