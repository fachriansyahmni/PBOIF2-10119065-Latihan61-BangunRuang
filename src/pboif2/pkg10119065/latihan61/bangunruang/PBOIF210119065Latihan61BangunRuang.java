package pboif2.pkg10119065.latihan61.bangunruang;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung volume bangun ruang
 */
public class PBOIF210119065Latihan61BangunRuang {
    
    public static void main(String[] args) {
        
        Bola bola = new Bola();
        bola.setR(7);
        System.out.printf("Hasil : V = %.1f cm^3 \n", bola.volume());
        
        Tabung tabung = new Tabung();
        tabung.setR(10);
        tabung.setTinggi(21);
        System.out.printf("Hasil : V = %.1f cm^3 \n", tabung.volume());
        
        Kerucut kerucut = new Kerucut();
        kerucut.setR(14);
        kerucut.setTinggi(9);
        System.out.printf("Hasil : V = %.1f cm^3 \n", kerucut.volume());
        
    }
    
}
