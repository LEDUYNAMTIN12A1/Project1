/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4.ltmang;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Bai4Ltmang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
	float tiendien = sc.nextFloat();
        System.out.println("Nhap so dien trong thang  :");
	float sotien = sc.nextFloat();
	System.out.println();
        if(sotien <=50){
            tiendien = sotien *5000;
        }else{
            tiendien = 50*5000 + (sotien-50)*1200;
        }
        System.out.println("tiendien : " + tiendien + "VND");
    }
    
}
