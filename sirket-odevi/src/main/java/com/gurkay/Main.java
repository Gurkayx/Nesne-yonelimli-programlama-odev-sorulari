package com.gurkay;

import com.gurkay.model.Calisan;
import com.gurkay.model.Mudur;
import com.gurkay.model.Sirket;

public class Main {
    public static void main(String[] args) {
        // Şirket oluştur
        Sirket sirket = new Sirket("G-tech A.Ş.", "İstanbul/Türkiye", 1000000);
        
        // Müdürler oluştur
        Mudur mudur1 = new Mudur("Gürkay", "Çilinger", "12345678901", 45000, "Yazılım", "Üst Düzey");
        Mudur mudur2 = new Mudur("Ayşe", "Demir", "12345678902", 30000, "İnsan Kaynakları", "Orta Düzey");
        
        // Çalışanlar oluştur
        Calisan calisan1 = new Calisan("Muhammet", "Çilinger", "12345678903", 35000, "Yazılım");
        Calisan calisan2 = new Calisan("Aleyna", "Çilinger", "12345678904", 30000, "Yazılım");
        Calisan calisan3 = new Calisan("Ali", "Öztürk", "12345678905", 13000, "İnsan Kaynakları");
        
        // Şirkete müdürleri ekle
        sirket.mudurEkle(mudur1);
        sirket.mudurEkle(mudur2);
        
        // Şirkete çalışanları ekle
        sirket.calisanEkle(calisan1);
        sirket.calisanEkle(calisan2);
        sirket.calisanEkle(calisan3);
        
        // Müdürlere ekip üyelerini ekle
        mudur1.ekipUyesiEkle(calisan1);
        mudur1.ekipUyesiEkle(calisan2);
        mudur2.ekipUyesiEkle(calisan3);
        
        // Şirket bilgilerini göster
        sirket.sirketBilgileriGoster();
        
        // Departman raporunu göster
        sirket.departmanRaporuOlustur();
        
        // Toplantı düzenle
        System.out.println("\nToplantı Düzenleniyor...");
        mudur1.toplantiDuzenle();
        
        // Performans değerlendirmesi yap
        System.out.println("\nPerformans Değerlendirmesi Yapılıyor...");
        mudur1.performansDegerlendirmesiYap();
        
        // Maaşları öde
        System.out.println("\nMaaşlar Ödeniyor...");
        sirket.maaslariOde();
    }
}