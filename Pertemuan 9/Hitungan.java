// class Hitungan extends Matematika { 
//     private int x, y; 

//     public Hitungan() { 
//         x = 1; 
//         y = 2; 
//     } 

//     public Hitungan(int i, int j){ 
//         x = i; 
//         y = j; 
//     } 


//     public int tambah(){ 
//         return x + y; 
//     } 


//     public int kali(){ 
//         return y * 3;
//     } 
// }

class Hitungan extends Matematika { 
    private int x, y; 

    public Hitungan() { 
        x = 1; 
        y = 2; 
    } 

    public Hitungan(int i, int j){ 
        x = i; 
        y = j; 
    } 

    public int tambah(){ 
        return (x + y) + super.kali();
    } 


    public int kali(){ 
        return (y * 3 - super.tambah());
    } 
}