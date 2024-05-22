public class Tablet extends Gadget{

    @Override
    public void tampilPilih(){
        System.out.println("Tablet : " + Merk);
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