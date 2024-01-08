import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BiodataForm extends JFrame {
    private JTextField namaField;
    private JTextField nimField;
    private JTextField jurusanField;
    private JRadioButton lakiRadioButton;
    private JRadioButton perempuanRadioButton;
    private ButtonGroup jenisKelaminGroup;
    private JComboBox<String> angkatanComboBox;
    private JTextArea hasilArea;

    public BiodataForm() {
        setTitle("Borang Biodata Mahasiswa");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel namaLabel = new JLabel("Nama:");
        namaField = new JTextField();
        JLabel nimLabel = new JLabel("NIM:");
        nimField = new JTextField();
        JLabel jurusanLabel = new JLabel("Jurusan:");
        jurusanField = new JTextField();

        JLabel jenisKelaminLabel = new JLabel("Jenis Kelamin:");
        lakiRadioButton = new JRadioButton("Laki-laki");
        perempuanRadioButton = new JRadioButton("Perempuan");
        jenisKelaminGroup = new ButtonGroup();
        jenisKelaminGroup.add(lakiRadioButton);
        jenisKelaminGroup.add(perempuanRadioButton);

        JLabel angkatanLabel = new JLabel("Angkatan:");
        String[] angkatanOptions = {"2021", "2022", "2023", "2024"};
        angkatanComboBox = new JComboBox<>(angkatanOptions);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilkanHasil();
            }
        });

        hasilArea = new JTextArea();
        hasilArea.setEditable(false);

        panel.add(namaLabel);
        panel.add(namaField);
        panel.add(nimLabel);
        panel.add(nimField);
        panel.add(jurusanLabel);
        panel.add(jurusanField);
        panel.add(jenisKelaminLabel);
        panel.add(lakiRadioButton);
        panel.add(new JLabel(""));
        panel.add(perempuanRadioButton);
        panel.add(angkatanLabel);
        panel.add(angkatanComboBox);
        panel.add(new JLabel(""));
        panel.add(submitButton);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(hasilArea), BorderLayout.CENTER);
    }

    private void tampilkanHasil() {
        String nama = namaField.getText();
        String nim = nimField.getText();
        String jurusan = jurusanField.getText();

        String jenisKelamin;
        if (lakiRadioButton.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else {
            jenisKelamin = "Perempuan";
        }

        String angkatan = (String) angkatanComboBox.getSelectedItem();

        String hasil = "Biodata Mahasiswa\n\n" +
                "Nama: " + nama + "\n" +
                "NIM: " + nim + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Jenis Kelamin: " + jenisKelamin + "\n" +
                "Angkatan: " + angkatan;

        hasilArea.setText(hasil);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BiodataForm().setVisible(true);
            }
        });
    }
}