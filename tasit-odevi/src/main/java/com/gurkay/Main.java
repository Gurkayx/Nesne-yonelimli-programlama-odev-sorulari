package com.gurkay;

import com.gurkay.model.Otomobil;
import com.gurkay.model.Motosiklet;
import com.gurkay.model.Kamyon;

public class Main {
    public static void main(String[] args) {
        // Taşıtları oluştur
        Otomobil otomobil = new Otomobil("BMW", "520i", 2023, "Siyah", 4, "Otomatik");
        Motosiklet motosiklet = new Motosiklet("Honda", "CBR", 2022, "Kırmızı", 1000, true);
        Kamyon kamyon = new Kamyon("Mercedes", "Actros", 2021, "Beyaz", 25.0, 3);
        
        // Otomobil işlemleri
        System.out.println("\n--- Otomobil İşlemleri ---");
        otomobil.ozellikGoster();
        otomobil.calistir();
        otomobil.klimaAc();
        otomobil.hizlan(50);
        otomobil.yavasla(20);
        otomobil.klimaKapat();
        otomobil.durdur();
        
        // Motosiklet işlemleri
        System.out.println("\n--- Motosiklet İşlemleri ---");
        motosiklet.ozellikGoster();
        motosiklet.kaskTak();
        motosiklet.calistir();
        motosiklet.hizlan(40);
        motosiklet.yavasla(40);
        motosiklet.kaskCikar();
        motosiklet.durdur();
        
        // Kamyon işlemleri
        System.out.println("\n--- Kamyon İşlemleri ---");
        kamyon.ozellikGoster();
        kamyon.calistir();
        kamyon.yukYukle(15.0);
        kamyon.hizlan(30);
        kamyon.yukBosalt(5.0);
        kamyon.yavasla(30);
        kamyon.durdur();
    }
}