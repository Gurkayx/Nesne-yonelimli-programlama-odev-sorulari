package com.gurkay.model;

public class Kamyon extends Tasit {
    private double yukKapasitesi;
    private double mevcutYuk;
    private int dingilSayisi;
    
    public Kamyon(String marka, String model, int yil, String renk, double yukKapasitesi, int dingilSayisi) {
        super(marka, model, yil, renk);
        this.yukKapasitesi = yukKapasitesi;
        this.mevcutYuk = 0;
        this.dingilSayisi = dingilSayisi;
    }
    
    public void yukYukle(double yukMiktari) {
        if (mevcutYuk + yukMiktari <= yukKapasitesi) {
            mevcutYuk += yukMiktari;
            System.out.println(yukMiktari + " ton yük yüklendi. Mevcut yük: " + mevcutYuk + " ton");
        } else {
            System.out.println("Bu kadar yük yüklenemez! Kapasite: " + yukKapasitesi + " ton");
        }
    }
    
    public void yukBosalt(double yukMiktari) {
        if (mevcutYuk - yukMiktari >= 0) {
            mevcutYuk -= yukMiktari;
            System.out.println(yukMiktari + " ton yük boşaltıldı. Kalan yük: " + mevcutYuk + " ton");
        } else {
            System.out.println("Bu kadar yük boşaltılamaz! Mevcut yük: " + mevcutYuk + " ton");
        }
    }
    
    @Override
    public void hizlan(double artis) {
        if (mevcutYuk > yukKapasitesi * 0.8) { // Yük kapasitesinin %80'inden fazlaysa hız sınırlı
            artis = Math.min(artis, 10); // Maksimum 10 km/s artış
        }
        super.hizlan(artis);
    }
    
    @Override
    public void ozellikGoster() {
        System.out.println("\nKamyon Özellikleri:");
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Yıl: " + getYil());
        System.out.println("Renk: " + getRenk());
        System.out.println("Yük Kapasitesi: " + yukKapasitesi + " ton");
        System.out.println("Mevcut Yük: " + mevcutYuk + " ton");
        System.out.println("Dingil Sayısı: " + dingilSayisi);
    }
    
    // Getter ve Setter metodları
    public double getYukKapasitesi() { return yukKapasitesi; }
    public void setYukKapasitesi(double yukKapasitesi) { this.yukKapasitesi = yukKapasitesi; }
    
    public double getMevcutYuk() { return mevcutYuk; }
    public void setMevcutYuk(double mevcutYuk) { this.mevcutYuk = mevcutYuk; }
    
    public int getDingilSayisi() { return dingilSayisi; }
    public void setDingilSayisi(int dingilSayisi) { this.dingilSayisi = dingilSayisi; }
} 