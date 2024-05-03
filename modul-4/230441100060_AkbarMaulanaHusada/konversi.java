package Konversi;

public abstract class konversi{
    double nilai;
    String awal;
    String akhir;

    konversi(double nilai, String awal, String akhir){
        this.nilai = nilai;
        this.awal = awal;
        this.akhir = akhir;
    }

    protected abstract double konversikan();
    protected abstract void display();

    
}