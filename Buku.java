package koleksi;
        
public class Buku extends Koleksi{
    public String penulis;

    public Buku(String judul_buku,String penerbit_buku,String penulis_buku, int tahun_terbit_buku){
        super(judul_buku, penerbit_buku, tahun_terbit_buku);
        
        this.penulis = penulis_buku;
    }
    
    public String toString(){
        return super.toString()+ ", Edisi: "+this.penulis+"\n";
    }
    
}
