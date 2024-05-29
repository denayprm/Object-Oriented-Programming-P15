import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lingkaran {
    private JPanel VolumePanel;
    private JLabel aplikasiPenghitungVolumeBalokLabel;
    private JTextField tfPanjang;
    private JTextField tfLebar;
    private JButton resetButton;
    private JButton keluarButton;
    private JTextField tfTinggi;
    private JTextField tfVolume;
    private JButton hitungButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lingkaran");
        frame.setContentPane(new Lingkaran().VolumePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public Lingkaran() {
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //deklarasi variabel
                double panjang, lebar, tinggi, volume;

                //setting input
                panjang = Double.parseDouble(tfPanjang.getText());
                lebar = Double.parseDouble(tfLebar.getText());
                tinggi = Double.parseDouble(tfTinggi.getText());

                //hitung volume
                volume = panjang*lebar*tinggi;

                //setting output volume
                tfVolume.setText(String.valueOf(volume));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfPanjang.setText("");
                tfLebar.setText("");
                tfTinggi.setText("");
                tfVolume.setText("");
                tfPanjang.requestFocus();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
