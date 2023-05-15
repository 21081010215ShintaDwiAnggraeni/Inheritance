package koleksi;
        
public class Majalah extends Koleksi{
    public String edisi;

    public Majalah(String judul_majalah,String penerbit_majalah, String edisi, int tahun_terbit_majalah){
        super(judul_majalah, penerbit_majalah, tahun_terbit_majalah);
        this.edisi = edisi;
    }
    public String toString(){
        return super.toString()+
            ", Edisi: "+this.edisi+"\n";
    }
    
}