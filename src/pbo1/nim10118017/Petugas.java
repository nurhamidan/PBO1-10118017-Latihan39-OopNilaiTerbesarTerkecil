package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menentukan nilai terbesar dan terkecil dari kumpulan data nilai.
 * 
 */
public class Petugas {
    public String nama;
    public int[] dataNilai;
    public int nilaiTerbesar;
    public int nilaiTerkecil;
    
    public void hitungTerbesarTerkecil() {
        //Menampilkan semua nilai.
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        nilaiTerbesar = dataNilai[0];
        nilaiTerkecil = dataNilai[0];
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " = " + dataNilai[i]);
        }
        
        //Mencari nilai terbesar dan terkecil.
        for (int i = 0; i < (dataNilai.length - 1); i++) {
            if (nilaiTerbesar < dataNilai[i + 1]) {
                nilaiTerbesar = dataNilai[i + 1];
            }
            if (nilaiTerkecil > dataNilai[i + 1]) {
                nilaiTerkecil = dataNilai[i + 1];
            }
        }
    }
}
