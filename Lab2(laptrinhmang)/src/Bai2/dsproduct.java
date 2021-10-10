/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Nam
 */
public class dsproduct {
     public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        int choose;
        Scanner sc=  new Scanner(System.in);
        do{
            showmenu();
            System.out.println(" moi nhap lua chon : ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("========================================");
                    int n;
                    System.out.println(" nhap so san pham : ");
                    n=Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++){
                        Product sv = new Product();
                        sv.nhap();
                        productList.add(sv);
                    }
                    System.out.println("=========================================");
                    break;
                case 2:
                    System.out.println("======================================");
                    for(int i=0;i<productList.size();i++){
                        productList.get(i).xuat();
                    }
                    System.out.println("========================================");
                    break;
                case 3:
                    System.out.println("=========================================");
                    System.out.println(" Co san pham sua trong danh sach hang hoa khong: ");
                    int count=0;
                    for(Product sv :  productList){
                        if(sv.getTenhh().equalsIgnoreCase("Sua")){
                            System.out.println("Có");
                            count++;
                        }
                    }
                    if(count == 0 ){
                        System.out.println("khong  ! ");
                    }
                    System.out.println("========================================");
                    break;
                case 4:
                    
            }
        }while (choose!=7);  
     }
     static void showmenu(){
        System.out.println("1.nhap n san pham  : ");
        System.out.println("2.hien thi danh san pham : ");
        System.out.println("3.tim kiem san pham sua ");
        System.out.println("4.Sap xep giam dan theo gia ");
        System.out.println("5.San pham co gia ban cao nhat");
        System.out.println("6.Thoat ");
     }
}
    
 

