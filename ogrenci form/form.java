import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class OgrenciForm extends JFrame {
    private JTextField ogrenciNoField;
    private JTextField ogrenciAdField;
    private JTextField ogrenciSoyadField;
    private JTextField ogrenciBolumField;
    private JComboBox<String> derslerComboBox;
    private JButton kaydetButton;

    public OgrenciForm() {
        setTitle("Öğrenci Formu");
        setSize(400, 300);

        ogrenciNoField = new JTextField(20);
        ogrenciAdField = new JTextField(20);
        ogrenciSoyadField = new JTextField(20);
        ogrenciBolumField = new JTextField(20);
        derslerComboBox = new JComboBox<>();
        kaydetButton = new JButton("Kaydet");

       
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Biyoloji");
    
        for (String ders : dersler) {
            derslerComboBox.addItem(ders);
        }

        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Ogrenci yeniOgrenci = new Ogrenci();
                yeniOgrenci.ogrenciNo = ogrenciNoField.getText();
                yeniOgrenci.ogrenciAd = ogrenciAdField.getText();
                yeniOgrenci.ogrenciSoyad = ogrenciSoyadField.getText();
                yeniOgrenci.ogrenciBolum = ogrenciBolumField.getText();
                yeniOgrenci.ogrenciDersler = derslerComboBox.getSelectedItem().toString();

                
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Öğrenci No: "));
        panel.add(ogrenciNoField);
        panel.add(new JLabel("Ad: "));
        panel.add(ogrenciAdField);
        panel.add(new JLabel("Soyad: "));
        panel.add(ogrenciSoyadField);
        panel.add(new JLabel("Bölüm: "));
        panel.add(ogrenciBolumField);
        panel.add(new JLabel("Dersler: "));
        panel.add(derslerComboBox);
        panel.add(kaydetButton);

        add(panel);
    }
}

class OgretimGorevlisiForm extends JFrame {
    private JTextField ogretmenNoField;
    private JTextField adField;
    private JTextField soyadField;
    private JTextField bolumField;
    private JComboBox<String> derslerComboBox;
    private JButton kaydetButton;

    public OgretimGorevlisiForm() {
        setTitle("Öğretim Görevlisi Formu");
        setSize(400, 300);

        ogretmenNoField = new JTextField(20);
        adField = new JTextField(20);
        soyadField = new JTextField(20);
        bolumField = new JTextField(20);
        derslerComboBox = new JComboBox<>();
        kaydetButton = new JButton("Kaydet");

        
        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Biyoloji");
      
        for (String ders : dersler) {
            derslerComboBox.addItem(ders);
        }

        kaydetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Öğretim Görevlisi bilgilerini al ve dosyaya kaydet (Bu kısmı geliştirmeniz gerekebilir)
                OgretimGorevlisi yeniGorevlisi = new OgretimGorevlisi();
                yeniGorevlisi.ogretmenNo = ogretmenNoField.getText();
                yeniGorevlisi.ad = adField.getText();
                yeniGorevlisi.soyad = soyadField.getText();
                yeniGorevlisi.bolum = bolumField.getText();
                yeniGorevlisi.verdigiDersler = derslerComboBox.getSelectedItem().toString();

                // Burada dosyaya kaydetme işlemleri yapılabilir
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Öğretmen No: "));
        panel.add(ogretmenNoField);
        panel.add(new JLabel("Ad: "));
        panel.add(adField);
        panel.add(new JLabel("Soyad: "));
        panel.add(soyadField);
        panel.add(new JLabel("Bölüm: "));
        panel.add(bolumField);
        panel.add(new JLabel("Verdiği Dersler: "));
        panel.add(derslerComboBox);
        panel.add(kaydetButton);

        add(panel);
    }
}
