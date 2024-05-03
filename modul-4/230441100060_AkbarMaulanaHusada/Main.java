package Konversi;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Boolean balikatas = true;
        while(balikatas) {
            while(true){
                System.out.println("*****Aplikasi Konversi*****");
                System.out.println("1.Konversi suhu");
                System.out.println("2.Konversi panjang");
                System.out.println("3.Konversi berat");
                System.out.println("4.Konversi waktu");
                System.out.println("5.Keluar");

                System.out.print("Input 1 / 2 / 3 / 4 / 5 : ");
                
                String pilihKonversi;
                String awal;
                String akhir;
                while (true) {
                    pilihKonversi = inputUser.nextLine();
                    if (pilihKonversi.equalsIgnoreCase("1")) {
                        System.out.print("input nilai : ");
                        double nilai = inputUser.nextDouble();
                        inputUser.nextLine();
                        System.out.println("******Konversi Suhu******");
                        System.out.println("Jenis Suhu");
                        System.out.println("1. C = Celsius");
                        System.out.println("2. F = Fahrenheit");
                        System.out.println("3. K = Kelvin");
                        System.out.println("4. R = Reamur");
                        System.out.println("5. B = Batal");
                        System.out.println("input C / F / K / R / B : ");
                        System.out.print("Konversi dari : ");
                        awal = inputUser.nextLine();
                        if(awal.equalsIgnoreCase("B")){
                            System.out.println("Berhasil keluar...");
                            break;
                        } else {
                            System.out.print("Konversi ke   :");
                            akhir = inputUser.nextLine();
                            if (akhir.equalsIgnoreCase("B")){
                                System.out.println("Berhasil keluar...");
                                break;
                            }
                            else{
                                suhu suhu = new suhu(nilai, awal, akhir);
                                if(suhu.konversikan() == 0d) {
                                    System.out.println("Fitur Tidak ada..!");
                                }
                                else{
                                    suhu.display();
                                    break;
                                }
                            }
                        }
                    }
                    else if(pilihKonversi.equalsIgnoreCase("2")){
                        System.out.print("input nilai : ");
                        double nilai = inputUser.nextDouble();
                        inputUser.nextLine();
                        System.out.println("******Konversi Panjang******");
                        System.out.println("Jenis Panjang");
                        System.out.println("1. KM  = Kilometer");
                        System.out.println("2. HM  = Hektometer");
                        System.out.println("3. DAM = Dekameter");
                        System.out.println("4. M   = Meter");
                        System.out.println("5. DM  = Desimeter");
                        System.out.println("6. CM  = Centimeter");
                        System.out.println("7. MM  = Milimeter");
                        System.out.println("8. B   = Batal");
                        System.out.println("input KM / HM / DAM / M / DM / CM / MM / B : ");
                        System.out.print("Konversi dari : ");
                        awal = inputUser.nextLine();
                        if(awal.equalsIgnoreCase("B")){
                            System.out.println("Berhasil keluar...");
                            break;
                        }
                        else{
                            System.out.print("Konversi ke   :");
                            akhir = inputUser.nextLine();
                            if (akhir.equalsIgnoreCase("B")){
                                System.out.println("Berhasil keluar...");
                                break;
                            }
                            else{
                                panjang panjang = new panjang(nilai, awal, akhir);
                                if(panjang.konversikan() == 0d) {
                                    System.out.println("Fitur Tidak ada..!");
                                }
                                else{
                                    panjang.display();
                                    break;
                                }
                            }
                        }
                    }  
                    else if(pilihKonversi.equalsIgnoreCase("3")){
                        System.out.print("input nilai : ");
                        double nilai = inputUser.nextDouble();
                        inputUser.nextLine();
                        System.out.println("******Konversi Berat******");
                        System.out.println("Jenis Berat");
                        System.out.println("1. KG  = Kilogram");
                        System.out.println("2. HG  = Hektogram");
                        System.out.println("3. DAG = Dekagram");
                        System.out.println("4. G   = gram");
                        System.out.println("5. DG  = Desigram");
                        System.out.println("6. CG  = Centigram");
                        System.out.println("7. MG  = Miligram");
                        System.out.println("8. B   = Batal");
                        System.out.println("input KG / HG / DAG / G / DG / CG / MG / B : ");
                        System.out.print("Konversi dari : ");
                        awal = inputUser.nextLine();
                        if (awal.equalsIgnoreCase("B")){
                            System.out.println("Berhasil keluar...");
                            break;
                        } else{
                            System.out.print("Konversi ke :");
                            akhir = inputUser.nextLine();
                            if (akhir.equalsIgnoreCase("B")){
                                System.out.println("Berhasil keluar...");
                                break;
                            }
                            else{
                                berat berat = new berat(nilai, awal, akhir);
                                if(berat.konversikan() == 0d) {
                                    System.out.println("Fitur Tidak ada..!");
                                }
                                else{
                                    berat.display();
                                    break;
                                }
                            }
                        }
                        
                    }  
                    else if(pilihKonversi.equalsIgnoreCase("4")){
                        System.out.print("input nilai : ");
                        double nilai = inputUser.nextDouble();
                        inputUser.nextLine();
                        System.out.println("******Konversi Waktu******");
                        System.out.println("Jenis Waktu");
                        System.out.println("1. H = Hari");
                        System.out.println("2. J = Jam");
                        System.out.println("3. M = Menit");
                        System.out.println("4. D = Detik");
                        System.out.println("8. B = Batal");
                        System.out.println("input H / J / M / D / B : ");
                        System.out.print("Konversi dari : ");
                        awal = inputUser.nextLine();
                        if (awal.equalsIgnoreCase("B")){
                            System.out.println("Berhasil keluar...");
                            break;
                        } 
                        else{
                            System.out.print("Konversi ke :");
                            akhir = inputUser.nextLine();
                            if (akhir.equalsIgnoreCase("B")){
                                System.out.println("Berhasil keluar...");
                                break;
                            }
                            else{
                                waktu waktu = new waktu(nilai, awal, akhir);
                                if(waktu.konversikan() == 0d) {
                                    System.out.println("Fitur Tidak ada..!");
                                }
                                else{
                                    waktu.display();
                                    break;
                                }
                            }
                        }
                    } 
                    else if(pilihKonversi.equalsIgnoreCase("5")){
                        System.out.println("Program Selesai...");
                        break;
                    }
                    else{
                        System.out.println("Input Salah..!");
                    }
                } 
                if(pilihKonversi.equalsIgnoreCase("5")){
                    balikatas = false;
                    break;
                }        
                }
            }
        }
    }

