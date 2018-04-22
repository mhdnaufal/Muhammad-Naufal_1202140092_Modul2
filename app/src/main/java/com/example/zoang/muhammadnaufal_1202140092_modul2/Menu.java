package com.example.zoang.muhammadnaufal_1202140092_modul2;

/**
 * Created by ASUS on 2/17/2018.
 */

public class Menu {
    private int gambar, komposisi;
    private String nama, harga;
    public Menu(int gambar, String nama, String harga, int komposisi) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.komposisi = komposisi;
    }

    public String getHarga() {
        return harga;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }
    public int getKomposisi() {
        return komposisi;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
