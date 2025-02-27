# PENJELASAN KUIS 1

public class Latihan1 { 
// Mendeklarasikan kelas bernama Latihan1
public static void main(String[] args) { 
// berfungsi sebagai metode utama  yang digunakan untuk mengeksekusi program 
        
int[] number = new int[5]; 
// Membuat array yang menyimpan elemen bertipe int
        
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
        //Deklarasi array: int[] number → Membuat array yang menyimpan elemen bertipe int.
          Inisialisasi array langsung dengan nilai {1, 2, 3, 4, 5}
        
        for (int i = 0; i < number.length; i++) { 
        Perulangan for untuk mengakses semua elemen array satu per satu.
        int i = 0; 
        // Variabel i sebagai indeks awal, dimulai dari 0.
        i < number.length; 
        // Kondisi agar perulangan berjalan selama i lebih kecil dari    panjang array (number.length bernilai 5).
        i++ 
        // Menambah nilai i setiap iterasi agar bisa membaca elemen berikutnya

        System.out.print(number[i]+" "); 
        // Mencetak elemen array pada indeks i menggunakan System.out.print()
        + " " → Menambahkan spasi setelah setiap angka agar output lebih rapi.

          }
         }
        }
        // Menutup blok kode untuk main() dan Latihan1.

# PENJELASAN KUIS 2

public class Latihan2 {
// Mendeklarasikan kelas bernama Latihan2

public static void main(String[] args) {
// berfungsi sebagai metode utama  yang digunakan untuk mengeksekusi program 

        
int[] number = new int[5];
// Membuat array yang menyimpan elemen bertipe int
    
        number[0]=1;
        number[1]=2;
        number[2]=3;
        number[3]=4;
        number[4]=5;
        // //Deklarasi array: int[] number → Membuat array yang menyimpan elemen bertipe int.
          Inisialisasi array langsung dengan nilai {1, 2, 3, 4, 5}
        
for (int i = 0; i < number.length; i++) {
// Perulangan for untuk menampilkan semua elemen array, indeks awal dimulai dari 0, menambah nilai i setiap iterasi dan Berjalan selama i kurang dari panjang array (5).

System.out.print(number[i]);
// Mencetak elemen array pada indeks i

if (i < number.length - 1) {
System.out.print(",");
// Mengecek apakah elemen yang sedang dicetak bukan yang terakhir.
Jika bukan elemen terakhir, cetak koma (,).


            }
        }
    }
}
// Menutup blok kode main() dan Latihan2