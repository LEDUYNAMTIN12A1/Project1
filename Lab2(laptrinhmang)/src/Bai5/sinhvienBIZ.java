/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class sinhvienBIZ extends sinhvienpoly{
    public double diemMarketing;
     public double diemSALES;

    public sinhvienBIZ() {
    }

    public sinhvienBIZ(double diemMarketing, double diemSALES) {
        this.diemMarketing = diemMarketing;
        this.diemSALES = diemSALES;
    }
    @Override
    public double getdiem(){
        return (2*diemMarketing+diemSALES)/3;
    }
    @Override
    public void nhapdl(){
        Scanner sc = new Scanner(System.in);
        super.nhapdl();
        System.out.println(" diem Marketing : ");
        this.diemMarketing=sc.nextDouble();
        System.out.println(" diem SALES :");
        this.diemSALES=sc.nextDouble();
    }
    @Override
    public void xuatdl(){
        super.xuatdl();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvienBIZ sv1[] = null;
        int luachon=0,n=0;
        boolean flag=true;
        System.out.println(" danh sach sinh vien nghanh kinh doanh : ");
        do{ 
            System.out.println("=============================================");
            System.out.println("1.nhap danh sach sinh vien : ");
            System.out.println("2.xuat danh sach sinh vien :");
            System.out.println("3.danh sach sinh vien gioi : ");
            System.out.println("4.danh sach sinh vien tang dan theo diem :");
            System.out.println("5.ket thuc ");
            System.out.println(" vui long nhap lua chon  : ");
            luachon=sc.nextInt();
            System.out.println("==============================================");
            switch(luachon) {
                case 1:
                    System.out.println("================================");
                    System.out.println(" nhap so sinh vien  : ");
                    n=sc.nextInt();
                    sv1 = new sinhvienBIZ[n];
                    System.out.println(" nhap danh sach sinh vien : ");
                    for(int i=0;i<n;i++){
                        System.out.println(" sinh vien thu ["+(i+1)+"] la : ");
                        sv1[i] = new sinhvienBIZ();
                        sv1[i].nhapdl();
                    }
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("xuat danh sach sinh vien : ");
                    for (int i = 0; i < n; i++) {
                        sv1[i].xuatdl();
                    }
                    break;
                case 3:
                    System.out.println("==============================");
                    for(int i=0 ;i<n;i++){
                        if("gioi".equals(sv1[i].gethocluc())){
                            sv1[i].xuatdl();
                        }
                    }
                    break;
                case 4:
                    System.out.println("==================================");
                    sinhvienBIZ temp=sv1[0];
                    for (int i = 0; i < n - 1; i++) {
                        for(int j=i+1 ;j<n;j++){
                            if(sv1[i].getdiem()>sv1[j].getdiem()){
                                temp=sv1[i];
                                sv1[i]=sv1[j];
                                sv1[j]=temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        sv1[i].xuatdl();
                    }
                    break;
                case 5 :
                    System.out.println("===============================");
                    System.out.println(" thoat ! ");
                    flag=false;
                default:
                    System.out.println(" vui long nhap lai : ");
            }
        }while (flag);
    }
}
