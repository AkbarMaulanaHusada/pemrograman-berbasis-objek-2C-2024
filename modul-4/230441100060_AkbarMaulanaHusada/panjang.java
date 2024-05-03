package Konversi;

public class panjang extends konversi{

     panjang(double nilai, String awal, String akhir){
          super(nilai,awal,akhir);
     }

     @Override
     protected double konversikan(){
          if (awal.equalsIgnoreCase("KM")){
               if(akhir.equalsIgnoreCase("HM")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("DAM")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("M")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("DM")){
                    return nilai*10000;
               }
               else if(akhir.equalsIgnoreCase("CM")){
                    return nilai*100000;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai*1000000;
               }
               else{
                    return 0;
               }
          }
          else if (awal.equalsIgnoreCase("HM")){
               if(akhir.equalsIgnoreCase("KM")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DAM")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("M")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("DM")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("CM")){
                    return nilai*10000;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai*100000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("DAM")){
               if(akhir.equalsIgnoreCase("HM")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("KM")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("M")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("DM")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("CM")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai*10000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("M")){
               if(akhir.equalsIgnoreCase("DAM")){
                    return nilai /10;
               }
               else if(akhir.equalsIgnoreCase("HM")){
                    return nilai /100;
               }
               else if(akhir.equalsIgnoreCase("KM")){
                    return nilai /1000;
               }
               else if(akhir.equalsIgnoreCase("DM")){
                    return nilai *10;
               }
               else if(akhir.equalsIgnoreCase("CM")){
                    return nilai *100;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai *1000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("DM")){
               if(akhir.equalsIgnoreCase("M")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DAM")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("HM")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("KM")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("CM")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai*100;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("CM")){
               if(akhir.equalsIgnoreCase("DM")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("M")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("DAM")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("HM")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("KM")){
                    return nilai/100000;
               }
               else if(akhir.equalsIgnoreCase("MM")){
                    return nilai*10;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("MM")){
               if(akhir.equalsIgnoreCase("CM")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DM")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("M")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("DAM")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("HM")){
                    return nilai/100000;
               }
               else if(akhir.equalsIgnoreCase("KM")){
                    return nilai/1000000;
               }
               else{
                    return 0;
               }
          }
          else{
               return 0;
          }

     }

     @Override       
     protected void display(){
          System.out.println("hasil = " + nilai + awal + " ~~> " + akhir  + " : " + konversikan() + akhir);
     }
}