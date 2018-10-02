/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 * NAMA                 : RD Muhammad Djulfikar BU
 * KELAS                : IF3
 * NIM                  : 10117086
 * DESKRIPSI PROGRAM    : program untuk ejaan nama
 */
public class PBO310117086Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //        deklarasi variabel
        String nama;
        int panjang; // variabel untuk menampung jumlah huruf 
        char huruf; //menampung satu karakter
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan Anda untuk dieja : ");
        nama = scn.next();
        panjang = nama.length(); //jumlah huruf akan digunakan dalam looping
        
        System.out.println("\nEjaan untuk "+" \""+nama+"\" adalah : ");
        /*
        * Jangan gunakan i <= panjang, karena akan 'string index out of range'
        */
//        proses looping per huruf
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf ke-"+(i+1)+" : "+nama.charAt(i));
        }
    }
    
}
