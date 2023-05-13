/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author naffsisky
 */
public class Inheritance {

    public static void main(String[] args) {
        Koleksi buku = new Koleksi("Java", "Erlangga", 2022);
        Buku penulis = new Buku("C++", "Aku", "Erlangga", 2023 );
        Majalah edisi = new Majalah("Python", "Lengkap", "Erlangga", 2024);
        Skripsi npm = new Skripsi("21081010278", "Aku", "C#", "Erlangga", 2025);
        npm.output();
        buku.output();
        penulis.output();
        edisi.output();
        
    }  
}
