/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan20;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 Nama :Ma'rifatu Khirzah
 NIM :22205025
 Prodi :Teknik Informatika
 Deskripsi :Menampilkan program Perhitungan target saldo tabungan
 */
public class Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bulan = 0;
        
        System.out.print("Saldo Awal: ");
        int saldoAwal = scanner.nextInt();

        System.out.print("Bunga/Bulan (%): ");
        int bungaPerBulan = scanner.nextInt();

        System.out.print("saldo target: ");
        int saldoTarget = scanner.nextInt();

        
        while (saldoAwal < saldoTarget) {
            bulan++;
            int bunga = saldoAwal * bungaPerBulan / 100 ;
            saldoAwal += bunga;
            System.out.println("Saldo di bulan ke-" + bulan + "= Rp." + saldoAwal);
            
        }
    }
}
