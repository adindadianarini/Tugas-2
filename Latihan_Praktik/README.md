# LATIHAN PRAKTIK 1
public class Laprak1 { 
// Mendeklarasikan kelas Laprak1

public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program

int[] bilanganGenap = new int[10]; 
// Deklarasi array dengan ukuran 10

int jumlah = 0; 
// Variabel untuk menyimpan jumlah seluruh elemen array

// Mengisi array dengan bilangan genap mulai dari 2
for (int i = 0; i < bilanganGenap.length; i++) { 
// Perulangan dari indeks 0 sampai 9
            
bilanganGenap[i] = (i + 1) * 2; 
// Mengisi array dengan bilangan genap: 2, 4, 6, ..., 20
}

// Menampilkan isi array
System.out.println("Isi array:");
        
for (int bilangan : bilanganGenap) { 
// Loop untuk membaca setiap elemen dalam array

System.out.print(bilangan + " "); 
// Mencetak elemen array dengan spasi sebagai pemisah
            
jumlah += bilangan; 
// Menjumlahkan setiap elemen array ke variabel jumlah
}

// Mencetak jumlah seluruh elemen dalam array
System.out.println("\nJumlah semua elemen: " + jumlah); // Memperbaiki penulisan "\n"
    
    }
}

# LATIHAN PRAKTIK 2

public class Laprak2 { 
// Mendeklarasikan kelas Laprak2

public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program

// Deklarasi dan inisialisasi array nilai
int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; 
// Array berisi daftar nilai
       
int cari = 90; 
// Nilai yang akan dicari dalam array
        
boolean ketemu = false; 
// Variabel untuk menandai apakah nilai ditemukan
        
int indeks = -1; 
// Variabel untuk menyimpan indeks nilai yang dicari

// Mencari nilai dalam array
for (int i = 0; i < nilai.length; i++) { // Loop untuk menelusuri seluruh elemen array
            
if (nilai[i] == cari) { // Jika nilai pada indeks ke-i sama dengan nilai yang dicari

ketemu = true; 
// Tandai bahwa nilai ditemukan
                
indeks = i; 
// Simpan indeks tempat nilai ditemukan

break; 
// Hentikan pencarian setelah nilai ditemukan
    
     }
   }

// Menampilkan hasil pencarian

if (ketemu) { 
// Jika nilai ditemukan

System.out.println("Nilai " + cari + " ditemukan pada indeks " + indeks);
} else { 
// Jika nilai tidak ditemukan
System.out.println("Nilai " + cari + " tidak ditemukan");

        }
    }
}

# LATIHAN PRAKTIK 3

public class Laprak3 { 
// Mendeklarasikan kelas Laprak3

public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program

// Program menghitung statistik nilai siswa
int[] nilai = {75, 80, 65, 90, 85, 70, 95, 88}; // Array berisi daftar nilai siswa

// Inisialisasi nilai tertinggi, terendah, dan total
int tertinggi = nilai[0]; // Anggap nilai pertama sebagai yang tertinggi
int terendah = nilai[0]; // Anggap nilai pertama sebagai yang terendah
int total = nilai[0]; // Inisialisasi total dengan nilai pertama

// Loop untuk mencari nilai tertinggi, terendah, dan menghitung total
for (int i = 1; i < nilai.length; i++) { // Mulai dari indeks 1 karena indeks 0 sudah dipakai
            
if (nilai[i] > tertinggi) tertinggi = nilai[i]; // Perbarui jika menemukan nilai lebih tinggi
if (nilai[i] < terendah) terendah = nilai[i]; // Perbarui jika menemukan nilai lebih rendah
total += nilai[i]; // Menjumlahkan nilai untuk menghitung rata-rata
}

// Menghitung rata-rata dengan pembagian total nilai dengan jumlah elemen
double rataRata = (double) total / nilai.length; // Casting ke double agar hasilnya desimal

// Menampilkan hasil perhitungan
System.out.println("Nilai tertinggi: " + tertinggi);
System.out.println("Nilai terendah: " + terendah);
System.out.println("Rata-rata: " + rataRata);
   
    }
}

# LATIHAN PRAKTIK 4

public class Laprak4 { 
// Mendeklarasikan kelas Laprak4
    
public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program

// Program operasi matriks
// Deklarasi dan inisialisasi matriks A (2x3)
int[][] matriksA = {
{1, 2, 3},
{4, 5, 6}
};

// Deklarasi dan inisialisasi matriks B (2x3)
int[][] matriksB = {
{7, 8, 9},
{10, 11, 12}
};

// Penjumlahan matriks A dan B, hasil disimpan dalam matriks baru
int[][] hasil = new int[2][3]; // Matriks hasil berukuran sama (2x3)

// Proses penjumlahan elemen-elemen matriks
for (int i = 0; i < matriksA.length; i++) { // Loop untuk baris
            
for (int j = 0; j < matriksA[0].length; j++) { // Loop untuk kolom
                
hasil[i][j] = matriksA[i][j] + matriksB[i][j]; // Menjumlahkan elemen yang bersesuaian
  }
}

// Menampilkan hasil penjumlahan matriks
System.out.println("Hasil penjumlahan matriks:");
        
for (int[] baris : hasil) { // Loop untuk setiap baris matriks
            
for (int nilai : baris) { // Loop untuk setiap elemen dalam baris
                
System.out.print(nilai + " "); // Cetak elemen matriks
    }
System.out.println(); // Pindah ke baris berikutnya

        }
    }
}

