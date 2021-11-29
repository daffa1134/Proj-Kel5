/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;
import java.util.ArrayList;
/**
 *
 * @author Kelompok 5
 */
public class DaftarMenu {
    
     private Makanan spaghetti;
    private Makanan nasiGoreng;
    private Makanan rotiDaging;
    private Makanan koftaSandwich;
    private ArrayList<Makanan> menuMakanan = new ArrayList<>();
    private ArrayList<String> tagSpaghetti = new ArrayList<>();
    private ArrayList<String> tagNasiGoreng = new ArrayList<>();
    private ArrayList<String> tagRotiDaging = new ArrayList<>();
    private ArrayList<String> tagKoftaSandwich = new ArrayList<>();

    public DaftarMenu() {
        
        tagSpaghetti.add("manis");
        tagSpaghetti.add("asam");
        tagSpaghetti.add("pedas");
        tagSpaghetti.add("sehat");
    
        spaghetti = new Makanan("Spaghetti", 10000, false, true, tagSpaghetti, "Italia");
          
        tagNasiGoreng.add("asin");
        tagNasiGoreng.add("asam");
        tagNasiGoreng.add("gurih");
        tagNasiGoreng.add("sehat");

        nasiGoreng = new Makanan("Nasi Goreng", 15000, false, true, tagNasiGoreng, "Indonesia");

        tagRotiDaging.add("manis");
        tagRotiDaging.add("asam");
        tagRotiDaging.add("cepat saji");

        rotiDaging = new Makanan("Roti Daging", 5000, false, false, tagRotiDaging, "China");

        
        tagKoftaSandwich.add("asam");
        tagKoftaSandwich.add("pedas");
        tagKoftaSandwich.add("cepat saji");

        koftaSandwich = new Makanan("Kofta Sandwich", 13000, false, false, tagKoftaSandwich, "Mesir");

        menuMakanan.add(spaghetti);
        menuMakanan.add(nasiGoreng);
        menuMakanan.add(rotiDaging);
        menuMakanan.add(koftaSandwich);

    }

    public int getJlhMakanan() {
        return this.menuMakanan.size();
    }

    public Makanan getSpaghetti() {
        return this.spaghetti;
    }
    
    public Makanan getNasGor() {
        return this.nasiGoreng;
    }

    public Makanan getRotiDaging() {
        return this.rotiDaging;
    }

    public Makanan getKofta() {
        return this.koftaSandwich;
    }
    
}
