package com.pboreg;

import java.util.Scanner;

public class LatihanLoopingForLoop {
    public static void main(String[] args) {
        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal= ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir= ");
        nilaiAkhir = inputUser.nextInt();

        for(total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        }
    }
}
