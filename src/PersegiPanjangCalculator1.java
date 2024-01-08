import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersegiPanjangCalculator1 extends JFrame {
    private JTextField panjangField;
    private JTextField lebarField;
    private JTextField kelilingField;
    private JTextField luasField;

    public PersegiPanjangCalculator1() {
        setTitle("Persegi Panjang Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel panjangLabel = new JLabel("Panjang:");
        panjangField = new JTextField();
        JLabel lebarLabel = new JLabel("Lebar:");
        lebarField = new JTextField();
        JLabel kelilingLabel = new JLabel("Keliling:");
        kelilingField = new JTextField();
        kelilingField.setEditable(false);
        JLabel luasLabel = new JLabel("Luas:");
        luasField = new JTextField();
        luasField.setEditable(false);

        JButton hitungButton = new JButton("Hitung");
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungKelilingDanLuas();
            }
        });

        panel.add(panjangLabel);
        panel.add(panjangField);
        panel.add(lebarLabel);
        panel.add(lebarField);
        panel.add(kelilingLabel);
        panel.add(kelilingField);
        panel.add(luasLabel);
        panel.add(luasField);

        add(panel, BorderLayout.CENTER);
        add(hitungButton, BorderLayout.SOUTH);
    }

    private void hitungKelilingDanLuas() {
        try {
            double panjang = Double.parseDouble(panjangField.getText());
            double lebar = Double.parseDouble(lebarField.getText());

            double keliling = 2 * (panjang + lebar);
            double luas = panjang * lebar;

            kelilingField.setText(String.format("%.2f", keliling));
            luasField.setText(String.format("%.2f", luas));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan bilangan yang valid.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PersegiPanjangCalculator1().setVisible(true);
            }
        });
    }
}