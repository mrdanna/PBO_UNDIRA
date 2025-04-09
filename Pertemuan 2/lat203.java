// import java.io.*;

// public class lat203 {
//     public static void main(String[] args) {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Gunakan BufferedReader
//         String kata = "";
        
//         System.out.print("Masukkan Kata - Kata Anda: ");
        
//         try {
//             kata = reader.readLine(); // Membaca satu baris input dari pengguna
//         } catch (IOException e) {
//             System.err.println("Terjadi kesalahan saat membaca input!");
//         }
        
//         System.out.println("Kalimat yang Anda ketikkan = " + kata);
//     }
// }

// import java.io.*;
	
// class lat203	
// {	
// public static void main(String[] args)
// {	
// String kata = "";
// boolean akhir = false;
// int huruf;
	
// System.out.print("Masukkan Kata - Kata Anda : ");
	
// while(!akhir)
// {	
// try	
// {	
// 	huruf = System.in.read();
// 	if(huruf < -1 || huruf == '\n')
// 	akhir = true;
// 	kata = kata + (char) huruf;
// }	
// catch (IOException e)
// {	
// 	System.err.println("Mengalami Salah?");
// 	akhir = true;
//                            }	
//                    }	
// 	System.out.println("Kalimat yang anda ketikan = " + kata);
//            }	
// }

import java.io.*;
	
class Lat204	
{	
public static void main(String args[])throws Exception
{	
//membuat objek baru
	
InputStreamReader keyreader = new InputStreamReader(System.in);
BufferedReader input = new BufferedReader(keyreader);
	
//deklarasi variabel
String s1, s2;
	
System.out.print("Masukan String Pertama : ");
s1 = input.readLine();
	
System.out.print("Masukan String Kedua : ");
s2 = input.readLine();

System.out.println("\nHasil Input String " + s1 + " " + s2);
}
}


