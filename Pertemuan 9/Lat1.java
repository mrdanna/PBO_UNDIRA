class Lat1{
    float nilakhir;
    Lat1 (int nilai_akhir){
        nilakhir = nilai_akhir;
    }

    public String grade(){
        String nilgrade;
        if(nilakhir >= 80)
        nilgrade = "A";
        else if(nilakhir >= 68)
        nilgrade = "B";
        else if(nilakhir >= 56)
        nilgrade = "C";
        else if(nilakhir >= 49)
        nilgrade = "D";
        else
        nilgrade = "E";
        return nilgrade;
    }

    public void cetak(){
        System.out.println("Grade Nilainya = " + grade());
    }
    public static void main(String[] args){
        Lat1 hasil = new Lat1(67);
        hasil.cetak();
    }
}
