package Konversi;

public class waktu extends konversi {
    
    waktu(double nilai, String awal, String akhir){
        super(nilai, awal, akhir);
    }

    @Override
    protected double konversikan() {
        if (awal.equalsIgnoreCase("H")) {
            if (akhir.equalsIgnoreCase("J")) {
                return nilai * 24;
            }
            else if (akhir.equalsIgnoreCase("M")) {
                return nilai * 144000;
            }
            else if (akhir.equalsIgnoreCase("D")){
                return nilai * 86400;
            }
            else{
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("J")){
            if (akhir.equalsIgnoreCase("H")) {
                return nilai / 24;
            } else if (akhir.equalsIgnoreCase("M")) {
                return nilai * 60;
            } else if (akhir.equalsIgnoreCase("D")) {
                return nilai * 3600;
            } else {
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("M")){
            if (akhir.equalsIgnoreCase("J")) {
                return nilai / 60;
            } else if (akhir.equalsIgnoreCase("H")) {
                return nilai / 144000;
            } else if (akhir.equalsIgnoreCase("D")) {
                return nilai * 60;
            } else {
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("D")){
            if (akhir.equalsIgnoreCase("M")) {
                return nilai * 60;
            } else if (akhir.equalsIgnoreCase("J")) {
                return nilai / 3600;
            } else if (akhir.equalsIgnoreCase("H")) {
                return nilai / 86400;
            } else {
                return 0d;
            }
        }
        else {
            return 0d;
        }   
    }
    @Override       
     protected void display(){
          System.out.println("hasil = " + nilai + awal + " ~~> " + akhir  + " : " + konversikan() + akhir );
          System.out.println();
     }

}
