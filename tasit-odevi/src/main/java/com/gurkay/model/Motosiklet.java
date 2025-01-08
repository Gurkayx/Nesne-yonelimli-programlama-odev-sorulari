package com.gurkay.model;

public class Motosiklet extends Tasit {
    private int motorHacmi;
    private boolean kasklı;
    private boolean seleli;
    
    public Motosiklet(String marka, String model, int yil, String renk, int motorHacmi, boolean seleli) {
        super(marka, model, yil, renk);
        this.motorHacmi = motorHacmi;
        this.kasklı = false;
        this.seleli = seleli;
    }
    
    public void kaskTak() {
        if (!kasklı) {
            kasklı = true;
            System.out.println("Kask takıldı. Güvenli sürüş!");
        } else {
            System.out.println("Kask zaten takılı!");
        }
    }
    
    public void kaskCikar() {
        if (kasklı) {
            if (getHiz() == 0) {
                kasklı = false;
                System.out.println("Kask çıkarıldı.");
            } else {
                System.out.println("Hareket halindeyken kask çıkarılamaz!");
            }
        } else {
            System.out.println("Kask zaten takılı değil!");
        }
    }
    
    @Override
    public void calistir() {
        if (kasklı) {
            super.calistir();
        } else {
            System.out.println("Önce kask takmalısınız!");
        }
    }
    
    @Override
    public void ozellikGoster() {
        System.out.println("\nMotosiklet Özellikleri:");
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Yıl: " + getYil());
        System.out.println("Renk: " + getRenk());
        System.out.println("Motor Hacmi: " + motorHacmi + " cc");
        System.out.println("Kask Durumu: " + (kasklı ? "Takılı" : "Takılı Değil"));
        System.out.println("Sele Durumu: " + (seleli ? "Var" : "Yok"));
    }
    
    // Getter ve Setter metodları
    public int getMotorHacmi() { return motorHacmi; }
    public void setMotorHacmi(int motorHacmi) { this.motorHacmi = motorHacmi; }
    
    public boolean isKasklı() { return kasklı; }
    public void setKasklı(boolean kasklı) { this.kasklı = kasklı; }
    
    public boolean isSeleli() { return seleli; }
    public void setSeleli(boolean seleli) { this.seleli = seleli; }
} 