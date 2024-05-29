import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorMini {
    private JPanel KalkulatorMini;
    private JButton akKurang;
    private JButton akKali;
    private JButton akBagi;
    private JButton akPersen;
    private JTextField tfAngka2;
    private JTextField tfAngka1;
    private JButton akTambah;
    private JTextField tfHasil;

    public static void main(String[] args) {
        JFrame frame = new JFrame("KalkulatorMini");
        frame.setContentPane(new KalkulatorMini().KalkulatorMini);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public KalkulatorMini() {
        akTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angka1, angka2,hasil;

                angka1 = Double.parseDouble(tfAngka1.getText());
                angka2 = Double.parseDouble(tfAngka2.getText());

                hasil = angka1 + angka2;

                tfHasil.setText(String.valueOf(hasil));
            }
        });
        akKurang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angka1, angka2,hasil;

                angka1 = Double.parseDouble(tfAngka1.getText());
                angka2 = Double.parseDouble(tfAngka2.getText());

                hasil = angka1 - angka2;

                tfHasil.setText(String.valueOf(hasil));
            }
        });
        akKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angka1, angka2,hasil;

                angka1 = Double.parseDouble(tfAngka1.getText());
                angka2 = Double.parseDouble(tfAngka2.getText());

                hasil = angka1 * angka2;

                tfHasil.setText(String.valueOf(hasil));
            }
        });
        akBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angka1, angka2, hasil;

                angka1 = Double.parseDouble(tfAngka1.getText());
                angka2 = Double.parseDouble(tfAngka2.getText());

                hasil = angka1 / angka2;

                tfHasil.setText(String.valueOf(hasil));
            }
        });
        akPersen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double angka1, angka2,hasil1,hasil2;

                angka1 = Double.parseDouble(tfAngka1.getText());
                angka2 = Double.parseDouble(tfAngka2.getText());

                hasil1 = angka1/100;
                hasil2 = angka2/100;

                tfHasil.setText("Angka 1 : "+hasil1 +"% dan Angka 2 : "+ hasil2 +"%");
            }
        });
    }
}
