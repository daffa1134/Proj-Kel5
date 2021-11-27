
public class Makanan {
    private String nama;
    private int harga;
    private String jenis;
    private String tag;
    private String negara;

    public void Makanan(String nama, int harga, String jenis, String tag, String negara) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
        this.tag = tag;
        this.negara = negara;   
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }

    public String getTag() {
        return tag;
    }

    public String getNegara() {
        return negara;
    }

}
