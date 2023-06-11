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
public class Sepatu {
    String jenis;
    int ukuran;
    int harga;
//Method Constructor
public Sepatu(String jenis, int ukuran, int harga){
    this.jenis = jenis;
    this.ukuran = ukuran;
    this.harga = harga;
}    
//Method Mutator
public void setJenis(String jenis){
    this.jenis = jenis;
}
public void setUkuran(int ukuran){
    this.ukuran = ukuran;
}
public void setHarga(int harga){
    this.harga = harga;
}
public String getJenis() {
return jenis;
}
public int getUkuran() {
return ukuran;
}
public int getHarga() {
return harga;
}
}