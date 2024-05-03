package Konversi;

public class berat extends konversi{

     berat(double nilai, String awal, String akhir){
          super(nilai,awal,akhir);
     }

     @Override
     protected double konversikan(){
          if (awal.equalsIgnoreCase("KG")){
               if(akhir.equalsIgnoreCase("HG")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("DAG")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("G")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("DG")){
                    return nilai*10000;
               }
               else if(akhir.equalsIgnoreCase("CG")){
                    return nilai*100000;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai*1000000;
               }
               else{
                    return 0;
               }
          }
          else if (awal.equalsIgnoreCase("HG")){
               if(akhir.equalsIgnoreCase("KG")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DAG")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("G")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("DG")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("CG")){
                    return nilai*10000;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai*100000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("DAG")){
               if(akhir.equalsIgnoreCase("HG")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("KG")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("G")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("DG")){
                    return nilai*100;
               }
               else if(akhir.equalsIgnoreCase("CG")){
                    return nilai*1000;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai*10000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("G")){
               if(akhir.equalsIgnoreCase("DAG")){
                    return nilai /10;
               }
               else if(akhir.equalsIgnoreCase("HG")){
                    return nilai /100;
               }
               else if(akhir.equalsIgnoreCase("KG")){
                    return nilai /1000;
               }
               else if(akhir.equalsIgnoreCase("DG")){
                    return nilai *10;
               }
               else if(akhir.equalsIgnoreCase("CG")){
                    return nilai *100;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai *1000;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("DG")){
               if(akhir.equalsIgnoreCase("G")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DAG")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("HG")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("KG")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("CG")){
                    return nilai*10;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai*100;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("CG")){
               if(akhir.equalsIgnoreCase("DG")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("G")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("DAG")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("HG")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("KG")){
                    return nilai/100000;
               }
               else if(akhir.equalsIgnoreCase("MG")){
                    return nilai*10;
               }
               else{
                    return 0;
               }
          }
          else if(awal.equalsIgnoreCase("MG")){
               if(akhir.equalsIgnoreCase("CG")){
                    return nilai/10;
               }
               else if(akhir.equalsIgnoreCase("DG")){
                    return nilai/100;
               }
               else if(akhir.equalsIgnoreCase("G")){
                    return nilai/1000;
               }
               else if(akhir.equalsIgnoreCase("DAG")){
                    return nilai/10000;
               }
               else if(akhir.equalsIgnoreCase("HG")){
                    return nilai/100000;
               }
               else if(akhir.equalsIgnoreCase("KG")){
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