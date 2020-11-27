package pboif2.pkg10119065.latihan61.bangunruang;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung volume bangun ruang
 */
public class Kerucut extends BangunRuang{
    private double tinggi;

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume()
    {
        return Math.PI * 1/3 * Math.pow(r, 2) * tinggi;
    }
}
