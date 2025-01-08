package com.gurkay.model;

public class Otomobil extends Tasit {
    private int kapiSayisi;
    private String vitesTipi;
    private boolean klimaAcik;
    
    public Otomobil(String marka, String model, int yil, String renk, int kapiSayisi, String vitesTipi) {
        super(marka, model, yil, renk);
        this.kapiSayisi = kapiSayisi;
        this.vitesTipi = vitesTipi;
        this.klimaAcik = false;
    }
    
    public void klimaAc() {
        if (isCalisiyor()) {
            if (!klimaAcik) {
                klimaAcik = true;
                System.out.println("Klima açıldı.");
            } else {
                System.out.println("Klima zaten açık!");
            }
        } else {
            System.out.println("Araç çalışmıyor! Önce çalıştırın.");
        }
    }
    
    public void klimaKapat() {
        if (klimaAcik) {
            klimaAcik = false;
            System.out.println("Klima kapatıldı.");
        } else {
            System.out.println("Klima zaten kapalı!");
        }
    }
    
    @Override
    public void ozellikGoster() {
        System.out.println("\nOtomobil Özellikleri:");
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Yıl: " + getYil());
        System.out.println("Renk: " + getRenk());
        System.out.println("Kapı Sayısı: " + kapiSayisi);
        System.out.println("Vites Tipi: " + vitesTipi);
        System.out.println("Klima Durumu: " + (klimaAcik ? "Açık" : "Kapalı"));
    }
    
    // Getter ve Setter metodları
    public int getKapiSayisi() { return kapiSayisi; }
    public void setKapiSayisi(int kapiSayisi) { this.kapiSayisi = kapiSayisi; }
    
    public String getVitesTipi() { return vitesTipi; }
    public void setVitesTipi(String vitesTipi) { this.vitesTipi = vitesTipi; }
    
    public boolean isKlimaAcik() { return klimaAcik; }
    public void setKlimaAcik(boolean klimaAcik) { this.klimaAcik = klimaAcik; }
} 