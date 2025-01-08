package com.gurkay.model;

public abstract class Tasit {
    private String marka;
    private String model;
    private int yil;
    private String renk;
    private double hiz;
    private boolean calisiyor;
    
    public Tasit(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
        this.hiz = 0;
        this.calisiyor = false;
    }
    
    public void calistir() {
        if (!calisiyor) {
            calisiyor = true;
            System.out.println(marka + " " + model + " çalıştırıldı.");
        } else {
            System.out.println("Araç zaten çalışıyor!");
        }
    }
    
    public void durdur() {
        if (calisiyor) {
            calisiyor = false;
            hiz = 0;
            System.out.println(marka + " " + model + " durduruldu.");
        } else {
            System.out.println("Araç zaten durmuş durumda!");
        }
    }
    
    public void hizlan(double artis) {
        if (calisiyor) {
            hiz += artis;
            System.out.println("Hız artırıldı. Yeni hız: " + hiz + " km/saat");
        } else {
            System.out.println("Araç çalışmıyor! Önce çalıştırın.");
        }
    }
    
    public void yavasla(double azalis) {
        if (calisiyor) {
            if (hiz - azalis >= 0) {
                hiz -= azalis;
                System.out.println("Hız azaltıldı. Yeni hız: " + hiz + " km/saat");
            } else {
                hiz = 0;
                System.out.println("Araç durdu.");
            }
        } else {
            System.out.println("Araç zaten durmuş durumda!");
        }
    }
    
    public abstract void ozellikGoster();
    
    // Getter ve Setter metodları
    public String getMarka() { return marka; }
    public void setMarka(String marka) { this.marka = marka; }
    
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
    
    public int getYil() { return yil; }
    public void setYil(int yil) { this.yil = yil; }
    
    public String getRenk() { return renk; }
    public void setRenk(String renk) { this.renk = renk; }
    
    public double getHiz() { return hiz; }
    public void setHiz(double hiz) { this.hiz = hiz; }
    
    public boolean isCalisiyor() { return calisiyor; }
    public void setCalisiyor(boolean calisiyor) { this.calisiyor = calisiyor; }
} 