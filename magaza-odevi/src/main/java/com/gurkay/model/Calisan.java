package com.gurkay.model;

public class Calisan {
    private String ad;
    private String soyad;
    private String tcNo;
    private double maas;
    private String pozisyon;
    private String subeKodu;
    
    public Calisan(String ad, String soyad, String tcNo, double maas, String pozisyon, String subeKodu) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.maas = maas;
        this.pozisyon = pozisyon;
        this.subeKodu = subeKodu;
    }
    
    public void bilgileriGoster() {
        System.out.println("\nÇalışan Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("TC No: " + tcNo);
        System.out.println("Maaş: " + maas + " TL");
        System.out.println("Pozisyon: " + pozisyon);
        System.out.println("Şube Kodu: " + subeKodu);
    }
    
    // Getter ve Setter metodları
    public String getAd() { return ad; }
    public void setAd(String ad) { this.ad = ad; }
    
    public String getSoyad() { return soyad; }
    public void setSoyad(String soyad) { this.soyad = soyad; }
    
    public String getTcNo() { return tcNo; }
    public void setTcNo(String tcNo) { this.tcNo = tcNo; }
    
    public double getMaas() { return maas; }
    public void setMaas(double maas) { this.maas = maas; }
    
    public String getPozisyon() { return pozisyon; }
    public void setPozisyon(String pozisyon) { this.pozisyon = pozisyon; }
    
    public String getSubeKodu() { return subeKodu; }
    public void setSubeKodu(String subeKodu) { this.subeKodu = subeKodu; }
} 