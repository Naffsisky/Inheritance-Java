/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author naffsisky
 */
public class Koleksi {
    String judul;
    String penerbit;
    int tahun;
    public Koleksi(String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    public void output(){
        System.out.println("Judul\t\t: " + this.judul);   
        System.out.println("Penerbit\t: " + this.penerbit);
        System.out.println("Tahun\t\t: " + this.tahun);
    }
}
