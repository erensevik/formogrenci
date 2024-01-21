
class DersForm extends JFrame {
   

    private ArrayList<Ders> dersListesi = new ArrayList<>();

    public DersForm() {
       

        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         
                Ders yeniDers = new Ders();
                yeniDers.dersKodu = dersKoduField.getText();
                yeniDers.dersAd = dersAdField.getText();
                yeniDers.dersDonem = dersDonemField.getText();
                yeniDers.ogretimGorevlisi = ogretimGorevlisiField.getText();

                dersListesi.add(yeniDers);
                DosyaIslemleri.dersKaydet(dersListesi, "dersler.dat");
            }
        });

    }
}


class OgrenciForm extends JFrame {


    private ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();

    public OgrenciForm() {
        

        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                Ogrenci yeniOgrenci = new Ogrenci();
                yeniOgrenci.ogrenciNo = ogrenciNoField.getText();
                yeniOgrenci.ogrenciAd = ogrenciAdField.getText();
                yeniOgrenci.ogrenciSoyad = ogrenciSoyadField.getText();
                yeniOgrenci.ogrenciBolum = ogrenciBolumField.getText();
                yeniOgrenci.ogrenciDersler = derslerComboBox.getSelectedItem().toString();

                ogrenciListesi.add(yeniOgrenci);
                DosyaIslemleri.ogrenciKaydet(ogrenciListesi, "ogrenciler.dat");
            }
        });

       
    }
}


class OgretimGorevlisiForm extends JFrame {


    private ArrayList<OgretimGorevlisi> ogretimGorevlisiListesi = new ArrayList<>();

    public OgretimGorevlisiForm() {
   
        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                OgretimGorevlisi yeniGorevlisi = new OgretimGorevlisi();
                yeniGorevlisi.ogretmenNo = ogretmenNoField.getText();
                yeniGorevlisi.ad = adField.getText();
                yeniGorevlisi.soyad = soyadField.getText();
                yeniGorevlisi.bolum = bolumField.getText();
                yeniGorevlisi.verdigiDersler = dersler
