/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.project;

/**
 *
 * @author User
 */
public class Project {

    public static void main(String[] args) {
//        Account a1 = new Account("Neto",23103439);
//        
//        a1.Display();
//         Account a2 = new Account("Talib",23103469);
//        
//        a1.deposit(500);
//        a1.Display();
//        a1.verify();
//        a1.Display();
//        a1.withdraw(200);
//        a1.Display();

        Vehicle car = new Vehicle(100, 0, "black", "vios", "toyota", "GAE6969", false);

        System.out.println(car);

        car.display();

        car.accelerate();
        while (car.getCurrspeed() < car.getTopspeed()) {
            car.accelerate();
        }
        System.out.println(car);
        car.display();

    }
}
