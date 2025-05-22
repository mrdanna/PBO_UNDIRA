class Lat2{
    float nilakhir, a;
    Lat2(int nilai_akhir){
        nilakhir = nilai_akhir; 
    }
    Lat2(int nil1, int nil2){
        nilakhir = ab + ac; 
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

public void cetak() {
	System.out.println("Grade Nilainya = "	+	grade());
	}		
			
	public static void main(String[]	args)		
	{		
	Lat2 hasil = new Lat2(67);		
	hasil.cetak();		
	Lat2 hasilnya = new Lat2(45,	35);		
	hasilnya.cetak();		
	}		
}