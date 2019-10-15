/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldo;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan perhitungan
 * saldo tabungan dengan ketentuan :
 * saldo awal = Rp.3.500.000
 * Bunga/Bulan(%) = 8
 * Target Saldo = Rp.6.000.000
 * berbasis objek oriented
 */
public class hitungsaldo {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TargetSaldo saldo = new TargetSaldo();
        
        saldo.saldoAwal = 3500000;
        saldo.bunga = 0.08;
        
        saldo.targetSaldo(saldo.saldoAwal, saldo.bunga);
        
    }
    
}
