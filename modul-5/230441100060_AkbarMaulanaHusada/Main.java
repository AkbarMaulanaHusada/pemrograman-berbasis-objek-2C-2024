package Mobil;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            System.out.println("\n->->Tipe Mobil<-<- ");
            System.out.println("1.Mobil MPV");
            System.out.println("2.Mobil SUV");
            System.out.println("3.Mobil Sport");
            System.out.println("4.Mobil Listrik");
            
            mobil mobil;
            while (true) {
                System.out.print("Input 1 / 2 / 3 / 4 : ");
                String pilihMobil = inputUser.nextLine();
                if (pilihMobil.equals("1")) {
                    mobil = new MPV();
                    break;
                }
                else if (pilihMobil.equals("2")) {
                    mobil = new SUV();
                    break;
                }
                else if (pilihMobil.equals("3")) {
                    mobil = new sport();
                    break;
                }
                else if (pilihMobil.equals("4")) {
                    mobil = new listrik();
                    break;
                }
                else{
                    System.out.println("Input yang bener dong..!");
                }
            }
            String inputMerk, inputModel;
            int inputTahunProduksi;
            System.out.println("Input Data Mobil");
            System.out.print("Input Merk Mobil : ");
            inputMerk = inputUser.nextLine();
            System.out.print("Input Model Mobil : ");
            inputModel = inputUser.nextLine();
            System.out.print("Input Tahun Produksi Mobil : ");
            inputTahunProduksi = inputUser.nextInt();
            inputUser.nextLine();
            mobil.setAtribute(inputMerk, inputModel, inputTahunProduksi);
            mobil.showFeature();
            System.out.println();
            while (true) {
                System.out.print("Mau input lagi tidak ? ( y ) or ( t ) : ");
                String mau = inputUser.nextLine();
                if (mau.equalsIgnoreCase("y")) {
                    break;
                }else if (mau.equalsIgnoreCase("t")) {
                    System.out.println("program selesai...");
                    lanjut = false;
                    break;
                } else {
                    System.out.println("Yang bener dong..!");
                }

            }
        }
    }
}


