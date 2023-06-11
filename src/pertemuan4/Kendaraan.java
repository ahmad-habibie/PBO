
package pertemuan4;

public class Kendaraan {
    private String merek;
    private int tahun;
    
    public Kendaraan (String merek, int tahun){
        this.merek = merek;
        this.tahun = tahun;
    }
    public String getMerek(){
        return merek;
    }
    public int getTahun(){
        return tahun;
    }
    public void info(){
        System.out.println("Kendaraan " + merek + " ");
    }
}
