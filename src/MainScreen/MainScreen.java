package MainScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame {
    private JPanel panelMain;
    private JList JListMahasiswa;
    private JTextField textFieldNama;
    private JTextField textFieldNim;
    private JTextField textFieldKelas;
    private JTextField textFieldJurusan;
    private JTextField textFieldFakultas;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel JLnama;
    private JLabel JLnim;
    private JLabel JLkelas;
    private JLabel JLjurusan;
    private JLabel JLfakultas;

    class Mahasiswa{
        private String nim;
        private String nama;
        private String kelas;
        private String jurusan;
        private String fakultas;


        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public String getKelas() {
            return kelas;
        }

        public void setKelas(String kelas) {
            this.kelas = kelas;
        }

        public String getJurusan() {
            return jurusan;
        }

        public void setJurusan(String jurusan) {
            this.jurusan = jurusan;
        }

        public String getFakultas() {
            return fakultas;
        }

        public void setFakultas(String fakultas) {
            this.fakultas = fakultas;
        }
    }

    public MainScreen() {
       this.setContentPane(panelMain);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.pack();
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void clearForm() {
        textFieldNama.setText("");
        textFieldFakultas.setText("");
        textFieldJurusan.setText("");
        textFieldKelas.setText("");
        textFieldNim.setText("");

    }
    public static void main(String [] args) {
        MainScreen mainScreen = new MainScreen();
        mainScreen.setVisible(true);
    }
}
