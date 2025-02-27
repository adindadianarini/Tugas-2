# PENJELASAN KUIS 1

public class Latihan1 { 
// Mendeklarasikan kelas bernama Latihan1

public static void main(String[] args) { 
// berfungsi sebagai metode utama  yang digunakan untuk mengeksekusi program 
        
int[] number = new int[5]; 
// Membuat array yang menyimpan elemen bertipe int

number[0]=1;// Elemen indeks 0 diisi dengan 1
number[1]=2;// Elemen indeks 1 diisi dengan 2
number[2]=3;// Elemen indeks 2 diisi dengan 3
number[3]=4;// Elemen indeks 3 diisi dengan 4
number[4]=5;// Elemen indeks 4 diisi dengan 5
//Deklarasi array: int[] number → Membuat array yang menyimpan elemen bertipe int. 
Inisialisasi array langsung dengan nilai {1, 2, 3, 4, 5}
        
for (int i = 0; i < number.length; i++) { 
//Perulangan for untuk mengakses semua elemen array satu per satu.

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
    
number[0]=1;// Elemen indeks 0 diisi dengan 1
number[1]=2;// Elemen indeks 1 diisi dengan 2
number[2]=3;// Elemen indeks 2 diisi dengan 3
number[3]=4;// Elemen indeks 3 diisi dengan 4
number[4]=5;// Elemen indeks 4 diisi dengan 5

//Deklarasi array: int[] number → Membuat array yang menyimpan elemen bertipe int. Inisialisasi array langsung dengan nilai {1, 2, 3, 4, 5}
        
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

# PENJELASAN KUIS 3

public class Latihan3 {
//Mendeklarasikan kelas bernama Latihan3

public static void main(String[] args) {
//berfungsi sebagai metode utama  yang digunakan untuk mengeksekusi program 

int[] number = new int[5];
//Membuat array yang menyimpan elemen bertipe int
    
number[0]=1;// Elemen indeks 0 diisi dengan 1
number[1]=2;// Elemen indeks 1 diisi dengan 2
number[2]=3;// Elemen indeks 2 diisi dengan 3
number[3]=4;// Elemen indeks 3 diisi dengan 4
number[4]=5;// Elemen indeks 4 diisi dengan 5

//Deklarasi array: int[] number → Membuat array yang menyimpan elemen bertipe int. Inisialisasi array langsung dengan nilai {1, 2, 3, 4, 5}
      
for (int i = 0; i < number.length; i++) {
//digunakan untuk melakukan iterasi (perulangan) sebanyak panjang array number, yaitu 5 kali (dari indeks 0 hingga 4).

if (i%2==0) {
//igunakan untuk mengecek apakah nilai i adalah bilangan genap.
% adalah operator modulus, yang menghasilkan sisa pembagian. Jika i % 2 == 0, berarti i adalah indeks genap (0, 2, 4).

System.out.print(number[i]);
//mencetak nilai dari array number pada indeks i yang memenuhi kondisi (indeks genap).

if (i<4) {
System.out.print(",");
//memastikan bahwa koma hanya dicetak jika i bukan indeks terakhir yang diproses (karena array memiliki 5 elemen, indeks terakhir adalah 4). Dengan ini, output akan menjadi "1,3,5" tanpa koma setelah angka terakhir.

    }
   }
  }
 }
}
//menutup blok kode

# PENJELASAN KUIS 4

public class Latihan4 { 
// Mendeklarasikan kelas bernama Latihan4

public static void main(String[] args) { 
// Metode main sebagai titik awal eksekusi program

int[] number = new int[5]; 
// Deklarasi dan inisialisasi array dengan ukuran 5
        
        
// Mengisi array dengan nilai 1 hingga 5
number[0] = 1; // Elemen indeks 0 diisi dengan 1
number[1] = 2; // Elemen indeks 1 diisi dengan 2
number[2] = 3; // Elemen indeks 2 diisi dengan 3
number[3] = 4; // Elemen indeks 3 diisi dengan 4
number[4] = 5; // Elemen indeks 4 diisi dengan 5

// Perulangan dari indeks 4 (terakhir) ke indeks 0
for (int i = 4; i > -1; i--) { // Mengurangi nilai i setiap iterasi
            
// Mengecek apakah indeks i adalah bilangan genap
if (i % 2 == 0) { 
// Jika i genap (4, 2, 0), maka kode di dalam blok ini dieksekusi
                
System.out.print(+number[i]); 
// Mencetak nilai array pada indeks genap
                
// Menambahkan koma setelah angka, kecuali angka terakhir yang dicetak
if (i > 1) { 
// Jika indeks lebih dari 1, maka cetak koma
System.out.print(",");
        
       }
      }
     }
    }
   }
//menutup blok kode

# PENJELASAN KUIS 5

public class Latihan5 { 
// Mendeklarasikan kelas Latihan5

public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program
        
// Deklarasi dan inisialisasi array dengan ukuran 5
int[] number = new int[5]; 
        
// Mengisi array dengan nilai 1 hingga 5
number[0] = 1; // Elemen indeks 0 diisi dengan 1
number[1] = 2; // Elemen indeks 1 diisi dengan 2
number[2] = 3; // Elemen indeks 2 diisi dengan 3
number[3] = 4; // Elemen indeks 3 diisi dengan 4
number[4] = 5; // Elemen indeks 4 diisi dengan 5

// Perulangan untuk mencetak elemen array
for (int i = 0; i < number.length; i++) { // Loop dari indeks 0 sampai 4
System.out.print(number[i]); // Mencetak nilai dari array pada indeks i
            
// Jika indeks adalah 1, cetak ulang elemen indeks 0 dengan koma
if (i == 1) { 
System.out.print("," + number[0]); 
} 

// Jika indeks adalah 3, cetak ulang elemen indeks 1 dengan koma
else if (i == 3) { 
System.out.print("," + number[1]); 
}

// Menambahkan koma setelah setiap angka, kecuali angka terakhir
if (i < number.length - 1) { 
System.out.print(",");

      }
     }
    }
   }
//menutup blok kode

# PENJELASAN KUIS 6

public class Latihan6 { 
//Mendeklarasikan kelas Latihan6

public static void main(String[] args) { 
//Metode utama sebagai titik awal eksekusi program
        
//Deklarasi dan inisialisasi array dengan ukuran 5
int[] number = new int[5]; 
        
// Mengisi array dengan nilai 1 hingga 5
number[0] = 1; // Elemen indeks 0 diisi dengan 1
number[1] = 2; // Elemen indeks 1 diisi dengan 2
number[2] = 3; // Elemen indeks 2 diisi dengan 3
number[3] = 4; // Elemen indeks 3 diisi dengan 4
number[4] = 5; // Elemen indeks 4 diisi dengan 5

// Menampilkan teks sebagai penanda output soal nomor 6
System.out.println("\nSoal no 6"); 
        
// Perulangan untuk mencetak elemen array
for (int i = 0; i < number.length; i++) { // Loop dari indeks 0 sampai 4
            
// Jika indeks adalah 1, cetak angka dari indeks 0 diikuti koma
if (i == 1) { 
System.out.print(number[0] + ","); 
} 

// Jika indeks adalah 3, cetak angka dari indeks 1 diikuti koma
else if (i == 3) { 
System.out.print(number[1] + ",");
} 

// Jika tidak memenuhi kondisi di atas, cetak angka sesuai indeksnya
else { 
System.out.print(number[i]); 
                
// Tambahkan koma setelah angka kecuali angka terakhir
if (i < number.length - 1) { 
System.out.print(",");

        }
       }
      }
     }
    }
//menutup blok kode

                
