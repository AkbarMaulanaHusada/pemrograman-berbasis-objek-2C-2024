public class Smartphone extends Gadget{
    
    @Override
    public void tampilPilih(){
        System.out.println("Smartphone : " + Merk);
        System.out.println("Model      : " + Model);
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
