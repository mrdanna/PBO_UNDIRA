class hitung{
    private int c = 8;
    public int getVAR(){
    return this.c;
    }
}

class Lat3{
    public static void main(String[] args){
        int hasil;
        hitung tambah = new hitung();
        System.out.println("Nilai C = " + tambah.getVAR());
    }
}

