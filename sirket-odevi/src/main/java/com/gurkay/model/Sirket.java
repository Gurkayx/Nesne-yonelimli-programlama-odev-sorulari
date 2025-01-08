package com.gurkay.model;

import java.util.ArrayList;
import java.util.List;

public class Sirket {
    private String ad;
    private String adres;
    private List<Calisan> calisanlar;
    private List<Mudur> mudurler;
    private double toplamButce;
    
    public Sirket(String ad, String adres, double baslangicButcesi) {
        this.ad = ad;
        this.adres = adres;
        this.toplamButce = baslangicButcesi;
        this.calisanlar = new ArrayList<>();
        this.mudurler = new ArrayList<>();
    }
    
    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
        System.out.println(calisan.getAd() + " " + calisan.getSoyad() + " şirkete eklendi.");
    }
    
    public void mudurEkle(Mudur mudur) {
        mudurler.add(mudur);
        System.out.println(mudur.getAd() + " " + mudur.getSoyad() + " şirkete müdür olarak eklendi.");
    }
    
    public void butceGuncelle(double miktar) {
        this.toplamButce += miktar;
        System.out.println("Şirket bütçesi güncellendi. Yeni bütçe: " + toplamButce);
    }
    
    public void maaslariOde() {
        double toplamMaas = 0;
        
        for (Calisan calisan : calisanlar) {
            toplamMaas += calisan.getMaas();
        }
        
        for (Mudur mudur : mudurler) {
            toplamMaas += mudur.getMaas();
        }
        
        if (toplamMaas <= toplamButce) {
            toplamButce -= toplamMaas;
            System.out.println("Maaşlar ödendi. Kalan bütçe: " + toplamButce);
        } else {
            System.out.println("Uyarı: Yeterli bütçe yok! Gereken: " + toplamMaas + ", Mevcut: " + toplamButce);
        }
    }
    
    public void sirketBilgileriGoster() {
        System.out.println("\nŞirket Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Adres: " + adres);
        System.out.println("Toplam Bütçe: " + toplamButce);
        System.out.println("Çalışan Sayısı: " + calisanlar.size());
        System.out.println("Müdür Sayısı: " + mudurler.size());
    }
    
    public void departmanRaporuOlustur() {
        System.out.println("\nDepartman Raporu:");
        List<String> departmanlar = new ArrayList<>();
        
        for (Calisan calisan : calisanlar) {
            if (!departmanlar.contains(calisan.getDepartman())) {
                departmanlar.add(calisan.getDepartman());
            }
        }
        
        for (String departman : departmanlar) {
            int calisanSayisi = 0;
            for (Calisan calisan : calisanlar) {
                if (calisan.getDepartman().equals(departman)) {
                    calisanSayisi++;
                }
            }
            System.out.println(departman + " departmanında " + calisanSayisi + " çalışan var.");
        }
    }
    
    // Getter ve Setter metodları
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }
    
    public String getAdres() { return adres; }
    public void setAdres(String adres) { this.adres = adres; }
    
    public List<Calisan> getCalisanlar() { return calisanlar; }
    public void setCalisanlar(List<Calisan> calisanlar) { this.calisanlar = calisanlar; }
    
    public List<Mudur> getMudurler() { return mudurler; }
    public void setMudurler(List<Mudur> mudurler) { this.mudurler = mudurler; }
    
    public double getToplamButce() { return toplamButce; }
    public void setToplamButce(double toplamButce) { this.toplamButce = toplamButce; }
} 