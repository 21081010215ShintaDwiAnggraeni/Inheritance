package koleksi;
        
public class Koleksi{
    public String judul;
    public String penerbit;
    public int tahun;

    public Koleksi(String judul_koleksi,String penerbit, int tahun_terbit){
        this.judul = judul_koleksi;
        this.penerbit = penerbit;
        this.tahun = tahun_terbit;
    }

    public String toString(){
        return "Koleksi: Judul=" + judul +", Penerbit=" + penerbit +", Tahun terbit="+ tahun +" ";
    }
}