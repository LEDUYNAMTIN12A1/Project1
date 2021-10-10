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
public class UnetiBook extends Book{
    private  String language;
    private int semester;

    public UnetiBook() {
    }

    public UnetiBook(String language, int semester) {
        this.language = language;
        this.semester = semester;
    }

    public String getLanguage() {
        return language;
    }

    public int getSemester() {
        return semester;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ngôn ngữ :");
        this.language= sc.nextLine();
        System.out.println("Nhập học kỳ");
        this.semester = sc.nextInt();//To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void display(){
        super.display();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ngôn ngữ "+ this.language);
        System.out.println("Học kỳ : " +this.semester);
    }
    
}
