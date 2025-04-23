class Lat6 {    
    public static void main(String[] args) {    
        int i, j, k;        
        int[][][] data_jual = {        
            { 
                {100, 200, 300},
                {150, 240, 360},
                {250, 340, 460},
                {250, 340, 460}
            },
            { 
                {160, 250, 365},
                {175, 275, 375},
                {275, 375, 575},
                {380, 480, 580}
            }
        };        
        
        System.out.println();
        System.out.println("Data Penjualan Pertahun");
        System.out.println("--------------------------------------");
        System.out.println();
        System.out.println("Tahun\tHasil\tTahun Penjualan Ke.");
        System.out.println();
        System.out.println("Ke.\tKe.\t--------------------");
        System.out.println();
        System.out.println("\t1\t2");
        System.out.println();
        System.out.println("--------------------------------------");
        System.out.println();
        
        for (i = 0; i < 2; i++) {                
            for (j = 0; j < 3; j++) {                
                System.out.print((i + 1) + "\t");                
                System.out.print((j + 1) + "\t\t");                
                for (k = 0; k < 3; k++) { // Memperbaiki batas loop dari 2 menjadi 3
                    System.out.print(data_jual[i][j][k] + "\t");                
                }                
                System.out.println();                
            }                
            System.out.println();                
        }                
        
        System.out.println("--------------------------------------");    
        System.out.println();                
    }    
}