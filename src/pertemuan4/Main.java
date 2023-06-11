
package pertemuan4;

public class Main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Sepeda",2020);
        kendaraan.info();
        
        Mobil mobil = new Mobil("Honda",2022, 4);
        mobil.info();
        
        Kendaraan mobil2 = new Mobil("Toyota", 2021, 2);
        mobil2.info();
    }
}
