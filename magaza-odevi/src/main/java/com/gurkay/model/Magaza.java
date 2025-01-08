package com.gurkay.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Magaza {
    private String magazaAdi;
    private Map<String, Sube> subeler;
    private double toplamCiro;
    
    public Magaza(String magazaAdi) {
        this.magazaAdi = magazaAdi;
        this.subeler = new HashMap<>();
        this.toplamCiro = 0;
    }
    
    public void subeEkle(Sube sube) {
        if (!subeler.containsKey(sube.getSubeKodu())) {
            subeler.put(sube.getSubeKodu(), sube);
            System.out.println(sube.getSubeAdi() + " mağazaya eklendi.");
        } else {
            System.out.println("Bu şube kodu zaten kullanımda!");
        }
    }
    
    public void subeSil(String subeKodu) {
        if (subeler.containsKey(subeKodu)) {
            Sube sube = subeler.get(subeKodu);
            if (sube.getCalisanlar().isEmpty()) {
                subeler.remove(subeKodu);
                System.out.println(sube.getSubeAdi() + " mağazadan silindi.");
            } else {
                System.out.println("Bu şubede hala çalışanlar var! Önce çalışanları transfer edin.");
            }
        } else {
            System.out.println("Bu şube kodu bulunamadı!");
        }
    }
    
    public void calisanTransfer(String kaynakSubeKodu, String hedefSubeKodu, String calisanTcNo) {
        if (subeler.containsKey(kaynakSubeKodu) && subeler.containsKey(hedefSubeKodu)) {
            Sube kaynakSube = subeler.get(kaynakSubeKodu);
            Sube hedefSube = subeler.get(hedefSubeKodu);
            
            Calisan transferEdilecek = null;
            for (Calisan calisan : kaynakSube.getCalisanlar()) {
                if (calisan.getTcNo().equals(calisanTcNo)) {
                    transferEdilecek = calisan;
                    break;
                }
            }
            
            if (transferEdilecek != null) {
                kaynakSube.calisanCikar(calisanTcNo);
                transferEdilecek.setSubeKodu(hedefSubeKodu);
                hedefSube.calisanEkle(transferEdilecek);
                System.out.println("Transfer başarılı!");
            } else {
                System.out.println("Belirtilen TC numarasına sahip çalışan bulunamadı!");
            }
        } else {
            System.out.println("Geçersiz şube kodu!");
        }
    }
    
    public void toplamCiroHesapla() {
        toplamCiro = 0;
        for (Sube sube : subeler.values()) {
            toplamCiro += sube.getAylikCiro();
        }
        System.out.println("\nToplam Ciro: " + toplamCiro + " TL");
    }
    
    public void enBasariliSubeyiBul() {
        Sube enBasarili = null;
        double enYuksekCiro = 0;
        
        for (Sube sube : subeler.values()) {
            if (sube.isAktif() && sube.getAylikCiro() > enYuksekCiro) {
                enYuksekCiro = sube.getAylikCiro();
                enBasarili = sube;
            }
        }
        
        if (enBasarili != null) {
            System.out.println("\nEn Başarılı Şube:");
            enBasarili.subeBilgileriGoster();
        } else {
            System.out.println("\nAktif şube bulunamadı!");
        }
    }
    
    public void magazaBilgileriGoster() {
        System.out.println("\nMağaza Bilgileri:");
        System.out.println("Mağaza Adı: " + magazaAdi);
        System.out.println("Toplam Şube Sayısı: " + subeler.size());
        System.out.println("Toplam Ciro: " + toplamCiro + " TL");
        
        int aktifSubeSayisi = 0;
        int toplamCalisan = 0;
        
        for (Sube sube : subeler.values()) {
            if (sube.isAktif()) {
                aktifSubeSayisi++;
            }
            toplamCalisan += sube.getCalisanlar().size();
        }
        
        System.out.println("Aktif Şube Sayısı: " + aktifSubeSayisi);
        System.out.println("Toplam Çalışan Sayısı: " + toplamCalisan);
    }
    
    public void subeleriListele() {
        System.out.println("\nŞubeler Listesi:");
        if (subeler.isEmpty()) {
            System.out.println("Henüz şube bulunmamaktadır.");
        } else {
            for (Sube sube : subeler.values()) {
                sube.subeBilgileriGoster();
            }
        }
    }
    
    // Getter ve Setter metodları
    public String getMagazaAdi() { return magazaAdi; }
    public void setMagazaAdi(String magazaAdi) { this.magazaAdi = magazaAdi; }
    
    public Map<String, Sube> getSubeler() { return subeler; }
    
    public double getToplamCiro() { return toplamCiro; }
    public void setToplamCiro(double toplamCiro) { this.toplamCiro = toplamCiro; }
} 