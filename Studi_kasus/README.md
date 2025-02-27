# PENJELASAN STUDI KASUS 1
public class Studikasus1 { 
// Mendeklarasikan kelas Studikasus1

public static void main(String[] args) { 
// Metode utama sebagai titik awal eksekusi program

// Data siswa
String[] namaSiswa = {"Ani", "Budi", "Cici", "Dodi", "Edi"}; // Array nama siswa
int[][] nilai = { // Array 2D berisi nilai tiap siswa untuk 3 mata pelajaran
{80, 85, 90}, // Nilai Ani (Matematika, Bahasa Inggris, IPA)

{75, 70, 85}, // Nilai Budi
{85, 80, 88}, // Nilai Cici
{90, 85, 95}, // Nilai Dodi
{70, 75, 80}  // Nilai Edi
};

String[] mapel = {"Matematika", "Bahasa Inggris", "IPA"}; // Array mata pelajaran

// Menghitung rata-rata per siswa
System.out.println("Rata-rata nilai per siswa:");

for (int i = 0; i < nilai.length; i++) { 
// Loop untuk setiap siswa

double total = 0; 
// Variabel untuk menyimpan total nilai per siswa

for (int n : nilai[i]) { 
// Loop untuk menjumlahkan nilai setiap siswa

total += n;
}
            
double rataSiswa = total / nilai[i].length; 
// Menghitung rata-rata nilai siswa

System.out.printf("%s: %.2f\n", namaSiswa[i], rataSiswa); 
// Menampilkan hasil
}

// Menghitung rata-rata per mata pelajaran
System.out.println("\nRata-rata nilai per mata pelajaran:");
        
for (int j = 0; j < nilai[0].length; j++) { 
// Loop untuk setiap mata pelajaran

double total = 0; 
// Variabel untuk menyimpan total nilai per mata pelajaran

for (int i = 0; i < nilai.length; i++) { 
// Loop untuk menjumlahkan nilai dari semua siswa pada mata pelajaran ini
total += nilai[i][j];
}
double rataMapel = total / nilai.length; 
// Menghitung rata-rata nilai per mata pelajaran

System.out.printf("%s: %.2f\n", mapel[j], rataMapel); 
// Menampilkan hasil
        }
    }
}


# PENJELASAN STUDI KASUS 2

public class Studikasus2 { 
// Deklarasi kelas Studikasus2

public static void main(String[] args) { 
// Metode utama program

char[][] papan = new char[3][3]; 
// Deklarasi array 2D untuk papan 3x3

// Inisialisasi papan kosong dengan karakter '-'
for (int i = 0; i < 3; i++) { // Loop untuk baris
for (int j = 0; j < 3; j++) { // Loop untuk kolom
papan[i][j] = '-'; // Mengisi setiap elemen dengan '-'
    }
  }

// Simulasi beberapa langkah permainan
papan[0][0] = 'X'; // Menempatkan 'X' di posisi (0,0)
papan[1][1] = 'O'; // Menempatkan 'O' di posisi (1,1)
papan[2][2] = 'X'; // Menempatkan 'X' di posisi (2,2)


// Menampilkan status papan setelah beberapa langkah permainan
System.out.println("Status Papan:");
tampilkanPapan(papan); // Memanggil metode tampilkanPapan untuk mencetak papan
}

// Metode untuk menampilkan papan permainan
public static void tampilkanPapan(char[][] papan) { 
        
for (int i = 0; i < 3; i++) { // Loop untuk baris

for (int j = 0; j < 3; j++) { // Loop untuk kolom

System.out.print(papan[i][j] + " "); 
// Mencetak elemen papan diikuti spasi
       }
System.out.println(); 
// Pindah ke baris berikutnya setelah mencetak satu baris papan

        }
    }
}
