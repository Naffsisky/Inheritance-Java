/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author naffsisky
 */
public class Majalah extends Koleksi {
    public String edisi;
    
    public Majalah(String judul, String edisi, String penerbit, int tahun){
        super(judul,penerbit, tahun);
        this.edisi = edisi;
    }
    public void output(){
        System.out.println("Edisi\t\t: " + this.edisi);
    }
}
