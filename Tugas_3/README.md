- PENJELASAN -

# PERKALIAN MATRIKS

import java.util.Scanner; 
// Mengimpor kelas Scanner untuk input dari pengguna

public class Perkalianmatriks { 
// Deklarasi kelas utama
    
public static void main(String[] args) { 
// Metode utama program

Scanner input = new Scanner(System.in); 
// Membuat objek Scanner untuk input dari pengguna

// Input ukuran matriks
System.out.println("Masukkan jumlah baris matriks A: ");
int barisA = input.nextInt(); // Menyimpan jumlah baris matriks A
System.out.println("Masukkan jumlah kolom matriks A (sama dengan baris B): ");
int kolomA = input.nextInt(); // Menyimpan jumlah kolom matriks A (juga baris matriks B)
System.out.println("Masukkan jumlah kolom matriks B: ");
int kolomB = input.nextInt(); // Menyimpan jumlah kolom matriks B

// Deklarasi matriks
int[][] A = new int[barisA][kolomA]; // Matriks A dengan ukuran barisA x kolomA
int[][] B = new int[kolomA][kolomB]; // Matriks B dengan ukuran kolomA x kolomB
int[][] C = new int[barisA][kolomB]; // Matriks hasil C dengan ukuran barisA x kolomB

// Input elemen matriks A
System.out.println("Masukkan elemen matriks A:");
for (int i = 0; i < barisA; i++) { // Looping baris
for (int j = 0; j < kolomA; j++) { // Looping kolom
A[i][j] = input.nextInt(); // Menyimpan input pengguna ke matriks A
  }
}

// Input elemen matriks B
System.out.println("Masukkan elemen matriks B:");

for (int i = 0; i < kolomA; i++) { // Looping baris
for (int j = 0; j < kolomB; j++) { // Looping kolom
B[i][j] = input.nextInt(); // Menyimpan input pengguna ke matriks B
  }
}

// Perkalian matriks
for (int i = 0; i < barisA; i++) { // Looping baris hasil
for (int j = 0; j < kolomB; j++) { // Looping kolom hasil
for (int k = 0; k < kolomA; k++) { // Looping perkalian elemen
C[i][j] += A[i][k] * B[k][j]; // Menghitung hasil perkalian dan menjumlahkannya
    }
  }
}

// Output hasil perkalian
System.out.println("Hasil perkalian matriks:");
for (int i = 0; i < barisA; i++) { // Looping baris matriks hasil
for (int j = 0; j < kolomB; j++) { // Looping kolom matriks hasil
System.out.print(C[i][j] + " "); // Mencetak elemen hasil perkalian
}

System.out.println(); // Pindah ke baris berikutnya
}

input.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
  }
}


# TRANSPOSE_MATRIKS

import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class Transposematriks { // Deklarasi kelas utama

public static void main(String[] args) { // Metode utama program
        
Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk input dari pengguna

// Input ukuran matriks
System.out.println("Masukkan jumlah baris dan kolom matriks: ");
        
int baris = input.nextInt(), kolom = input.nextInt(); // Input jumlah baris dan kolom matriks

int[][] matriks = new int[baris][kolom]; // Deklarasi matriks asli
        
int[][] transpose = new int[kolom][baris]; // Deklarasi matriks transpose (ukuran dibalik)

// Input elemen matriks
System.out.println("Masukkan elemen matriks:");
for (int i = 0; i < baris; i++) // Looping baris
for (int j = 0; j < kolom; j++) // Looping kolom
matriks[i][j] = input.nextInt(); // Menyimpan input pengguna ke matriks

// Proses transpose
for (int i = 0; i < baris; i++) // Looping baris
for (int j = 0; j < kolom; j++) // Looping kolom
transpose[j][i] = matriks[i][j]; // Menukar baris menjadi kolom

// Output hasil transpose
System.out.println("Hasil transpose:");
for (int[] row : transpose) { // Loop untuk setiap baris pada matriks transpose
for (int val : row) // Loop untuk setiap elemen dalam baris
System.out.print(val + " "); // Menampilkan elemen
System.out.println(); // Pindah ke baris berikutnya
}

input.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
  }
}


# DIAGONAL

import java.util.Scanner; // Mengimpor kelas Scanner untuk input dari pengguna

public class diagonal { // Deklarasi kelas utama
    
public static void main(String[] args) { // Metode utama program
        
Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input pengguna

// Input ukuran matriks (harus matriks persegi)
System.out.print("Masukkan ukuran matriks (n x n): ");
        
int n = input.nextInt(); // Input ukuran matriks (jumlah baris dan kolom yang sama)

int[][] matriks = new int[n][n]; // Deklarasi matriks persegi ukuran n x n

// Input elemen matriks dari pengguna
System.out.println("Masukkan elemen matriks:");
for (int i = 0; i < n; i++) // Looping untuk setiap baris
for (int j = 0; j < n; j++) // Looping untuk setiap kolom
matriks[i][j] = input.nextInt(); // Menyimpan input pengguna ke dalam matriks

// Cetak diagonal utama
System.out.print("Diagonal utama: ");
for (int i = 0; i < n; i++) // Looping untuk elemen diagonal utama
System.out.print(matriks[i][i] + " "); // Elemen diagonal utama adalah matriks[i][i]

// Cetak diagonal samping
System.out.print("\nDiagonal samping: ");
for (int i = 0; i < n; i++) // Looping untuk elemen diagonal samping
System.out.print(matriks[i][n - i - 1] + " "); // Elemen diagonal samping adalah matriks[i][n - i - 1]

input.close(); // Menutup Scanner untuk menghindari kebocoran sumber daya
    }
}






