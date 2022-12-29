import javax.swing.*;

public class App {


    public static void main(String[] args) throws Exception {
    double uts=0, uas=0, tugas=0, nilaiUTS, nilaiUAS, nilaiTugas, nilaiTotal;
    String nama = JOptionPane.showInputDialog( "Input Nama ");
    String nim = JOptionPane.showInputDialog("Input NIM ");
    String matkul = JOptionPane.showInputDialog("Input Matkul");
    uts = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai UTS "));
    uas = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai UAS "));
    tugas = Double.parseDouble(JOptionPane.showInputDialog("Input Nilai TUGAS "));
    nilaiUTS = uts*0.35;
    nilaiUAS = uts*0.4;
    nilaiTugas = tugas*0.25;
    nilaiTotal = nilaiUTS + nilaiUAS + nilaiTugas;
    
    JOptionPane.showMessageDialog(null, "Data Nilai Mahasiswa \n Nama : " + nama + 
    "\n Nim \t : " + nim + 
    "\n Mata kuliah \t : " + matkul + 
    "\n Nilai UTS \t : " + nilaiUTS + 
    "\n Nilai UAS \t : " + nilaiUAS + 
    "\n Nilai Total \t : " + nilaiTotal );
    }
}
