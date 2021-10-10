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
public class sinhvienpoly {
    public String hoten;
    public String nghanh;
    public double diem;

    public sinhvienpoly() {
    }

    public sinhvienpoly(String hoten, String nghanh) {
        this.hoten = hoten;
        this.nghanh = nghanh;
    }
    public double getdiem(){
        return this.diem;
    }
    public String gethocluc(){
        if(getdiem()>=8.0){
            return "gioi";
        }
        if(getdiem()<8.0 && getdiem()>7.0){
            return"kha";
        }
        if(getdiem()<=7.0&& getdiem()>=5.0){
            return"trung binh";
        }
        if(getdiem()<5.0){
            return "yeu";
        }
        return "nhap sai ";
    }
    public void nhapdl(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" ho ten sinh vien : ");
        this.hoten=sc.nextLine();
        System.out.println(" nghanh cua sinh vien :");
        this.nghanh=sc.nextLine();
    }
    public void xuatdl(){
        System.out.println(" ho ten sinh vien : "+this.hoten);
        System.out.println(" nghanh cua sinh vien :"+this.nghanh);
        System.out.println(" diem cua sinh vien :"+getdiem());
        System.out.println(" hoc luc cua sinh vien :"+gethocluc());
    }
}
