package pboif2.pkg10119065.latihan61.bangunruang;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program menghitung volume bangun ruang
 */
public class Bola extends BangunRuang{
    @Override
    public double volume()
    {
        return Math.PI * 4/3 * Math.pow(r, 3);
    }
}
