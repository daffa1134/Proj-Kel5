/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

import java.util.ArrayList;

/**
 *
 * @author Kelompok 5
 */
public class DaftarMenu {
    
    private final Makanan spaghetti;
    private final Makanan nasiGoreng;
    private final Makanan rotiDaging;
    private final Makanan koftaSandwich;
    private final Minuman ocha;
    private final Minuman iceABCD;
    private final Minuman thaiTea;
    private ArrayList<String> tagSpaghetti = new ArrayList<>();
    private ArrayList<String> tagNasiGoreng = new ArrayList<>();
    private ArrayList<String> tagRotiDaging = new ArrayList<>();
    private ArrayList<String> tagKoftaSandwich = new ArrayList<>();
    private ArrayList<String> tagOcha = new ArrayList<>();
    private ArrayList<String> tagIceABCD = new ArrayList<>();
    private ArrayList<String> tagThaiTea = new ArrayList<>();

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

        tagOcha.add("pahit");

        ocha = new Minuman("Ocha", 10000, false, false, tagOcha, "Jepang");

        tagIceABCD.add("manis");
        tagIceABCD.add("milk");
        
        iceABCD = new Minuman("Ice ABCD", 7000, true, false, tagIceABCD, "Malaysia");

        tagThaiTea.add("manis");
        tagThaiTea.add("milk");

        thaiTea = new Minuman("Thai Tea", 10000, true, false, tagThaiTea, "Thailand");
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

    public Minuman getOcha() {
        return this.ocha;
    }

    public Minuman getIceABCD() {
        return this.iceABCD;
    }

    public Minuman getThaiTea() {
        return this.thaiTea;
    }
}