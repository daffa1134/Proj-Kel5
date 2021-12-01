package Method;

import java.util.ArrayList;

public class Minuman {
    private String nama;
    private int harga;
    private boolean dingin;
    private boolean caffein;
    private final ArrayList<String> tag;
    private String negara;
    
    /**
     * 
     * @param nama Nama minuman
     * @param harga Harga minuman
     * @param dingin Dingin
     * @param caffein Mengandung kafein
     * @param tag Tag
     * @param negara Asal negara
     */
    public Minuman(String nama, int harga, boolean dingin, boolean caffein, ArrayList<String> tag, String negara){
        this.nama = nama;
        this.harga = harga;
        this.dingin = dingin;
        this.caffein = caffein;
        this.tag = tag;
        this.negara = negara;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }
    
    public boolean getDingin() {
        return this.dingin;
    }

    public boolean getCaffein() {
        return this.caffein;
    }

    public String getTag(int index) {
        return this.tag.get(index);
    }

    public String getNegara() {
        return this.negara;
    }
}