import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame {
        Label titleLabel, utsLabel, uasLabel, hasilLabel;

         TextField utsField, uasField;
        Button hitungButton;

        MataKuliah pemlan = new Pemlan();

        public MainFrame() {
            setLayout(new FlowLayout());
            setSize(300,200);

            titleLabel = new Label("Hitung Nilai Akhir Pemlan");
            utsLabel = new Label("Nilai UTS:");
            uasLabel = new Label("Nilai UAS:");
            hasilLabel = new Label("Hasil:");
            utsField = new TextField(10);
            uasField = new TextField(10);
            hitungButton = new Button("Hitung");

            add(titleLabel);
            add(utsLabel);
            add(utsField);
            add(uasLabel);
            add(uasField);
            add(hitungButton);
            add(hasilLabel);

            hitungButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                    int nilaiUts = Integer.parseInt(utsField.getText());
                    int nilaiUas = Integer.parseInt(uasField.getText());
                    pemlan.setNilai(nilaiUts, nilaiUas);
                    double nilaiAkhir = pemlan.hitungNilaiAkhir();
                    String grade = pemlan.getGrade();
                    hasilLabel.setText(String.format("Hasil: %.2f (%s)", nilaiAkhir, grade));
                } catch (NumberFormatException ex) {
                    hasilLabel.setText("Input tidak valid!");
                }
            }
            });

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }

        public static void main(String[] args) {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setTitle("Nilai Akhir Pemlan");
            mainFrame.setVisible(true);
        }
    }


