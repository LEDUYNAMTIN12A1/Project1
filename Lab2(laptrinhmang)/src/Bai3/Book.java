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
public class Book {
    private  String Tensach;
    private String Tentacgia;
    private String nhasanxuat;
    private int namsx;
    private float gia;

    public Book() {
    }

    public Book(String Tensach, String Tentacgia, String nhasanxuat, int namsx, float gia) {
        this.Tensach = Tensach;
        this.Tentacgia = Tentacgia;
        this.nhasanxuat = nhasanxuat;
        this.namsx = namsx;
        this.gia = gia;
    }

    public String getTensach() {
        return Tensach;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public int getNamsx() {
        return namsx;
    }

    public float getGia() {
        return gia;
    }

    public void setTensach(String Tensach) {
        this.Tensach = Tensach;
    }

    public void setTentacgia(String Tentacgia) {
        this.Tentacgia = Tentacgia;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public void setNamsx(int namsx) {
        this.namsx = namsx;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    public void input(){
        System.out.println("Nhập danh sách sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên sách : ");
        this.Tensach = sc.nextLine();
        System.out.println("Tên tác giả : ");
        this.Tentacgia = sc.nextLine();
        System.out.println("Nhà sản xuất:");
        this.nhasanxuat = sc.nextLine().toString();
        System.out.println("Năm xuất bản : ");
        this.namsx = sc.nextInt();
        System.out.println("Gía bán : ");
        this.gia = sc.nextFloat();
    }
    public void display(){
        System.out.println(" tên sách : " + this.Tensach);
        System.out.println(" Tên tác giả  : " + this.Tentacgia);
        System.out.println("Nhà sản xuất  : " + this.nhasanxuat);
        System.out.println("Năm xuất bản  : " + this.namsx);
        System.out.println("Gía bán : " + this.gia);

    }
}
