package com.gurkay.model;

import java.util.ArrayList;
import java.util.List;

public class Mudur extends Calisan {
    private List<Calisan> ekip;
    private String seviye; // Örn: "Orta Düzey", "Üst Düzey"
    
    public Mudur(String ad, String soyad, String tcNo, double maas, String departman, String seviye) {
        super(ad, soyad, tcNo, maas, departman);
        this.seviye = seviye;
        this.ekip = new ArrayList<>();
    }
    
    public void ekipUyesiEkle(Calisan calisan) {
        ekip.add(calisan);
        System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " ekibe eklendi.");
    }
    
    public void ekipUyesiCikar(Calisan calisan) {
        if (ekip.remove(calisan)) {
            System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " ekipten çıkarıldı.");
        } else {
            System.out.println("Bu çalışan ekipte bulunamadı.");
        }
    }
    
    public void toplantiDuzenle() {
        System.out.println(getAd() + " " + getSoyad() + " toplantı düzenliyor...");
        System.out.println("Katılımcılar:");
        for (Calisan calisan : ekip) {
            System.out.println("- " + calisan.getAd() + " " + calisan.getSoyad());
        }
    }
    
    public void performansDegerlendirmesiYap() {
        System.out.println(getAd() + " " + getSoyad() + " performans değerlendirmesi yapıyor...");
        for (Calisan calisan : ekip) {
            System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " değerlendiriliyor...");
        }
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Seviye: " + seviye);
        System.out.println("Ekip Üye Sayısı: " + ekip.size());
    }
    
    // Getter ve Setter metodları
    public List<Calisan> getEkip() { return ekip; }
    public void setEkip(List<Calisan> ekip) { this.ekip = ekip; }
    
    public String getSeviye() { return seviye; }
    public void setSeviye(String seviye) { this.seviye = seviye; }
} 