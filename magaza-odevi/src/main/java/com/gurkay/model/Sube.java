package com.gurkay.model;

import java.util.ArrayList;
import java.util.List;

public class Sube {
    private String subeKodu;
    private String subeAdi;
    private String adres;
    private String telefon;
    private List<Calisan> calisanlar;
    private double aylikCiro;
    private boolean aktif;
    
    public Sube(String subeKodu, String subeAdi, String adres, String telefon) {
        this.subeKodu = subeKodu;
        this.subeAdi = subeAdi;
        this.adres = adres;
        this.telefon = telefon;
        this.calisanlar = new ArrayList<>();
        this.aylikCiro = 0;
        this.aktif = true;
    }
    
    public void calisanEkle(Calisan calisan) {
        if (aktif) {
            calisanlar.add(calisan);
            System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " şubeye eklendi.");
        } else {
            System.out.println("Bu şube aktif değil! Çalışan eklenemez.");
        }
    }
    
    public void calisanCikar(String tcNo) {
        Calisan silinecekCalisan = null;
        for (Calisan calisan : calisanlar) {
            if (calisan.getTcNo().equals(tcNo)) {
                silinecekCalisan = calisan;
                break;
            }
        }
        
        if (silinecekCalisan != null) {
            calisanlar.remove(silinecekCalisan);
            System.out.println(silinecekCalisan.getAd() + " " + silinecekCalisan.getSoyad() + " şubeden çıkarıldı.");
        } else {
            System.out.println("Bu TC numarasına sahip çalışan bulunamadı!");
        }
    }
    
    public void ciroGuncelle(double miktar) {
        if (aktif) {
            aylikCiro += miktar;
            System.out.println(subeAdi + " şubesinin cirosu güncellendi. Yeni ciro: " + aylikCiro + " TL");
        } else {
            System.out.println("Bu şube aktif değil! Ciro güncellenemez.");
        }
    }
    
    public void subeyiKapat() {
        if (aktif) {
            aktif = false;
            System.out.println(subeAdi + " şubesi kapatıldı.");
        } else {
            System.out.println("Bu şube zaten kapalı!");
        }
    }
    
    public void subeyiAc() {
        if (!aktif) {
            aktif = true;
            System.out.println(subeAdi + " şubesi açıldı.");
        } else {
            System.out.println("Bu şube zaten açık!");
        }
    }
    
    public void subeBilgileriGoster() {
        System.out.println("\nŞube Bilgileri:");
        System.out.println("Şube Kodu: " + subeKodu);
        System.out.println("Şube Adı: " + subeAdi);
        System.out.println("Adres: " + adres);
        System.out.println("Telefon: " + telefon);
        System.out.println("Çalışan Sayısı: " + calisanlar.size());
        System.out.println("Aylık Ciro: " + aylikCiro + " TL");
        System.out.println("Durum: " + (aktif ? "Aktif" : "Kapalı"));
    }
    
    public void calisanlariListele() {
        System.out.println("\n" + subeAdi + " Şubesi Çalışanları:");
        if (calisanlar.isEmpty()) {
            System.out.println("Bu şubede çalışan bulunmamaktadır.");
        } else {
            for (Calisan calisan : calisanlar) {
                calisan.bilgileriGoster();
            }
        }
    }
    
    // Getter ve Setter metodları
    public String getSubeKodu() { return subeKodu; }
    public void setSubeKodu(String subeKodu) { this.subeKodu = subeKodu; }
    
    public String getSubeAdi() { return subeAdi; }
    public void setSubeAdi(String subeAdi) { this.subeAdi = subeAdi; }
    
    public String getAdres() { return adres; }
    public void setAdres(String adres) { this.adres = adres; }
    
    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
    
    public List<Calisan> getCalisanlar() { return calisanlar; }
    
    public double getAylikCiro() { return aylikCiro; }
    public void setAylikCiro(double aylikCiro) { this.aylikCiro = aylikCiro; }
    
    public boolean isAktif() { return aktif; }
    public void setAktif(boolean aktif) { this.aktif = aktif; }
} 