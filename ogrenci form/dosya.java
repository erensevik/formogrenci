import java.io.*;
import java.util.ArrayList;

public class DosyaIslemleri {

    public static void dersKaydet(ArrayList<Ders> dersListesi, String dosyaAdi) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(dosyaAdi))) {
            outputStream.writeObject(dersListesi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   
    public static void ogrenciKaydet(ArrayList<Ogrenci> ogrenciListesi, String dosyaAdi) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(dosyaAdi))) {
            outputStream.writeObject(ogrenciListesi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ogretimGorevlisiKaydet(ArrayList<OgretimGorevlisi> ogretimGorevlisiListesi, String dosyaAdi) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(dosyaAdi))) {
            outputStream.writeObject(ogretimGorevlisiListesi);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  
    public static ArrayList<Ders> dersListesiOku(String dosyaAdi) {
        ArrayList<Ders> dersListesi = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dosyaAdi))) {
            dersListesi = (ArrayList<Ders>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dersListesi;
    }

  
    public static ArrayList<Ogrenci> ogrenciListesiOku(String dosyaAdi) {
        ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dosyaAdi))) {
            ogrenciListesi = (ArrayList<Ogrenci>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ogrenciListesi;
    }

  
    public static ArrayList<OgretimGorevlisi> ogretimGorevlisiListesiOku(String dosyaAdi) {
        ArrayList<OgretimGorevlisi> ogretimGorevlisiListesi = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(dosyaAdi))) {
            ogretimGorevlisiListesi = (ArrayList<OgretimGorevlisi>) inputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return ogretimGorevlisiListesi;
    }
}
