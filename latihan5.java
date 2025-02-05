package com.belajar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class latihan5 {
    public static void main(String[] args) {
        String nama;
        int umur;
        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        // Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);
        // Mengisi variabel nama dengan BufferedReader
        System.out.print("Inputkan nama Anda : ");
        nama = br.readLine();
        System.out.print("Inputkan umur Anda : ");
        umur = Integer.ParsInt(br.readLine());
        // Tampilkan output isi variabel nama
        System.out.println("Nama Anda adalah " + nama);
        System.out.println("Umur" + umur);
    }
}
