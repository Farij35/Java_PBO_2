package com.pboreg;

import java.util.Scanner;

public class LatihanLoopingSederhana {
    public static void main(String[] args) {


        // program untuk menjumlahan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal= ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir= ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while(nilaiAwal <= nilaiAkhir){
            total = total + nilaiAwal;

            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
    }
}
