import java.util.*;
public class Main {

    public static void main(String[] args) {
        try (Scanner inputUser = new Scanner(System.in)) {
            ArrayList<Gadget> listObj = new ArrayList<>();

            boolean while1 = true;
            Gadget elektronik = null;
            while (while1) {
                
                boolean while2 = true;
                while (while2) {
                    System.out.println("<--------Pilih-------->");
                    System.out.println("Opsi 1 : Tambah data");
                    System.out.println("Opsi 2 : Tampilkan data");
                    System.out.println("Opsi 3 : Pilih data");
                    System.out.println("Opsi 4 : hapus data");
                    System.out.println("Opsi 5 : edit data");
                    System.out.println("Opsi 6 : keluar");
                    System.out.print("Pilih (1 / 2  / 3 / 4 / 5 / 6) : ");
                    String Pilih = inputUser.nextLine();

                    boolean while3 = true;
                    switch (Pilih) {
                        case "1":
                            while (while3) {
                                System.out.println("<-----Pilih jenis----->");
                                System.out.println("Jenis 1 : Smartphone");
                                System.out.println("Jenis 2 : Tablet");
                                System.out.println("Jenis 3 : Laptop");
                                System.out.print("Input (1 / 2 / 3) : ");
                                String PilihJenis = inputUser.nextLine();

                                switch (PilihJenis) {
                                    case "1":
                                        elektronik = new Smartphone();
                                        while3 = false;
                                        break;
                                    case "2":
                                        elektronik = new Tablet();
                                        while3 = false;
                                        break;
                                    case "3":
                                        elektronik = new Laptop();
                                        while3 = false;
                                        break;                        
                                    default:
                                        System.out.println("Input tidak valid..!");
                                        break;
                                }
                                
                            }
                            System.out.println("<-----Input data----->");
                            System.out.print("Input Merk : ");
                            String merk = inputUser.nextLine();
                            System.out.print("Input Model : ");
                            String model = inputUser.nextLine();
                            elektronik.setMerk(merk);
                            elektronik.setModel(model);
                            listObj.add(elektronik);
                            System.out.println("Berhasil menambahkan data...\n");
                                break;

                        case "2":
                            if (listObj.isEmpty()) {
                                System.out.println("Tidak ada Gadget untuk ditampilkan.");
                            } else{
                                System.out.println("<-------Daftar Gadget------->");
                                for (int index = 0; index < listObj.size() ; index++) {
                                    Gadget listGadget = listObj.get(index);
                                    System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                    System.out.println("   Model : " + listGadget.Model);
                                    System.out.println("---------------------------");
                                }
                            }
                                System.out.println();
                                break;
                        case "3":
                            if (listObj.isEmpty()) {
                                System.out.println("Tidak ada Gadget untuk dipilih.");
                            } else{
                                System.out.println("<-------Daftar Gadget------->");
                                for (int index = 0; index < listObj.size() ; index++) {
                                    Gadget listGadget = listObj.get(index);
                                    System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                    System.out.println("   Model : " + listGadget.Model);
                                    System.out.println("---------------------------");
                                }
                                boolean while4 = true;
                                while (while4) {
                                    System.out.print("Pilih Gadget yang akan digunakan : ");
                                    int pilihObj = inputUser.nextInt();
                                    inputUser.nextLine();     
                                    if (pilihObj > 0 && pilihObj <= listObj.size()) {
                                        Gadget objDipilih = listObj.get(pilihObj - 1);
                                        objDipilih.tampilPilih();
                                        while4 = false;
                                    } else {
                                        System.out.println("Input tidak valid..!");
                                    }
                                    
                                }
                            }
                            break;

                        case "4" :
                            if (listObj.isEmpty()) {
                                System.out.println("Tidak ada Gadget untuk dihapus.");
                            } else{
                                System.out.println("<-----Daftar Gadget----->");
                                for (int index = 0; index < listObj.size() ; index++) {
                                    Gadget listGadget = listObj.get(index);
                                    System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                    System.out.println("   Model : " + listGadget.Model);
                                    System.out.println("------------------------");
                                }                           
                                boolean while5 = true;
                                while (while5) {
                                    System.out.print("Pilih Gadget yang akan dihapus : ");
                                    int hapus = inputUser.nextInt();
                                    inputUser.nextLine();     
                                    if (hapus > 0 && hapus <= listObj.size()) {
                                        listObj.remove(hapus - 1);
                                        System.out.println("Berhasil menghapus data...");
                                        System.out.println();
                                        while5 = false;
                                    } else {
                                        System.out.println("Input tidak valid..!");
                                    }
                                }
                            }
                            break;
                        case "5" :
                        if (listObj.isEmpty()) {
                            System.out.println("Tidak ada Gadget untuk diedit.");
                        } else{
                            System.out.println("<-------Daftar Gadget------->");
                            for (int index = 0; index < listObj.size() ; index++) {
                                Gadget listGadget = listObj.get(index);
                                System.out.println(index + 1 + ". Merk  : " + listGadget.Merk);
                                System.out.println("   Model : " + listGadget.Model);
                                System.out.println("---------------------------");
                            }
                            boolean while4 = true;
                            while (while4) {
                                System.out.print("Pilih Gadget yang akan diedit : ");
                                int pilihObj = inputUser.nextInt();
                                inputUser.nextLine();     
                                if (pilihObj > 0 && pilihObj <= listObj.size()) {
                                    System.out.println("<-----Input data----->");
                                    System.out.print("Input Merk : ");
                                    String merkEdit = inputUser.nextLine();
                                    System.out.print("Input Model : ");
                                    String modelEdit = inputUser.nextLine();
                                    listObj.get(pilihObj - 1).setMerk(merkEdit);;
                                    listObj.get(pilihObj - 1).setModel(modelEdit);;
                                    System.out.println("Berhasil mengedit data...");
                                    System.out.println();
                                    while4 = false;
                                } else {
                                    System.out.println("Input tidak valid..!");
                                }
                                
                            }
                        }
                            break;
                        case "6" :
                            System.out.println("Program selesai...");
                            while1 = false;
                            while2 = false;
                            break;
                        default:
                            System.out.println("Input tidak valid..!");
                            break;

                    }
                       
                    
                   
                }

   }
        }


    }
}
