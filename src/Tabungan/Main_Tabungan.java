/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabungan;

/**
 *
 * @author Agus
 */
public class Main_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan A = new Tabungan(1000000,"IDR");
        System.out.println("Saldo saat ini = Rp"+A.getSaldo("IDR"));
        System.out.println("Mengamil saldo sebesar = Rp500.000");
        A.ambil(500000, "IDR");
        System.out.println("Saldo saat ini = Rp"+A.getSaldo("IDR"));
        System.out.println("======================================");
        Tabungan B = new Tabungan(10000,"JPY");
        System.out.println("Saldo saat ini = "+B.getSaldo("JPY")+"JPY");
        System.out.println("Mengamil saldo sebesar = 5000"+"JPY");
        B.ambil(5000, "JPY");
        System.out.println("Saldo saat ini = "+B.getSaldo("JPY")+"JPY");
    }
}
