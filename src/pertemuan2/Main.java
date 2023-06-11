/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author ahmad
 */
public class Main {

    public static void main(String[] args) {

// Method constructor
        Sepatu sepatu1 = new Sepatu("Sneakers", 40, 500000);
// Method mutator
        sepatu1.setJenis("awio");
        sepatu1.setUkuran(45);
        sepatu1.setHarga(600000);
//Menampilkan informasi sepatu
        
System.out.println("Jenis Sepatu 1: " + sepatu1.getJenis());
System.out.println("Ukuran Sepatu 1: " + sepatu1.getUkuran());
System.out.println("Harga Sepatu 1: " + sepatu1.getHarga());
}
}
