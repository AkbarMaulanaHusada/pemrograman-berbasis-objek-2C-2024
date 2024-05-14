package Mobil;

public class mobil{
    String merk, model;
    int tahunProduksi;

    void setAtribute(String merk, String model, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    } 

    void showFeature(){
        System.out.println("Kelebihan dari mobil ini.");
    }

    void display(){
        System.out.println("\nMerk           : " + merk);
        System.out.println("Model          : " + model);
        System.out.println("Tahun Produksi : " + tahunProduksi);
    }
}
