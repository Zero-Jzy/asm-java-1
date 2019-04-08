package com.asmjava1.until;

import com.asmjava1.controller.EmployeeController;

import java.util.Scanner;

public class UntilMenu {


    public void generateEmployeeMenu() {

        EmployeeController controller = new EmployeeController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-------------Menu----------------");
            System.out.println("1. Đăng kí.");
            System.out.println("2. Đăng nhập.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("---------------------------------");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 3) {
                System.out.println("Hẹn gặp lại.");
                break;
            }

            switch (choice) {
                case 1:
                    controller.register();
                    break;
                case 2:
                    controller.login();
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }

        }
    }
}
