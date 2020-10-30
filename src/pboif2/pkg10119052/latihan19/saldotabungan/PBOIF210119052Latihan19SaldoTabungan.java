package pboif2.pkg10119052.latihan19.saldotabungan;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * NAMA   : Rizki Dwi nugraha
 * KELAS  : IF-2
 * NIM    : 10119052
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * sebuah saldo tabungan di suatu bank
 */ 
public class PBOIF210119052Latihan19SaldoTabungan {
    public static int hitung(int saldo, int bunga){
        int Bunga = (saldo * bunga) / 100;
        int saldoTotal = saldo + Bunga;
        return saldoTotal;
    } 
    public static void main(String[] args) {
        Scanner bank = new Scanner(System.in);
        System.out.print("Saldo Awal : Rp.");
        int saldoAwal = bank.nextInt();
        System.out.print("Bunga/Bulan(%) : ");
        int bunga = bank.nextInt();
        System.out.print("Lama (Bulan) : ");
        int bulan = bank.nextInt();
        System.out.println();
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
         for (int i=1; i<=bulan; i++) {
         System.out.println("Saldo di Bulan ke-"+i+" "+kursIndonesia.format(hitung(saldoAwal,bunga)));
         saldoAwal = hitung(saldoAwal,bunga);
       }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Developed By Rizki Dwi Nugraha"); 
    }
    
}
