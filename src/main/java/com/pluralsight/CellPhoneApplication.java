package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number? ");
        int serial = input.nextInt();
        phone.setSerialNumber(serial);



        System.out.println("What model is the phone? ");
        String model = input.nextLine();
        phone.setModelNumber(model);





    }






}
