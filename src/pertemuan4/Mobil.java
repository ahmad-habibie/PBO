
package pertemuan4;

class Mobil extends Kendaraan{
    private int jumlahPintu;


public Mobil(String merek, int tahun, int jumlahPintu){
    super(merek, tahun);
    this.jumlahPintu = jumlahPintu;
}

public int getJumlahPintu(){
    return jumlahPintu;
}

public void info() {
    System.out.println("Mobil " + getMerek() + " tahun " + getTahun() + " dengan " + jumlahPintu+ " pintu");
}
}