package koleksi;
        
public class Skripsi extends Buku{
    public String NPM;

    public Skripsi(String judul_skripsi,String penerbit_skripsi,String penulis_skripsi, String NPM, int tahun_terbit_skripsi){
        super(judul_skripsi, penulis_skripsi, penerbit_skripsi, tahun_terbit_skripsi);
        this.NPM = NPM;
    }
    public String toString(){
        return super.toString()+
            ", NPM: "+this.NPM+"\n";
    }
    
}