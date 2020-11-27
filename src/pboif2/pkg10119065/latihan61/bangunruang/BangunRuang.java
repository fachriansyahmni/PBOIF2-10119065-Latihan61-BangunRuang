package pboif2.pkg10119065.latihan61.bangunruang;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung volume bangun ruang
 */
public abstract class BangunRuang {
    protected int r;
    
    public void setR(int r) {
        this.r = r;
    }
    
    public abstract double volume();
}
