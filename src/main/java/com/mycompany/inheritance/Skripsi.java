/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author naffsisky
 */
public class Skripsi extends Buku {
    public String NPM;
    
    public Skripsi(String NPM, String penulis, String judul, String penerbit, int tahun){
        super(judul, penulis, penerbit, tahun);
        this.NPM = NPM;
    }
    
    public void output(){
        System.out.println("NPM\t\t: " + this.NPM);
    }
}
