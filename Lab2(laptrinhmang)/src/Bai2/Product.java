/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author Nam
 */
public class Product {
    private String Tenhh;
    private String Mahh;
    private int soluong;
    private float gia1sp;

    public Product() {
    }

    public Product(String Tenhh, String Mahh, int soluong, float gia1sp) {
        this.Tenhh = Tenhh;
        this.Mahh = Mahh;
        this.soluong = soluong;
        this.gia1sp = gia1sp;
    }

    public String getTenhh() {
        return Tenhh;
    }

    public String getMahh() {
        return Mahh;
    }

    public int getSoluong() {
        return soluong;
    }

    public float getGia1sp() {
        return gia1sp;
    }

    public void setTenhh(String Tenhh) {
        this.Tenhh = Tenhh;
    }

    public void setMahh(String Mahh) {
        this.Mahh = Mahh;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGia1sp(float gia1sp) {
        this.gia1sp = gia1sp;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ten hang hoa : ");
        this.Tenhh=sc.nextLine();
        System.out.println(" nhap ma hang hoa : ");
        this.Mahh=sc.nextLine();
        System.out.println(" So luong hang hoa : ");
        this.soluong=sc.nextInt();
        System.out.println(" gia ban 1 sp  : ");
        this.gia1sp=sc.nextFloat();
    }
    public void xuat(){
        System.out.println(" hang hoa : "+this.Tenhh);
        System.out.println(" ma  : "+this.Mahh);
        System.out.println(" so luong  :"+this.soluong);
        System.out.println(" gia 1 san pham : "+this.gia1sp);
    }
}
