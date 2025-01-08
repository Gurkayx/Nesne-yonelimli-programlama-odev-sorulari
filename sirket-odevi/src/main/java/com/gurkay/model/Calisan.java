package com.gurkay.model;

public class Calisan {
    private String ad;
    private String soyad;
    private String tcNo;
    private double maas;
    private String departman;
    
    public Calisan(String ad, String soyad, String tcNo, double maas, String departman) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.maas = maas;
        this.departman = departman;
    }
    
    public void bilgileriGoster() {
        System.out.println("Çalışan Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("TC No: " + tcNo);
        System.out.println("Maaş: " + maas);
        System.out.println("Departman: " + departman);
    }
    
    public void calis() {
        System.out.println(ad + " " + soyad + " çalışıyor...");
    }
    
    public void molaVer() {
        System.out.println(ad + " " + soyad + " mola veriyor...");
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
    
    public String getDepartman() { return departman; }
    public void setDepartman(String departman) { this.departman = departman; }
} 