package Konversi;

public class suhu extends konversi {
    
    suhu(double nilai, String awal, String akhir){
        super(nilai, awal, akhir);
    }

    @Override
    protected double konversikan() {
        if (awal.equalsIgnoreCase("C")) {
            if (akhir.equalsIgnoreCase("F")) {
                return (nilai * 9/5) + 32;
            }
            else if (akhir.equalsIgnoreCase("K")) {
                return (nilai + 273.15);
            }
            else if (akhir.equalsIgnoreCase("R")){
                return (4 / 5 * nilai);
            }
            else{
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("F")){
            if (akhir.equalsIgnoreCase("C")) {
                return (nilai - 32) * 5/9;
            } else if (akhir.equalsIgnoreCase("R")) {
                return (nilai - 32) * 4/9;
            } else if (akhir.equalsIgnoreCase("K")) {
                return (nilai - 32) * 5/9 + 273.15;
            } else {
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("R")){
            if (akhir.equalsIgnoreCase("C")) {
                return nilai * 5/4;
            } else if (akhir.equalsIgnoreCase("F")) {
                return nilai * 9/4 + 32;
            } else if (akhir.equalsIgnoreCase("K")) {
                return nilai * 5/4 + 273.15;
            } else {
                return 0d;
            }
        }
        else if(awal.equalsIgnoreCase("K")){
            if (akhir.equalsIgnoreCase("C")) {
                return nilai - 273.15;
            } else if (akhir.equalsIgnoreCase("F")) {
                return (nilai - 273.15) * 9/5 + 32;
            } else if (akhir.equalsIgnoreCase("R")) {
                return (nilai - 273.15) * 4 / 5;
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
