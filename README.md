# Nesne Yönelimli Programlama Ödev Soruları (BLP233)

Bu repository, 2025 yılı BLP233 Nesne Yönelimli Programlama dersi için hazırlanmış örnek projeleri içermektedir.

## Projeler

### 1. Harf Ödevi
ASCII art kullanarak harfleri ekrana yazdıran bir uygulama.

#### Özellikler:
- Harfleri ASCII karakterleri ile görsel olarak oluşturma
- Büyük harfleri destekleme

#### Örnek Çıktı:
```
   ###    
  #   #   
 #     #  
 ####### 
 #     #  
 #     #  
 #     #  
```

### 2. Şirket Ödevi
Bir şirketin çalışanlarını ve departmanlarını yöneten bir sistem.

#### Sınıflar:
- `Calisan`: Temel çalışan bilgileri ve metodları
- `Mudur`: Çalışan sınıfından kalıtım alan, ekip yönetimi özellikleri olan sınıf
- `Sirket`: Genel şirket yönetimi için sınıf

#### Özellikler:
- Çalışan ekleme/çıkarma
- Departman yönetimi
- Maaş yönetimi
- Performans değerlendirmesi
- Toplantı düzenleme

### 3. Taşıt Ödevi
Farklı taşıt türlerini yöneten bir sistem.

#### Sınıflar:
- `Tasit`: Temel taşıt özellikleri için abstract sınıf
- `Otomobil`: Klima, kapı sayısı gibi özellikleri olan sınıf
- `Motosiklet`: Kask kontrolü, motor hacmi gibi özellikleri olan sınıf
- `Kamyon`: Yük kapasitesi, dingil sayısı gibi özellikleri olan sınıf

#### Özellikler:
- Taşıt çalıştırma/durdurma
- Hız kontrolü
- Güvenlik kontrolleri
- Özel fonksiyonlar (klima, yük taşıma, vb.)

### 4. Mağaza Ödevi
Çok şubeli bir mağaza zincirini yöneten bir sistem.

#### Sınıflar:
- `Magaza`: Ana mağaza yönetimi
- `Sube`: Şube operasyonları
- `Calisan`: Çalışan bilgileri ve işlemleri

#### Özellikler:
- Şube ekleme/çıkarma
- Çalışan yönetimi
- Ciro takibi
- Şubeler arası çalışan transferi
- Performans raporlama

## Kurulum ve Çalıştırma

1. Repository'yi klonlayın:
```bash
https://github.com/Gurkayx/Nesne-yonelimli-programlama-odev-sorulari.git
```

2. İlgili projenin dizinine gidin:
```bash
cd [proje-adi]
```

3. Java dosyalarını derleyin:
```bash
javac src/main/java/com/gurkay/*.java
```

4. Programı çalıştırın:
```bash
java -cp src/main/java com.gurkay.Main
```

## Gereksinimler

- Java JDK 8 veya üzeri
- Temel nesne yönelimli programlama bilgisi


## Lisans

Bu projeler eğitim amaçlı olup, MIT lisansı altında dağıtılmaktadır.

## İletişim

Sorularınız için (gmail): [gurkaycilingerr@gmail.com] 
Sorularınız için (instagram): [www.instagram.com/gurkaycilinger] 
