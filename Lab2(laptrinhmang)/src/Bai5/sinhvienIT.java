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
public class sinhvienIT extends sinhvienpoly{
    public double diemjava;
    public double diemcss;
    public double diemhtml;

    public sinhvienIT() {
    }

    public sinhvienIT(double diemjava, double diemcss, double diemhtml) {
        this.diemjava = diemjava;
        this.diemcss = diemcss;
        this.diemhtml = diemhtml;
    }
    @Override
    public double getdiem(){
        return (diemjava*2+diemcss+diemhtml)/4;
    }
    @Override
    public void nhapdl(){
        super.nhapdl();
        Scanner sc = new Scanner(System.in);
        System.out.println(" diem java : ");
        this.diemjava=sc.nextDouble();
        System.out.println(" diem css :");
        this.diemcss=sc.nextDouble();
        System.out.println(" diem html:");
        this.diemhtml=sc.nextDouble();
    }
    @Override
    public void xuatdl(){
        super.xuatdl();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhvienIT sv[] = null;
        int luachon=0,n=0;
        boolean flag=true;
        System.out.println(" danh sach sinh vien nghanh cong nghe thong tin : ");
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
                    sv = new sinhvienIT[n];
                    System.out.println(" nhap danh sach sinh vien : ");
                    for(int i=0;i<n;i++){
                        System.out.println(" sinh vien thu ["+(i+1)+"] la : ");
                        sv[i] = new sinhvienIT();
                        sv[i].nhapdl();
                    }
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("xuat danh sach sinh vien : ");
                    for (int i = 0; i < n; i++) {
                        sv[i].xuatdl();
                    }
                    break;
                case 3:
                    System.out.println("==============================");
                    for(int i=0 ;i<n;i++){
                        if("gioi".equals(sv[i].gethocluc())){
                            System.out.println(" sinh vien thu ["+(i+1)+"] la ");
                            System.out.println("==========================");
                            sv[i].xuatdl();
                        }
                    }
                    break;
                case 4:
                    System.out.println("==================================");
                    sinhvienIT temp=sv[0];
                    for (int i = 0; i < n - 1; i++) {
                        for(int j=i+1 ;j<n;j++){
                            if(sv[i].getdiem()>sv[j].getdiem()){
                                temp=sv[i];
                                sv[i]=sv[j];
                                sv[j]=temp;
                            }
                        }
                    }
                    for (int i = 0; i < n; i++) {
                        sv[i].xuatdl();
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
