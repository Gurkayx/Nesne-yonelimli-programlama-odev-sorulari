package com.gurkay;

import com.gurkay.model.Calisan;
import com.gurkay.model.Magaza;
import com.gurkay.model.Sube;

public class Main {
    public static void main(String[] args) {
        // Mağaza oluştur
        Magaza magaza = new Magaza("G-Market");
        
        // Şubeler oluştur
        Sube sube1 = new Sube("IST001", "Kadıköy Şubesi", "İstanbul/Kadıköy", "0216-555-0001");
        Sube sube2 = new Sube("IST002", "Beşiktaş Şubesi", "İstanbul/Beşiktaş", "0216-555-0002");
        Sube sube3 = new Sube("ANK001", "Kızılay Şubesi", "Ankara/Kızılay", "0312-555-0001");
        
        // Çalışanlar oluştur
        Calisan calisan1 = new Calisan("Gürkay", "Çilinger", "12345678901", 12000, "Kasiyer", "IST001");
        Calisan calisan2 = new Calisan("Ayşe", "Demir", "12345678902", 15000, "Müdür Yardımcısı", "IST001");
        Calisan calisan3 = new Calisan("Mehmet", "Kaya", "12345678903", 11000, "Kasiyer", "IST002");
        Calisan calisan4 = new Calisan("Fatma", "Şahin", "12345678904", 13000, "Reyon Görevlisi", "ANK001");
        
        // Şubeleri mağazaya ekle
        magaza.subeEkle(sube1);
        magaza.subeEkle(sube2);
        magaza.subeEkle(sube3);
        
        // Çalışanları şubelere ekle
        sube1.calisanEkle(calisan1);
        sube1.calisanEkle(calisan2);
        sube2.calisanEkle(calisan3);
        sube3.calisanEkle(calisan4);
        
        // Şubelere ciro ekle
        sube1.ciroGuncelle(150000);
        sube2.ciroGuncelle(120000);
        sube3.ciroGuncelle(90000);
        
        // Mağaza bilgilerini göster
        magaza.magazaBilgileriGoster();
        
        // Şubeleri listele
        magaza.subeleriListele();
        
        // En başarılı şubeyi bul
        magaza.enBasariliSubeyiBul();
        
        // Çalışan transfer et
        System.out.println("\nÇalışan Transfer İşlemi:");
        magaza.calisanTransfer("IST001", "IST002", "12345678901");
        
        // Şube kapat
        System.out.println("\nŞube Kapatma İşlemi:");
        sube3.subeyiKapat();
        
        // Toplam ciroyu hesapla
        magaza.toplamCiroHesapla();
        
        // Son durumu göster
        System.out.println("\nSon Durum:");
        magaza.magazaBilgileriGoster();
    }
}