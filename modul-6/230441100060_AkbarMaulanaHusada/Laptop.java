public class Laptop extends Gadget{

    @Override
    public void tampilPilih(){
        System.out.println("Laptop : " + Merk);
        System.out.println("Model  : " + Model);
        ambilFoto();
        rekamVideo();
        kirimFile();
        terimaFile();
        cariJaringan();
        hubungkanJaringan();
        lupakanJaringan();
        ambilKoordinat();
    }
}
