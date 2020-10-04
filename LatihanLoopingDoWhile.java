package com.pboreg;

import java.util.Scanner;

public class LatihanLoopingDoWhile {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total = 0;
        boolean kondisi = true;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal= ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir= ");
        nilaiAkhir = inputUser.nextInt();

        do{
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;

        } while(nilaiAwal <= nilaiAkhir);
    }
}
