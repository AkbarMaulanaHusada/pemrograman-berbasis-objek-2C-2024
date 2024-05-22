public abstract class Gadget implements Kamera,Bluetooth,Wifi,GPS{

    public String Merk,Model;

    public void setMerk(String merk) {
        Merk = merk;
    }

    public void setModel(String model) {
        Model = model;
    }
    
    public abstract void tampilPilih();

    // public void tampil(){
    //     System.out.println("Merk : " + Merk);
    //     System.out.println("Model : " + Model);
    // }

    @Override
    public void ambilFoto(){
        System.out.println("Mengambil foto dari -> " + Model);
    }

    @Override
    public void rekamVideo(){
        System.out.println("Merekam video dari -> " + Model);
    }

    @Override
    public void kirimFile(){
        System.out.println("Mengirim file dari -> " + Model);
    }

    @Override
    public void terimaFile(){
        System.out.println("Menerima file dari -> " + Model);
    }

    @Override
    public void cariJaringan(){
        System.out.println("Mencari jaringan dari -> " + Model);
    }

    @Override
    public void hubungkanJaringan(){
        System.out.println("Menghubungkan jaringan dari -> " + Model);
    }
    
    @Override
    public void lupakanJaringan(){
        System.out.println("Melupakan jaringan dari -> " + Model);
    }

    @Override
    public void ambilKoordinat(){
        System.out.println("Mengambil koordinat dari -> " + Model);
    }
}