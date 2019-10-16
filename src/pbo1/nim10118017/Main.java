package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Petugas petugas = new Petugas();
        Scanner scanner = new Scanner(System.in);
        
        //Memasukkan nilai
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        petugas.nama = scanner.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        petugas.dataNilai = new int[scanner.nextInt()];
        
        //Proses memasukkan nilai mahasiswa
        for (int i = 0; i < petugas.dataNilai.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i+1) + " = ");
            petugas.dataNilai[i] = scanner.nextInt();
        }
        
        petugas.hitungTerbesarTerkecil();
        
        //Menampilkan nilai terbesar dan terkecil.
        System.out.println("\nNilai terbesar adalah " + petugas.nilaiTerbesar);
        System.out.println("Nilai terkecil adalah " + petugas.nilaiTerkecil + "\n");
        System.out.println("Petugas : " + petugas.nama);
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
