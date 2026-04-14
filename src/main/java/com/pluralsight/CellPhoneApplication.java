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


        System.out.println("Who is the carrier?");
        String carrier = input.nextLine();
        phone.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = input.nextLine();
        phone.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = input.nextLine();
        phone.setOwner(owner);

    }


}
