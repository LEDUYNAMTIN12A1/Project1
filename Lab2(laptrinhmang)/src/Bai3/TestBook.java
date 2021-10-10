/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class TestBook {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UnetiBook sv[] = null;
        int luachon=0,n=0;
        boolean flag=true;
        String namesearch;
        System.out.println(" danh sach san pham  : ");
        do{ 
            System.out.println("=============================================");
            System.out.println("1.nhap danh sach san pham : ");
            System.out.println("2.xuat danh sach san pham  :");
            System.out.println("3.danh sach sap xep theo nam san xuat  : ");
            System.out.println("4.danh sach tên sách tìm kiếm :");
            System.out.println("5.ket thuc ");
            System.out.println(" vui long nhap lua chon  : ");
            luachon=sc.nextInt();
            System.out.println("==============================================");
            switch(luachon) {
                case 1:
                    System.out.println("================================");
                    System.out.println(" nhap so san pham  : ");
                    n=sc.nextInt();
                    sv = new UnetiBook[n];
                    System.out.println(" nhap danh san pham : ");
                    for(int i=0;i<n;i++){
                        System.out.println(" san pham  thu ["+(i+1)+"] la : ");
                        sv[i] = new UnetiBook();
                        sv[i].input();
                    }
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("xuat danh sach san pham : ");
                    for (int i = 0; i < n; i++) {
                        sv[i].display();
                    }
                    break;
                case 3:
                    System.out.println("==================================");
                    UnetiBook temp=sv[0];
                    for (int i = 0; i < n - 1; i++) {
                        for(int j=i+1 ;j<n;j++){
                            if(sv[i].getNamsx()>sv[j].getNamsx()){
                                temp=sv[i];
                                sv[i]=sv[j];
                                sv[j]=temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        sv[i].display();
                    }
                    break;
                case 4:
                    System.out.println("Tên sách cân tìm là : ");
                    namesearch = sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        if(sv[i].getTensach().equals(namesearch)){
                            sv[i].display();
                        }
                    }
                    break;
                case 5:
                    System.out.println("=====================================");
                    System.out.println(" thoat ! ");
                    flag=false;
                default:
                    System.out.println(" vui long nhap lai : ");
            }
        }while (flag);
    }
}
